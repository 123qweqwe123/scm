package com.jet.datasync.bdcor3.service.impl;

import com.jet.datasync.bdcor3.domain.*;
import com.jet.datasync.bdcor3.filter.PipScmFrozenbox3Filter;
import com.jet.datasync.bdcor3.filter.PipScmFrozentube3Filter;
import com.jet.datasync.bdcor3.mapper.*;
import com.jet.datasync.bdcor3.proto.*;
import com.jet.datasync.bdcor3.service.Bdcor3Service;
import com.jet.datasync.core.util.ClassToProtoBuilderUtil;
import com.jet.datasync.core.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/12 上午9:25
 */
@Service
public class Bdcor3ServiceImpl implements Bdcor3Service {

    Logger logger = LoggerFactory.getLogger(Bdcor3ServiceImpl.class);

    @Autowired
    private PipScmFrozenbox3Mapper pipScmFrozenbox3Mapper;
    @Autowired
    private PipScmFrozentube3Mapper pipScmFrozentube3Mapper;
    @Autowired
    private PipCommRcc3Mapper pipCommRcc3Mapper;
    @Autowired
    private PipCommLcc3Mapper pipCommLccMapper;
    @Autowired
    private PipCommLccUser3Mapper pipCommLccUserMapper;


    @Override
    public PipScmFrozenboxProtos.TransPipScmFrozenboxes queryScmFrozenboxes(PipScmFrozenbox3Filter filter) {
        PipScmFrozenbox3Example exp = new PipScmFrozenbox3Example();
        exp.createCriteria().andTransDateGreaterThanOrEqualTo(filter.getTransDate());
        List<PipScmFrozenbox3> boxes = pipScmFrozenbox3Mapper.selectByExample(exp);
        PipScmFrozenboxProtos.TransPipScmFrozenboxes.Builder transPipScmFrozenboxes = PipScmFrozenboxProtos.TransPipScmFrozenboxes.newBuilder();
        transPipScmFrozenboxes.setUuid(Utils.generateUUID());
        transPipScmFrozenboxes.setTransTime(filter.getTransDate().getTime());
        transPipScmFrozenboxes.addAllPipScmFrozenboxs(boxes.stream().map(x -> {
            PipScmFrozenboxProtos.TransPipScmFrozenboxes.PipScmFrozenbox.Builder boxBuilder = PipScmFrozenboxProtos.TransPipScmFrozenboxes.PipScmFrozenbox.newBuilder();
            boxBuilder = (PipScmFrozenboxProtos.TransPipScmFrozenboxes.PipScmFrozenbox.Builder) ClassToProtoBuilderUtil.getProtoBuilder(x, boxBuilder);
            return boxBuilder.build();
        }).collect(Collectors.toList()));

        return transPipScmFrozenboxes.build();
    }

    @Override
    public PipScmFrozentubeProtos.TransPipScmFrozentubes queryScmFrozentubes(PipScmFrozentube3Filter filter) {
        PipScmFrozentube3Example example = new PipScmFrozentube3Example();
        example.createCriteria().andTransDateGreaterThanOrEqualTo(filter.getTransDate());
        List<PipScmFrozentube3> tubes = pipScmFrozentube3Mapper.selectByExample(example);
        PipScmFrozentubeProtos.TransPipScmFrozentubes.Builder transPipScmFrozentube = PipScmFrozentubeProtos.TransPipScmFrozentubes.newBuilder();
        transPipScmFrozentube.addAllPipScmFrozentubes(
                tubes.stream().map(pipScmFrozentube -> {
                    PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube.Builder tubeBuilder = PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube.newBuilder();
                    tubeBuilder = (PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube.Builder) ClassToProtoBuilderUtil.getProtoBuilder(pipScmFrozentube, tubeBuilder);
                    return tubeBuilder.build();
                }).collect(Collectors.toList())
        );
        return transPipScmFrozentube.build();
    }

    @Override
    public PipCommRccProtos.TransPipCommRcc queryCommRcc(PipCommRcc3 pipCommRcc) {
        PipCommRcc3Example example = new PipCommRcc3Example();
        List<PipCommRcc3> rcc3s = pipCommRcc3Mapper.selectByExample(example);

        PipCommRccProtos.TransPipCommRcc.Builder builder = PipCommRccProtos.TransPipCommRcc.newBuilder();
        builder.addAllPipCommRccs(
                rcc3s.stream().map(rcc -> {
                    PipCommRccProtos.TransPipCommRcc.PipCommRcc.Builder rccBuilder = PipCommRccProtos.TransPipCommRcc.PipCommRcc.newBuilder();
                    rccBuilder = (PipCommRccProtos.TransPipCommRcc.PipCommRcc.Builder) ClassToProtoBuilderUtil.getProtoBuilder(rcc, rccBuilder);
                    return rccBuilder.build();
                }).collect(Collectors.toList())
        );
        return builder.build();
    }

    @Override
    public PipCommLccProtos.TransPipCommLcc queryCommLcc(PipCommLcc3 pipCommLcc) {
        PipCommLcc3Example example = new PipCommLcc3Example();
        List<PipCommLcc3> lcc3s = pipCommLccMapper.selectByExample(example);

        PipCommLccProtos.TransPipCommLcc.Builder builder = PipCommLccProtos.TransPipCommLcc.newBuilder();
        builder.addAllPipCommLccs(
                lcc3s.stream().map(lcc -> {
                    PipCommLccProtos.TransPipCommLcc.PipCommLcc.Builder lccBuilder = PipCommLccProtos.TransPipCommLcc.PipCommLcc.newBuilder();
                    lccBuilder = (PipCommLccProtos.TransPipCommLcc.PipCommLcc.Builder) ClassToProtoBuilderUtil.getProtoBuilder(lcc, lccBuilder);
                    return lccBuilder.build();
                }).collect(Collectors.toList())
        );
        return builder.build();
    }

    @Override
    public PipCommLccUserProtos.TransPipCommLccUser queryCommLccUser(PipCommLccUser3 pipCommLccUser) {
        PipCommLccUser3Example example = new PipCommLccUser3Example();
        List<PipCommLccUser3> lccUser3s = pipCommLccUserMapper.selectByExample(example);

        PipCommLccUserProtos.TransPipCommLccUser.Builder builder = PipCommLccUserProtos.TransPipCommLccUser.newBuilder();
        builder.addAllPipCommLccUsers(
                lccUser3s.stream().map(lccUser -> {
                    PipCommLccUserProtos.TransPipCommLccUser.PipCommLccUser.Builder lccUserbuilder = PipCommLccUserProtos.TransPipCommLccUser.PipCommLccUser.newBuilder();
                    lccUserbuilder = (PipCommLccUserProtos.TransPipCommLccUser.PipCommLccUser.Builder) ClassToProtoBuilderUtil.getProtoBuilder(lccUser, lccUserbuilder);
                    return lccUserbuilder.build();
                }).collect(Collectors.toList())
        );
        return builder.build();
    }


    /**
     * @param filter
     * @return
     */
    @Override
    public String syncBoxStatus(PipScmFrozenbox3Filter filter) {
        if (StringUtils.isEmpty(filter.getBoxesStr())) {
            return "冻存盒数量不能为空";
        }
        String[] boxes = filter.getBoxesStr().split(",");
        try {
            // 大于 1000 oracle 不能使用 in
            if (boxes.length >= 1000) {
                for (String boxStr : boxes) {
                    PipScmFrozenbox3 box = new PipScmFrozenbox3();
                    box.setIsCheckin((short) 1);
                    PipScmFrozenbox3Example exp = new PipScmFrozenbox3Example();
                    exp.createCriteria().andBoxCodeEqualTo(boxStr);
                    pipScmFrozenbox3Mapper.updateByExampleSelective(box, exp);
                }
            } else {
                PipScmFrozenbox3 box = new PipScmFrozenbox3();
                box.setIsCheckin((short) 1);
                PipScmFrozenbox3Example exp = new PipScmFrozenbox3Example();
                List<String> boxList = Arrays.stream(boxes).collect(Collectors.toList());
                exp.createCriteria().andBoxCodeIn(boxList);
                pipScmFrozenbox3Mapper.updateByExampleSelective(box, exp);
            }
            logger.info("修改高危三期冻存盒入库状态成功，修改{}条", boxes.length);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage(), e);
            return e.getMessage();
        }
    }
}
