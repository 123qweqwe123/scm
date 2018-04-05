package com.jet.datasync.bdcor3.domain;

import java.util.Date;

public class PipCommRcc3 extends PipCommRcc3Key {
    public String rccName;

    public String countryCode;

    public String areaCode;

    public String englishName;

    public String address;

    public String helpCode;

    public String latitudeLongitude;

    public Short isJoin;

    public Date joinTime;

    public String updateBy;

    public Date updateTime;

    public String initialTask;

    public String riskTask;

    public String shortFollowupTask;

    public String longFollowupTask;

    public String getRccName() {
        return rccName;
    }

    public void setRccName(String rccName) {
        this.rccName = rccName == null ? null : rccName.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHelpCode() {
        return helpCode;
    }

    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode == null ? null : helpCode.trim();
    }

    public String getLatitudeLongitude() {
        return latitudeLongitude;
    }

    public void setLatitudeLongitude(String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude == null ? null : latitudeLongitude.trim();
    }

    public Short getIsJoin() {
        return isJoin;
    }

    public void setIsJoin(Short isJoin) {
        this.isJoin = isJoin;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getInitialTask() {
        return initialTask;
    }

    public void setInitialTask(String initialTask) {
        this.initialTask = initialTask == null ? null : initialTask.trim();
    }

    public String getRiskTask() {
        return riskTask;
    }

    public void setRiskTask(String riskTask) {
        this.riskTask = riskTask == null ? null : riskTask.trim();
    }

    public String getShortFollowupTask() {
        return shortFollowupTask;
    }

    public void setShortFollowupTask(String shortFollowupTask) {
        this.shortFollowupTask = shortFollowupTask == null ? null : shortFollowupTask.trim();
    }

    public String getLongFollowupTask() {
        return longFollowupTask;
    }

    public void setLongFollowupTask(String longFollowupTask) {
        this.longFollowupTask = longFollowupTask == null ? null : longFollowupTask.trim();
    }
}