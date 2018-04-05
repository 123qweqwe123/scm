package com.jet.scm.web.spem.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.jet.scm.core.constant.AppConsts;
import com.jet.scm.core.exception.ServiceException;
import com.jet.scm.core.exception.ValidatorException;
import com.jet.scm.core.utils.Securitys;
import com.jet.scm.core.utils.Utils;
import com.jet.scm.thirdservice.datasync.bdcor3.SyncDataToBdcor3Service;
import com.jet.scm.thirdservice.mail.MailService;
import com.jet.scm.thirdservice.mail.domain.MailEntity;
import com.jet.scm.thirdservice.sms.SMSService;
import com.jet.scm.web.common.domain.PipScmTransLink;
import com.jet.scm.web.common.domain.PipScmTransLinkExample;
import com.jet.scm.web.common.mapper.PipScmTransLinkMapper;
import com.jet.scm.web.common.service.JxlsService;
import com.jet.scm.web.proj.domain.PipCommRcc;
import com.jet.scm.web.proj.domain.PipCommRccExample;
import com.jet.scm.web.proj.mapper.PipCommRccMapper;
import com.jet.scm.web.spem.domain.*;
import com.jet.scm.web.spem.filter.SpemTransferFilter;
import com.jet.scm.web.spem.mapper.*;
import com.jet.scm.web.spem.qo.SpemTransferDetailUploadQO;
import com.jet.scm.web.spem.qo.TransMasterQO;
import com.jet.scm.web.spem.service.SpemTransferService;
import com.jet.scm.web.spem.vo.ReceiveInfoVO;
import com.jet.scm.web.spem.vo.ScmBox4MasterVO;
import com.jet.scm.web.spem.vo.ScmBoxVO;
import com.jet.scm.web.spem.vo.TransNoVO;
import com.jet.scm.web.sys.domain.SysAccount;
import com.jet.scm.web.sys.mapper.SysAccountMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/20 上午8:41
 */
@Service
public class SpemTransferServiceImpl implements SpemTransferService {

    Logger logger = LoggerFactory.getLogger(SpemTransferServiceImpl.class);

    @Autowired
    private PipScmTransProcMasterMapper transProcMasterMapper;

    @Autowired
    private PipScmTransProcDetailMapper transProcDetailMapper;

    @Autowired
    private PipScmTransLinkMapper pipScmTransLinkMapper;

    @Autowired
    private PipScmTransProcDetailPicMapper pipScmTransProcDetailPicMapper;

    @Autowired
    private PipScmTransLogMapper pipScmTransLogMapper;

    @Autowired
    private PipScmFrozenboxTransportMapper pipScmFrozenboxTransportMapper;

    @Autowired
    private PipScmFrozenboxMapper pipScmFrozenboxMapper;

    @Autowired
    private PipScmFrozentubeMapper pipScmFrozentubeMapper;

    @Autowired
    private PipScmTransProcDetailBoxMapper pipScmTransProcDetailBoxMapper;

    @Autowired
    private PipScmTransEmailMapper pipScmTransEmailMapper;

    @Autowired
    private PipScmTransProcMasterMailMapper pipScmTransProcMasterMailMapper;

    @Autowired
    private PipCommRccMapper pipCommRccMapper;

    @Autowired
    private SysAccountMapper sysAccountMapper;

    @Autowired
    private MailService mailService;

    @Autowired
    private SMSService smsService;

    @Autowired
    private JxlsService jxlsService;

    @Autowired
    private SyncDataToBdcor3Service syncDataToBdcor3Service;

    @Override
    public List<?> transfers(SpemTransferFilter filter) {
        return transProcMasterMapper.selectByFilter(filter);
    }


    @Override
    public List<?> transferDetails(String transferId, SpemTransferFilter filter) {
        PipScmTransProcDetailExample exp = new PipScmTransProcDetailExample();
        PipScmTransProcDetailExample.Criteria criteria = exp.createCriteria();
        criteria.andMasterIdEqualTo(transferId);
        if (filter.getPlanGetStartDate() != null) {
            criteria.andPlanGetDateGreaterThan(filter.getPlanGetStartDate());
        }
        if (filter.getPlanGetEndDate() != null) {
            criteria.andPlanGetDateLessThan(filter.getPlanGetEndDate());
        }
        exp.setOrderByClause("LCC_CODE");
        return transProcDetailMapper.selectByExample(exp);
    }

    @Override
    public List<?> unTransfers(SpemTransferFilter filter) {
        List<Map<String, Object>> unTransfers = transProcMasterMapper.selectNoTransData(filter);
        for (Map<String, Object> unTransfer : unTransfers) {
            if (unTransfer.get("RCC_CODE") != null) {
                String rccCode = unTransfer.get("RCC_CODE").toString();
                PipScmTransProcDetailExample detailExample = new PipScmTransProcDetailExample();
                detailExample.createCriteria().andRccCodeEqualTo(rccCode)
                        .andPlanGetDateIsNotNull();
                detailExample.setOrderByClause("PLAN_GET_DATE desc");
                List<PipScmTransProcDetail> details = transProcDetailMapper.selectByExample(detailExample);
                if (details.size() > 0) {
                    PipScmTransProcDetail detail = details.get(0);
                    unTransfer.put("planGetDate", DateFormatUtils.format(detail.getPlanGetDate(), "yyyy-MM-dd"));
                }
            }
        }
        return unTransfers;
    }

    @Override
    public List<?> linkMans(String lccCode, Short type) {
        PipScmTransLinkExample exp = new PipScmTransLinkExample();
        if (StringUtils.isNotBlank(lccCode)) {
            exp.createCriteria().andLccCodeEqualTo(lccCode);
        }
        if (type != null) {
            exp.createCriteria().andLinkTypeEqualTo(type);
        }
        return pipScmTransLinkMapper.selectByExample(exp);
    }

    @Override
    public void updateTransferDetails(String transferId, PipScmTransProcDetail detail) {
        detail.setUpdateDate(new Date());
        detail.setUpdateUserId(String.valueOf(Securitys.getAccountId()));
        detail.setUpdateUserName(Securitys.getName());
        // 必须整表更新,前端传递的是全量属性
        transProcDetailMapper.updateByPrimaryKey(detail);
    }

    @Override
    public List<PipScmTransLink> createOrUpdatelinkMan(String transferId,
                                                       String detailId,
                                                       PipScmTransLink link) {
        if (StringUtils.isEmpty(link.getId())) {
            link.setId(Utils.generateUUID());
            link.setCreateBy(Securitys.getName());
            link.setCreateTime(new Date());
            pipScmTransLinkMapper.insertSelective(link);
        } else {
            link.setUpdateBy(Securitys.getName());
            link.setUpdateTime(new Date());
            //  先更新明细取样人，必须在更新 linkMan 之前操作获取原始名字
            updateTransDetailLinkMan(link, detailId);

            pipScmTransLinkMapper.updateByPrimaryKeySelective(link);
        }
        List<PipScmTransLink> transLinks = Lists.newArrayList();
        transLinks.add(link);
        return transLinks;
    }

    private void updateTransDetailLinkMan(PipScmTransLink link, String detailId) {
        PipScmTransProcDetail detail = new PipScmTransProcDetail();
        detail.setId(detailId);
        if (link.getLinkType() == 1) {
            detail.setLink1Man(link.getLinkName());
            detail.setLink1Tel(link.getPhone());
        } else if (link.getLinkType() == 2) {
            detail.setLink2Man(link.getLinkName());
            detail.setLink2Tel(link.getPhone());
        } else if (link.getLinkType() == 3) {
            // 取样人可能有多个,修改取样人，用新的名字替换之前的名字
            detail = transProcDetailMapper.selectByPrimaryKey(detailId);
            String planGetManName = detail.getPlanGetManName();
            PipScmTransLink srcTransLink = pipScmTransLinkMapper.selectByPrimaryKey(link.getId());
            String srcName = srcTransLink.getLinkName();
            if (StringUtils.isNotBlank(planGetManName)
                    && planGetManName.contains(srcName)) {
                planGetManName = planGetManName.replace(srcName, link.getLinkName());
            }
            detail.setPlanGetManName(planGetManName);
        }
        detail.setUpdateUserName(Securitys.getName());
        detail.setUpdateUserId(String.valueOf(Securitys.getAccountId()));
        detail.setUpdateDate(new Date());
        transProcDetailMapper.updateByPrimaryKeySelective(detail);
    }

    @Override
    public void validateLinkName(String q, Short type, String lccCode) {
        PipScmTransLinkExample exp = new PipScmTransLinkExample();
        PipScmTransLinkExample.Criteria cr = exp.createCriteria();
        cr.andLinkNameEqualTo(q).andLinkTypeEqualTo(type);
        if (3 == type) {
            cr.andLccCodeEqualTo(lccCode);
        }
        List<PipScmTransLink> links = pipScmTransLinkMapper.selectByExample(exp);
        if (links.size() > 0) {
            throw new ValidatorException("名字已存在");
        }
    }

    @Override
    public void uploadTransferDetailAttachment(String transferId, String detailId, SpemTransferDetailUploadQO qo) {
        // 更新 detail 的状态
        PipScmTransProcDetail detail = transProcDetailMapper.selectByPrimaryKey(detailId);
        detail.setDetailStatus(AppConsts.SCM_PROC_DETAIL_STATUS_1); // 置为已交付状态
        detail.setUpdateDate(new Date());
        detail.setUpdateUserId(String.valueOf(Securitys.getAccountId()));
        detail.setUpdateUserName(Securitys.getName());
        transProcDetailMapper.updateByPrimaryKeySelective(detail);

        // 更新 master 的状态
        PipScmTransProcDetailExample detailExample = new PipScmTransProcDetailExample();
        detailExample.createCriteria().andMasterIdEqualTo(transferId).andDetailStatusEqualTo(AppConsts.SCM_PROC_DETAIL_STATUS_2);
        PipScmTransProcMaster master = transProcMasterMapper.selectByPrimaryKey(transferId);
        if (transProcDetailMapper.countByExample(detailExample) == 0) {
            master.setStatus(AppConsts.SCM_PROC_MASTER_STATUS_4);
        } else {
            master.setStatus(AppConsts.SCM_PROC_MASTER_STATUS_3);
        }
        master.setUpdateBy(String.valueOf(Securitys.getAccountId()));
        master.setUpdateTime(new Date());
        transProcMasterMapper.updateByPrimaryKeySelective(master);

        // 保存上传文件信息
        PipScmTransProcDetailPicExample picExample = new PipScmTransProcDetailPicExample();
        picExample.createCriteria().andDetailIdEqualTo(detailId);
        List<PipScmTransProcDetailPic> pics = pipScmTransProcDetailPicMapper.selectByExample(picExample);
        int picCount = pics.size() + 1;
        String fileInfos = qo.getFile();
        for (String fileInfo : fileInfos.split(";")) {
            String fileName = StringUtils.substringBefore(fileInfo, ",");
            String fileId = StringUtils.substringAfter(fileInfo, ",");
            String extName = StringUtils.substringAfterLast(fileName, "."); // 文件后缀
            PipScmTransProcDetailPic pic = new PipScmTransProcDetailPic();
            pic.setCreateBy(String.valueOf(Securitys.getAccountId()));
            pic.setCreateTime(new Date());
            pic.setId(Utils.generateUUID());
            pic.setTransId(transferId);
            pic.setDetailId(detailId);
            pic.setSrcFileName(fileName);
            pic.setFilePath(fileId);
            // 文件名=明细no_图片数序号.文件后缀
            pic.setFileName(detail.getTransDetailNo() + "_" + picCount + "." + extName);
            pipScmTransProcDetailPicMapper.insertSelective(pic);
            picCount++;
        }


        // 样本接收信息表
        Map<String, Object> boxMap = Maps.newHashMap();
        boxMap.put("RECEIVE_DATE", qo.getReceiveDate());
        boxMap.put("CHECKINLIST_ID", qo.getCheckinlistId());
        boxMap.put("RECEIVE_OPERATOR", qo.getReceiveOperator());
        boxMap.put("BY", String.valueOf(Securitys.getAccountId()));
        boxMap.put("TIME", new Date());
        boxMap.put("DETAIL_ID", detailId);
        List<ReceiveInfoVO> receiveInfo = pipScmFrozenboxTransportMapper.getReceiveInfo(detailId);
        if (receiveInfo.size() == 0) {
            pipScmFrozenboxTransportMapper.insertBox(boxMap);
        } else {
            pipScmFrozenboxTransportMapper.updateBox(boxMap);
        }


        // 记录日志
        PipScmTransLog transLog = new PipScmTransLog();
        transLog.setId(Utils.generateUUID());
        transLog.setType(AppConsts.SCM_PROC_LOG_TYPE_3);
        transLog.setTransId(transferId);
        transLog.setTransDetailId(detailId);
        transLog.setCreateBy(String.valueOf(Securitys.getAccountId()));
        transLog.setCreateTime(new Date());
        transLog.setContent("上传运单");
        pipScmTransLogMapper.insertSelective(transLog);
    }


    @Override
    public List<PipScmTransProcDetailPic> images(String transferId, String detailId) {
        PipScmTransProcDetailPicExample picExample = new PipScmTransProcDetailPicExample();
        picExample.createCriteria().andDetailIdEqualTo(detailId);
        return pipScmTransProcDetailPicMapper.selectByExample(picExample);
    }

    @Override
    public List<ScmBoxVO> unselectedBoxes(String lccCode) {
        return pipScmFrozenboxMapper.queryBoxByLccCode(lccCode);
    }

    @Override
    public void appendTransferDetail(String transferId, String detailId, String boxes) {
        String createBy = String.valueOf(Securitys.getAccountId());
        String createByName = Securitys.getName();
        Date createTime = new Date();

        // 生成新的补录运单明细
        PipScmTransProcDetail detail = transProcDetailMapper.selectByPrimaryKey(detailId);
        String[] boxArr = boxes.split(",");
        detail.setBoxCount(boxArr.length);
        detail.setCreateDate(createTime);
        detail.setCreateUserId(createBy);
        detail.setCreateUserName(createByName);
        detail.setDetailStatus(AppConsts.SCM_PROC_DETAIL_STATUS_2);
        // 生成新的子运单编号
        String srcDetailNo = StringUtils.substringBefore(detail.getTransDetailNo(), "_B");
        PipScmTransProcDetailExample detailExample = new PipScmTransProcDetailExample();
        detailExample.createCriteria().andTransDetailNoLike(srcDetailNo + "_B%");
        List<PipScmTransProcDetail> appendDetails = transProcDetailMapper.selectByExample(detailExample);
        String newDetailNo = srcDetailNo + "_B" + (appendDetails.size() + 1);
        detail.setTransDetailNo(newDetailNo);
        detail.setId(Utils.generateUUID());
        transProcDetailMapper.insertSelective(detail);

        // 生成运单明细
        for (String boxCode : boxArr) {
            PipScmTransProcDetailBox box = new PipScmTransProcDetailBox();
            box.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            box.setTransId(detail.getMasterId());
            box.setTransNo(detail.getTransNo());
            box.setTransDetailId(detail.getId());
            box.setTransDetailNo(detail.getTransDetailNo());
            box.setBoxCode(boxCode);
            box.setCreateBy(createBy);
            box.setCreateTime(createTime);
            box.setCreateByName(createByName);
            pipScmTransProcDetailBoxMapper.insertSelective(box);
        }

        PipScmTransProcMaster master = transProcMasterMapper.selectByPrimaryKey(detail.getMasterId());
        if (master.getStatus() == AppConsts.SCM_PROC_MASTER_STATUS_4) {
            master.setStatus(AppConsts.SCM_PROC_MASTER_STATUS_3);
            transProcMasterMapper.updateByPrimaryKey(master);
        }

        // 更改主单冻存盒数量
        int boxCount = master.getBoxCount() + boxArr.length;
        master.setBoxCount(boxCount);
        transProcMasterMapper.updateByPrimaryKeySelective(master);

        // 发送短信和邮件
        beginTransProInThread(transferId);


        // 记录日志
        PipScmTransLog transLog = new PipScmTransLog();
        transLog.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        transLog.setType(AppConsts.SCM_PROC_LOG_TYPE_3);
        transLog.setTransId(detail.getMasterId());
        transLog.setTransDetailId(detailId);
        transLog.setCreateBy(createBy);
        transLog.setCreateTime(createTime);
        transLog.setContent("补充运单");
        pipScmTransLogMapper.insertSelective(transLog);

    }

    @Override
    public List<PipScmTransEmail> emails(Short type) {
        PipScmTransEmailExample exp = new PipScmTransEmailExample();
        if (type != null) {
            exp.createCriteria().andTypeEqualTo(type);
        }
        return pipScmTransEmailMapper.selectByExample(exp);
    }

    @Override
    public void createEmails(PipScmTransEmail email) {
        email.setId(Utils.generateUUID());
        email.setCreateBy(String.valueOf(Securitys.getAccountId()));
        email.setCreateTime(new Date());
        pipScmTransEmailMapper.insertSelective(email);
    }

    @Override
    public void updateEmails(PipScmTransEmail email) {
        email.setUpdateBy(String.valueOf(Securitys.getAccountId()));
        email.setUpdateTime(new Date());
        pipScmTransEmailMapper.updateByPrimaryKeySelective(email);
    }

    @Override
    public TransNoVO createTransNo(String rccCodeAndDateStr) {
        String rccCode = StringUtils.substringBefore(rccCodeAndDateStr, "-");
        PipScmTransProcMasterExample exp = new PipScmTransProcMasterExample();
        int total = transProcMasterMapper.selectByExample(exp).size() + 8;   // 从 D0008开始
        exp.createCriteria().andTransNoLike("%" + rccCodeAndDateStr + "%");
        int dayCount = transProcMasterMapper.selectByExample(exp).size() + 1; // 当天rcc下订单数量
        StringBuilder sb = new StringBuilder();
        sb.append("D");
        sb.append(String.format("%04d", total));
        sb.append("-");
        sb.append(rccCodeAndDateStr);
        sb.append("-");
        sb.append(String.format("%02d", dayCount));
        TransNoVO vo = new TransNoVO();
        vo.setDateStr(StringUtils.substringAfter(rccCodeAndDateStr, "-"));
        String transNo = sb.toString();
        vo.setTransNo(transNo);
        vo.setPrefix(StringUtils.substringBefore(transNo, "-") + "-" + rccCode);
        vo.setSuffix(StringUtils.substringAfterLast(transNo, "-"));
        vo.setRccCode(rccCode);
        return vo;
    }

    @Override
    public void validateEmail(String q, Short type) {
        PipScmTransEmailExample exp = new PipScmTransEmailExample();
        exp.createCriteria().andEmailEqualTo(q).andTypeEqualTo(type);
        if (pipScmTransEmailMapper.selectByExample(exp).size() > 0) {
            throw new ValidatorException("该邮箱已经存在!");
        }
    }

    @Override
    public List<ScmBox4MasterVO> boxes(String rccCode) {
        return pipScmFrozenboxMapper.queryBoxByRccCode(rccCode);
    }

    @Override
    public synchronized void createTransfers(TransMasterQO qo) {

        // 重新获取transNo
        String srcTransNo = qo.getTransNo();
        TransNoVO transNoVO = createTransNo(StringUtils.substringAfter(StringUtils.substringBeforeLast(srcTransNo, "-"), "-"));  // 得到 RCCCODE-yyyy-MM-dd
        String currTransNo = transNoVO.getTransNo();
        qo.setTransNo(currTransNo);

        // 添加master信息
        String transId = addMaster(qo);
        // 添加detail信息
        addDetail(qo, transId);
        // 更新邮箱信息，设置为默认选择
        updateTransEmails(qo);
        // 添加邮箱和样本转运单关联信息
        addTransMasterAndEmails(qo, transId);
        // 发送邮件和短信
        beginTransProInThread(transId);

        logger.info("生成新的样本转运单，单号{}", transId);
    }

    /**
     * 添加样本转运单信息
     *
     * @param detail
     */
    private String addMaster(TransMasterQO detail) {
        PipScmTransProcMaster master = new PipScmTransProcMaster();
        master.setId(Utils.generateUUID());
        master.setCreateTime(new Date());
        master.setCreateBy(detail.getCreateBy());
        master.setCreateByName(detail.getCreateByName());
        master.setTransNo(detail.getTransNo());
        master.setRccCode(detail.getRccCode());
        master.setStatus(AppConsts.SCM_PROC_MASTER_STATUS_1); // 新任务
        master.setBoxCount(detail.getBoxes().split(",").length);
        transProcMasterMapper.insertSelective(master);
        return master.getId();
    }

    /**
     * 添加样本单明细信息(每个lcc的信息)
     *
     * @param detail
     * @param masterId
     */
    private void addDetail(TransMasterQO detail, String masterId) {
        String boxesStr = detail.getBoxesStr();
        if (StringUtils.isEmpty(boxesStr)) {
            throw new ServiceException("冻存盒数量不能为空");
        }
        String[] boxesStrGroupByLcc = boxesStr.split(";");
        int i = 1;
        for (String boxesStrLcc : boxesStrGroupByLcc) {

            PipScmTransProcDetail procDetail = new PipScmTransProcDetail();
            procDetail.setId(Utils.generateUUID());
            String transDetailNo = detail.getTransNo() + "_" + i;
            i++;
            String[] boxesLcc = boxesStrLcc.split(",");
            for (String box : boxesLcc) {
                PipScmTransProcDetailBox detailBox = new PipScmTransProcDetailBox();
                detailBox.setId(Utils.generateUUID());
                detailBox.setBoxCode(box);
                detailBox.setCreateBy(detail.getCreateBy());
                detailBox.setCreateByName(detail.getCreateByName());
                detailBox.setTransId(masterId);
                detailBox.setTransNo(detail.getTransNo());
                detailBox.setTransDetailId(procDetail.getId());
                detailBox.setTransDetailNo(transDetailNo);
                pipScmTransProcDetailBoxMapper.insertSelective(detailBox);
                //更新冻存盒为准备入库的状态
                updateFrozenBoxIsCheckIn(box, (short) 3);
            }

            procDetail.setTransDetailNo(transDetailNo);
            procDetail.setMasterId(masterId);
            procDetail.setTransNo(detail.getTransNo());
            procDetail.setCreateDate(new Date());
            procDetail.setCreateUserId(detail.getCreateBy());
            procDetail.setCreateUserName(detail.getCreateByName());
            procDetail.setBoxCount(boxesLcc.length);
            procDetail.setRccCode(detail.getRccCode());
            ScmBox4MasterVO boxVo = pipScmFrozenboxMapper.getFrozenboxByBoxCode(boxesLcc[0]);
            procDetail.setLccCode(boxVo.getLccCode());
            procDetail.setLccName(boxVo.getLccName());
            procDetail.setRccCode(boxVo.getRccCode());
            procDetail.setRccName(boxVo.getRccName());
            procDetail.setAreaCode(boxVo.getAreaCode());
            procDetail.setAreaName(boxVo.getAreaName());
            transProcDetailMapper.insertSelective(procDetail);
        }
    }

    /**
     * 更新冻存盒为准备入库的状态
     *
     * @param box
     */
    private void updateFrozenBoxIsCheckIn(String box, short isCheckIn) {
        PipScmFrozenboxExample exp = new PipScmFrozenboxExample();
        exp.createCriteria().andBoxCodeEqualTo(box);
        PipScmFrozenbox frozenbox = new PipScmFrozenbox();
        frozenbox.setIsCheckin(isCheckIn);
        pipScmFrozenboxMapper.updateByExampleSelective(frozenbox, exp);

    }

    private void updateTransEmails(TransMasterQO detail) {
        String transMail = detail.getTransMail();
        String projMail = detail.getProjMail();
        String spemMail = detail.getSpemMail();
        updateEmail(transMail, (short) 1);
        updateEmail(projMail, (short) 2);
        updateEmail(spemMail, (short) 3);
    }

    private void updateEmail(String mailStr, short type) {
        Short isDefault = 1;//默认选中状态
        // 将邮箱全部设置为默认未选中状态
        PipScmTransEmailExample example1 = new PipScmTransEmailExample();
        example1.createCriteria().andTypeEqualTo(type);
        PipScmTransEmail e = new PipScmTransEmail();
        e.setIsDefault((short) 0);
        pipScmTransEmailMapper.updateByExampleSelective(e, example1);

        if (StringUtils.isNotBlank(mailStr)) {
            String[] mails = mailStr.split(",");
            for (String mailId : mails) {
                PipScmTransEmail email = pipScmTransEmailMapper.selectByPrimaryKey(mailId);
                email.setUpdateTime(new Date());
                email.setUpdateBy(String.valueOf(Securitys.getAccountId()));
                email.setIsDefault(isDefault);
                pipScmTransEmailMapper.updateByPrimaryKeySelective(email);
            }
        }
    }

    private void addTransMasterAndEmails(TransMasterQO detail, String transId) {

        String transMail = detail.getTransMail();
        String projMail = detail.getProjMail();
        String spemMail = detail.getSpemMail();
        addTransMasterAndEmail(transId, transMail, detail, (short) 1);
        addTransMasterAndEmail(transId, projMail, detail, (short) 2);
        addTransMasterAndEmail(transId, spemMail, detail, (short) 3);
    }

    private void addTransMasterAndEmail(String transId, String mailStr, TransMasterQO detail, Short type) {

        if (StringUtils.isNotBlank(mailStr)) {
            String[] mailIds = mailStr.split(",");
            for (String mailId : mailIds) {
                PipScmTransEmail transEmail = pipScmTransEmailMapper.selectByPrimaryKey(mailId);

                PipScmTransProcMasterMail masterMail = new PipScmTransProcMasterMail();
                masterMail.setId(Utils.generateUUID());
                masterMail.setCreateBy(String.valueOf(Securitys.getAccountId()));
                masterMail.setCreateTime(new Date());
                masterMail.setTransId(transId);
                masterMail.setTransNo(detail.getTransNo());
                masterMail.setEmailId(transEmail.getId());
                masterMail.setEmailType(type);
                masterMail.setEmail(transEmail.getEmail());
                pipScmTransProcMasterMailMapper.insertSelective(masterMail);
            }
        }
    }

    @Override
    public List<?> boxesByTransId(String transId) {
        PipScmTransProcDetailBoxExample exp = new PipScmTransProcDetailBoxExample();
        exp.createCriteria().andTransIdEqualTo(transId);
        return pipScmTransProcDetailBoxMapper.selectByExample(exp);
    }

    /**
     * 通过邮件类型获取对应的邮件组
     *
     * @param type
     * @param mailList
     * @return
     */
    private List<String> getTransMailsByType(Short type, List<PipScmTransProcMasterMail> mailList) {
        return mailList.stream().filter(x -> {
            return Objects.equals(x.getEmailType(), type);
        }).map(PipScmTransProcMasterMail::getEmail).collect(Collectors.toList());
    }

    private String getLccBoxDetail(List<PipScmTransProcDetail> details, List<TransProOfLcc> attrOfLcc) {
        StringBuilder lccBoxDetail = new StringBuilder();
        for (PipScmTransProcDetail detail : details) {
            int boxCountInLcc = 0;
            PipScmTransProcDetailBoxExample boxExample = new PipScmTransProcDetailBoxExample();
            boxExample.createCriteria().andTransDetailIdEqualTo(detail.getId());
            List<PipScmTransProcDetailBox> boxes = pipScmTransProcDetailBoxMapper.selectByExample(boxExample);
            lccBoxDetail.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + detail.getLccName() + "，");
            int index = 0;
            for (PipScmTransProcDetailBox box : boxes) {
                boxCountInLcc++;
                TransProOfLcc e = new TransProOfLcc(detail);
                e.setIndex(++index);
                e.setBoxCode(box.getBoxCode());
                PipScmFrozentubeExample tubeExp = new PipScmFrozentubeExample();
                tubeExp.createCriteria().andBoxCodeEqualTo(box.getBoxCode()).andBoxTypeEqualTo("A");
                int tubeCountByType = pipScmFrozentubeMapper.countByExample(tubeExp);
                e.setTubeCount(tubeCountByType);
                attrOfLcc.add(e);
            }
            lccBoxDetail.append(boxCountInLcc + "套样本；<br>");
        }
        return lccBoxDetail.toString();
    }

    @Override
    public void deliverTransfers(String transId) {
        PipScmTransProcMaster record = transProcMasterMapper.selectByPrimaryKey(transId);
        record.setStatus(AppConsts.SCM_PROC_MASTER_STATUS_5);
        record.setUpdateBy(Securitys.getAccountId());
        record.setUpdateTime(new Date());
        transProcMasterMapper.updateByPrimaryKeySelective(record);
        // 修改冻存管状态为已入库
        changeBoxStatus(transId);

        // 发送邮件和短信
        finishTransProInThread(transId);
    }

    /**
     * 需要调用接口传输数据，将冻存盒状态回执
     *
     * @param transId
     */
    private void changeBoxStatus(String transId) {
        PipScmTransProcDetailBoxExample exp = new PipScmTransProcDetailBoxExample();
        exp.createCriteria().andTransIdEqualTo(transId);
        List<String> boxes = Lists.newArrayList();
        pipScmTransProcDetailBoxMapper.selectByExample(exp).forEach(box -> {
            String boxCode = box.getBoxCode();
            PipScmFrozenboxExample boxExp = new PipScmFrozenboxExample();
            boxExp.createCriteria().andBoxCodeEqualTo(boxCode);
            PipScmFrozenbox b = new PipScmFrozenbox();
            b.setIsCheckin((short) 1);
            boxes.add(box.getBoxCode());
            pipScmFrozenboxMapper.updateByExampleSelective(b, boxExp);
        });
        // 回传状态到高危数据库
        syncDataToBdcor3Service.syncPipScmFrozenboxesOfIsCheckin(String.join(",", boxes));
    }

    /**
     * 开始转运前，发送邮件和短信
     */
    public void beginTransProInThread(String transProId) {
        logger.info("begin_trans send begin:" + transProId);
        PipScmTransProcMaster pipScmTransProcMaster = transProcMasterMapper.selectByPrimaryKey(transProId);
        if (pipScmTransProcMaster == null) {
            return;
        }
        PipScmTransProcDetailExample example = new PipScmTransProcDetailExample();
        example.createCriteria().andMasterIdEqualTo(transProId);
        List<PipScmTransProcDetail> list = transProcDetailMapper.selectByExample(example);

        PipScmTransProcMasterMailExample exampleMail = new PipScmTransProcMasterMailExample();
        exampleMail.createCriteria().andTransIdEqualTo(pipScmTransProcMaster.getId());
        List<PipScmTransProcMasterMail> emailList = pipScmTransProcMasterMailMapper.selectByExample(exampleMail);

        //邮件的附件使用
        List<TransProOfLcc> attrOfLcc = Lists.newArrayList();

        //申请单号
        String transProNo = pipScmTransProcMaster.getTransNo();
        String rccCode = pipScmTransProcMaster.getRccCode();
        String rccName = getRccName(rccCode);
        Integer lccCount = list.size();
        Integer boxCount = 0;
        String lccBoxDetail = getLccBoxDetail(list, attrOfLcc);
        for (PipScmTransProcDetail detail : list) {
            boxCount += detail.getBoxCount();
        }

        Map beans = new HashMap();
        beans.put("results", list);
        beans.put("transNo", transProNo);
        beans.put("attrOfLcc", attrOfLcc);

        //==============================================================P
        String projectGrpupEmailTitle = "《{0}-高危3期-生物样本转运申请》";//转运单号
        String projectGrpupEmailAttaTemplate = "trans_plan_P.xls";
        String projectGrpupEmailAttaName = "{0}-高危3期-生物样本转运申请_P.xls";//转运单号
        String projectGrpupEmailContent = "您好！<br>" +
                "本次转运的《{0}-高危3期-生物样本转运申请》为{1}（{2}）。<br>" +//rcc name ，rcc Code
                "计划转运{3}个承担单位样本，共计{4}套样本。其中：<br>" +//
                "{5}" +
                "   本次转运样本的详细转运申请，请查看附件“{6}”";
        String projectGrpupEmailAttaNameReal = MessageFormat.format(projectGrpupEmailAttaName, transProNo);
        List<String> fileIdP = Lists.newArrayList();
        fileIdP.add(jxlsService.createExcel("spem/" + projectGrpupEmailAttaTemplate, projectGrpupEmailAttaNameReal, beans));
        MailEntity pMailEntity = new MailEntity()
                .setSubject(MessageFormat.format(projectGrpupEmailTitle, transProNo))
                .setContent(MessageFormat.format(projectGrpupEmailContent, transProNo, rccName, rccCode, lccCount, boxCount, lccBoxDetail, projectGrpupEmailAttaNameReal))
                .setTo(getTransMailsByType((short) 2, emailList))
                .setFileIds(fileIdP);
        mailService.send(pMailEntity);

        //==============================================================T
        String transGrpupEmailTitle = "《{0}-高危3期-生物样本转运计划》";//转运单号
        String transGrpupEmailAttaTemplate = "trans_plan_T.xls";
        String transGrpupEmailAttaName = "{0}-高危3期样本转运计划_T.xls";//转运单号
        String transGrpupEmailContent = "您好！<br>" +
                "本次转运的《{0}-高危3期-生物样本转运计划》为{1}（{2}）。<br>" +
                "计划转运{3}个承担单位样本，共计{4}套样本。其中：<br>" +
                "{5}" +
                "   本次转运样本的详细计划，请查看附件“{6}”";

        String transGrpupEmailAttaNameReal = MessageFormat.format(transGrpupEmailAttaName, transProNo);
        List<String> fileIdT = Lists.newArrayList();
        fileIdT.add(jxlsService.createExcel("spem/" + transGrpupEmailAttaTemplate, transGrpupEmailAttaNameReal, beans));
        MailEntity tMailEntity = new MailEntity().
                setSubject(MessageFormat.format(transGrpupEmailTitle, transProNo))
                .setContent(MessageFormat.format(transGrpupEmailContent, transProNo, rccName, rccCode, lccCount, boxCount, lccBoxDetail, transGrpupEmailAttaNameReal))
                .setTo(getTransMailsByType((short) 1, emailList))
                .setFileIds(fileIdT);
        mailService.send(tMailEntity);

        //==============================================================B
        String sampleGrpupEmailTitle = "《{0}-高危3期-生物样本入库请求》";//转运单号
        String sampleGrpupEmailAttaTemplate = "trans_plan_B.xls";
        String sampleGrpupEmailAttaName = "{0}-高危3期-生物样本入库请求_B.xls";//转运单号
        String sampleGrpupEmailContent = "您好！<br>" +
                "本次转运的《{0}-高危3期-生物样本入库请求》为{1}（{2}）。<br>" +
                "计划转运{3}个承担单位样本，共计{4}套样本。其中：<br>" +
                "{5}" +
                "   本次转运样本的详细入库请求，请查看附件“{6}”";
        String sampleGrpupEmailAttaNameReal = MessageFormat.format(sampleGrpupEmailAttaName, transProNo);
        List<String> fileIdB = Lists.newArrayList();
        fileIdB.add(jxlsService.createExcel("spem/" + sampleGrpupEmailAttaTemplate, sampleGrpupEmailAttaNameReal, beans));
        MailEntity bMailEntity = new MailEntity()
                .setSubject(MessageFormat.format(sampleGrpupEmailTitle, transProNo))
                .setContent(MessageFormat.format(sampleGrpupEmailContent, transProNo, rccName, rccCode, lccCount, boxCount, lccBoxDetail, sampleGrpupEmailAttaNameReal))
                .setTo(getTransMailsByType((short) 3, emailList))
                .setFileIds(fileIdB);
        mailService.send(bMailEntity);

        //任务发起人发送短息
        String mobileContent = "{0}您好！已生成新的高危转运计划 {1}，请及时查看网站并更新取件人和取件时间。";
        String userid = pipScmTransProcMaster.getCreateBy();
        SysAccount account = sysAccountMapper.selectByPrimaryKey(userid);
        if (account != null && account.getTelNumber() != null) {
            String userName = pipScmTransProcMaster.getCreateByName();
            smsService.send(account.getTelNumber(), MessageFormat.format(mobileContent, userName, transProNo));
        }
    }

    /**
     * 结束转运后，发送邮件和短信
     */
    public void finishTransProInThread(String transProId) {

        logger.info("finish_trans send begin:" + transProId);
        PipScmTransProcMaster pipScmTransProcMaster = transProcMasterMapper.selectByPrimaryKey(transProId);
        if (pipScmTransProcMaster == null) {
            return;
        }
        PipScmTransProcDetailExample example = new PipScmTransProcDetailExample();
        example.createCriteria().andMasterIdEqualTo(transProId);
        List<PipScmTransProcDetail> list = transProcDetailMapper.selectByExample(example);

        //邮件组
        PipScmTransProcMasterMailExample exampleMail = new PipScmTransProcMasterMailExample();
        exampleMail.createCriteria().andTransIdEqualTo(pipScmTransProcMaster.getId());
        List<PipScmTransProcMasterMail> emailList = pipScmTransProcMasterMailMapper.selectByExample(exampleMail);

        //申请单号
        String transProNo = pipScmTransProcMaster.getTransNo();
        String rccCode = pipScmTransProcMaster.getRccCode();
        String rccName = getRccName(rccCode);
        Integer lccCount = list.size();
        Integer boxCount = 0;

        //邮件的附件使用
        List<TransProOfLcc> attrOfLcc = Lists.newArrayList();
        String lccBoxDetail = getLccBoxDetail(list, attrOfLcc);
        List<String> detailIds = Lists.newArrayList();
        for (PipScmTransProcDetail detail : list) {
            boxCount += detail.getBoxCount();
            detailIds.add(detail.getId());
        }

        //图片
        PipScmTransProcDetailPicExample examplePic = new PipScmTransProcDetailPicExample();
        examplePic.createCriteria().andTransIdEqualTo(pipScmTransProcMaster.getId());
        List<PipScmTransProcDetailPic> picList = pipScmTransProcDetailPicMapper.selectByExample(examplePic);
        List<String> files = Lists.newArrayList();
        StringBuilder fileNames = new StringBuilder();
        for (PipScmTransProcDetailPic pic : picList) {
            files.add(pic.getFilePath());
            fileNames.append(pic.getSrcFileName()).append(";");
        }

        // 样本接收人 上传运单时填写
        PipScmFrozenboxTransportExample transportExample = new PipScmFrozenboxTransportExample();
        transportExample.createCriteria().andTransDetailIdIn(detailIds);
        List<PipScmFrozenboxTransport> transports = pipScmFrozenboxTransportMapper.selectByExample(transportExample);
        Set<String> operators = Sets.newHashSet();
        transports.forEach(x -> {
            operators.add(x.getReceiveOperator());
        });
        String operatorNames = String.join(",", operators);

        /**
         *   P
         发件人：cm1819@163.com
         收件人：《转运组邮箱列表选中邮箱》
         标题：D006-RCC_CODE-YYYYMMDD转运交接记录
         正文：
         您好！
         D006-RCC_CODE-YYYYMMDD_高危3期样本转运计划中包含的全部样本已交付国家心血管病中心样本库样本库接收人：XXX
         本次转运项目点为RCC_NAME（RCC_CODE）。
         本次转运XXXX个承担单位样本，共计XXXX套样本。其中：
         LCC_NAME，XXXX套样本；
         LCC_NAME，XXXX套样本；
         LCC_NAME，XXXX套样本；
         详细转运内容请查看附件“D006-RCC_CODE-YYYYMMDD_序号_VID”


         */
        String pTitle = "《{0}-高危3期-转运样本入库交接记录》";
        String pContent = "您好！<br>" +
                "本次《{0}-高危3期-样本转运申请》中包含的全部样本已交付国家心血管病中心<br>"
                + "样本库接收人：{1}<br>" +//rcc name ，rcc Code
                "本次转运项目点为{2}（{3}）。<br>" +//
                "本次转运{4}个承担单位样本，共计{5}套样本。其中：<br>" +//
                "{6}" +
                "   本次申请的《样本入库交接记录》，请查看附件“{7}”";
        MailEntity pMailEntity = new MailEntity();
        pMailEntity.setSubject(MessageFormat.format(pTitle, transProNo))
                .setTo(getTransMailsByType((short) 2, emailList))
                .setContent(MessageFormat.format(pContent, transProNo, operatorNames, rccName, rccCode, lccCount, boxCount, lccBoxDetail, fileNames.toString()))
                .setFileIds(files);
        mailService.send(pMailEntity);

        /**
         * T
         发件人：cm1819@163.com
         收件人：《转运组邮箱列表选中邮箱》
         标题：D006-RCC_CODE-YYYYMMDD转运交接记录
         正文：
         您好！
         D006-RCC_CODE-YYYYMMDD_高危3期样本转运计划中包含的全部样本已交付国家心血管病中心样本库
         样本库接收人：XXX
         本次转运目标为RCC_NAME项目点（RCC_CODE）。
         本次转运XXXX个承担单位样本，共计XXXX套样本。其中：
         LCC_NAME，XXXX套样本；
         LCC_NAME，XXXX套样本；
         LCC_NAME，XXXX套样本；
         详细转运内容请查看附件“D006-RCC_CODE-YYYYMMDD_序号_VID”

         */
        String tTitle = "《{0}》-高危3期-转运样本入库交接记录";
        String tContent = "您好！<br>" +
                "本次《{0}》中包含的全部样本已交付国家心血管病中心样本库 <br>"
                + "样本库接收人：{1}<br>" +//rcc name ，rcc Code
                "本次转运项目点为{2}（{3}）。<br>" +//
                "本次转运{4}个承担单位样本，共计{5}套样本。其中：<br>" +//
                "{6}" +
                "   本次计划的《样本入库交接记录》，请查看附件“{7}”";
        MailEntity tMailEntity = new MailEntity();
        tMailEntity.setSubject(MessageFormat.format(tTitle, transProNo))
                .setTo(getTransMailsByType((short) 1, emailList))
                .setContent(MessageFormat.format(tContent, transProNo, operatorNames, rccName, rccCode, lccCount, boxCount, lccBoxDetail, fileNames.toString()))
                .setFileIds(files);
        mailService.send(tMailEntity);
        /**
         * B
         发件人：cm1819@163.com
         收件人：《转运组邮箱列表选中邮箱》
         标题：D006-RCC_CODE-YYYYMMDD转运交接记录
         正文：
         您好！
         D006-RCC_CODE-YYYYMMDD_高危3期样本转运计划中包含的全部样本已交付国家心血管病中心样本库
         样本库接收人：XXX
         本次转运项目点为RCC_NAME（RCC_CODE）。
         本次转运XXXX个承担单位样本，共计XXXX套样本。其中：
         LCC_NAME，XXXX套样本；
         LCC_NAME，XXXX套样本；
         LCC_NAME，XXXX套样本；
         详细转运内容请查看附件“D006-RCC_CODE-YYYYMMDD_序号_VID”

         */
        String bTitle = "《{0}-高危3期-转运样本入库交接记录》";
        String bContent = "您好！<br>" +
                "本次《{0}-高危3期-样本入库请求》中包含的全部样本已交付国家心血管病中心样本库<br>"
                + "样本库接收人：{1}<br>" +//rcc name ，rcc Code
                "本次转运项目点为{2}（{3}）。<br>" +//
                "本次转运{4}个承担单位样本，共计{5}套样本。其中：<br>" +//
                "{6}" +
                "   本次请求的《样本入库交接记录》，请查看附件“{7}”";
        MailEntity bMailEntity = new MailEntity();
        bMailEntity.setSubject(MessageFormat.format(bTitle, transProNo))
                .setTo(getTransMailsByType((short) 3, emailList))
                .setContent(MessageFormat.format(bContent, transProNo, operatorNames, rccName, rccCode, lccCount, boxCount, lccBoxDetail, fileNames.toString()))
                .setFileIds(files);
        mailService.send(bMailEntity);


        //任务发起人发送短息
        String mobileContent = "{0}您好！《{1}》计划的所有样本，已入库国家心血管病中心样本库。";
        String userId = pipScmTransProcMaster.getCreateBy();
        SysAccount account = sysAccountMapper.selectByPrimaryKey(userId);
        if (account != null && account.getTelNumber() != null) {
            String userName = pipScmTransProcMaster.getCreateByName();
            smsService.send(account.getTelNumber(), MessageFormat.format(mobileContent, userName, transProNo));
        }

        logger.info("finish_trans send end:" + transProId);
    }


    private String getRccName(String rccCode) {
        PipCommRccExample example = new PipCommRccExample();
        example.createCriteria()
                .andRccCodeEqualTo(rccCode);
        List<PipCommRcc> rccList = pipCommRccMapper.selectByExample(example);
        if (rccList.size() == 0) {
            return "";
        }
        return rccList.get(0).getRccName();
    }
}
