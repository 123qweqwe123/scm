package com.jet.scm.web.proj.domain;

public class PipCommRccKey {
    private String projectId;

    private String rccCode;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getRccCode() {
        return rccCode;
    }

    public void setRccCode(String rccCode) {
        this.rccCode = rccCode == null ? null : rccCode.trim();
    }
}