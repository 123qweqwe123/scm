package com.jet.scm.web.dict.filter;

import com.jet.scm.core.mybatis.domain.PageFilter;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/3
 */
public class DictVersionFilter extends PageFilter {

    private Long id;

    private String dictType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictVersion() {
        return dictVersion;
    }

    public void setDictVersion(String dictVersion) {
        this.dictVersion = dictVersion;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getLccCode() {
        return lccCode;
    }

    public void setLccCode(String lccCode) {
        this.lccCode = lccCode;
    }

    private String dictVersion;

    private String projectId;

    private String lccCode;


}
