package com.jet.scm.web.spem.domain;

/**
 * Description:
 * <pre>
 *     邮件附件使用
 * </pre>
 * Author: huangrupeng
 * Create: 17/7/24 上午9:28
 */
public class TransProOfLcc {

    private String boxCode;
    private Integer tubeCount;
    private String rccCode;
    private String lccName;
    private String lccCode;
    private String areaName;
    private Integer index;

    public TransProOfLcc(PipScmTransProcDetail detail) {
        this.rccCode = detail.getRccCode();
        this.lccName = detail.getLccName();
        this.lccCode = detail.getLccCode();
        this.areaName = detail.getAreaName();
    }

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode;
    }

    public Integer getTubeCount() {
        return tubeCount;
    }

    public void setTubeCount(Integer tubeCount) {
        this.tubeCount = tubeCount;
    }

    public String getRccCode() {
        return rccCode;
    }

    public void setRccCode(String rccCode) {
        this.rccCode = rccCode;
    }

    public String getLccName() {
        return lccName;
    }

    public void setLccName(String lccName) {
        this.lccName = lccName;
    }

    public String getLccCode() {
        return lccCode;
    }

    public void setLccCode(String lccCode) {
        this.lccCode = lccCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
