package com.jet.scm.web.sys.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBpidIsNull() {
            addCriterion("BPID is null");
            return (Criteria) this;
        }

        public Criteria andBpidIsNotNull() {
            addCriterion("BPID is not null");
            return (Criteria) this;
        }

        public Criteria andBpidEqualTo(String value) {
            addCriterion("BPID =", value, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidNotEqualTo(String value) {
            addCriterion("BPID <>", value, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidGreaterThan(String value) {
            addCriterion("BPID >", value, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidGreaterThanOrEqualTo(String value) {
            addCriterion("BPID >=", value, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidLessThan(String value) {
            addCriterion("BPID <", value, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidLessThanOrEqualTo(String value) {
            addCriterion("BPID <=", value, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidLike(String value) {
            addCriterion("BPID like", value, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidNotLike(String value) {
            addCriterion("BPID not like", value, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidIn(List<String> values) {
            addCriterion("BPID in", values, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidNotIn(List<String> values) {
            addCriterion("BPID not in", values, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidBetween(String value1, String value2) {
            addCriterion("BPID between", value1, value2, "bpid");
            return (Criteria) this;
        }

        public Criteria andBpidNotBetween(String value1, String value2) {
            addCriterion("BPID not between", value1, value2, "bpid");
            return (Criteria) this;
        }

        public Criteria andMpidIsNull() {
            addCriterion("MPID is null");
            return (Criteria) this;
        }

        public Criteria andMpidIsNotNull() {
            addCriterion("MPID is not null");
            return (Criteria) this;
        }

        public Criteria andMpidEqualTo(String value) {
            addCriterion("MPID =", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotEqualTo(String value) {
            addCriterion("MPID <>", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThan(String value) {
            addCriterion("MPID >", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidGreaterThanOrEqualTo(String value) {
            addCriterion("MPID >=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThan(String value) {
            addCriterion("MPID <", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLessThanOrEqualTo(String value) {
            addCriterion("MPID <=", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidLike(String value) {
            addCriterion("MPID like", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotLike(String value) {
            addCriterion("MPID not like", value, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidIn(List<String> values) {
            addCriterion("MPID in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotIn(List<String> values) {
            addCriterion("MPID not in", values, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidBetween(String value1, String value2) {
            addCriterion("MPID between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andMpidNotBetween(String value1, String value2) {
            addCriterion("MPID not between", value1, value2, "mpid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andRouterIsNull() {
            addCriterion("ROUTER is null");
            return (Criteria) this;
        }

        public Criteria andRouterIsNotNull() {
            addCriterion("ROUTER is not null");
            return (Criteria) this;
        }

        public Criteria andRouterEqualTo(String value) {
            addCriterion("ROUTER =", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotEqualTo(String value) {
            addCriterion("ROUTER <>", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterGreaterThan(String value) {
            addCriterion("ROUTER >", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTER >=", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLessThan(String value) {
            addCriterion("ROUTER <", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLessThanOrEqualTo(String value) {
            addCriterion("ROUTER <=", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLike(String value) {
            addCriterion("ROUTER like", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotLike(String value) {
            addCriterion("ROUTER not like", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterIn(List<String> values) {
            addCriterion("ROUTER in", values, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotIn(List<String> values) {
            addCriterion("ROUTER not in", values, "router");
            return (Criteria) this;
        }

        public Criteria andRouterBetween(String value1, String value2) {
            addCriterion("ROUTER between", value1, value2, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotBetween(String value1, String value2) {
            addCriterion("ROUTER not between", value1, value2, "router");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("PERMISSION is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("PERMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("PERMISSION =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("PERMISSION <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("PERMISSION >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("PERMISSION <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("PERMISSION like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("PERMISSION not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("PERMISSION in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("PERMISSION not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("PERMISSION between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("PERMISSION not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("SEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("SEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("SEQUENCE =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("SEQUENCE <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("SEQUENCE >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("SEQUENCE <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("SEQUENCE in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("SEQUENCE not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("CREATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("CREATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("CREATE_DATETIME =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("CREATE_DATETIME >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("CREATE_DATETIME <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("CREATE_DATETIME in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("CREATE_DATETIME not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNull() {
            addCriterion("MENU_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNotNull() {
            addCriterion("MENU_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelEqualTo(Integer value) {
            addCriterion("MENU_LEVEL =", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotEqualTo(Integer value) {
            addCriterion("MENU_LEVEL <>", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThan(Integer value) {
            addCriterion("MENU_LEVEL >", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_LEVEL >=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThan(Integer value) {
            addCriterion("MENU_LEVEL <", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_LEVEL <=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIn(List<Integer> values) {
            addCriterion("MENU_LEVEL in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotIn(List<Integer> values) {
            addCriterion("MENU_LEVEL not in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelBetween(Integer value1, Integer value2) {
            addCriterion("MENU_LEVEL between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_LEVEL not between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andHelpCodeIsNull() {
            addCriterion("HELP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andHelpCodeIsNotNull() {
            addCriterion("HELP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andHelpCodeEqualTo(String value) {
            addCriterion("HELP_CODE =", value, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeNotEqualTo(String value) {
            addCriterion("HELP_CODE <>", value, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeGreaterThan(String value) {
            addCriterion("HELP_CODE >", value, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HELP_CODE >=", value, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeLessThan(String value) {
            addCriterion("HELP_CODE <", value, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeLessThanOrEqualTo(String value) {
            addCriterion("HELP_CODE <=", value, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeLike(String value) {
            addCriterion("HELP_CODE like", value, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeNotLike(String value) {
            addCriterion("HELP_CODE not like", value, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeIn(List<String> values) {
            addCriterion("HELP_CODE in", values, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeNotIn(List<String> values) {
            addCriterion("HELP_CODE not in", values, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeBetween(String value1, String value2) {
            addCriterion("HELP_CODE between", value1, value2, "helpCode");
            return (Criteria) this;
        }

        public Criteria andHelpCodeNotBetween(String value1, String value2) {
            addCriterion("HELP_CODE not between", value1, value2, "helpCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}