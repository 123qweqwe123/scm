package com.jet.scm.thirdservice.datasync.bdcor3.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.jet.datasync.bdcor3.proto.*;
import com.jet.scm.core.utils.Utils;
import com.jet.scm.thirdservice.datasync.bdcor3.SyncDataFromBdcor3Service;
import com.jet.scm.thirdservice.datasync.config.ISyncDataManager;
import com.jet.scm.web.proj.domain.PipCommLcc;
import com.jet.scm.web.proj.domain.PipCommLccUser;
import com.jet.scm.web.proj.domain.PipCommRcc;
import com.jet.scm.web.proj.mapper.PipCommLccMapper;
import com.jet.scm.web.proj.mapper.PipCommLccUserMapper;
import com.jet.scm.web.proj.mapper.PipCommRccMapper;
import com.jet.scm.web.spem.domain.PipScmFrozenbox;
import com.jet.scm.web.spem.domain.PipScmFrozentube;
import com.jet.scm.web.spem.mapper.PipScmFrozenboxMapper;
import com.jet.scm.web.spem.mapper.PipScmFrozentubeMapper;
import com.jet.scm.web.sys.domain.SysDataSyncLog;
import com.jet.scm.web.sys.mapper.SysDataSyncLogMapper;
import org.apache.http.client.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/12 下午1:09
 */
public class SyncDataFromBdcor3ServiceImpl implements SyncDataFromBdcor3Service {

    private Logger logger = LoggerFactory.getLogger(SyncDataFromBdcor3ServiceImpl.class);

    private HttpClient httpClient;
    private Environment env;

    @Autowired
    private PipScmFrozenboxMapper pipScmFrozenboxMapper;
    @Autowired
    private PipScmFrozentubeMapper pipScmFrozentubeMapper;
    @Autowired
    private PipCommRccMapper pipCommRccMapper;
    @Autowired
    private PipCommLccMapper pipCommLccMapper;
    @Autowired
    private PipCommLccUserMapper pipCommLccUserMapper;

    @Autowired
    private SysDataSyncLogMapper dataSyncLogMapper;

    @Autowired
    private ISyncDataManager syncDataManager;

    public SyncDataFromBdcor3ServiceImpl(Environment env) {
        this.env = env;
    }

    @Override
    public void syncPipScmFrozenboxes() {
        SysDataSyncLog log = new SysDataSyncLog();
        log.setId(Utils.generateUUID());
        log.setStartTime(new Date());
        try {
            Map<String, String> params = Maps.newHashMap();
            // 更新前一天的数据
            LocalDateTime date = LocalDateTime.now().minusDays(1).with(LocalTime.MIN);
            String transDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            params.put("transDate", transDate);
            byte[] response = syncDataManager.doGet("bdcor3/frozenboxes", params);

            PipScmFrozenboxProtos.TransPipScmFrozenboxes boxes = PipScmFrozenboxProtos.TransPipScmFrozenboxes.parseFrom(response);
            java.util.List<PipScmFrozenboxProtos.TransPipScmFrozenboxes.PipScmFrozenbox> frozenboxList = boxes.getPipScmFrozenboxsList();
            List<PipScmFrozenbox> boxes2update = Lists.newArrayList();
            frozenboxList.forEach(x -> {
                PipScmFrozenbox box = new PipScmFrozenbox();
                box.setFridgeId(x.getFridgeId());
                box.setBoxState((short) x.getBoxState());
                box.setRemark(x.getRemark());
                box.setIsCheckin((short) x.getIsCheckin());
                box.setCheckinlistId(x.getCheckinlistId());
                box.setLccCode(x.getLccCode());
                box.setCreateDate(new Date(x.getCreateDate()));
                box.setCreateBy(x.getCreateBy());
                box.setId(x.getId());
                box.setVersion(x.getVersion());
                box.setClientId(x.getClientId());
                box.setUpdateFlag((short) x.getUpdateFlag());
                box.setHr3UpdateDate(new Date(x.getHr3UpdateDate()));
                box.setTransDate(new Date(x.getTransDate()));
                box.setMpp("3");
                box.setTransDateFromMpp(new Date());
                box.setBoxCode(x.getBoxCode());
                box.setBoxType(x.getBoxType());
                box.setProjectId(x.getProjectId());
                try {
                    pipScmFrozenboxMapper.insertSelective(box);
                } catch (Exception e) {
                    boxes2update.add(box);
                    logger.error("插入失败，加入更新队列", e);
                }
            });
            logger.info("插入成功{}条", frozenboxList.size() - boxes2update.size());
            boxes2update.forEach(box -> {
                pipScmFrozenboxMapper.updateByPrimaryKeySelective(box);
            });
            logger.info("更新成功{}条", boxes2update.size());
            log.setInsertCount(frozenboxList.size() - boxes2update.size());
            log.setUpdateCount(boxes2update.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.setSyncId("pip_scm_frozenbox");
        log.setEndTime(new Date());
        dataSyncLogMapper.insert(log);
    }

    @Override
    public void syncPipScmFrozentubes() {
        SysDataSyncLog log = new SysDataSyncLog();
        log.setId(Utils.generateUUID());
        log.setStartTime(new Date());
        try {
            Map<String, String> params = Maps.newHashMap();
            LocalDateTime date = LocalDateTime.now().minusDays(1).with(LocalTime.MIN);
            String transDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            params.put("transDate", transDate);
            byte[] response = syncDataManager.doGet("bdcor3/frozentubes", params);

            PipScmFrozentubeProtos.TransPipScmFrozentubes boxes = PipScmFrozentubeProtos.TransPipScmFrozentubes.parseFrom(response);
            java.util.List<PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube> frozentubeList = boxes.getPipScmFrozentubesList();
            List<PipScmFrozentube> tubes2update = Lists.newArrayList();
            frozentubeList.forEach(x -> {
                PipScmFrozentube tube = new PipScmFrozentube();
                tube.setId(x.getId());
                tube.setProjectId(x.getProjectId());
                tube.setTubeCode(x.getTubeCode());
                tube.setTubeType(x.getTubeType());
                tube.setBoxCode(x.getBoxCode());
                tube.setBoxType(x.getBoxType());
                tube.setBoxColno((short) x.getBoxColno());
                tube.setBoxRowno((short) x.getBoxRowno());
                tube.setBloodCode(x.getBloodCode());
                tube.setCreateBy(x.getCreateBy());
                tube.setCreateDate(new Date(x.getCreateDate()));
                tube.setRemark(x.getRemark());
                tube.setIsHemolysis((short) x.getIsHemolysis());
                tube.setIsLipid((short) x.getIsLipid());
                tube.setLccCode(x.getLccCode());
                tube.setIsEmpty((short) x.getIsEmpty());
                tube.setFileName(x.getFileName());
                tube.setTerminalId(x.getTerminalId());
                tube.setVersion(x.getVersion());
                tube.setClientId(x.getClientId());
                tube.setUpdateFlag((short) x.getUpdateFlag());
                tube.setHr3UpdateDate(new Date(x.getHr3UpdateDate()));
                tube.setTransDate(new Date(x.getTransDate()));
                try {
                    pipScmFrozentubeMapper.insertSelective(tube);
                } catch (Exception e) {
                    tubes2update.add(tube);
                    logger.error("插入失败，加入更新队列", e);
                }
            });
            logger.info("插入成功{}条", frozentubeList.size() - tubes2update.size());
            tubes2update.forEach(tube -> {
                pipScmFrozentubeMapper.updateByPrimaryKeySelective(tube);
            });
            logger.info("更新成功{}条", tubes2update.size());
            log.setInsertCount(tubes2update.size() - tubes2update.size());
            log.setUpdateCount(tubes2update.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.setSyncId("pip_scm_frozentube");
        log.setEndTime(new Date());
        dataSyncLogMapper.insert(log);
    }

    @Override
    public void syncPipCommRccs() {
        SysDataSyncLog log = new SysDataSyncLog();
        log.setId(Utils.generateUUID());
        log.setStartTime(new Date());
        try {
            Map<String, String> params = Maps.newHashMap();
            byte[] response = syncDataManager.doGet("bdcor3/rccs", params);

            PipCommRccProtos.TransPipCommRcc rccs = PipCommRccProtos.TransPipCommRcc.parseFrom(response);
            java.util.List<PipCommRccProtos.TransPipCommRcc.PipCommRcc> rccList = rccs.getPipCommRccsList();
            List<PipCommRcc> rccs2update = Lists.newArrayList();
            rccList.forEach(x -> {
                PipCommRcc rcc = new PipCommRcc();
                rcc.setProjectId(x.getProjectId());
                rcc.setRccCode(x.getRccCode());
                rcc.setRccName(x.getRccName());
                rcc.setCountryCode(x.getCountryCode());
                rcc.setAreaCode(x.getAreaCode());
                rcc.setEnglishName(x.getEnglishName());
                rcc.setAddress(x.getAddress());
                rcc.setHelpCode(x.getHelpCode());
                rcc.setLatitudeLongitude(x.getLatitudeLongitude());
                rcc.setIsJoin((short) x.getIsJoin());
                rcc.setJoinTime(new Date(x.getJoinTime()));
                rcc.setUpdateBy(x.getUpdateBy());
                rcc.setUpdateTime(new Date(x.getUpdateTime()));
                rcc.setInitialTask(x.getInitialTask());
                rcc.setRiskTask(x.getRiskTask());
                rcc.setShortFollowupTask(x.getShortFollowupTask());
                rcc.setLongFollowupTask(x.getLongFollowupTask());
                try {
                    pipCommRccMapper.insertSelective(rcc);
                } catch (Exception e) {
                    rccs2update.add(rcc);
                    logger.error("插入失败，加入更新队列", e);
                }
            });
            logger.info("插入成功{}条", rccList.size() - rccs2update.size());
            rccs2update.forEach(rcc -> {
                pipCommRccMapper.updateByPrimaryKeySelective(rcc);
            });
            logger.info("更新成功{}条", rccs2update.size());
            log.setInsertCount(rccs2update.size() - rccs2update.size());
            log.setUpdateCount(rccs2update.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.setSyncId("pip_comm_rcc");
        log.setEndTime(new Date());
        dataSyncLogMapper.insert(log);
    }

    @Override
    public void syncPipCommLccs() {
        SysDataSyncLog log = new SysDataSyncLog();
        log.setId(Utils.generateUUID());
        log.setStartTime(new Date());
        try {
            Map<String, String> params = Maps.newHashMap();
            byte[] response = syncDataManager.doGet("bdcor3/lccs", params);

            PipCommLccProtos.TransPipCommLcc lccs = PipCommLccProtos.TransPipCommLcc.parseFrom(response);
            java.util.List<PipCommLccProtos.TransPipCommLcc.PipCommLcc> lccList = lccs.getPipCommLccsList();
            List<PipCommLcc> lccs2update = Lists.newArrayList();
            lccList.forEach(x -> {
                PipCommLcc lcc = new PipCommLcc();
                lcc.setProjectId(x.getProjectId());
                lcc.setLccCode(x.getLccCode());
                lcc.setLccName(x.getLccName());
                lcc.setCountryCode(x.getCountryCode());
                lcc.setAreaCode(x.getAreaCode());
                lcc.setStatus((short) x.getStatus());
                lcc.setCreateBy(x.getCreateBy());
                lcc.setCreateDate(new Date(x.getCreateDate()));
                lcc.setUpdateBy(x.getUpdateBy());
                lcc.setUpdateDate(new Date(x.getUpdateDate()));
                lcc.setIsRemoved((short) x.getIsRemoved());
                lcc.setFtpIp(x.getFtpIp());
                lcc.setFtpPort(new BigDecimal(x.getFtpPort()));
                lcc.setFtpUser(x.getFtpUser());
                lcc.setFtpPassword(x.getFtpPassword());
                lcc.setCostSum(new BigDecimal(x.getCostSum()));
                lcc.setEnglishName(x.getEnglishName());
                lcc.setAddress(x.getAddress());
                lcc.setProjectManager(x.getProjectManager());
                lcc.setPmTel(x.getPmTel());
                lcc.setPmEmail(x.getPmEmail());
                lcc.setContractSignDate(new Date(x.getContractSignDate()));
                lcc.setIsSignContract(x.getIsSignContract());
                lcc.setHigherApproveDate(new Date(x.getHigherApproveDate()));
                lcc.setIsTraining(x.getIsTraining());
                lcc.setExpectStartDate(new Date(x.getExpectStartDate()));
                lcc.setLccType(x.getLccType());
                lcc.setIsEthical(x.getIsEthical());
                lcc.setEthicalEffectiveDate(new Date(x.getEthicalEffectiveDate()));
                lcc.setEthicalDisableDate(new Date(x.getEthicalDisableDate()));
                lcc.setEthicalPaperCode(x.getEthicalPaperCode());
                lcc.setDeliveryAddress(x.getDeliveryAddress());
                lcc.setDeliveryContact(x.getDeliveryContact());
                lcc.setDeliveryTel(x.getDeliveryTel());
                lcc.setStartDate(new Date(x.getStartDate()).toString());
                lcc.setContact(x.getContact());
                lcc.setTel(x.getTel());
                lcc.setRccCode(x.getRccCode());
                lcc.setIsAdminDep(x.getIsAdminDep());
                lcc.setOrgan(x.getOrgan());
                lcc.setLccrole(x.getLccrole());
                lcc.setCityCode(x.getCityCode());
                lcc.setWorkload(new BigDecimal(x.getWorkload()));
                lcc.setHelpCode(x.getHelpCode());
                lcc.setEndDate(new Date(x.getEndDate()));
                lcc.setLccCategory(x.getLccCategory());
                lcc.setHospitalType(x.getHospitalType());
                lcc.setPmDuty(x.getPmDuty());
                lcc.setEstimatedBeginTime(new Date(x.getEstimatedBeginTime()));
                lcc.setEstimatedEndTime(new Date(x.getEstimatedBeginTime()));

                try {
                    pipCommLccMapper.insertSelective(lcc);
                } catch (Exception e) {
                    lccs2update.add(lcc);
                    logger.error("插入失败，加入更新队列", e);
                }
            });
            logger.info("插入成功{}条", lccList.size() - lccs2update.size());
            lccs2update.forEach(lcc -> {
                pipCommLccMapper.updateByPrimaryKeySelective(lcc);
            });
            logger.info("更新成功{}条", lccs2update.size());
            log.setInsertCount(lccs2update.size() - lccs2update.size());
            log.setUpdateCount(lccs2update.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.setSyncId("pip_comm_lcc");
        log.setEndTime(new Date());
        dataSyncLogMapper.insert(log);
    }

    @Override
    public void syncPipCommLccUsers() {
        SysDataSyncLog log = new SysDataSyncLog();
        log.setId(Utils.generateUUID());
        log.setStartTime(new Date());
        try {
            Map<String, String> params = Maps.newHashMap();
            byte[] response = syncDataManager.doGet("bdcor3/lccusers", params);

            PipCommLccUserProtos.TransPipCommLccUser lccUsers = PipCommLccUserProtos.TransPipCommLccUser.parseFrom(response);
            java.util.List<PipCommLccUserProtos.TransPipCommLccUser.PipCommLccUser> lccUserList = lccUsers.getPipCommLccUsersList();
            List<PipCommLccUser> lccUsers2update = Lists.newArrayList();
            lccUserList.forEach(x -> {
                PipCommLccUser lccUser = new PipCommLccUser();

                try {
                    pipCommLccUserMapper.insertSelective(lccUser);
                } catch (Exception e) {
                    lccUsers2update.add(lccUser);
                    logger.error("插入失败，加入更新队列", e);
                }
            });
            logger.info("插入成功{}条", lccUserList.size() - lccUsers2update.size());
            lccUsers2update.forEach(lccUser -> {
                pipCommLccUserMapper.updateByPrimaryKeySelective(lccUser);
            });
            logger.info("更新成功{}条", lccUsers2update.size());
            log.setInsertCount(lccUserList.size() - lccUsers2update.size());
            log.setUpdateCount(lccUsers2update.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.setSyncId("pip_comm_lcc_user");
        log.setEndTime(new Date());
        dataSyncLogMapper.insert(log);
    }

}
