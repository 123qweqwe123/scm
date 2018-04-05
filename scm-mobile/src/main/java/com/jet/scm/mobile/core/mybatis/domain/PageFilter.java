package com.jet.scm.mobile.core.mybatis.domain;

/**
 * Description:
 * <pre>
 *  分页过滤器
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/17 下午1:32
 */
public class PageFilter {

    // 当前页码
    private int page = 1;
    // 分页数量
    private int pageSize = 10;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public final void setLocal(int total) {
        TableResponse tableResponse = TableResponseContext.localResponse.get();
        if (tableResponse == null) {
            tableResponse = new TableResponse();
        }
        tableResponse.setTotal(total);
        TableResponseContext.localResponse.set(tableResponse);
    }
}
