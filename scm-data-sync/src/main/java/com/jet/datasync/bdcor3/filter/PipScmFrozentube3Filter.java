package com.jet.datasync.bdcor3.filter;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Description:
 * <pre>
 *     按照 transData 进行更新
 * </pre>
 * Author: huangchengzhi
 * Create: 2017/7/14
 */
public class PipScmFrozentube3Filter {
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date transDate;

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }
}
