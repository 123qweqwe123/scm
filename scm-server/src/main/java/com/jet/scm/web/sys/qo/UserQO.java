package com.jet.scm.web.sys.qo;

/**
 * Description:
 * <pre>
 *     登录表单数据
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/31 下午6:27
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
