package com.jet.datasync.bdcor2.domain;

public class PipScmFrozenbox2Key {
    private String boxCode;

    private String boxType;

    private String projectId;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }
}