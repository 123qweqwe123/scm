package com.jet.scm.mobile.web.spem.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Description:
 * <pre>
 *     运单明细
 * </pre>
 * Author: huangrupeng
 * Create: 17/8/1 上午10:11
 */
public class TransferDetailVO {

    private String transDetailNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date planGetDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date realGetDate;
    private String link1Man;
    private String link1ManTel;
    private String link2Man;
    private String link2ManTel;
    private String address;
    private String planBoxes;
    private String realBoxes;
    private String files;
    private String coordinate;
    private Short status;   //1 已完成  0 未转运

    public String getTransDetailNo() {
        return transDetailNo;
    }

    public void setTransDetailNo(String transDetailNo) {
        this.transDetailNo = transDetailNo;
    }

    public Date getPlanGetDate() {
        return planGetDate;
    }

    public void setPlanGetDate(Date planGetDate) {
        this.planGetDate = planGetDate;
    }

    public Date getRealGetDate() {
        return realGetDate;
    }

    public void setRealGetDate(Date realGetDate) {
        this.realGetDate = realGetDate;
    }

    public String getLink1Man() {
        return link1Man;
    }

    public void setLink1Man(String link1Man) {
        this.link1Man = link1Man;
    }

    public String getLink1ManTel() {
        return link1ManTel;
    }

    public void setLink1ManTel(String link1ManTel) {
        this.link1ManTel = link1ManTel;
    }

    public String getLink2Man() {
        return link2Man;
    }

    public void setLink2Man(String link2Man) {
        this.link2Man = link2Man;
    }

    public String getLink2ManTel() {
        return link2ManTel;
    }

    public void setLink2ManTel(String link2ManTel) {
        this.link2ManTel = link2ManTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlanBoxes() {
        return planBoxes;
    }

    public void setPlanBoxes(String planBoxes) {
        this.planBoxes = planBoxes;
    }

    public String getRealBoxes() {
        return realBoxes;
    }

    public void setRealBoxes(String realBoxes) {
        this.realBoxes = realBoxes;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
