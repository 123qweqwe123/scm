package com.jet.scm.mobile.web.spem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScmMobileTransferDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScmMobileTransferDetailExample() {
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

        public Criteria andTransDetailIdIsNull() {
            addCriterion("TRANS_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdIsNotNull() {
            addCriterion("TRANS_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdEqualTo(String value) {
            addCriterion("TRANS_DETAIL_ID =", value, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdNotEqualTo(String value) {
            addCriterion("TRANS_DETAIL_ID <>", value, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdGreaterThan(String value) {
            addCriterion("TRANS_DETAIL_ID >", value, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DETAIL_ID >=", value, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdLessThan(String value) {
            addCriterion("TRANS_DETAIL_ID <", value, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DETAIL_ID <=", value, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdLike(String value) {
            addCriterion("TRANS_DETAIL_ID like", value, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdNotLike(String value) {
            addCriterion("TRANS_DETAIL_ID not like", value, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdIn(List<String> values) {
            addCriterion("TRANS_DETAIL_ID in", values, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdNotIn(List<String> values) {
            addCriterion("TRANS_DETAIL_ID not in", values, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdBetween(String value1, String value2) {
            addCriterion("TRANS_DETAIL_ID between", value1, value2, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailIdNotBetween(String value1, String value2) {
            addCriterion("TRANS_DETAIL_ID not between", value1, value2, "transDetailId");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoIsNull() {
            addCriterion("TRANS_DETAIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoIsNotNull() {
            addCriterion("TRANS_DETAIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoEqualTo(String value) {
            addCriterion("TRANS_DETAIL_NO =", value, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoNotEqualTo(String value) {
            addCriterion("TRANS_DETAIL_NO <>", value, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoGreaterThan(String value) {
            addCriterion("TRANS_DETAIL_NO >", value, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DETAIL_NO >=", value, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoLessThan(String value) {
            addCriterion("TRANS_DETAIL_NO <", value, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DETAIL_NO <=", value, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoLike(String value) {
            addCriterion("TRANS_DETAIL_NO like", value, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoNotLike(String value) {
            addCriterion("TRANS_DETAIL_NO not like", value, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoIn(List<String> values) {
            addCriterion("TRANS_DETAIL_NO in", values, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoNotIn(List<String> values) {
            addCriterion("TRANS_DETAIL_NO not in", values, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoBetween(String value1, String value2) {
            addCriterion("TRANS_DETAIL_NO between", value1, value2, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransDetailNoNotBetween(String value1, String value2) {
            addCriterion("TRANS_DETAIL_NO not between", value1, value2, "transDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNull() {
            addCriterion("TRANS_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("TRANS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(String value) {
            addCriterion("TRANS_ID =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(String value) {
            addCriterion("TRANS_ID <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(String value) {
            addCriterion("TRANS_ID >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_ID >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(String value) {
            addCriterion("TRANS_ID <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_ID <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLike(String value) {
            addCriterion("TRANS_ID like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotLike(String value) {
            addCriterion("TRANS_ID not like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<String> values) {
            addCriterion("TRANS_ID in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<String> values) {
            addCriterion("TRANS_ID not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(String value1, String value2) {
            addCriterion("TRANS_ID between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(String value1, String value2) {
            addCriterion("TRANS_ID not between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNull() {
            addCriterion("TRANS_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransNoIsNotNull() {
            addCriterion("TRANS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransNoEqualTo(String value) {
            addCriterion("TRANS_NO =", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotEqualTo(String value) {
            addCriterion("TRANS_NO <>", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThan(String value) {
            addCriterion("TRANS_NO >", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_NO >=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThan(String value) {
            addCriterion("TRANS_NO <", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLessThanOrEqualTo(String value) {
            addCriterion("TRANS_NO <=", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoLike(String value) {
            addCriterion("TRANS_NO like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotLike(String value) {
            addCriterion("TRANS_NO not like", value, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoIn(List<String> values) {
            addCriterion("TRANS_NO in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotIn(List<String> values) {
            addCriterion("TRANS_NO not in", values, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoBetween(String value1, String value2) {
            addCriterion("TRANS_NO between", value1, value2, "transNo");
            return (Criteria) this;
        }

        public Criteria andTransNoNotBetween(String value1, String value2) {
            addCriterion("TRANS_NO not between", value1, value2, "transNo");
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

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
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

        public Criteria andRccNameIsNull() {
            addCriterion("RCC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRccNameIsNotNull() {
            addCriterion("RCC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRccNameEqualTo(String value) {
            addCriterion("RCC_NAME =", value, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameNotEqualTo(String value) {
            addCriterion("RCC_NAME <>", value, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameGreaterThan(String value) {
            addCriterion("RCC_NAME >", value, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameGreaterThanOrEqualTo(String value) {
            addCriterion("RCC_NAME >=", value, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameLessThan(String value) {
            addCriterion("RCC_NAME <", value, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameLessThanOrEqualTo(String value) {
            addCriterion("RCC_NAME <=", value, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameLike(String value) {
            addCriterion("RCC_NAME like", value, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameNotLike(String value) {
            addCriterion("RCC_NAME not like", value, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameIn(List<String> values) {
            addCriterion("RCC_NAME in", values, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameNotIn(List<String> values) {
            addCriterion("RCC_NAME not in", values, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameBetween(String value1, String value2) {
            addCriterion("RCC_NAME between", value1, value2, "rccName");
            return (Criteria) this;
        }

        public Criteria andRccNameNotBetween(String value1, String value2) {
            addCriterion("RCC_NAME not between", value1, value2, "rccName");
            return (Criteria) this;
        }

        public Criteria andBoxCountIsNull() {
            addCriterion("BOX_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andBoxCountIsNotNull() {
            addCriterion("BOX_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBoxCountEqualTo(Integer value) {
            addCriterion("BOX_COUNT =", value, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountNotEqualTo(Integer value) {
            addCriterion("BOX_COUNT <>", value, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountGreaterThan(Integer value) {
            addCriterion("BOX_COUNT >", value, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOX_COUNT >=", value, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountLessThan(Integer value) {
            addCriterion("BOX_COUNT <", value, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountLessThanOrEqualTo(Integer value) {
            addCriterion("BOX_COUNT <=", value, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountIn(List<Integer> values) {
            addCriterion("BOX_COUNT in", values, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountNotIn(List<Integer> values) {
            addCriterion("BOX_COUNT not in", values, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountBetween(Integer value1, Integer value2) {
            addCriterion("BOX_COUNT between", value1, value2, "boxCount");
            return (Criteria) this;
        }

        public Criteria andBoxCountNotBetween(Integer value1, Integer value2) {
            addCriterion("BOX_COUNT not between", value1, value2, "boxCount");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIsNull() {
            addCriterion("DETAIL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIsNotNull() {
            addCriterion("DETAIL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDetailStatusEqualTo(Short value) {
            addCriterion("DETAIL_STATUS =", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotEqualTo(Short value) {
            addCriterion("DETAIL_STATUS <>", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusGreaterThan(Short value) {
            addCriterion("DETAIL_STATUS >", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("DETAIL_STATUS >=", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLessThan(Short value) {
            addCriterion("DETAIL_STATUS <", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLessThanOrEqualTo(Short value) {
            addCriterion("DETAIL_STATUS <=", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIn(List<Short> values) {
            addCriterion("DETAIL_STATUS in", values, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotIn(List<Short> values) {
            addCriterion("DETAIL_STATUS not in", values, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusBetween(Short value1, Short value2) {
            addCriterion("DETAIL_STATUS between", value1, value2, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotBetween(Short value1, Short value2) {
            addCriterion("DETAIL_STATUS not between", value1, value2, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andLink1ManIsNull() {
            addCriterion("LINK_1_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLink1ManIsNotNull() {
            addCriterion("LINK_1_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLink1ManEqualTo(String value) {
            addCriterion("LINK_1_MAN =", value, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManNotEqualTo(String value) {
            addCriterion("LINK_1_MAN <>", value, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManGreaterThan(String value) {
            addCriterion("LINK_1_MAN >", value, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_1_MAN >=", value, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManLessThan(String value) {
            addCriterion("LINK_1_MAN <", value, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManLessThanOrEqualTo(String value) {
            addCriterion("LINK_1_MAN <=", value, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManLike(String value) {
            addCriterion("LINK_1_MAN like", value, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManNotLike(String value) {
            addCriterion("LINK_1_MAN not like", value, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManIn(List<String> values) {
            addCriterion("LINK_1_MAN in", values, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManNotIn(List<String> values) {
            addCriterion("LINK_1_MAN not in", values, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManBetween(String value1, String value2) {
            addCriterion("LINK_1_MAN between", value1, value2, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1ManNotBetween(String value1, String value2) {
            addCriterion("LINK_1_MAN not between", value1, value2, "link1Man");
            return (Criteria) this;
        }

        public Criteria andLink1TelIsNull() {
            addCriterion("LINK_1_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLink1TelIsNotNull() {
            addCriterion("LINK_1_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLink1TelEqualTo(String value) {
            addCriterion("LINK_1_TEL =", value, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelNotEqualTo(String value) {
            addCriterion("LINK_1_TEL <>", value, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelGreaterThan(String value) {
            addCriterion("LINK_1_TEL >", value, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_1_TEL >=", value, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelLessThan(String value) {
            addCriterion("LINK_1_TEL <", value, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelLessThanOrEqualTo(String value) {
            addCriterion("LINK_1_TEL <=", value, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelLike(String value) {
            addCriterion("LINK_1_TEL like", value, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelNotLike(String value) {
            addCriterion("LINK_1_TEL not like", value, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelIn(List<String> values) {
            addCriterion("LINK_1_TEL in", values, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelNotIn(List<String> values) {
            addCriterion("LINK_1_TEL not in", values, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelBetween(String value1, String value2) {
            addCriterion("LINK_1_TEL between", value1, value2, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink1TelNotBetween(String value1, String value2) {
            addCriterion("LINK_1_TEL not between", value1, value2, "link1Tel");
            return (Criteria) this;
        }

        public Criteria andLink2ManIsNull() {
            addCriterion("LINK_2_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLink2ManIsNotNull() {
            addCriterion("LINK_2_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLink2ManEqualTo(String value) {
            addCriterion("LINK_2_MAN =", value, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManNotEqualTo(String value) {
            addCriterion("LINK_2_MAN <>", value, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManGreaterThan(String value) {
            addCriterion("LINK_2_MAN >", value, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_2_MAN >=", value, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManLessThan(String value) {
            addCriterion("LINK_2_MAN <", value, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManLessThanOrEqualTo(String value) {
            addCriterion("LINK_2_MAN <=", value, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManLike(String value) {
            addCriterion("LINK_2_MAN like", value, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManNotLike(String value) {
            addCriterion("LINK_2_MAN not like", value, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManIn(List<String> values) {
            addCriterion("LINK_2_MAN in", values, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManNotIn(List<String> values) {
            addCriterion("LINK_2_MAN not in", values, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManBetween(String value1, String value2) {
            addCriterion("LINK_2_MAN between", value1, value2, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2ManNotBetween(String value1, String value2) {
            addCriterion("LINK_2_MAN not between", value1, value2, "link2Man");
            return (Criteria) this;
        }

        public Criteria andLink2TelIsNull() {
            addCriterion("LINK_2_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLink2TelIsNotNull() {
            addCriterion("LINK_2_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLink2TelEqualTo(String value) {
            addCriterion("LINK_2_TEL =", value, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelNotEqualTo(String value) {
            addCriterion("LINK_2_TEL <>", value, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelGreaterThan(String value) {
            addCriterion("LINK_2_TEL >", value, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_2_TEL >=", value, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelLessThan(String value) {
            addCriterion("LINK_2_TEL <", value, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelLessThanOrEqualTo(String value) {
            addCriterion("LINK_2_TEL <=", value, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelLike(String value) {
            addCriterion("LINK_2_TEL like", value, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelNotLike(String value) {
            addCriterion("LINK_2_TEL not like", value, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelIn(List<String> values) {
            addCriterion("LINK_2_TEL in", values, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelNotIn(List<String> values) {
            addCriterion("LINK_2_TEL not in", values, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelBetween(String value1, String value2) {
            addCriterion("LINK_2_TEL between", value1, value2, "link2Tel");
            return (Criteria) this;
        }

        public Criteria andLink2TelNotBetween(String value1, String value2) {
            addCriterion("LINK_2_TEL not between", value1, value2, "link2Tel");
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

        public Criteria andPlanGetManIdIsNull() {
            addCriterion("PLAN_GET_MAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdIsNotNull() {
            addCriterion("PLAN_GET_MAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdEqualTo(String value) {
            addCriterion("PLAN_GET_MAN_ID =", value, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdNotEqualTo(String value) {
            addCriterion("PLAN_GET_MAN_ID <>", value, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdGreaterThan(String value) {
            addCriterion("PLAN_GET_MAN_ID >", value, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_GET_MAN_ID >=", value, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdLessThan(String value) {
            addCriterion("PLAN_GET_MAN_ID <", value, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdLessThanOrEqualTo(String value) {
            addCriterion("PLAN_GET_MAN_ID <=", value, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdLike(String value) {
            addCriterion("PLAN_GET_MAN_ID like", value, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdNotLike(String value) {
            addCriterion("PLAN_GET_MAN_ID not like", value, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdIn(List<String> values) {
            addCriterion("PLAN_GET_MAN_ID in", values, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdNotIn(List<String> values) {
            addCriterion("PLAN_GET_MAN_ID not in", values, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdBetween(String value1, String value2) {
            addCriterion("PLAN_GET_MAN_ID between", value1, value2, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManIdNotBetween(String value1, String value2) {
            addCriterion("PLAN_GET_MAN_ID not between", value1, value2, "planGetManId");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameIsNull() {
            addCriterion("PLAN_GET_MAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameIsNotNull() {
            addCriterion("PLAN_GET_MAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameEqualTo(String value) {
            addCriterion("PLAN_GET_MAN_NAME =", value, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameNotEqualTo(String value) {
            addCriterion("PLAN_GET_MAN_NAME <>", value, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameGreaterThan(String value) {
            addCriterion("PLAN_GET_MAN_NAME >", value, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_GET_MAN_NAME >=", value, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameLessThan(String value) {
            addCriterion("PLAN_GET_MAN_NAME <", value, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameLessThanOrEqualTo(String value) {
            addCriterion("PLAN_GET_MAN_NAME <=", value, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameLike(String value) {
            addCriterion("PLAN_GET_MAN_NAME like", value, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameNotLike(String value) {
            addCriterion("PLAN_GET_MAN_NAME not like", value, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameIn(List<String> values) {
            addCriterion("PLAN_GET_MAN_NAME in", values, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameNotIn(List<String> values) {
            addCriterion("PLAN_GET_MAN_NAME not in", values, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameBetween(String value1, String value2) {
            addCriterion("PLAN_GET_MAN_NAME between", value1, value2, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetManNameNotBetween(String value1, String value2) {
            addCriterion("PLAN_GET_MAN_NAME not between", value1, value2, "planGetManName");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateIsNull() {
            addCriterion("PLAN_GET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateIsNotNull() {
            addCriterion("PLAN_GET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_GET_DATE =", value, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_GET_DATE <>", value, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PLAN_GET_DATE >", value, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_GET_DATE >=", value, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateLessThan(Date value) {
            addCriterionForJDBCDate("PLAN_GET_DATE <", value, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_GET_DATE <=", value, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_GET_DATE in", values, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_GET_DATE not in", values, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_GET_DATE between", value1, value2, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andPlanGetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_GET_DATE not between", value1, value2, "planGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateIsNull() {
            addCriterion("REAL_GET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRealGetDateIsNotNull() {
            addCriterion("REAL_GET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRealGetDateEqualTo(Date value) {
            addCriterionForJDBCDate("REAL_GET_DATE =", value, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REAL_GET_DATE <>", value, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REAL_GET_DATE >", value, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REAL_GET_DATE >=", value, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateLessThan(Date value) {
            addCriterionForJDBCDate("REAL_GET_DATE <", value, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REAL_GET_DATE <=", value, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateIn(List<Date> values) {
            addCriterionForJDBCDate("REAL_GET_DATE in", values, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REAL_GET_DATE not in", values, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REAL_GET_DATE between", value1, value2, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andRealGetDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REAL_GET_DATE not between", value1, value2, "realGetDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIdIsNull() {
            addCriterion("CREATE_BY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIdIsNotNull() {
            addCriterion("CREATE_BY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByIdEqualTo(String value) {
            addCriterion("CREATE_BY_ID =", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotEqualTo(String value) {
            addCriterion("CREATE_BY_ID <>", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdGreaterThan(String value) {
            addCriterion("CREATE_BY_ID >", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY_ID >=", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdLessThan(String value) {
            addCriterion("CREATE_BY_ID <", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY_ID <=", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdLike(String value) {
            addCriterion("CREATE_BY_ID like", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotLike(String value) {
            addCriterion("CREATE_BY_ID not like", value, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdIn(List<String> values) {
            addCriterion("CREATE_BY_ID in", values, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotIn(List<String> values) {
            addCriterion("CREATE_BY_ID not in", values, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdBetween(String value1, String value2) {
            addCriterion("CREATE_BY_ID between", value1, value2, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY_ID not between", value1, value2, "createById");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNull() {
            addCriterion("CREATE_BY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNotNull() {
            addCriterion("CREATE_BY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameEqualTo(String value) {
            addCriterion("CREATE_BY_NAME =", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotEqualTo(String value) {
            addCriterion("CREATE_BY_NAME <>", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThan(String value) {
            addCriterion("CREATE_BY_NAME >", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY_NAME >=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThan(String value) {
            addCriterion("CREATE_BY_NAME <", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY_NAME <=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLike(String value) {
            addCriterion("CREATE_BY_NAME like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotLike(String value) {
            addCriterion("CREATE_BY_NAME not like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIn(List<String> values) {
            addCriterion("CREATE_BY_NAME in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotIn(List<String> values) {
            addCriterion("CREATE_BY_NAME not in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameBetween(String value1, String value2) {
            addCriterion("CREATE_BY_NAME between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY_NAME not between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdIsNull() {
            addCriterion("UPDATE_BY_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdIsNotNull() {
            addCriterion("UPDATE_BY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdEqualTo(String value) {
            addCriterion("UPDATE_BY_ID =", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotEqualTo(String value) {
            addCriterion("UPDATE_BY_ID <>", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdGreaterThan(String value) {
            addCriterion("UPDATE_BY_ID >", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY_ID >=", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdLessThan(String value) {
            addCriterion("UPDATE_BY_ID <", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY_ID <=", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdLike(String value) {
            addCriterion("UPDATE_BY_ID like", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotLike(String value) {
            addCriterion("UPDATE_BY_ID not like", value, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdIn(List<String> values) {
            addCriterion("UPDATE_BY_ID in", values, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotIn(List<String> values) {
            addCriterion("UPDATE_BY_ID not in", values, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdBetween(String value1, String value2) {
            addCriterion("UPDATE_BY_ID between", value1, value2, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY_ID not between", value1, value2, "updateById");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameIsNull() {
            addCriterion("UPDATE_BY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameIsNotNull() {
            addCriterion("UPDATE_BY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameEqualTo(String value) {
            addCriterion("UPDATE_BY_NAME =", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotEqualTo(String value) {
            addCriterion("UPDATE_BY_NAME <>", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameGreaterThan(String value) {
            addCriterion("UPDATE_BY_NAME >", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY_NAME >=", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameLessThan(String value) {
            addCriterion("UPDATE_BY_NAME <", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY_NAME <=", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameLike(String value) {
            addCriterion("UPDATE_BY_NAME like", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotLike(String value) {
            addCriterion("UPDATE_BY_NAME not like", value, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameIn(List<String> values) {
            addCriterion("UPDATE_BY_NAME in", values, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotIn(List<String> values) {
            addCriterion("UPDATE_BY_NAME not in", values, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameBetween(String value1, String value2) {
            addCriterion("UPDATE_BY_NAME between", value1, value2, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateByNameNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY_NAME not between", value1, value2, "updateByName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("COORDINATE is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("COORDINATE is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("COORDINATE =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("COORDINATE <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("COORDINATE >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("COORDINATE >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("COORDINATE <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("COORDINATE <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("COORDINATE like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("COORDINATE not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("COORDINATE in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("COORDINATE not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("COORDINATE between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("COORDINATE not between", value1, value2, "coordinate");
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