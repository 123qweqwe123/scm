package com.jet.scm.mobile.web.sys.qo;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/31 上午10:04
 */
public class UserQO {

    public UserQO() {
    }

    public UserQO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
