package com.jet.scm.mobile.web.spem.vo;

import java.util.Date;

/**
 * Description:
 * <pre>
 *     查看运单列表
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 上午9:59
 */
public class TransferVO {

    private String transDetailNo;
    private String lccName;
    private String lccCode;
    private Date planGetDate;
    private Date realGetDate;
    private Short status;

    public String getTransDetailNo() {
        return transDetailNo;
    }

    public void setTransDetailNo(String transDetailNo) {
        this.transDetailNo = transDetailNo;
    }

    public String getLccName() {
        return lccName;
    }

    public void setLccName(String lccName) {
        this.lccName = lccName;
    }

    public String getLccCode() {
        return lccCode;
    }

    public void setLccCode(String lccCode) {
        this.lccCode = lccCode;
    }

    public Date getPlanGetDate() {
        return planGetDate;
    }

    public void setPlanGetDate(Date planGetDate) {
        this.planGetDate = planGetDate;
    }

    public Date getRealGetDate() {
        return realGetDate;
    }

    public void setRealGetDate(Date realGetDate) {
        this.realGetDate = realGetDate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
