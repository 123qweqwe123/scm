package com.jet;

import com.jet.datasync.bdcor3.domain.PipScmFrozentube3;
import com.jet.datasync.bdcor3.proto.PipScmFrozentubeProtos;
import com.jet.datasync.core.util.ClassToProtoBuilderUtil;
import org.junit.Test;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/21 下午1:20
 */
public class ClassToProtoBuilderUtilTests {

    @Test
    public void testGetProtoBuilder() {
        PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube.Builder transPipScmFrozentube = PipScmFrozentubeProtos.TransPipScmFrozentubes.PipScmFrozentube.newBuilder();
        PipScmFrozentube3 tube = new PipScmFrozentube3();
        tube.setBloodCode("11111");
        tube.setTubeCode("2222");
        tube.setTubeType("type");
        ClassToProtoBuilderUtil.getProtoBuilder(tube, transPipScmFrozentube);
        System.out.println(transPipScmFrozentube.getTubeCode());
        System.out.println(transPipScmFrozentube.getTubeType());

    }
}
