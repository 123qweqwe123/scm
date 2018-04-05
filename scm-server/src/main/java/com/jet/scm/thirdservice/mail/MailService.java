package com.jet.scm.thirdservice.mail;

import com.jet.scm.thirdservice.mail.domain.MailEntity;

/**
 * Description:
 * <pre>
 *     系统邮件接口
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午1:27
 */
public interface MailService {

    void send(MailEntity mailEntity);
}
