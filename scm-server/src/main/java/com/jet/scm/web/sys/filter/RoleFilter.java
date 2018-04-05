package com.jet.scm.web.sys.filter;

import com.jet.scm.core.mybatis.domain.PageFilter;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/6 下午2:20
 */
public class RoleFilter extends PageFilter {

    private String searchId;

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }
}
