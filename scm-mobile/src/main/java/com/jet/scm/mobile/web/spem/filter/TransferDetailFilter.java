package com.jet.scm.mobile.web.spem.filter;

import com.jet.scm.mobile.core.mybatis.domain.PageFilter;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 上午9:58
 */
public class TransferDetailFilter extends PageFilter {

    private Short status;

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
