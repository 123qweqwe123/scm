package com.jet.scm;

import com.jet.scm.web.sys.domain.SysMenu;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.Test;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/1 下午2:37
 */
public class FieldUtilsTests {


    @Test
    public void testReadField() {
        SysMenu menu = new SysMenu();
        menu.setIcon("sdfsdf");
        try {
            System.out.println(FieldUtils.readField(menu, "icon", true));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
