package com.jet.datasync.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Description:
 * <pre>
 *     通过账号密码认证对所有的请求进行过滤
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/11 下午3:20
 */
@RestController
public class AuthenticationController {

    @Autowired
    private Environment env;

    @RequestMapping("/login")
    public ResponseEntity<?> login(HttpServletRequest request, HttpSession session) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (env.getProperty("login.username").equals(username)
                && env.getProperty("login.password").equals(password)) {
            session.setAttribute("loginSuccess", true);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
