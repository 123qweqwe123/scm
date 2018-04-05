package com.jet.scm.mobile.web.spem.domain;

import java.util.Date;

public class ScmMobileTransferDetailPic {
    private String id;

    private String transMobileDetailId;

    private String srcFileName;

    private String fileName;

    private String filePath;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTransMobileDetailId() {
        return transMobileDetailId;
    }

    public void setTransMobileDetailId(String transMobileDetailId) {
        this.transMobileDetailId = transMobileDetailId == null ? null : transMobileDetailId.trim();
    }

    public String getSrcFileName() {
        return srcFileName;
    }

    public void setSrcFileName(String srcFileName) {
        this.srcFileName = srcFileName == null ? null : srcFileName.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
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
}