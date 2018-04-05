package com.jet.scm.mobile.web.spem.service.impl;

import com.google.common.collect.Maps;
import com.jet.scm.mobile.core.utils.Securitys;
import com.jet.scm.mobile.core.utils.Utils;
import com.jet.scm.mobile.thirdservice.fdfs.FileService;
import com.jet.scm.mobile.web.spem.domain.*;
import com.jet.scm.mobile.web.spem.filter.TransferDetailFilter;
import com.jet.scm.mobile.web.spem.mapper.*;
import com.jet.scm.mobile.web.spem.service.SpemTransferService;
import com.jet.scm.mobile.web.spem.vo.TransferDetailVO;
import com.jet.scm.mobile.web.spem.vo.TransferVO;
import org.apache.commons.lang3.StringUtils;
import org.csource.common.NameValuePair;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 上午10:07
 */
@Service
public class SpemTransferServiceImpl implements SpemTransferService {

    @Autowired
    private PipScmTransProcDetailMapper pipScmTransProcDetailMapper;
    @Autowired
    private ScmMobileTransferDetailPicMapper scmMobileTransferDetailPicMapper;
    @Autowired
    private ScmMobileTransferDetailBoxMapper scmMobileTransferDetailBoxMapper;
    @Autowired
    private ScmMobileTransferDetailMapper scmMobileTransferDetailMapper;
    @Autowired
    private PipScmTransProcDetailBoxMapper pipScmTransProcDetailBoxMapper;
    @Autowired
    private FileService fileService;

    @Override
    public List<TransferVO> selectDetails(TransferDetailFilter filter) {
        return pipScmTransProcDetailMapper.selectByFilter(filter);
    }

    @Override
    public TransferDetailVO selectDetail(String transDetailNo) {
        PipScmTransProcDetailExample pipDetailExp = new PipScmTransProcDetailExample();
        pipDetailExp.createCriteria().andTransDetailNoEqualTo(transDetailNo);
        List<PipScmTransProcDetail> details = pipScmTransProcDetailMapper.selectByExample(pipDetailExp);
        if (details.size() != 1) {
            return null;
        }
        PipScmTransProcDetail detail = details.get(0);

        ScmMobileTransferDetailExample scmDetailExp = new ScmMobileTransferDetailExample();
        scmDetailExp.createCriteria().andTransDetailNoEqualTo(transDetailNo);
        List<ScmMobileTransferDetail> detailsOfMobile = scmMobileTransferDetailMapper.selectByExample(scmDetailExp);
        TransferDetailVO result = new TransferDetailVO();
        result.setTransDetailNo(transDetailNo);
        result.setPlanGetDate(detail.getPlanGetDate());
        // 获取计划转运列表
        PipScmTransProcDetailBoxExample boxExample = new PipScmTransProcDetailBoxExample();
        boxExample.createCriteria().andTransDetailNoEqualTo(transDetailNo);
        List<PipScmTransProcDetailBox> planBoxes = pipScmTransProcDetailBoxMapper.selectByExample(boxExample);
        String planBoxesStr = String.join(",", planBoxes.stream().map(PipScmTransProcDetailBox::getBoxCode).collect(Collectors.toSet()));
        result.setPlanBoxes(planBoxesStr);
        if (detailsOfMobile.size() > 0) {   // 已转运
            ScmMobileTransferDetail detailOfMobile = detailsOfMobile.get(0);
            // 获取实际转运列表
            ScmMobileTransferDetailBoxExample mobileBoxExp = new ScmMobileTransferDetailBoxExample();
            mobileBoxExp.createCriteria().andTransMobileDetailIdEqualTo(detailOfMobile.getId());
            List<ScmMobileTransferDetailBox> mobileBoxes = scmMobileTransferDetailBoxMapper.selectByExample(mobileBoxExp);
            String realBoxesStr = String.join(",", mobileBoxes.stream().map(ScmMobileTransferDetailBox::getBoxCode).collect(Collectors.toSet()));
            result.setRealBoxes(realBoxesStr);
            // 获取上传文件路径
            ScmMobileTransferDetailPicExample mobilePicExp = new ScmMobileTransferDetailPicExample();
            mobilePicExp.createCriteria().andTransMobileDetailIdEqualTo(detailOfMobile.getId());
            List<ScmMobileTransferDetailPic> mobilePics = scmMobileTransferDetailPicMapper.selectByExample(mobilePicExp);
            String filesStr = String.join(",", mobilePics.stream().map(ScmMobileTransferDetailPic::getFilePath).collect(Collectors.toList()));
            result.setFiles(filesStr);

            result.setLink1Man(detailOfMobile.getLink1Man());
            result.setLink1ManTel(detailOfMobile.getLink1Tel());
            result.setLink2Man(detailOfMobile.getLink2Man());
            result.setLink2ManTel(detailOfMobile.getLink2Tel());
            result.setAddress(detailOfMobile.getAddress());
            result.setCoordinate(detailOfMobile.getCoordinate());
            result.setRealGetDate(detailOfMobile.getRealGetDate());
            result.setStatus((short) 1);
        } else {   // 未转运
            result.setStatus((short) 0);
            result.setLink1Man(detail.getLink1Man());
            result.setLink1ManTel(detail.getLink1Tel());
            result.setLink2Man(detail.getLink2Man());
            result.setLink2ManTel(detail.getLink2Tel());
            result.setAddress(detail.getRemarks());
        }
        return result;
    }

    @Override
    public Map<String, Object> saveDetail(String transDetailNo, TransferDetailVO transferDetailVO) {
        Map<String, Object> result = Maps.newHashMap();
        result.put("isSuccess", true);
        ScmMobileTransferDetailExample scmDetailExp = new ScmMobileTransferDetailExample();
        scmDetailExp.createCriteria().andTransDetailNoEqualTo(transDetailNo);
        List<ScmMobileTransferDetail> detailsOfMobile = scmMobileTransferDetailMapper.selectByExample(scmDetailExp);
        if(detailsOfMobile.size() > 0) {
            result.put("isSuccess", false);
            result.put("errMsg", "运单明细已保存");
        }

        ScmMobileTransferDetail detailOfMobile = new ScmMobileTransferDetail();
        detailOfMobile.setId(Utils.generateUUID());
        BeanUtils.copyProperties(transferDetailVO, detailOfMobile);
        detailOfMobile.setLink1Tel(transferDetailVO.getLink1ManTel());
        detailOfMobile.setLink2Tel(transferDetailVO.getLink2ManTel());
        // 保存实际转运列表
        String realBoxesStr = transferDetailVO.getRealBoxes();
        if (StringUtils.isNotBlank(realBoxesStr)) {
            int boxCount = 0;
            for (String boxCode : realBoxesStr.split(",")) {
                ScmMobileTransferDetailBox box = new ScmMobileTransferDetailBox();
                box.setBoxCode(boxCode);
                box.setId(Utils.generateUUID());
                box.setCreateBy(Securitys.getAccountId());
                box.setCreateTime(new Date());
                box.setCreateByName(Securitys.getName());
                box.setTransMobileDetailId(detailOfMobile.getId());
                scmMobileTransferDetailBoxMapper.insertSelective(box);
                boxCount++;
            }
            detailOfMobile.setBoxCount(boxCount);
        }
        // 保存上传图片
        String filesStr = transferDetailVO.getFiles();
        if (StringUtils.isNotBlank(filesStr)) {
            int index = 1;
            for (String fileId : filesStr.split(",")) {
                ScmMobileTransferDetailPic pic = new ScmMobileTransferDetailPic();
                pic.setId(Utils.generateUUID());
                pic.setTransMobileDetailId(detailOfMobile.getId());
                pic.setFilePath(fileId);
                NameValuePair[] nameValuePairs = fileService.getFileMetaData(fileId);
                for (NameValuePair pair : nameValuePairs) {
                    if ("name".equals(pair.getName())) {
                        pic.setSrcFileName(pair.getValue());
                        break;
                    }
                }
                pic.setFileName(transDetailNo + "_" + index);
                index++;
                pic.setCreateBy(Securitys.getAccountId());
                pic.setCreateTime(new Date());
                scmMobileTransferDetailPicMapper.insertSelective(pic);
            }
        }
        detailOfMobile.setCreateById(Securitys.getAccountId());
        detailOfMobile.setCreateByName(Securitys.getName());
        detailOfMobile.setCreateTime(new Date());
        PipScmTransProcDetailExample pipDetailExp = new PipScmTransProcDetailExample();
        pipDetailExp.createCriteria().andTransDetailNoEqualTo(transDetailNo);
        List<PipScmTransProcDetail> details = pipScmTransProcDetailMapper.selectByExample(pipDetailExp);
        if(details.size() != 1) {
            result.put("isSuccess", false);
            result.put("errMsg", "运单号有误");
        }
        detailOfMobile.setTransDetailId(details.get(0).getId());
        scmMobileTransferDetailMapper.insertSelective(detailOfMobile);
        return result;
    }
}
