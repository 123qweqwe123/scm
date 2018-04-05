package com.jet.scm.web.spem.vo;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/2 上午9:23
 */
public class TransNoVO {

    private String prefix;
    private String suffix;
    private String dateStr;
    private String transNo;
    private String rccCode;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getRccCode() {
        return rccCode;
    }

    public void setRccCode(String rccCode) {
        this.rccCode = rccCode;
    }
}
