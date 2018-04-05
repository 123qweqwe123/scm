package com.jet.scm.web.dict.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class JetCommDictBioErCode {
    private String dictCode;

    private String dictName;

    private String vcode;

    private String vname;

    private String remark;

    private String createBy;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    private String updateBy;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;

    private Short isRemoved;

    private String id;

    private Short isOperate;

    private String parentId;

    private Short checkLevel;

    private String helpCode;

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode == null ? null : vcode.trim();
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Short getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Short isRemoved) {
        this.isRemoved = isRemoved;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Short getIsOperate() {
        return isOperate;
    }

    public void setIsOperate(Short isOperate) {
        this.isOperate = isOperate;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Short getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(Short checkLevel) {
        this.checkLevel = checkLevel;
    }

    public String getHelpCode() {
        return helpCode;
    }

    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode == null ? null : helpCode.trim();
    }
}