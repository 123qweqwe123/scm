package com.jet.scm.thirdservice.sms;

/**
 * Description:
 * <pre>
 *     系统短信接口
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午1:26
 */
public interface SMSService {

    /**
     *
     * @param tel 要发送的手机号
     * @param msg   发送的内容
     */
    void send(String tel, String msg);
}
