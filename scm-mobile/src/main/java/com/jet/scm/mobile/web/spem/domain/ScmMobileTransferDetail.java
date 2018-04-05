package com.jet.scm.mobile.web.spem.domain;

import java.util.Date;

public class ScmMobileTransferDetail {
    private String id;

    private String transDetailId;

    private String transDetailNo;

    private String transId;

    private String transNo;

    private String lccCode;

    private String lccName;

    private String areaCode;

    private String areaName;

    private String rccCode;

    private String rccName;

    private Integer boxCount;

    private Short detailStatus;

    private String link1Man;

    private String link1Tel;

    private String link2Man;

    private String link2Tel;

    private String address;

    private String planGetManId;

    private String planGetManName;

    private Date planGetDate;

    private Date realGetDate;

    private String createById;

    private String createByName;

    private Date createTime;

    private String updateById;

    private String updateByName;

    private Date updateTime;

    private String coordinate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTransDetailId() {
        return transDetailId;
    }

    public void setTransDetailId(String transDetailId) {
        this.transDetailId = transDetailId == null ? null : transDetailId.trim();
    }

    public String getTransDetailNo() {
        return transDetailNo;
    }

    public void setTransDetailNo(String transDetailNo) {
        this.transDetailNo = transDetailNo == null ? null : transDetailNo.trim();
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

    public String getLccCode() {
        return lccCode;
    }

    public void setLccCode(String lccCode) {
        this.lccCode = lccCode == null ? null : lccCode.trim();
    }

    public String getLccName() {
        return lccName;
    }

    public void setLccName(String lccName) {
        this.lccName = lccName == null ? null : lccName.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getRccCode() {
        return rccCode;
    }

    public void setRccCode(String rccCode) {
        this.rccCode = rccCode == null ? null : rccCode.trim();
    }

    public String getRccName() {
        return rccName;
    }

    public void setRccName(String rccName) {
        this.rccName = rccName == null ? null : rccName.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public Date getRealGetDate() {
        return realGetDate;
    }

    public void setRealGetDate(Date realGetDate) {
        this.realGetDate = realGetDate;
    }

    public String getCreateById() {
        return createById;
    }

    public void setCreateById(String createById) {
        this.createById = createById == null ? null : createById.trim();
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName == null ? null : createByName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateById() {
        return updateById;
    }

    public void setUpdateById(String updateById) {
        this.updateById = updateById == null ? null : updateById.trim();
    }

    public String getUpdateByName() {
        return updateByName;
    }

    public void setUpdateByName(String updateByName) {
        this.updateByName = updateByName == null ? null : updateByName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate == null ? null : coordinate.trim();
    }
}