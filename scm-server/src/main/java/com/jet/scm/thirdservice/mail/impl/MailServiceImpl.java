package com.jet.scm.thirdservice.mail.impl;

import com.jet.scm.core.exception.ServiceException;
import com.jet.scm.thirdservice.fdfs.FileService;
import com.jet.scm.thirdservice.mail.MailService;
import com.jet.scm.thirdservice.mail.domain.MailEntity;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.csource.common.NameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午2:39
 */
@Service
public class MailServiceImpl implements MailService {

    Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);

    @Value(value = "${third-service.mail.server-request-url}")
    private String mailServerRequestUrl;

    @Autowired
    private FileService fileService;

    @Async
    @Override
    public void send(MailEntity mailEntity) {
        try {
            Form form = Form.form();
            form.add("subject", mailEntity.getSubject());
            form.add("content", mailEntity.getContent());
            mailEntity.getTo().forEach(to -> {
                form.add("to", to);
            });
            if (mailEntity.getCopyTo() != null) {
                mailEntity.getCopyTo().forEach(copyTo -> {
                    form.add("copyTo", copyTo);
                });
            }
            if (mailEntity.getFileIds() != null) {
                mailEntity.getFileIds().forEach(fileId -> {
                    form.add("fileNames", getFileNameWithFileId(fileId));
                    form.add("filePaths", fileId);
                });
            }
            String responce = Request.Post(mailServerRequestUrl)
                    .bodyForm(form.build(), Charset.forName("utf-8"))
                    .execute().returnContent().asString();
            if (!"success".equals(responce)) {
                logger.error("发送邮件失败，{}", responce);
                throw new ServiceException(responce);
            }
            logger.info("发送邮件成功，{}", mailEntity);
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("发送邮件失败", e);
            throw new ServiceException(" 邮件发送失败", e);
        }
    }

    private String getFileNameWithFileId(String fileId) {
        NameValuePair[] pairs = fileService.getFileMetaData(fileId);
        if (pairs == null) {
            return null;
        }
        for (NameValuePair pair : pairs) {
            if ("name".equals(pair.getName())) {
                return pair.getValue();
            }
        }
        return null;
    }
}
