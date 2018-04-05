package com.jet.scm.web.spem.filter;

import com.jet.scm.core.mybatis.domain.PageFilter;
import com.jet.scm.core.utils.DateConvertUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Description:
 * <pre>
 *     样本转运指令页面查询条件
 * </pre>
 * Author: huangrupeng
 * Create: 17/6/20 上午8:32
 */
public class SpemTransferFilter extends PageFilter {

    private String rccCode;
    private String transNo;
    private Short status;
    private String createMan;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createEndDate;
    private String getMan;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date planGetStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date planGetEndDate;


    public String getRccCode() {
        return rccCode;
    }

    public void setRccCode(String rccCode) {
        this.rccCode = rccCode;
    }

    /**
     * 尽量不要直接在 mybatis 里面使用 $，容易引起 sql 注入
     *
     * @return
     */
    public String getTransNo() {
        if (StringUtils.isNotBlank(transNo)) {
            return "%" + transNo + "%";
        }
        return null;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCreateMan() {
        if (StringUtils.isNotBlank(createMan)) {
            return "%" + createMan + "%";
        }
        return null;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public Date getCreateStartDate() {
        return createStartDate;
    }

    public void setCreateStartDate(Date createStartDate) {
        this.createStartDate = createStartDate;
    }

    public Date getCreateEndDate() {
        if (createEndDate != null) {
            return DateConvertUtils.asUtilDate(DateConvertUtils.asLocalDate(createEndDate).plusDays(1));
        }
        return null;
    }

    public void setCreateEndDate(Date createEndDate) {
        this.createEndDate = createEndDate;
    }

    public String getGetMan() {
        if (StringUtils.isNotBlank(getMan)) {
            return "%" + getMan + "%";
        }
        return null;
    }

    public void setGetMan(String getMan) {
        this.getMan = getMan;
    }

    public Date getPlanGetStartDate() {
        return planGetStartDate;
    }

    public void setPlanGetStartDate(Date planGetStartDate) {
        this.planGetStartDate = planGetStartDate;
    }

    public Date getPlanGetEndDate() {
        if (planGetEndDate != null) {
            return DateConvertUtils.asUtilDate(DateConvertUtils.asLocalDate(planGetEndDate).plusDays(1));
        }
        return null;
    }

    public void setPlanGetEndDate(Date planGetEndDate) {
        this.planGetEndDate = planGetEndDate;
    }
}
