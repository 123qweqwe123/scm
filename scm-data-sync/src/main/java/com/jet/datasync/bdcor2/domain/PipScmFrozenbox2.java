package com.jet.datasync.bdcor2.domain;

import java.util.Date;

public class PipScmFrozenbox2 extends PipScmFrozenbox2Key {
    private String fridgeId;

    private Short boxState;

    private String remark;

    private Short isCheckin;

    private String checkinlistId;

    private String lccCode;

    private Date createDate;

    private String createBy;

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
}