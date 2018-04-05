package com.jet.scm.mobile.web.sys.controller;

import com.jet.scm.mobile.core.utils.Securitys;
import com.jet.scm.mobile.web.sys.qo.UserQO;
import com.jet.scm.mobile.web.sys.service.UserService;
import com.jet.scm.mobile.web.sys.vo.LoginVO;
import com.jet.scm.mobile.web.sys.vo.UserVO;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/31 上午10:57
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public LoginVO login(UserQO userQO, HttpServletRequest request) {
        LoginVO loginVO = new LoginVO();
        if (SecurityUtils.getSubject().isAuthenticated()) {
            loginVO.setIsSuccess(true);
        } else {
            loginVO.setIsSuccess(false);
            loginVO.setErrMsg("用户名或者密码错误");
        }
        return loginVO;
    }

    @GetMapping("/user")
    public UserVO user() {
        System.out.println(444);
        UserVO userVO = new UserVO();
        userVO.setName(Securitys.getName());
        userVO.setTel(Securitys.getTel());
        return userVO;
    }

}
