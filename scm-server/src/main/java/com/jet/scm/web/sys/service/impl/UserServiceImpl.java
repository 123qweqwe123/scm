package com.jet.scm.web.sys.service.impl;

import com.jet.scm.core.constant.AppConsts;
import com.jet.scm.core.mvc.listener.MyHttpSessionListener;
import com.jet.scm.core.utils.PasswordUtils;
import com.jet.scm.core.utils.Securitys;
import com.jet.scm.core.utils.Utils;
import com.jet.scm.web.sys.domain.SysAccount;
import com.jet.scm.web.sys.domain.SysAccountExample;
import com.jet.scm.web.sys.domain.SysLoginLog;
import com.jet.scm.web.sys.mapper.SysAccountMapper;
import com.jet.scm.web.sys.mapper.SysLoginLogMapper;
import com.jet.scm.web.sys.qo.UserQO;
import com.jet.scm.web.sys.service.UserService;
import com.jet.scm.web.sys.vo.UserVO;
import com.google.common.collect.Maps;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/16 下午7:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysAccountMapper sysAccountMapper;

    @Autowired
    private SysLoginLogMapper sysLoginLogMapper;


    @Override
    public Map<String, Object> getUser() {
        Map<String, Object> res = Maps.newHashMap();
        res.put("menu", Securitys.getMenus());
        res.put("user", UserVO.buildUser());
        return res;
    }

    /**
     * @param userQO
     * @return
     */
    @Override
    public SysAccount login(UserQO userQO) {
        SysAccountExample exp = new SysAccountExample();
        exp.createCriteria().andLoginNameEqualTo(userQO.getUsername());
        List<SysAccount> accounts = sysAccountMapper.selectByExample(exp);
        if (accounts.size() > 0) {
            SysAccount account = accounts.get(0);
            String currPassword = PasswordUtils.getEncodePassWord(userQO.getPassword(), PasswordUtils.decodeHex(account.getSalt()));
            if (account.getPassword().equals(currPassword)) {
                return account;
            }
            throw new AuthenticationException("密码错误");
        }

        throw new UnknownAccountException("账号不存在");
    }

    @Override
    public void createLoginLog(ServletRequest request) {
        if (request instanceof HttpServletRequest) {
            HttpServletRequest req = (HttpServletRequest) request;
            SysLoginLog loginLog = new SysLoginLog();
            loginLog.setId(Utils.generateUUID());
            loginLog.setIsOnline(AppConsts.TRUE);
            loginLog.setLoginTime(new Date());
            loginLog.setIsSuccess(AppConsts.TRUE);
            loginLog.setMachineIp(request.getRemoteAddr());
            loginLog.setMachineName(request.getRemoteHost());
            loginLog.setUserAgent(req.getHeader("User-Agent"));//浏览器类型
            loginLog.setAccountId(Securitys.getAccountId());
            sysLoginLogMapper.insertSelective(loginLog);

            MyHttpSessionListener.bindSessionIdWithLoginLogId(req.getSession().getId(), loginLog.getId());
        }
    }

    @Override
    public void createLogoutLog(String loginLogId) {
        SysLoginLog logoutLog = new SysLoginLog();
        logoutLog.setIsOnline(AppConsts.FALSE);
        logoutLog.setId(loginLogId);
        logoutLog.setLogoutTime(new Date());
        sysLoginLogMapper.updateByPrimaryKeySelective(logoutLog);
    }

}
