package com.jet.scm.web.spem.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PipScmFrozenboxTransport {
    private String boxCode;

    private String boxType;

    private Date receiveDate;

    private String checkinlistId;

    private String rccCode;

    private BigDecimal frozentubeNum;

    private BigDecimal sampleNum;

    private BigDecimal portion;

    private String remark;

    private String receiveOperator;

    private String frozenboxId;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private String transDetailId;

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode == null ? null : boxCode.trim();
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType == null ? null : boxType.trim();
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
        this.checkinlistId = checkinlistId == null ? null : checkinlistId.trim();
    }

    public String getRccCode() {
        return rccCode;
    }

    public void setRccCode(String rccCode) {
        this.rccCode = rccCode == null ? null : rccCode.trim();
    }

    public BigDecimal getFrozentubeNum() {
        return frozentubeNum;
    }

    public void setFrozentubeNum(BigDecimal frozentubeNum) {
        this.frozentubeNum = frozentubeNum;
    }

    public BigDecimal getSampleNum() {
        return sampleNum;
    }

    public void setSampleNum(BigDecimal sampleNum) {
        this.sampleNum = sampleNum;
    }

    public BigDecimal getPortion() {
        return portion;
    }

    public void setPortion(BigDecimal portion) {
        this.portion = portion;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getReceiveOperator() {
        return receiveOperator;
    }

    public void setReceiveOperator(String receiveOperator) {
        this.receiveOperator = receiveOperator == null ? null : receiveOperator.trim();
    }

    public String getFrozenboxId() {
        return frozenboxId;
    }

    public void setFrozenboxId(String frozenboxId) {
        this.frozenboxId = frozenboxId == null ? null : frozenboxId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getTransDetailId() {
        return transDetailId;
    }

    public void setTransDetailId(String transDetailId) {
        this.transDetailId = transDetailId == null ? null : transDetailId.trim();
    }
}