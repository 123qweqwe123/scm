package com.jet.scm.mobile.core.shiro.domain;

import java.io.Serializable;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/4 下午5:47
 */
public class ShiroUser implements Serializable {

    private String name;
    private String tel;
    private String accountId;

    public ShiroUser() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
