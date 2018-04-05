package com.jet.scm.mobile.web.spem.domain;

import java.util.Date;

public class PipScmTransProcDetail {
    private String id;

    private String masterId;

    private String transNo;

    private String transDetailNo;

    private String areaCode;

    private String rccCode;

    private String lccCode;

    private Integer boxCount;

    private Short detailStatus;

    private String link1Man;

    private String link1Tel;

    private String link2Man;

    private String link2Tel;

    private String remarks;

    private String planGetManId;

    private String planGetManName;

    private Date planGetDate;

    private String createUserId;

    private String createUserName;

    private Date createDate;

    private String updateUserId;

    private String updateUserName;

    private Date updateDate;

    private String areaName;

    private String lccName;

    private String rccName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId == null ? null : masterId.trim();
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getRccCode() {
        return rccCode;
    }

    public void setRccCode(String rccCode) {
        this.rccCode = rccCode == null ? null : rccCode.trim();
    }

    public String getLccCode() {
        return lccCode;
    }

    public void setLccCode(String lccCode) {
        this.lccCode = lccCode == null ? null : lccCode.trim();
    }

    public Integer getBoxCount() {
        return boxCount;
    }

    public void setBoxCount(Integer boxCount) {
        this.boxCount = boxCount;
    }

    public Short getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(Short detailStatus) {
        this.detailStatus = detailStatus;
    }

    public String getLink1Man() {
        return link1Man;
    }

    public void setLink1Man(String link1Man) {
        this.link1Man = link1Man == null ? null : link1Man.trim();
    }

    public String getLink1Tel() {
        return link1Tel;
    }

    public void setLink1Tel(String link1Tel) {
        this.link1Tel = link1Tel == null ? null : link1Tel.trim();
    }

    public String getLink2Man() {
        return link2Man;
    }

    public void setLink2Man(String link2Man) {
        this.link2Man = link2Man == null ? null : link2Man.trim();
    }

    public String getLink2Tel() {
        return link2Tel;
    }

    public void setLink2Tel(String link2Tel) {
        this.link2Tel = link2Tel == null ? null : link2Tel.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getPlanGetManId() {
        return planGetManId;
    }

    public void setPlanGetManId(String planGetManId) {
        this.planGetManId = planGetManId == null ? null : planGetManId.trim();
    }

    public String getPlanGetManName() {
        return planGetManName;
    }

    public void setPlanGetManName(String planGetManName) {
        this.planGetManName = planGetManName == null ? null : planGetManName.trim();
    }

    public Date getPlanGetDate() {
        return planGetDate;
    }

    public void setPlanGetDate(Date planGetDate) {
        this.planGetDate = planGetDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName == null ? null : updateUserName.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getLccName() {
        return lccName;
    }

    public void setLccName(String lccName) {
        this.lccName = lccName == null ? null : lccName.trim();
    }

    public String getRccName() {
        return rccName;
    }

    public void setRccName(String rccName) {
        this.rccName = rccName == null ? null : rccName.trim();
    }
}