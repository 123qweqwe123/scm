package com.jet.scm.mobile.core.exception;

/**
 * Description:
 * <pre>
 *     业务类通用异常
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/17 下午4:48
 */
public class ServiceException extends RuntimeException {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
