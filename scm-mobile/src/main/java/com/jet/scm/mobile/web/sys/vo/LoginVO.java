package com.jet.scm.mobile.web.sys.vo;

/**
 * Description:
 * <pre>
 *     登录返回
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/31 下午2:26
 */
public class LoginVO {

    private boolean isSuccess;
    private String errMsg;

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean success) {
        isSuccess = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
