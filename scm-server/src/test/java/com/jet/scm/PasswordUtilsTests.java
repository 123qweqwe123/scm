package com.jet.scm;

import com.jet.scm.core.utils.Digests;
import com.jet.scm.core.utils.PasswordUtils;
import org.junit.Test;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/4 下午10:59
 */
public class PasswordUtilsTests {


    @Test
    public void testGeneratePassword() {
        byte[] salt = Digests.generateSalt(8);
        System.out.println(PasswordUtils.encodeHex(salt));
        System.out.println(PasswordUtils.getEncodePassWord("123456", salt));

        System.out.println(PasswordUtils.getEncodePassWord("123456", PasswordUtils.decodeHex("375beb6e7a6c07a1")));

    }
}
