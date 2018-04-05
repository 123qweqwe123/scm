package com.jet.scm.mobile.core.exception;

/**
 * Description:
 * <pre>
 *     表单远程校验异常
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/22 下午5:38
 */
public class ValidatorException extends RuntimeException {

    public ValidatorException() {
    }

    public ValidatorException(String message) {
        super(message);
    }

    public ValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidatorException(Throwable cause) {
        super(cause);
    }
}
