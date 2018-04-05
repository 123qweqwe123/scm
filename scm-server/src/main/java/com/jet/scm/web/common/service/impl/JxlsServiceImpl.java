package com.jet.scm.web.common.service.impl;

import com.jet.scm.core.exception.ServiceException;
import com.jet.scm.thirdservice.fdfs.FileService;
import com.jet.scm.web.common.service.JxlsService;
import org.csource.common.NameValuePair;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午6:59
 */
@Service
public class JxlsServiceImpl implements JxlsService {

    Logger logger = LoggerFactory.getLogger(JxlsServiceImpl.class);

    private static final String EXCEL_TEMPLATE_PATH = "template/";
    private static final String EXCEL_EXT_NAME = ".xls";

    @Autowired
    private FileService fileService;


    @Override
    public String createExcel(String templatePath, String fileName, Map<String, Object> vars) {
        Context context = new Context();
        vars.forEach(context::putVar);
        Resource resource = new ClassPathResource(EXCEL_TEMPLATE_PATH + templatePath);
        if (!resource.exists()) {
            throw new ServiceException("模板文件(" + templatePath + ")不存在，请将模板文件放在 src/main/resources/template 下面");
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            JxlsHelper.getInstance().processTemplate(resource.getInputStream(), out, context);
            logger.info("创建 excel 成功，文件名{}", fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        NameValuePair[] pairs = new NameValuePair[1];
        pairs[0] = new NameValuePair("name", fileName);
        return fileService.uploadFile(out.toByteArray(), EXCEL_EXT_NAME, pairs);
    }

}