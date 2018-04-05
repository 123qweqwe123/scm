package com.jet.scm.mobile.core.mybatis.domain;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * Description:
 * <pre>
 * </pre>
 * Author: huangrupeng
 * Create: 17/5/17 下午1:57
 */
public class TableResponseContext {

    protected static ThreadLocal<TableResponse> localResponse = new ThreadLocal<>();

    private TableResponseContext() {

    }

    public static <T> TableResponse<T> getTableResponse() {
        TableResponse<T> tableResponse = localResponse.get();
        if (tableResponse == null) {
            tableResponse = new TableResponse<>();
        }
        localResponse.remove();
        return tableResponse;
    }

    public static <T> TableResponse<T> getTableResponse(List<T> rows) {
        if (CollectionUtils.isEmpty(rows)) {
            return new TableResponse<>();
        }
        TableResponse<T> tableResponse = getTableResponse();
        return tableResponse.setList(rows);
    }
}
