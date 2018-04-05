package com.jet.scm.mobile.web.sys.filter;


import com.jet.scm.mobile.core.mybatis.domain.PageFilter;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/17 下午2:36
 */
public class AccountFilter extends PageFilter {

    private String searchId;

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }
}
