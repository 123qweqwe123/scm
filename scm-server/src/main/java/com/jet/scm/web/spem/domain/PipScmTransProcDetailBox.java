package com.jet.scm.web.spem.domain;

import java.util.Date;

public class PipScmTransProcDetailBox {
    private String id;

    private String transId;

    private String transNo;

    private String transDetailNo;

    private String boxCode;

    private String boxType;

    private Date createTime;

    private String createBy;

    private String createByName;

    private Date updateTime;

    private String updateBy;

    private String updateByName;

    private String transDetailId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    public String getTransDetailNo() {
        return transDetailNo;
    }

    public void setTransDetailNo(String transDetailNo) {
        this.transDetailNo = transDetailNo == null ? null : transDetailNo.trim();
    }

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

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName == null ? null : createByName.trim();
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

    public String getUpdateByName() {
        return updateByName;
    }

    public void setUpdateByName(String updateByName) {
        this.updateByName = updateByName == null ? null : updateByName.trim();
    }

    public String getTransDetailId() {
        return transDetailId;
    }

    public void setTransDetailId(String transDetailId) {
        this.transDetailId = transDetailId == null ? null : transDetailId.trim();
    }
}