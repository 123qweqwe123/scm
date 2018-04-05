package com.jet.scm.web.sys.filter;

import com.jet.scm.core.mybatis.domain.PageFilter;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/18
 */
public class DataSyncFilter extends PageFilter {

    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
