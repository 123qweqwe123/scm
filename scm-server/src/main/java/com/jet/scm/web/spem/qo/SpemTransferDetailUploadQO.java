package com.jet.scm.web.spem.qo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Description:
 * <pre>
 *     样本转运单明细上传信息
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/27 下午7:02
 */
public class SpemTransferDetailUploadQO {

    /**
     * 格式 name,fileId;name,fileId;
     */
    private String file;

    /**
     * 接收人
     */
    private String receiveOperator;
    /**
     * 接收日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date receiveDate;
    /**
     * 运单编号
     */
    private String checkinlistId;


    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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

    public String getCheckinlistId() {
        return checkinlistId;
    }

    public void setCheckinlistId(String checkinlistId) {
        this.checkinlistId = checkinlistId;
    }
}
