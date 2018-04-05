package com.jet.scm.mobile.web.sys.service.impl;

import com.google.common.collect.Maps;
import com.jet.scm.mobile.core.utils.PasswordUtils;
import com.jet.scm.mobile.web.sys.domain.SysAccount;
import com.jet.scm.mobile.web.sys.domain.SysAccountExample;
import com.jet.scm.mobile.web.sys.mapper.SysAccountMapper;
import com.jet.scm.mobile.web.sys.qo.UserQO;
import com.jet.scm.mobile.web.sys.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    @Override
    public Map<String, Object> getUser() {
        Map<String, Object> res = Maps.newHashMap();
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


}
