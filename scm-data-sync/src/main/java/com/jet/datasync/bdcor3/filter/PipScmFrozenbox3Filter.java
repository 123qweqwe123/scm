package com.jet.datasync.bdcor3.filter;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Description:
 * <pre>
 *     按照 transData 进行更新
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/12 上午9:32
 */
public class PipScmFrozenbox3Filter {

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date transDate;

    public Date getTransDate() {
        return transDate;
    }

    private String boxesStr;

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getBoxesStr() {
        return boxesStr;
    }

    public void setBoxesStr(String boxesStr) {
        this.boxesStr = boxesStr;
    }
}
