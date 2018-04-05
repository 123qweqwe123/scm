package com.jet.scm;

import com.jet.scm.web.sys.domain.SysRole;
import com.jet.scm.web.sys.vo.SysRoleVO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/8 下午2:07
 */
public class BeanUtilsTests {

    @Test
    public void testCopyProperties() {
        SysRole role = new SysRole();
        role.setName("小明");
        SysRoleVO vo = new SysRoleVO();
        BeanUtils.copyProperties(role, vo);
        Assert.assertEquals(role.getName(), vo.getName());
    }
}
