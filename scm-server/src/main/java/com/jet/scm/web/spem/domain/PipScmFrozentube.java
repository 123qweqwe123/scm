package com.jet.scm.web.spem.domain;

import java.util.Date;

public class PipScmFrozentube extends PipScmFrozentubeKey {
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

    private String id;

    private String version;

    private String clientId;

    private Short updateFlag;

    private Date hr3UpdateDate;

    private Date transDate;

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
}