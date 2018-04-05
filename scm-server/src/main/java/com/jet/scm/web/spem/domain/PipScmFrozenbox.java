package com.jet.scm.web.spem.domain;

import java.util.Date;

public class PipScmFrozenbox extends PipScmFrozenboxKey {
    private String fridgeId;

    private Short boxState;

    private String remark;

    private Short isCheckin;

    private String checkinlistId;

    private String lccCode;

    private Date createDate;

    private String createBy;

    private String id;

    private String version;

    private String clientId;

    private Short updateFlag;

    private Date hr3UpdateDate;

    private Date transDate;

    private String mpp;

    private Date transDateFromMpp;

    public String getFridgeId() {
        return fridgeId;
    }

    public void setFridgeId(String fridgeId) {
        this.fridgeId = fridgeId == null ? null : fridgeId.trim();
    }

    public Short getBoxState() {
        return boxState;
    }

    public void setBoxState(Short boxState) {
        this.boxState = boxState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getIsCheckin() {
        return isCheckin;
    }

    public void setIsCheckin(Short isCheckin) {
        this.isCheckin = isCheckin;
    }

    public String getCheckinlistId() {
        return checkinlistId;
    }

    public void setCheckinlistId(String checkinlistId) {
        this.checkinlistId = checkinlistId == null ? null : checkinlistId.trim();
    }

    public String getLccCode() {
        return lccCode;
    }

    public void setLccCode(String lccCode) {
        this.lccCode = lccCode == null ? null : lccCode.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public Short getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(Short updateFlag) {
        this.updateFlag = updateFlag;
    }

    public Date getHr3UpdateDate() {
        return hr3UpdateDate;
    }

    public void setHr3UpdateDate(Date hr3UpdateDate) {
        this.hr3UpdateDate = hr3UpdateDate;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getMpp() {
        return mpp;
    }

    public void setMpp(String mpp) {
        this.mpp = mpp == null ? null : mpp.trim();
    }

    public Date getTransDateFromMpp() {
        return transDateFromMpp;
    }

    public void setTransDateFromMpp(Date transDateFromMpp) {
        this.transDateFromMpp = transDateFromMpp;
    }
}