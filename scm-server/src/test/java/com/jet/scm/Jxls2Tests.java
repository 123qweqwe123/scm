package com.jet.scm;

import com.google.common.collect.Lists;
import com.jet.scm.web.spem.domain.PipScmTransProcDetail;
import com.jet.scm.web.spem.domain.TransProOfLcc;
import org.junit.Test;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 *     本系统使用 JXLS2(之前系统使用的是 JXLS1.0，二者不兼容)
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午4:53
 */
public class Jxls2Tests {


    /**
     * 单 sheet 测试
     * @throws IOException
     */
    @Test
    public void testExportExcel() throws IOException {
        Resource resource = new ClassPathResource("template/spem/trans_plan_B_template.xls");
        Context context = new Context();
        List<PipScmTransProcDetail> list = Lists.newArrayList();
        PipScmTransProcDetail detail1 = new PipScmTransProcDetail();
        detail1.setTransDetailNo("sdfsdfsdf");
        detail1.setAreaName("sfsdf");
        detail1.setRccCode("fsdsdf");
        detail1.setLccCode("222");
        detail1.setLccName("测试医院");
        detail1.setBoxCount(111);
        list.add(detail1);

        PipScmTransProcDetail detail2 = new PipScmTransProcDetail();
        detail2.setTransDetailNo("sdfsdfsdf");
        detail2.setAreaName("sfsdf");
        detail2.setRccCode("fsdsdf");
        detail2.setLccCode("222");
        detail2.setLccName("测试医院");
        detail2.setBoxCount(111);
        list.add(detail2);

        context.putVar("results",list);
        OutputStream os = new FileOutputStream("target/object_collection_output.xls");
        JxlsHelper.getInstance().processTemplate(resource.getInputStream(), os, context);
        os.flush();
    }

    @Test
    public void testExportExcelMultiSheet() throws IOException {
        Resource resource = new ClassPathResource("template/spem/trans_plan_T_template.xls");
        Context context = new Context();
        List<PipScmTransProcDetail> list = Lists.newArrayList();
        PipScmTransProcDetail detail1 = new PipScmTransProcDetail();
        detail1.setTransDetailNo("sdfsdfsdf");
        detail1.setAreaName("sfsdf");
        detail1.setRccCode("fsdsdf");
        detail1.setLccCode("222");
        detail1.setLccName("测试医院");
        detail1.setBoxCount(111);
        list.add(detail1);
        context.putVar("results",list);

        TransProOfLcc lcc = new TransProOfLcc(detail1);
        lcc.setAreaName("sdfsdf");
        lcc.setRccCode("sdfsdf");
        lcc.setLccCode("111");
        lcc.setLccName("222");
        lcc.setBoxCode("sdfasd");
        lcc.setTubeCount(100);
        List<TransProOfLcc> attrs = Lists.newArrayList();
        attrs.add(lcc);
        context.putVar("boxes", attrs);

        context.putVar("transNo", "测试");

        OutputStream os = new FileOutputStream("target/multi_sheet.xls");
        JxlsHelper.getInstance().processTemplate(resource.getInputStream(), os, context);
        os.flush();
        System.out.println(context.getVar("boxes"));
    }

    @Test
    public void spemExcelExportTests() throws Exception{
        List<PipScmTransProcDetail> list = Lists.newArrayList();
        PipScmTransProcDetail detail = new PipScmTransProcDetail();
        detail.setTransDetailNo("1111");
        detail.setAreaName("测试地区");
        detail.setRccCode("2101");
        detail.setLccCode("210101");
        detail.setLccName("测试 lcc");
        detail.setBoxCount(100);
        list.add(detail);
        String transProNo = "666-11";
        List<com.jet.scm.web.spem.domain.TransProOfLcc> attrOfLcc = Lists.newArrayList();
        TransProOfLcc lcc = new TransProOfLcc(detail);
        lcc.setIndex(1);
        lcc.setTubeCount(100);
        lcc.setBoxCode("1101011");
        attrOfLcc.add(lcc);
        Map<String, Object> beans = new HashMap();
        beans.put("results", list);
        beans.put("transNo", transProNo);
        beans.put("attrOfLcc", attrOfLcc);
        Context context = new Context();
        beans.forEach(context::putVar);

        Resource resource = new ClassPathResource("template/spem/trans_plan_T.xls");
        OutputStream os = new FileOutputStream("target/trans_plan_T_result.xls");
        JxlsHelper.getInstance().processTemplate(resource.getInputStream(), os, context);
        os.flush();
    }
}
