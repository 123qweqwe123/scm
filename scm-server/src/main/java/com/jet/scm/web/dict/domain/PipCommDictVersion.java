package com.jet.scm.web.dict.domain;

public class PipCommDictVersion {
    private String dictType;

    private String dictVersion;

    private String projectId;

    private String lccCode;

    private String id;

    private String fileId;

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getDictVersion() {
        return dictVersion;
    }

    public void setDictVersion(String dictVersion) {
        this.dictVersion = dictVersion == null ? null : dictVersion.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getLccCode() {
        return lccCode;
    }

    public void setLccCode(String lccCode) {
        this.lccCode = lccCode == null ? null : lccCode.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }
}