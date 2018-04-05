package com.jet.scm.web.common.service;

import java.util.Map;

/**
 * Description:
 * <pre>
 *     excel 导入、导出，使用 jxls2.x
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/6 下午6:54
 */
public interface JxlsService {

    /**
     * @param templatePath 模板路径，相对 resources/template 路径
     * @param vars         变量
     * @return 文件在 fastdfs 上面的 id
     */
    String createExcel(String templatePath, String fileName, Map<String, Object> vars);
}
