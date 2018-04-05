package com.jet.datasync.bdcor2.domain;

import java.util.Date;

public class PipScmFrozentube2 extends PipScmFrozentube2Key {
    private String boxCode;

    private String boxType;

    private Short boxColno;

    private Short boxRowno;

    private String bloodCode;

    private Date createDate;

    private String createBy;

    private String remark;

    private Short isHemolysis;

    private Short isLipid;

    private String lccCode;

    private Short isEmpty;

    private String fileName;

    private String terminalId;

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

    public Short getBoxColno() {
        return boxColno;
    }

    public void setBoxColno(Short boxColno) {
        this.boxColno = boxColno;
    }

    public Short getBoxRowno() {
        return boxRowno;
    }

    public void setBoxRowno(Short boxRowno) {
        this.boxRowno = boxRowno;
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode == null ? null : bloodCode.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getIsHemolysis() {
        return isHemolysis;
    }

    public void setIsHemolysis(Short isHemolysis) {
        this.isHemolysis = isHemolysis;
    }

    public Short getIsLipid() {
        return isLipid;
    }

    public void setIsLipid(Short isLipid) {
        this.isLipid = isLipid;
    }

    public String getLccCode() {
        return lccCode;
    }

    public void setLccCode(String lccCode) {
        this.lccCode = lccCode == null ? null : lccCode.trim();
    }

    public Short getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(Short isEmpty) {
        this.isEmpty = isEmpty;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId == null ? null : terminalId.trim();
    }
}