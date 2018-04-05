package com.jet.scm.web.common.vo;

/**
 * Description:
 * <pre>
 *     前端输入框自动补全
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/24 下午2:40
 */
public class AutoCompleteVO {

    private String value;
    private String text;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
