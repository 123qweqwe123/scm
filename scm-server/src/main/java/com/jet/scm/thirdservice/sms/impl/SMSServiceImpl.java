package com.jet.scm.thirdservice.sms.impl;

import com.jet.scm.core.constant.AppConsts;
import com.jet.scm.core.exception.ServiceException;
import com.jet.scm.thirdservice.sms.SMSService;
import com.bdcore.webservice.client.MsgClient;
import com.bdcore.webservice.client.SendResultCallback;
import com.bdcore.webservice.client.bean.MsgOfSend;
import com.bdcore.webservice.client.config.ClientConfig;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Description:
 * <pre>
 *     短信发送服务
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午1:37
 */
@Service
public class SMSServiceImpl implements SMSService {

    Logger logger = LoggerFactory.getLogger(SMSServiceImpl.class);

    private MsgClient client;

    @Value("${third-service.sms.msg-server-ip}")
    private String msgServerIp;

    @Value("${third-service.sms.msg-server-port}")
    private String msgServerPort;

    @Value("${third-service.sms.msg-reply-port}")
    private String replyPort;

    @Value("${third-service.sms.msg-reply-ip}")
    private String replyIp;

    @Value("${third-service.sms.msg-send-status-ip}")
    private String msgSendStatusIp;

    @Value("${third-service.sms.msg-send-status-port}")
    private String msgSendStatusPort;

    @Value("${third-service.sms.msg-server-subcode}")
    private String msgServerSubcode;

    @Value("${third-service.sms.msg-sign}")
    private String msgSign;

    @PostConstruct
    private void initClient() {
        if (client == null) {
            ClientConfig config = new ClientConfig();
            config.put(ClientConfig.MSG_SERVER_IP, msgServerIp);
            config.put(ClientConfig.MSG_SERVER_PORT, msgServerPort);
            config.put(ClientConfig.PROJ_ID, AppConsts.PROJECT_ID);
            config.put(ClientConfig.REPLY_SERVER_IP, replyIp);
            config.put(ClientConfig.REPLY_SERVER_PORT, replyPort);
            config.put(ClientConfig.SEND_STATUS_SERVER_IP, msgSendStatusIp);
            config.put(ClientConfig.SEND_STATUS_SERVER_PORT, msgSendStatusPort);
            config.put(ClientConfig.MSG_SEND_SUBCODE, "03");
            config.put(ClientConfig.MSG_SIGN, msgSign);

            client = new MsgClient(config);
            client.start();
        }
    }

    /**
     * 调用短信服务，该操作是异步的
     *
     * @param tel 要发送的手机号
     * @param msg 发送的内容
     */
    @Override
    @Async
    public void send(String tel, String msg) {
        if (StringUtils.isBlank(tel) || StringUtils.isBlank(msg)) {
            throw new ServiceException("发送短信手机号或者内容不能为空");
        }
        MsgOfSend sendMsg = new MsgOfSend();
        sendMsg.setTel(tel);
        sendMsg.setContent(msg);
        sendMsg.setLinkId("linkid");
        if (client == null) {
            initClient();
        }
        double i = Math.random();
        client.send(sendMsg, new SendResultCallback() {
            @Override
            public void callback(int result, String resultMsg, MsgOfSend msgOfSend) {
                if (result == 1) {
                    logger.info("短信发送成功");
                } else {
                    logger.error("短信发送失败,{},{}", result, resultMsg);
                }
            }
        });
    }
}
