package com.jet.scm.web.proj.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PipCommLcc extends PipCommLccKey {
    private String lccName;

    private String countryCode;

    private String areaCode;

    private Short status;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private Short isRemoved;

    private String ftpIp;

    private BigDecimal ftpPort;

    private String ftpUser;

    private String ftpPassword;

    private BigDecimal costSum;

    private String englishName;

    private String address;

    private String projectManager;

    private String pmTel;

    private String pmEmail;

    private Date contractSignDate;

    private String isSignContract;

    private Date higherApproveDate;

    private String isTraining;

    private Date expectStartDate;

    private String lccType;

    private String isEthical;

    private Date ethicalEffectiveDate;

    private Date ethicalDisableDate;

    private String ethicalPaperCode;

    private String deliveryAddress;

    private String deliveryContact;

    private String deliveryTel;

    private String startDate;

    private String contact;

    private String tel;

    private String rccCode;

    private String isAdminDep;

    private String organ;

    private String lccrole;

    private String cityCode;

    private BigDecimal workload;

    private String helpCode;

    private Date endDate;

    private String lccCategory;

    private String hospitalType;

    private String pmDuty;

    private Date estimatedBeginTime;

    private Date estimatedEndTime;

    public String getLccName() {
        return lccName;
    }

    public void setLccName(String lccName) {
        this.lccName = lccName == null ? null : lccName.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Short getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Short isRemoved) {
        this.isRemoved = isRemoved;
    }

    public String getFtpIp() {
        return ftpIp;
    }

    public void setFtpIp(String ftpIp) {
        this.ftpIp = ftpIp == null ? null : ftpIp.trim();
    }

    public BigDecimal getFtpPort() {
        return ftpPort;
    }

    public void setFtpPort(BigDecimal ftpPort) {
        this.ftpPort = ftpPort;
    }

    public String getFtpUser() {
        return ftpUser;
    }

    public void setFtpUser(String ftpUser) {
        this.ftpUser = ftpUser == null ? null : ftpUser.trim();
    }

    public String getFtpPassword() {
        return ftpPassword;
    }

    public void setFtpPassword(String ftpPassword) {
        this.ftpPassword = ftpPassword == null ? null : ftpPassword.trim();
    }

    public BigDecimal getCostSum() {
        return costSum;
    }

    public void setCostSum(BigDecimal costSum) {
        this.costSum = costSum;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager == null ? null : projectManager.trim();
    }

    public String getPmTel() {
        return pmTel;
    }

    public void setPmTel(String pmTel) {
        this.pmTel = pmTel == null ? null : pmTel.trim();
    }

    public String getPmEmail() {
        return pmEmail;
    }

    public void setPmEmail(String pmEmail) {
        this.pmEmail = pmEmail == null ? null : pmEmail.trim();
    }

    public Date getContractSignDate() {
        return contractSignDate;
    }

    public void setContractSignDate(Date contractSignDate) {
        this.contractSignDate = contractSignDate;
    }

    public String getIsSignContract() {
        return isSignContract;
    }

    public void setIsSignContract(String isSignContract) {
        this.isSignContract = isSignContract == null ? null : isSignContract.trim();
    }

    public Date getHigherApproveDate() {
        return higherApproveDate;
    }

    public void setHigherApproveDate(Date higherApproveDate) {
        this.higherApproveDate = higherApproveDate;
    }

    public String getIsTraining() {
        return isTraining;
    }

    public void setIsTraining(String isTraining) {
        this.isTraining = isTraining == null ? null : isTraining.trim();
    }

    public Date getExpectStartDate() {
        return expectStartDate;
    }

    public void setExpectStartDate(Date expectStartDate) {
        this.expectStartDate = expectStartDate;
    }

    public String getLccType() {
        return lccType;
    }

    public void setLccType(String lccType) {
        this.lccType = lccType == null ? null : lccType.trim();
    }

    public String getIsEthical() {
        return isEthical;
    }

    public void setIsEthical(String isEthical) {
        this.isEthical = isEthical == null ? null : isEthical.trim();
    }

    public Date getEthicalEffectiveDate() {
        return ethicalEffectiveDate;
    }

    public void setEthicalEffectiveDate(Date ethicalEffectiveDate) {
        this.ethicalEffectiveDate = ethicalEffectiveDate;
    }

    public Date getEthicalDisableDate() {
        return ethicalDisableDate;
    }

    public void setEthicalDisableDate(Date ethicalDisableDate) {
        this.ethicalDisableDate = ethicalDisableDate;
    }

    public String getEthicalPaperCode() {
        return ethicalPaperCode;
    }

    public void setEthicalPaperCode(String ethicalPaperCode) {
        this.ethicalPaperCode = ethicalPaperCode == null ? null : ethicalPaperCode.trim();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    public String getDeliveryContact() {
        return deliveryContact;
    }

    public void setDeliveryContact(String deliveryContact) {
        this.deliveryContact = deliveryContact == null ? null : deliveryContact.trim();
    }

    public String getDeliveryTel() {
        return deliveryTel;
    }

    public void setDeliveryTel(String deliveryTel) {
        this.deliveryTel = deliveryTel == null ? null : deliveryTel.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getRccCode() {
        return rccCode;
    }

    public void setRccCode(String rccCode) {
        this.rccCode = rccCode == null ? null : rccCode.trim();
    }

    public String getIsAdminDep() {
        return isAdminDep;
    }

    public void setIsAdminDep(String isAdminDep) {
        this.isAdminDep = isAdminDep == null ? null : isAdminDep.trim();
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ == null ? null : organ.trim();
    }

    public String getLccrole() {
        return lccrole;
    }

    public void setLccrole(String lccrole) {
        this.lccrole = lccrole == null ? null : lccrole.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public BigDecimal getWorkload() {
        return workload;
    }

    public void setWorkload(BigDecimal workload) {
        this.workload = workload;
    }

    public String getHelpCode() {
        return helpCode;
    }

    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode == null ? null : helpCode.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLccCategory() {
        return lccCategory;
    }

    public void setLccCategory(String lccCategory) {
        this.lccCategory = lccCategory == null ? null : lccCategory.trim();
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType == null ? null : hospitalType.trim();
    }

    public String getPmDuty() {
        return pmDuty;
    }

    public void setPmDuty(String pmDuty) {
        this.pmDuty = pmDuty == null ? null : pmDuty.trim();
    }

    public Date getEstimatedBeginTime() {
        return estimatedBeginTime;
    }

    public void setEstimatedBeginTime(Date estimatedBeginTime) {
        this.estimatedBeginTime = estimatedBeginTime;
    }

    public Date getEstimatedEndTime() {
        return estimatedEndTime;
    }

    public void setEstimatedEndTime(Date estimatedEndTime) {
        this.estimatedEndTime = estimatedEndTime;
    }
}