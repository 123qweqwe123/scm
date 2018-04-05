package com.jet.scm.web.spem.vo;

import java.util.Date;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/28 上午9:36
 */
public class ReceiveInfoVO {

    private String checkinlistId;

    private String receiveOperator;

    private Date receiveDate;

    public String getCheckinlistId() {
        return checkinlistId;
    }

    public void setCheckinlistId(String checkinlistId) {
        this.checkinlistId = checkinlistId;
    }

    public String getReceiveOperator() {
        return receiveOperator;
    }

    public void setReceiveOperator(String receiveOperator) {
        this.receiveOperator = receiveOperator;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }
}
