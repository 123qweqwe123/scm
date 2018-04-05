package com.jet.datasync.bdcor2.service.impl;

import com.jet.datasync.bdcor2.domain.PipScmFrozenbox2;
import com.jet.datasync.bdcor2.domain.PipScmFrozentube2;
import com.jet.datasync.bdcor2.filter.PipScmFrozenbox2Filter;
import com.jet.datasync.bdcor2.filter.PipScmFrozentube2Filter;
import com.jet.datasync.bdcor2.mapper.PipScmFrozenbox2Mapper;
import com.jet.datasync.bdcor2.mapper.PipScmFrozentube2Mapper;
import com.jet.datasync.bdcor2.proto.PipScmFrozenboxProtos;
import com.jet.datasync.bdcor2.proto.PipScmFrozentubeProtos;
import com.jet.datasync.bdcor2.service.Bdcor2Service;
import com.jet.datasync.core.util.ClassToProtoBuilderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Description:
 * <pre>
 *     二期的数据目前是全量导入
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/21 上午10:43
 */
@Service
public class Bdcor2ServiceImpl implements Bdcor2Service {

    Logger logger = LoggerFactory.getLogger(Bdcor2ServiceImpl.class);

    @Autowired
    private PipScmFrozenbox2Mapper pipScmFrozenbox2Mapper;
    @Autowired
    private PipScmFrozentube2Mapper pipScmFrozentube2Mapper;


    @Override
    public PipScmFrozenboxProtos.TransPipScmFrozenboxes queryScmFrozenboxes(PipScmFrozenbox2Filter filter) {
        List<PipScmFrozenbox2> boxes = pipScmFrozenbox2Mapper.selectByExample(null);
        PipScmFrozenboxProtos.TransPipScmFrozenboxes.Builder transPipScmFrozenboxes = PipScmFrozenboxProtos.TransPipScmFrozenboxes.newBuilder();
        transPipScmFrozenboxes.addAllPipScmFrozenboxs(boxes.stream().map(x -> {
            PipScmFrozenboxProtos.TransPipScmFrozenboxes.PipScmFrozenbox.Builder boxBuilder = PipScmFrozenboxProtos.TransPipScmFrozenboxes.PipScmFrozenbox.newBuilder();
            boxBuilder = (PipScmFrozenboxProtos.TransPipScmFrozenboxes.PipScmFrozenbox.Builder) ClassToProtoBuilderUtil.getProtoBuilder(x, boxBuilder);
            return boxBuilder.build();
        }).collect(Collectors.toList()));

        return transPipScmFrozenboxes.build();
    }

    @Override
    public PipScmFrozentubeProtos.TransPipScmFrozentubes queryScmFrozentubes(PipScmFrozentube2Filter filter) {
        int totalFrozentube = pipScmFrozentube2Mapper.countByExample(null);
        int fetchSize = 100000;
        int batch = totalFrozentube / fetchSize;    // 每10000条处理一次
        final PipScmFrozentubeProtos.TransPipScmFrozentubes.Builder transPipScmFrozentube = PipScmFrozentubeProtos.TransPipScmFrozentubes.newBuilder();

        ExecutorService executorService = Executors.newFixedThreadPool(16);
        CountDownLatch d = new CountDownLatch(batch + 1);
        logger.info("共{}条数据，开始处理", totalFrozentube);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= batch; i++) {
            int start = i * fetchSize;
            int end = (i + 1) * fetchSize - 1;
            PipScmFrozentube2Filter f = new PipScmFrozentube2Filter();
            f.setStart(start);
            f.setEnd(end);
            executorService.submit(() -> {
                List<PipScmFrozentube2> subTubes = pipScmFrozentube2Mapper.selectByRownum(f);
                transPipScmFrozentube.addAllPipScmFrozentubes(
                        subTubes.stream().map(pipScmFrozentube -> {
                            PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube.Builder tubeBuilder = PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube.newBuilder();
                            tubeBuilder = (PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube.Builder) ClassToProtoBuilderUtil.getProtoBuilder(pipScmFrozentube, tubeBuilder);
                            return tubeBuilder.build();
                        }).collect(Collectors.toList())
                );
                logger.info("处理 {}-{} 行，处理了{}", f.getStart(), f.getEnd(), subTubes.size());
                d.countDown();
            });
        }
        try {
            d.await(30, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        logger.info("共处理数据{}，耗时{}" + transPipScmFrozentube.getPipScmFrozentubesCount(), endTime - startTime);
        return transPipScmFrozentube.build();
    }
}
