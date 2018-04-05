package com.jet.scm.web.sys.filter;

import com.jet.scm.core.mybatis.domain.PageFilter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Description:
 * Author: huangchengzhi
 * Create: 2017/7/19
 */
public class DataSyncLogFilter extends PageFilter {

    private String syncId;

    private Short isSuccess;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    public String getSyncId() {
        return syncId;
    }

    public void setSyncId(String syncId) {
        this.syncId = syncId;
    }

    public Short getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Short isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
