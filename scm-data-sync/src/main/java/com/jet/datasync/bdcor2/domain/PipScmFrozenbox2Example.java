package com.jet.datasync.bdcor2.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PipScmFrozenbox2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipScmFrozenbox2Example() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBoxCodeIsNull() {
            addCriterion("BOX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBoxCodeIsNotNull() {
            addCriterion("BOX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBoxCodeEqualTo(String value) {
            addCriterion("BOX_CODE =", value, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeNotEqualTo(String value) {
            addCriterion("BOX_CODE <>", value, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeGreaterThan(String value) {
            addCriterion("BOX_CODE >", value, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BOX_CODE >=", value, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeLessThan(String value) {
            addCriterion("BOX_CODE <", value, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeLessThanOrEqualTo(String value) {
            addCriterion("BOX_CODE <=", value, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeLike(String value) {
            addCriterion("BOX_CODE like", value, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeNotLike(String value) {
            addCriterion("BOX_CODE not like", value, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeIn(List<String> values) {
            addCriterion("BOX_CODE in", values, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeNotIn(List<String> values) {
            addCriterion("BOX_CODE not in", values, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeBetween(String value1, String value2) {
            addCriterion("BOX_CODE between", value1, value2, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxCodeNotBetween(String value1, String value2) {
            addCriterion("BOX_CODE not between", value1, value2, "boxCode");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIsNull() {
            addCriterion("BOX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIsNotNull() {
            addCriterion("BOX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBoxTypeEqualTo(String value) {
            addCriterion("BOX_TYPE =", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotEqualTo(String value) {
            addCriterion("BOX_TYPE <>", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeGreaterThan(String value) {
            addCriterion("BOX_TYPE >", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BOX_TYPE >=", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeLessThan(String value) {
            addCriterion("BOX_TYPE <", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeLessThanOrEqualTo(String value) {
            addCriterion("BOX_TYPE <=", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeLike(String value) {
            addCriterion("BOX_TYPE like", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotLike(String value) {
            addCriterion("BOX_TYPE not like", value, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeIn(List<String> values) {
            addCriterion("BOX_TYPE in", values, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotIn(List<String> values) {
            addCriterion("BOX_TYPE not in", values, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeBetween(String value1, String value2) {
            addCriterion("BOX_TYPE between", value1, value2, "boxType");
            return (Criteria) this;
        }

        public Criteria andBoxTypeNotBetween(String value1, String value2) {
            addCriterion("BOX_TYPE not between", value1, value2, "boxType");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("PROJECT_ID like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdIsNull() {
            addCriterion("FRIDGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFridgeIdIsNotNull() {
            addCriterion("FRIDGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFridgeIdEqualTo(String value) {
            addCriterion("FRIDGE_ID =", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdNotEqualTo(String value) {
            addCriterion("FRIDGE_ID <>", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdGreaterThan(String value) {
            addCriterion("FRIDGE_ID >", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FRIDGE_ID >=", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdLessThan(String value) {
            addCriterion("FRIDGE_ID <", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdLessThanOrEqualTo(String value) {
            addCriterion("FRIDGE_ID <=", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdLike(String value) {
            addCriterion("FRIDGE_ID like", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdNotLike(String value) {
            addCriterion("FRIDGE_ID not like", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdIn(List<String> values) {
            addCriterion("FRIDGE_ID in", values, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdNotIn(List<String> values) {
            addCriterion("FRIDGE_ID not in", values, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdBetween(String value1, String value2) {
            addCriterion("FRIDGE_ID between", value1, value2, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdNotBetween(String value1, String value2) {
            addCriterion("FRIDGE_ID not between", value1, value2, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andBoxStateIsNull() {
            addCriterion("BOX_STATE is null");
            return (Criteria) this;
        }

        public Criteria andBoxStateIsNotNull() {
            addCriterion("BOX_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andBoxStateEqualTo(Short value) {
            addCriterion("BOX_STATE =", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateNotEqualTo(Short value) {
            addCriterion("BOX_STATE <>", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateGreaterThan(Short value) {
            addCriterion("BOX_STATE >", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateGreaterThanOrEqualTo(Short value) {
            addCriterion("BOX_STATE >=", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateLessThan(Short value) {
            addCriterion("BOX_STATE <", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateLessThanOrEqualTo(Short value) {
            addCriterion("BOX_STATE <=", value, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateIn(List<Short> values) {
            addCriterion("BOX_STATE in", values, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateNotIn(List<Short> values) {
            addCriterion("BOX_STATE not in", values, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateBetween(Short value1, Short value2) {
            addCriterion("BOX_STATE between", value1, value2, "boxState");
            return (Criteria) this;
        }

        public Criteria andBoxStateNotBetween(Short value1, Short value2) {
            addCriterion("BOX_STATE not between", value1, value2, "boxState");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsCheckinIsNull() {
            addCriterion("IS_CHECKIN is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckinIsNotNull() {
            addCriterion("IS_CHECKIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckinEqualTo(Short value) {
            addCriterion("IS_CHECKIN =", value, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinNotEqualTo(Short value) {
            addCriterion("IS_CHECKIN <>", value, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinGreaterThan(Short value) {
            addCriterion("IS_CHECKIN >", value, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_CHECKIN >=", value, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinLessThan(Short value) {
            addCriterion("IS_CHECKIN <", value, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinLessThanOrEqualTo(Short value) {
            addCriterion("IS_CHECKIN <=", value, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinIn(List<Short> values) {
            addCriterion("IS_CHECKIN in", values, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinNotIn(List<Short> values) {
            addCriterion("IS_CHECKIN not in", values, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinBetween(Short value1, Short value2) {
            addCriterion("IS_CHECKIN between", value1, value2, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andIsCheckinNotBetween(Short value1, Short value2) {
            addCriterion("IS_CHECKIN not between", value1, value2, "isCheckin");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdIsNull() {
            addCriterion("CHECKINLIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdIsNotNull() {
            addCriterion("CHECKINLIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdEqualTo(String value) {
            addCriterion("CHECKINLIST_ID =", value, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdNotEqualTo(String value) {
            addCriterion("CHECKINLIST_ID <>", value, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdGreaterThan(String value) {
            addCriterion("CHECKINLIST_ID >", value, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKINLIST_ID >=", value, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdLessThan(String value) {
            addCriterion("CHECKINLIST_ID <", value, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdLessThanOrEqualTo(String value) {
            addCriterion("CHECKINLIST_ID <=", value, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdLike(String value) {
            addCriterion("CHECKINLIST_ID like", value, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdNotLike(String value) {
            addCriterion("CHECKINLIST_ID not like", value, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdIn(List<String> values) {
            addCriterion("CHECKINLIST_ID in", values, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdNotIn(List<String> values) {
            addCriterion("CHECKINLIST_ID not in", values, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdBetween(String value1, String value2) {
            addCriterion("CHECKINLIST_ID between", value1, value2, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andCheckinlistIdNotBetween(String value1, String value2) {
            addCriterion("CHECKINLIST_ID not between", value1, value2, "checkinlistId");
            return (Criteria) this;
        }

        public Criteria andLccCodeIsNull() {
            addCriterion("LCC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLccCodeIsNotNull() {
            addCriterion("LCC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLccCodeEqualTo(String value) {
            addCriterion("LCC_CODE =", value, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeNotEqualTo(String value) {
            addCriterion("LCC_CODE <>", value, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeGreaterThan(String value) {
            addCriterion("LCC_CODE >", value, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LCC_CODE >=", value, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeLessThan(String value) {
            addCriterion("LCC_CODE <", value, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeLessThanOrEqualTo(String value) {
            addCriterion("LCC_CODE <=", value, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeLike(String value) {
            addCriterion("LCC_CODE like", value, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeNotLike(String value) {
            addCriterion("LCC_CODE not like", value, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeIn(List<String> values) {
            addCriterion("LCC_CODE in", values, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeNotIn(List<String> values) {
            addCriterion("LCC_CODE not in", values, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeBetween(String value1, String value2) {
            addCriterion("LCC_CODE between", value1, value2, "lccCode");
            return (Criteria) this;
        }

        public Criteria andLccCodeNotBetween(String value1, String value2) {
            addCriterion("LCC_CODE not between", value1, value2, "lccCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
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