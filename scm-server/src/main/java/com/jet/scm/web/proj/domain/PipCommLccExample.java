package com.jet.scm.web.proj.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PipCommLccExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipCommLccExample() {
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

        public Criteria andLccNameIsNull() {
            addCriterion("LCC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLccNameIsNotNull() {
            addCriterion("LCC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLccNameEqualTo(String value) {
            addCriterion("LCC_NAME =", value, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameNotEqualTo(String value) {
            addCriterion("LCC_NAME <>", value, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameGreaterThan(String value) {
            addCriterion("LCC_NAME >", value, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameGreaterThanOrEqualTo(String value) {
            addCriterion("LCC_NAME >=", value, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameLessThan(String value) {
            addCriterion("LCC_NAME <", value, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameLessThanOrEqualTo(String value) {
            addCriterion("LCC_NAME <=", value, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameLike(String value) {
            addCriterion("LCC_NAME like", value, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameNotLike(String value) {
            addCriterion("LCC_NAME not like", value, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameIn(List<String> values) {
            addCriterion("LCC_NAME in", values, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameNotIn(List<String> values) {
            addCriterion("LCC_NAME not in", values, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameBetween(String value1, String value2) {
            addCriterion("LCC_NAME between", value1, value2, "lccName");
            return (Criteria) this;
        }

        public Criteria andLccNameNotBetween(String value1, String value2) {
            addCriterion("LCC_NAME not between", value1, value2, "lccName");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("COUNTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("COUNTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("COUNTRY_CODE =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("COUNTRY_CODE <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("COUNTRY_CODE >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CODE >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("COUNTRY_CODE <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY_CODE <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("COUNTRY_CODE like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("COUNTRY_CODE not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("COUNTRY_CODE in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("COUNTRY_CODE not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("COUNTRY_CODE between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("COUNTRY_CODE not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("UPDATE_BY like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andIsRemovedIsNull() {
            addCriterion("IS_REMOVED is null");
            return (Criteria) this;
        }

        public Criteria andIsRemovedIsNotNull() {
            addCriterion("IS_REMOVED is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemovedEqualTo(Short value) {
            addCriterion("IS_REMOVED =", value, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedNotEqualTo(Short value) {
            addCriterion("IS_REMOVED <>", value, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedGreaterThan(Short value) {
            addCriterion("IS_REMOVED >", value, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_REMOVED >=", value, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedLessThan(Short value) {
            addCriterion("IS_REMOVED <", value, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedLessThanOrEqualTo(Short value) {
            addCriterion("IS_REMOVED <=", value, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedIn(List<Short> values) {
            addCriterion("IS_REMOVED in", values, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedNotIn(List<Short> values) {
            addCriterion("IS_REMOVED not in", values, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedBetween(Short value1, Short value2) {
            addCriterion("IS_REMOVED between", value1, value2, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andIsRemovedNotBetween(Short value1, Short value2) {
            addCriterion("IS_REMOVED not between", value1, value2, "isRemoved");
            return (Criteria) this;
        }

        public Criteria andFtpIpIsNull() {
            addCriterion("FTP_IP is null");
            return (Criteria) this;
        }

        public Criteria andFtpIpIsNotNull() {
            addCriterion("FTP_IP is not null");
            return (Criteria) this;
        }

        public Criteria andFtpIpEqualTo(String value) {
            addCriterion("FTP_IP =", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpNotEqualTo(String value) {
            addCriterion("FTP_IP <>", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpGreaterThan(String value) {
            addCriterion("FTP_IP >", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpGreaterThanOrEqualTo(String value) {
            addCriterion("FTP_IP >=", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpLessThan(String value) {
            addCriterion("FTP_IP <", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpLessThanOrEqualTo(String value) {
            addCriterion("FTP_IP <=", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpLike(String value) {
            addCriterion("FTP_IP like", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpNotLike(String value) {
            addCriterion("FTP_IP not like", value, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpIn(List<String> values) {
            addCriterion("FTP_IP in", values, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpNotIn(List<String> values) {
            addCriterion("FTP_IP not in", values, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpBetween(String value1, String value2) {
            addCriterion("FTP_IP between", value1, value2, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpIpNotBetween(String value1, String value2) {
            addCriterion("FTP_IP not between", value1, value2, "ftpIp");
            return (Criteria) this;
        }

        public Criteria andFtpPortIsNull() {
            addCriterion("FTP_PORT is null");
            return (Criteria) this;
        }

        public Criteria andFtpPortIsNotNull() {
            addCriterion("FTP_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andFtpPortEqualTo(BigDecimal value) {
            addCriterion("FTP_PORT =", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortNotEqualTo(BigDecimal value) {
            addCriterion("FTP_PORT <>", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortGreaterThan(BigDecimal value) {
            addCriterion("FTP_PORT >", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FTP_PORT >=", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortLessThan(BigDecimal value) {
            addCriterion("FTP_PORT <", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FTP_PORT <=", value, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortIn(List<BigDecimal> values) {
            addCriterion("FTP_PORT in", values, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortNotIn(List<BigDecimal> values) {
            addCriterion("FTP_PORT not in", values, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FTP_PORT between", value1, value2, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpPortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FTP_PORT not between", value1, value2, "ftpPort");
            return (Criteria) this;
        }

        public Criteria andFtpUserIsNull() {
            addCriterion("FTP_USER is null");
            return (Criteria) this;
        }

        public Criteria andFtpUserIsNotNull() {
            addCriterion("FTP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andFtpUserEqualTo(String value) {
            addCriterion("FTP_USER =", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserNotEqualTo(String value) {
            addCriterion("FTP_USER <>", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserGreaterThan(String value) {
            addCriterion("FTP_USER >", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserGreaterThanOrEqualTo(String value) {
            addCriterion("FTP_USER >=", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserLessThan(String value) {
            addCriterion("FTP_USER <", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserLessThanOrEqualTo(String value) {
            addCriterion("FTP_USER <=", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserLike(String value) {
            addCriterion("FTP_USER like", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserNotLike(String value) {
            addCriterion("FTP_USER not like", value, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserIn(List<String> values) {
            addCriterion("FTP_USER in", values, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserNotIn(List<String> values) {
            addCriterion("FTP_USER not in", values, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserBetween(String value1, String value2) {
            addCriterion("FTP_USER between", value1, value2, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpUserNotBetween(String value1, String value2) {
            addCriterion("FTP_USER not between", value1, value2, "ftpUser");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordIsNull() {
            addCriterion("FTP_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordIsNotNull() {
            addCriterion("FTP_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordEqualTo(String value) {
            addCriterion("FTP_PASSWORD =", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordNotEqualTo(String value) {
            addCriterion("FTP_PASSWORD <>", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordGreaterThan(String value) {
            addCriterion("FTP_PASSWORD >", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("FTP_PASSWORD >=", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordLessThan(String value) {
            addCriterion("FTP_PASSWORD <", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordLessThanOrEqualTo(String value) {
            addCriterion("FTP_PASSWORD <=", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordLike(String value) {
            addCriterion("FTP_PASSWORD like", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordNotLike(String value) {
            addCriterion("FTP_PASSWORD not like", value, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordIn(List<String> values) {
            addCriterion("FTP_PASSWORD in", values, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordNotIn(List<String> values) {
            addCriterion("FTP_PASSWORD not in", values, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordBetween(String value1, String value2) {
            addCriterion("FTP_PASSWORD between", value1, value2, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andFtpPasswordNotBetween(String value1, String value2) {
            addCriterion("FTP_PASSWORD not between", value1, value2, "ftpPassword");
            return (Criteria) this;
        }

        public Criteria andCostSumIsNull() {
            addCriterion("COST_SUM is null");
            return (Criteria) this;
        }

        public Criteria andCostSumIsNotNull() {
            addCriterion("COST_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andCostSumEqualTo(BigDecimal value) {
            addCriterion("COST_SUM =", value, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumNotEqualTo(BigDecimal value) {
            addCriterion("COST_SUM <>", value, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumGreaterThan(BigDecimal value) {
            addCriterion("COST_SUM >", value, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_SUM >=", value, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumLessThan(BigDecimal value) {
            addCriterion("COST_SUM <", value, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_SUM <=", value, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumIn(List<BigDecimal> values) {
            addCriterion("COST_SUM in", values, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumNotIn(List<BigDecimal> values) {
            addCriterion("COST_SUM not in", values, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_SUM between", value1, value2, "costSum");
            return (Criteria) this;
        }

        public Criteria andCostSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_SUM not between", value1, value2, "costSum");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNull() {
            addCriterion("ENGLISH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIsNotNull() {
            addCriterion("ENGLISH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishNameEqualTo(String value) {
            addCriterion("ENGLISH_NAME =", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotEqualTo(String value) {
            addCriterion("ENGLISH_NAME <>", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThan(String value) {
            addCriterion("ENGLISH_NAME >", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISH_NAME >=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThan(String value) {
            addCriterion("ENGLISH_NAME <", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLessThanOrEqualTo(String value) {
            addCriterion("ENGLISH_NAME <=", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameLike(String value) {
            addCriterion("ENGLISH_NAME like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotLike(String value) {
            addCriterion("ENGLISH_NAME not like", value, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameIn(List<String> values) {
            addCriterion("ENGLISH_NAME in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotIn(List<String> values) {
            addCriterion("ENGLISH_NAME not in", values, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameBetween(String value1, String value2) {
            addCriterion("ENGLISH_NAME between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andEnglishNameNotBetween(String value1, String value2) {
            addCriterion("ENGLISH_NAME not between", value1, value2, "englishName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIsNull() {
            addCriterion("PROJECT_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIsNotNull() {
            addCriterion("PROJECT_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerEqualTo(String value) {
            addCriterion("PROJECT_MANAGER =", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotEqualTo(String value) {
            addCriterion("PROJECT_MANAGER <>", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGreaterThan(String value) {
            addCriterion("PROJECT_MANAGER >", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_MANAGER >=", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLessThan(String value) {
            addCriterion("PROJECT_MANAGER <", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_MANAGER <=", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLike(String value) {
            addCriterion("PROJECT_MANAGER like", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotLike(String value) {
            addCriterion("PROJECT_MANAGER not like", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIn(List<String> values) {
            addCriterion("PROJECT_MANAGER in", values, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotIn(List<String> values) {
            addCriterion("PROJECT_MANAGER not in", values, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerBetween(String value1, String value2) {
            addCriterion("PROJECT_MANAGER between", value1, value2, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotBetween(String value1, String value2) {
            addCriterion("PROJECT_MANAGER not between", value1, value2, "projectManager");
            return (Criteria) this;
        }

        public Criteria andPmTelIsNull() {
            addCriterion("PM_TEL is null");
            return (Criteria) this;
        }

        public Criteria andPmTelIsNotNull() {
            addCriterion("PM_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andPmTelEqualTo(String value) {
            addCriterion("PM_TEL =", value, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelNotEqualTo(String value) {
            addCriterion("PM_TEL <>", value, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelGreaterThan(String value) {
            addCriterion("PM_TEL >", value, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelGreaterThanOrEqualTo(String value) {
            addCriterion("PM_TEL >=", value, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelLessThan(String value) {
            addCriterion("PM_TEL <", value, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelLessThanOrEqualTo(String value) {
            addCriterion("PM_TEL <=", value, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelLike(String value) {
            addCriterion("PM_TEL like", value, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelNotLike(String value) {
            addCriterion("PM_TEL not like", value, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelIn(List<String> values) {
            addCriterion("PM_TEL in", values, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelNotIn(List<String> values) {
            addCriterion("PM_TEL not in", values, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelBetween(String value1, String value2) {
            addCriterion("PM_TEL between", value1, value2, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmTelNotBetween(String value1, String value2) {
            addCriterion("PM_TEL not between", value1, value2, "pmTel");
            return (Criteria) this;
        }

        public Criteria andPmEmailIsNull() {
            addCriterion("PM_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andPmEmailIsNotNull() {
            addCriterion("PM_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPmEmailEqualTo(String value) {
            addCriterion("PM_EMAIL =", value, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailNotEqualTo(String value) {
            addCriterion("PM_EMAIL <>", value, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailGreaterThan(String value) {
            addCriterion("PM_EMAIL >", value, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailGreaterThanOrEqualTo(String value) {
            addCriterion("PM_EMAIL >=", value, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailLessThan(String value) {
            addCriterion("PM_EMAIL <", value, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailLessThanOrEqualTo(String value) {
            addCriterion("PM_EMAIL <=", value, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailLike(String value) {
            addCriterion("PM_EMAIL like", value, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailNotLike(String value) {
            addCriterion("PM_EMAIL not like", value, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailIn(List<String> values) {
            addCriterion("PM_EMAIL in", values, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailNotIn(List<String> values) {
            addCriterion("PM_EMAIL not in", values, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailBetween(String value1, String value2) {
            addCriterion("PM_EMAIL between", value1, value2, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andPmEmailNotBetween(String value1, String value2) {
            addCriterion("PM_EMAIL not between", value1, value2, "pmEmail");
            return (Criteria) this;
        }

        public Criteria andContractSignDateIsNull() {
            addCriterion("CONTRACT_SIGN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andContractSignDateIsNotNull() {
            addCriterion("CONTRACT_SIGN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractSignDateEqualTo(Date value) {
            addCriterion("CONTRACT_SIGN_DATE =", value, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateNotEqualTo(Date value) {
            addCriterion("CONTRACT_SIGN_DATE <>", value, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateGreaterThan(Date value) {
            addCriterion("CONTRACT_SIGN_DATE >", value, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTRACT_SIGN_DATE >=", value, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateLessThan(Date value) {
            addCriterion("CONTRACT_SIGN_DATE <", value, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateLessThanOrEqualTo(Date value) {
            addCriterion("CONTRACT_SIGN_DATE <=", value, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateIn(List<Date> values) {
            addCriterion("CONTRACT_SIGN_DATE in", values, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateNotIn(List<Date> values) {
            addCriterion("CONTRACT_SIGN_DATE not in", values, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateBetween(Date value1, Date value2) {
            addCriterion("CONTRACT_SIGN_DATE between", value1, value2, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andContractSignDateNotBetween(Date value1, Date value2) {
            addCriterion("CONTRACT_SIGN_DATE not between", value1, value2, "contractSignDate");
            return (Criteria) this;
        }

        public Criteria andIsSignContractIsNull() {
            addCriterion("IS_SIGN_CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andIsSignContractIsNotNull() {
            addCriterion("IS_SIGN_CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignContractEqualTo(String value) {
            addCriterion("IS_SIGN_CONTRACT =", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractNotEqualTo(String value) {
            addCriterion("IS_SIGN_CONTRACT <>", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractGreaterThan(String value) {
            addCriterion("IS_SIGN_CONTRACT >", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SIGN_CONTRACT >=", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractLessThan(String value) {
            addCriterion("IS_SIGN_CONTRACT <", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractLessThanOrEqualTo(String value) {
            addCriterion("IS_SIGN_CONTRACT <=", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractLike(String value) {
            addCriterion("IS_SIGN_CONTRACT like", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractNotLike(String value) {
            addCriterion("IS_SIGN_CONTRACT not like", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractIn(List<String> values) {
            addCriterion("IS_SIGN_CONTRACT in", values, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractNotIn(List<String> values) {
            addCriterion("IS_SIGN_CONTRACT not in", values, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractBetween(String value1, String value2) {
            addCriterion("IS_SIGN_CONTRACT between", value1, value2, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractNotBetween(String value1, String value2) {
            addCriterion("IS_SIGN_CONTRACT not between", value1, value2, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateIsNull() {
            addCriterion("HIGHER_APPROVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateIsNotNull() {
            addCriterion("HIGHER_APPROVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateEqualTo(Date value) {
            addCriterion("HIGHER_APPROVE_DATE =", value, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateNotEqualTo(Date value) {
            addCriterion("HIGHER_APPROVE_DATE <>", value, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateGreaterThan(Date value) {
            addCriterion("HIGHER_APPROVE_DATE >", value, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("HIGHER_APPROVE_DATE >=", value, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateLessThan(Date value) {
            addCriterion("HIGHER_APPROVE_DATE <", value, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateLessThanOrEqualTo(Date value) {
            addCriterion("HIGHER_APPROVE_DATE <=", value, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateIn(List<Date> values) {
            addCriterion("HIGHER_APPROVE_DATE in", values, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateNotIn(List<Date> values) {
            addCriterion("HIGHER_APPROVE_DATE not in", values, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateBetween(Date value1, Date value2) {
            addCriterion("HIGHER_APPROVE_DATE between", value1, value2, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andHigherApproveDateNotBetween(Date value1, Date value2) {
            addCriterion("HIGHER_APPROVE_DATE not between", value1, value2, "higherApproveDate");
            return (Criteria) this;
        }

        public Criteria andIsTrainingIsNull() {
            addCriterion("IS_TRAINING is null");
            return (Criteria) this;
        }

        public Criteria andIsTrainingIsNotNull() {
            addCriterion("IS_TRAINING is not null");
            return (Criteria) this;
        }

        public Criteria andIsTrainingEqualTo(String value) {
            addCriterion("IS_TRAINING =", value, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingNotEqualTo(String value) {
            addCriterion("IS_TRAINING <>", value, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingGreaterThan(String value) {
            addCriterion("IS_TRAINING >", value, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TRAINING >=", value, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingLessThan(String value) {
            addCriterion("IS_TRAINING <", value, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingLessThanOrEqualTo(String value) {
            addCriterion("IS_TRAINING <=", value, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingLike(String value) {
            addCriterion("IS_TRAINING like", value, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingNotLike(String value) {
            addCriterion("IS_TRAINING not like", value, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingIn(List<String> values) {
            addCriterion("IS_TRAINING in", values, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingNotIn(List<String> values) {
            addCriterion("IS_TRAINING not in", values, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingBetween(String value1, String value2) {
            addCriterion("IS_TRAINING between", value1, value2, "isTraining");
            return (Criteria) this;
        }

        public Criteria andIsTrainingNotBetween(String value1, String value2) {
            addCriterion("IS_TRAINING not between", value1, value2, "isTraining");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateIsNull() {
            addCriterion("EXPECT_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateIsNotNull() {
            addCriterion("EXPECT_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateEqualTo(Date value) {
            addCriterion("EXPECT_START_DATE =", value, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateNotEqualTo(Date value) {
            addCriterion("EXPECT_START_DATE <>", value, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateGreaterThan(Date value) {
            addCriterion("EXPECT_START_DATE >", value, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPECT_START_DATE >=", value, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateLessThan(Date value) {
            addCriterion("EXPECT_START_DATE <", value, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPECT_START_DATE <=", value, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateIn(List<Date> values) {
            addCriterion("EXPECT_START_DATE in", values, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateNotIn(List<Date> values) {
            addCriterion("EXPECT_START_DATE not in", values, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateBetween(Date value1, Date value2) {
            addCriterion("EXPECT_START_DATE between", value1, value2, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andExpectStartDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPECT_START_DATE not between", value1, value2, "expectStartDate");
            return (Criteria) this;
        }

        public Criteria andLccTypeIsNull() {
            addCriterion("LCC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLccTypeIsNotNull() {
            addCriterion("LCC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLccTypeEqualTo(String value) {
            addCriterion("LCC_TYPE =", value, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeNotEqualTo(String value) {
            addCriterion("LCC_TYPE <>", value, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeGreaterThan(String value) {
            addCriterion("LCC_TYPE >", value, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LCC_TYPE >=", value, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeLessThan(String value) {
            addCriterion("LCC_TYPE <", value, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeLessThanOrEqualTo(String value) {
            addCriterion("LCC_TYPE <=", value, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeLike(String value) {
            addCriterion("LCC_TYPE like", value, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeNotLike(String value) {
            addCriterion("LCC_TYPE not like", value, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeIn(List<String> values) {
            addCriterion("LCC_TYPE in", values, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeNotIn(List<String> values) {
            addCriterion("LCC_TYPE not in", values, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeBetween(String value1, String value2) {
            addCriterion("LCC_TYPE between", value1, value2, "lccType");
            return (Criteria) this;
        }

        public Criteria andLccTypeNotBetween(String value1, String value2) {
            addCriterion("LCC_TYPE not between", value1, value2, "lccType");
            return (Criteria) this;
        }

        public Criteria andIsEthicalIsNull() {
            addCriterion("IS_ETHICAL is null");
            return (Criteria) this;
        }

        public Criteria andIsEthicalIsNotNull() {
            addCriterion("IS_ETHICAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsEthicalEqualTo(String value) {
            addCriterion("IS_ETHICAL =", value, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalNotEqualTo(String value) {
            addCriterion("IS_ETHICAL <>", value, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalGreaterThan(String value) {
            addCriterion("IS_ETHICAL >", value, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ETHICAL >=", value, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalLessThan(String value) {
            addCriterion("IS_ETHICAL <", value, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalLessThanOrEqualTo(String value) {
            addCriterion("IS_ETHICAL <=", value, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalLike(String value) {
            addCriterion("IS_ETHICAL like", value, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalNotLike(String value) {
            addCriterion("IS_ETHICAL not like", value, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalIn(List<String> values) {
            addCriterion("IS_ETHICAL in", values, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalNotIn(List<String> values) {
            addCriterion("IS_ETHICAL not in", values, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalBetween(String value1, String value2) {
            addCriterion("IS_ETHICAL between", value1, value2, "isEthical");
            return (Criteria) this;
        }

        public Criteria andIsEthicalNotBetween(String value1, String value2) {
            addCriterion("IS_ETHICAL not between", value1, value2, "isEthical");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateIsNull() {
            addCriterion("ETHICAL_EFFECTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateIsNotNull() {
            addCriterion("ETHICAL_EFFECTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateEqualTo(Date value) {
            addCriterion("ETHICAL_EFFECTIVE_DATE =", value, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateNotEqualTo(Date value) {
            addCriterion("ETHICAL_EFFECTIVE_DATE <>", value, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateGreaterThan(Date value) {
            addCriterion("ETHICAL_EFFECTIVE_DATE >", value, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ETHICAL_EFFECTIVE_DATE >=", value, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateLessThan(Date value) {
            addCriterion("ETHICAL_EFFECTIVE_DATE <", value, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterion("ETHICAL_EFFECTIVE_DATE <=", value, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateIn(List<Date> values) {
            addCriterion("ETHICAL_EFFECTIVE_DATE in", values, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateNotIn(List<Date> values) {
            addCriterion("ETHICAL_EFFECTIVE_DATE not in", values, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateBetween(Date value1, Date value2) {
            addCriterion("ETHICAL_EFFECTIVE_DATE between", value1, value2, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterion("ETHICAL_EFFECTIVE_DATE not between", value1, value2, "ethicalEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateIsNull() {
            addCriterion("ETHICAL_DISABLE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateIsNotNull() {
            addCriterion("ETHICAL_DISABLE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateEqualTo(Date value) {
            addCriterion("ETHICAL_DISABLE_DATE =", value, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateNotEqualTo(Date value) {
            addCriterion("ETHICAL_DISABLE_DATE <>", value, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateGreaterThan(Date value) {
            addCriterion("ETHICAL_DISABLE_DATE >", value, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ETHICAL_DISABLE_DATE >=", value, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateLessThan(Date value) {
            addCriterion("ETHICAL_DISABLE_DATE <", value, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateLessThanOrEqualTo(Date value) {
            addCriterion("ETHICAL_DISABLE_DATE <=", value, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateIn(List<Date> values) {
            addCriterion("ETHICAL_DISABLE_DATE in", values, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateNotIn(List<Date> values) {
            addCriterion("ETHICAL_DISABLE_DATE not in", values, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateBetween(Date value1, Date value2) {
            addCriterion("ETHICAL_DISABLE_DATE between", value1, value2, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalDisableDateNotBetween(Date value1, Date value2) {
            addCriterion("ETHICAL_DISABLE_DATE not between", value1, value2, "ethicalDisableDate");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeIsNull() {
            addCriterion("ETHICAL_PAPER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeIsNotNull() {
            addCriterion("ETHICAL_PAPER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeEqualTo(String value) {
            addCriterion("ETHICAL_PAPER_CODE =", value, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeNotEqualTo(String value) {
            addCriterion("ETHICAL_PAPER_CODE <>", value, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeGreaterThan(String value) {
            addCriterion("ETHICAL_PAPER_CODE >", value, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ETHICAL_PAPER_CODE >=", value, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeLessThan(String value) {
            addCriterion("ETHICAL_PAPER_CODE <", value, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeLessThanOrEqualTo(String value) {
            addCriterion("ETHICAL_PAPER_CODE <=", value, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeLike(String value) {
            addCriterion("ETHICAL_PAPER_CODE like", value, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeNotLike(String value) {
            addCriterion("ETHICAL_PAPER_CODE not like", value, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeIn(List<String> values) {
            addCriterion("ETHICAL_PAPER_CODE in", values, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeNotIn(List<String> values) {
            addCriterion("ETHICAL_PAPER_CODE not in", values, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeBetween(String value1, String value2) {
            addCriterion("ETHICAL_PAPER_CODE between", value1, value2, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andEthicalPaperCodeNotBetween(String value1, String value2) {
            addCriterion("ETHICAL_PAPER_CODE not between", value1, value2, "ethicalPaperCode");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNull() {
            addCriterion("DELIVERY_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIsNotNull() {
            addCriterion("DELIVERY_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressEqualTo(String value) {
            addCriterion("DELIVERY_ADDRESS =", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotEqualTo(String value) {
            addCriterion("DELIVERY_ADDRESS <>", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThan(String value) {
            addCriterion("DELIVERY_ADDRESS >", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ADDRESS >=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThan(String value) {
            addCriterion("DELIVERY_ADDRESS <", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_ADDRESS <=", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressLike(String value) {
            addCriterion("DELIVERY_ADDRESS like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotLike(String value) {
            addCriterion("DELIVERY_ADDRESS not like", value, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressIn(List<String> values) {
            addCriterion("DELIVERY_ADDRESS in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotIn(List<String> values) {
            addCriterion("DELIVERY_ADDRESS not in", values, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressBetween(String value1, String value2) {
            addCriterion("DELIVERY_ADDRESS between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryAddressNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_ADDRESS not between", value1, value2, "deliveryAddress");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactIsNull() {
            addCriterion("DELIVERY_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactIsNotNull() {
            addCriterion("DELIVERY_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactEqualTo(String value) {
            addCriterion("DELIVERY_CONTACT =", value, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactNotEqualTo(String value) {
            addCriterion("DELIVERY_CONTACT <>", value, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactGreaterThan(String value) {
            addCriterion("DELIVERY_CONTACT >", value, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_CONTACT >=", value, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactLessThan(String value) {
            addCriterion("DELIVERY_CONTACT <", value, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_CONTACT <=", value, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactLike(String value) {
            addCriterion("DELIVERY_CONTACT like", value, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactNotLike(String value) {
            addCriterion("DELIVERY_CONTACT not like", value, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactIn(List<String> values) {
            addCriterion("DELIVERY_CONTACT in", values, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactNotIn(List<String> values) {
            addCriterion("DELIVERY_CONTACT not in", values, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactBetween(String value1, String value2) {
            addCriterion("DELIVERY_CONTACT between", value1, value2, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryContactNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_CONTACT not between", value1, value2, "deliveryContact");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelIsNull() {
            addCriterion("DELIVERY_TEL is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelIsNotNull() {
            addCriterion("DELIVERY_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelEqualTo(String value) {
            addCriterion("DELIVERY_TEL =", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelNotEqualTo(String value) {
            addCriterion("DELIVERY_TEL <>", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelGreaterThan(String value) {
            addCriterion("DELIVERY_TEL >", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TEL >=", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelLessThan(String value) {
            addCriterion("DELIVERY_TEL <", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TEL <=", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelLike(String value) {
            addCriterion("DELIVERY_TEL like", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelNotLike(String value) {
            addCriterion("DELIVERY_TEL not like", value, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelIn(List<String> values) {
            addCriterion("DELIVERY_TEL in", values, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelNotIn(List<String> values) {
            addCriterion("DELIVERY_TEL not in", values, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelBetween(String value1, String value2) {
            addCriterion("DELIVERY_TEL between", value1, value2, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andDeliveryTelNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_TEL not between", value1, value2, "deliveryTel");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("START_DATE like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("START_DATE not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andRccCodeIsNull() {
            addCriterion("RCC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRccCodeIsNotNull() {
            addCriterion("RCC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRccCodeEqualTo(String value) {
            addCriterion("RCC_CODE =", value, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeNotEqualTo(String value) {
            addCriterion("RCC_CODE <>", value, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeGreaterThan(String value) {
            addCriterion("RCC_CODE >", value, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RCC_CODE >=", value, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeLessThan(String value) {
            addCriterion("RCC_CODE <", value, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeLessThanOrEqualTo(String value) {
            addCriterion("RCC_CODE <=", value, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeLike(String value) {
            addCriterion("RCC_CODE like", value, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeNotLike(String value) {
            addCriterion("RCC_CODE not like", value, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeIn(List<String> values) {
            addCriterion("RCC_CODE in", values, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeNotIn(List<String> values) {
            addCriterion("RCC_CODE not in", values, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeBetween(String value1, String value2) {
            addCriterion("RCC_CODE between", value1, value2, "rccCode");
            return (Criteria) this;
        }

        public Criteria andRccCodeNotBetween(String value1, String value2) {
            addCriterion("RCC_CODE not between", value1, value2, "rccCode");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepIsNull() {
            addCriterion("IS_ADMIN_DEP is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepIsNotNull() {
            addCriterion("IS_ADMIN_DEP is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepEqualTo(String value) {
            addCriterion("IS_ADMIN_DEP =", value, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepNotEqualTo(String value) {
            addCriterion("IS_ADMIN_DEP <>", value, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepGreaterThan(String value) {
            addCriterion("IS_ADMIN_DEP >", value, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ADMIN_DEP >=", value, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepLessThan(String value) {
            addCriterion("IS_ADMIN_DEP <", value, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepLessThanOrEqualTo(String value) {
            addCriterion("IS_ADMIN_DEP <=", value, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepLike(String value) {
            addCriterion("IS_ADMIN_DEP like", value, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepNotLike(String value) {
            addCriterion("IS_ADMIN_DEP not like", value, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepIn(List<String> values) {
            addCriterion("IS_ADMIN_DEP in", values, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepNotIn(List<String> values) {
            addCriterion("IS_ADMIN_DEP not in", values, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepBetween(String value1, String value2) {
            addCriterion("IS_ADMIN_DEP between", value1, value2, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andIsAdminDepNotBetween(String value1, String value2) {
            addCriterion("IS_ADMIN_DEP not between", value1, value2, "isAdminDep");
            return (Criteria) this;
        }

        public Criteria andOrganIsNull() {
            addCriterion("ORGAN is null");
            return (Criteria) this;
        }

        public Criteria andOrganIsNotNull() {
            addCriterion("ORGAN is not null");
            return (Criteria) this;
        }

        public Criteria andOrganEqualTo(String value) {
            addCriterion("ORGAN =", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotEqualTo(String value) {
            addCriterion("ORGAN <>", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganGreaterThan(String value) {
            addCriterion("ORGAN >", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganGreaterThanOrEqualTo(String value) {
            addCriterion("ORGAN >=", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLessThan(String value) {
            addCriterion("ORGAN <", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLessThanOrEqualTo(String value) {
            addCriterion("ORGAN <=", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganLike(String value) {
            addCriterion("ORGAN like", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotLike(String value) {
            addCriterion("ORGAN not like", value, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganIn(List<String> values) {
            addCriterion("ORGAN in", values, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotIn(List<String> values) {
            addCriterion("ORGAN not in", values, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganBetween(String value1, String value2) {
            addCriterion("ORGAN between", value1, value2, "organ");
            return (Criteria) this;
        }

        public Criteria andOrganNotBetween(String value1, String value2) {
            addCriterion("ORGAN not between", value1, value2, "organ");
            return (Criteria) this;
        }

        public Criteria andLccroleIsNull() {
            addCriterion("LCCROLE is null");
            return (Criteria) this;
        }

        public Criteria andLccroleIsNotNull() {
            addCriterion("LCCROLE is not null");
            return (Criteria) this;
        }

        public Criteria andLccroleEqualTo(String value) {
            addCriterion("LCCROLE =", value, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleNotEqualTo(String value) {
            addCriterion("LCCROLE <>", value, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleGreaterThan(String value) {
            addCriterion("LCCROLE >", value, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleGreaterThanOrEqualTo(String value) {
            addCriterion("LCCROLE >=", value, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleLessThan(String value) {
            addCriterion("LCCROLE <", value, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleLessThanOrEqualTo(String value) {
            addCriterion("LCCROLE <=", value, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleLike(String value) {
            addCriterion("LCCROLE like", value, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleNotLike(String value) {
            addCriterion("LCCROLE not like", value, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleIn(List<String> values) {
            addCriterion("LCCROLE in", values, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleNotIn(List<String> values) {
            addCriterion("LCCROLE not in", values, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleBetween(String value1, String value2) {
            addCriterion("LCCROLE between", value1, value2, "lccrole");
            return (Criteria) this;
        }

        public Criteria andLccroleNotBetween(String value1, String value2) {
            addCriterion("LCCROLE not between", value1, value2, "lccrole");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNull() {
            addCriterion("WORKLOAD is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadIsNotNull() {
            addCriterion("WORKLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD =", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD <>", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD >", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD >=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThan(BigDecimal value) {
            addCriterion("WORKLOAD <", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD <=", value, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD not in", values, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD between", value1, value2, "workload");
            return (Criteria) this;
        }

        public Criteria andWorkloadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD not between", value1, value2, "workload");
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

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andLccCategoryIsNull() {
            addCriterion("LCC_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andLccCategoryIsNotNull() {
            addCriterion("LCC_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andLccCategoryEqualTo(String value) {
            addCriterion("LCC_CATEGORY =", value, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryNotEqualTo(String value) {
            addCriterion("LCC_CATEGORY <>", value, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryGreaterThan(String value) {
            addCriterion("LCC_CATEGORY >", value, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("LCC_CATEGORY >=", value, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryLessThan(String value) {
            addCriterion("LCC_CATEGORY <", value, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryLessThanOrEqualTo(String value) {
            addCriterion("LCC_CATEGORY <=", value, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryLike(String value) {
            addCriterion("LCC_CATEGORY like", value, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryNotLike(String value) {
            addCriterion("LCC_CATEGORY not like", value, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryIn(List<String> values) {
            addCriterion("LCC_CATEGORY in", values, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryNotIn(List<String> values) {
            addCriterion("LCC_CATEGORY not in", values, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryBetween(String value1, String value2) {
            addCriterion("LCC_CATEGORY between", value1, value2, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andLccCategoryNotBetween(String value1, String value2) {
            addCriterion("LCC_CATEGORY not between", value1, value2, "lccCategory");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIsNull() {
            addCriterion("HOSPITAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIsNotNull() {
            addCriterion("HOSPITAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeEqualTo(String value) {
            addCriterion("HOSPITAL_TYPE =", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotEqualTo(String value) {
            addCriterion("HOSPITAL_TYPE <>", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeGreaterThan(String value) {
            addCriterion("HOSPITAL_TYPE >", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_TYPE >=", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLessThan(String value) {
            addCriterion("HOSPITAL_TYPE <", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLessThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_TYPE <=", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLike(String value) {
            addCriterion("HOSPITAL_TYPE like", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotLike(String value) {
            addCriterion("HOSPITAL_TYPE not like", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIn(List<String> values) {
            addCriterion("HOSPITAL_TYPE in", values, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotIn(List<String> values) {
            addCriterion("HOSPITAL_TYPE not in", values, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeBetween(String value1, String value2) {
            addCriterion("HOSPITAL_TYPE between", value1, value2, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotBetween(String value1, String value2) {
            addCriterion("HOSPITAL_TYPE not between", value1, value2, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andPmDutyIsNull() {
            addCriterion("PM_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andPmDutyIsNotNull() {
            addCriterion("PM_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andPmDutyEqualTo(String value) {
            addCriterion("PM_DUTY =", value, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyNotEqualTo(String value) {
            addCriterion("PM_DUTY <>", value, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyGreaterThan(String value) {
            addCriterion("PM_DUTY >", value, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyGreaterThanOrEqualTo(String value) {
            addCriterion("PM_DUTY >=", value, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyLessThan(String value) {
            addCriterion("PM_DUTY <", value, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyLessThanOrEqualTo(String value) {
            addCriterion("PM_DUTY <=", value, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyLike(String value) {
            addCriterion("PM_DUTY like", value, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyNotLike(String value) {
            addCriterion("PM_DUTY not like", value, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyIn(List<String> values) {
            addCriterion("PM_DUTY in", values, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyNotIn(List<String> values) {
            addCriterion("PM_DUTY not in", values, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyBetween(String value1, String value2) {
            addCriterion("PM_DUTY between", value1, value2, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andPmDutyNotBetween(String value1, String value2) {
            addCriterion("PM_DUTY not between", value1, value2, "pmDuty");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeIsNull() {
            addCriterion("ESTIMATED_BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeIsNotNull() {
            addCriterion("ESTIMATED_BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeEqualTo(Date value) {
            addCriterion("ESTIMATED_BEGIN_TIME =", value, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeNotEqualTo(Date value) {
            addCriterion("ESTIMATED_BEGIN_TIME <>", value, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeGreaterThan(Date value) {
            addCriterion("ESTIMATED_BEGIN_TIME >", value, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ESTIMATED_BEGIN_TIME >=", value, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeLessThan(Date value) {
            addCriterion("ESTIMATED_BEGIN_TIME <", value, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("ESTIMATED_BEGIN_TIME <=", value, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeIn(List<Date> values) {
            addCriterion("ESTIMATED_BEGIN_TIME in", values, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeNotIn(List<Date> values) {
            addCriterion("ESTIMATED_BEGIN_TIME not in", values, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeBetween(Date value1, Date value2) {
            addCriterion("ESTIMATED_BEGIN_TIME between", value1, value2, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("ESTIMATED_BEGIN_TIME not between", value1, value2, "estimatedBeginTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeIsNull() {
            addCriterion("ESTIMATED_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeIsNotNull() {
            addCriterion("ESTIMATED_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeEqualTo(Date value) {
            addCriterion("ESTIMATED_END_TIME =", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeNotEqualTo(Date value) {
            addCriterion("ESTIMATED_END_TIME <>", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeGreaterThan(Date value) {
            addCriterion("ESTIMATED_END_TIME >", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ESTIMATED_END_TIME >=", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeLessThan(Date value) {
            addCriterion("ESTIMATED_END_TIME <", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("ESTIMATED_END_TIME <=", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeIn(List<Date> values) {
            addCriterion("ESTIMATED_END_TIME in", values, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeNotIn(List<Date> values) {
            addCriterion("ESTIMATED_END_TIME not in", values, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeBetween(Date value1, Date value2) {
            addCriterion("ESTIMATED_END_TIME between", value1, value2, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("ESTIMATED_END_TIME not between", value1, value2, "estimatedEndTime");
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