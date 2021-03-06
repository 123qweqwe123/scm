package com.jet.scm.web.proj.domain;

import java.util.Date;

public class PipCommLccUser extends PipCommLccUserKey {
    private String name;

    private String phone;

    private String email;

    private String lccRole;

    private String isSignSigna;

    private String isGetResume;

    private String isJoinTraining;

    private String status;

    private String mobile;

    private String addtolinkman;

    private String linkmanCode;

    private String helpCode;

    private String gender;

    private String department;

    private String major;

    private String duty;

    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLccRole() {
        return lccRole;
    }

    public void setLccRole(String lccRole) {
        this.lccRole = lccRole == null ? null : lccRole.trim();
    }

    public String getIsSignSigna() {
        return isSignSigna;
    }

    public void setIsSignSigna(String isSignSigna) {
        this.isSignSigna = isSignSigna == null ? null : isSignSigna.trim();
    }

    public String getIsGetResume() {
        return isGetResume;
    }

    public void setIsGetResume(String isGetResume) {
        this.isGetResume = isGetResume == null ? null : isGetResume.trim();
    }

    public String getIsJoinTraining() {
        return isJoinTraining;
    }

    public void setIsJoinTraining(String isJoinTraining) {
        this.isJoinTraining = isJoinTraining == null ? null : isJoinTraining.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddtolinkman() {
        return addtolinkman;
    }

    public void setAddtolinkman(String addtolinkman) {
        this.addtolinkman = addtolinkman == null ? null : addtolinkman.trim();
    }

    public String getLinkmanCode() {
        return linkmanCode;
    }

    public void setLinkmanCode(String linkmanCode) {
        this.linkmanCode = linkmanCode == null ? null : linkmanCode.trim();
    }

    public String getHelpCode() {
        return helpCode;
    }

    public void setHelpCode(String helpCode) {
        this.helpCode = helpCode == null ? null : helpCode.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}