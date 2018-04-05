package com.jet.datasync.bdcor2.domain;

public class PipScmFrozentube2Key {
    private String projectId;

    private String tubeCode;

    private String tubeType;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getTubeCode() {
        return tubeCode;
    }

    public void setTubeCode(String tubeCode) {
        this.tubeCode = tubeCode == null ? null : tubeCode.trim();
    }

    public String getTubeType() {
        return tubeType;
    }

    public void setTubeType(String tubeType) {
        this.tubeType = tubeType == null ? null : tubeType.trim();
    }
}