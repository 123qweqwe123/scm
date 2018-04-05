package com.jet.scm.web.spem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PipScmFrozenboxTransportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipScmFrozenboxTransportExample() {
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

        public Criteria andReceiveDateIsNull() {
            addCriterion("RECEIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("RECEIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("RECEIVE_DATE =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RECEIVE_DATE <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RECEIVE_DATE >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECEIVE_DATE >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterionForJDBCDate("RECEIVE_DATE <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECEIVE_DATE <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("RECEIVE_DATE in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RECEIVE_DATE not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECEIVE_DATE between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECEIVE_DATE not between", value1, value2, "receiveDate");
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

        public Criteria andFrozentubeNumIsNull() {
            addCriterion("FROZENTUBE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumIsNotNull() {
            addCriterion("FROZENTUBE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumEqualTo(BigDecimal value) {
            addCriterion("FROZENTUBE_NUM =", value, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumNotEqualTo(BigDecimal value) {
            addCriterion("FROZENTUBE_NUM <>", value, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumGreaterThan(BigDecimal value) {
            addCriterion("FROZENTUBE_NUM >", value, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FROZENTUBE_NUM >=", value, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumLessThan(BigDecimal value) {
            addCriterion("FROZENTUBE_NUM <", value, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FROZENTUBE_NUM <=", value, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumIn(List<BigDecimal> values) {
            addCriterion("FROZENTUBE_NUM in", values, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumNotIn(List<BigDecimal> values) {
            addCriterion("FROZENTUBE_NUM not in", values, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FROZENTUBE_NUM between", value1, value2, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andFrozentubeNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FROZENTUBE_NUM not between", value1, value2, "frozentubeNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumIsNull() {
            addCriterion("SAMPLE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSampleNumIsNotNull() {
            addCriterion("SAMPLE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNumEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_NUM =", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_NUM <>", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumGreaterThan(BigDecimal value) {
            addCriterion("SAMPLE_NUM >", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_NUM >=", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLessThan(BigDecimal value) {
            addCriterion("SAMPLE_NUM <", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAMPLE_NUM <=", value, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumIn(List<BigDecimal> values) {
            addCriterion("SAMPLE_NUM in", values, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotIn(List<BigDecimal> values) {
            addCriterion("SAMPLE_NUM not in", values, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAMPLE_NUM between", value1, value2, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andSampleNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAMPLE_NUM not between", value1, value2, "sampleNum");
            return (Criteria) this;
        }

        public Criteria andPortionIsNull() {
            addCriterion("PORTION is null");
            return (Criteria) this;
        }

        public Criteria andPortionIsNotNull() {
            addCriterion("PORTION is not null");
            return (Criteria) this;
        }

        public Criteria andPortionEqualTo(BigDecimal value) {
            addCriterion("PORTION =", value, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionNotEqualTo(BigDecimal value) {
            addCriterion("PORTION <>", value, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionGreaterThan(BigDecimal value) {
            addCriterion("PORTION >", value, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTION >=", value, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionLessThan(BigDecimal value) {
            addCriterion("PORTION <", value, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTION <=", value, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionIn(List<BigDecimal> values) {
            addCriterion("PORTION in", values, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionNotIn(List<BigDecimal> values) {
            addCriterion("PORTION not in", values, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTION between", value1, value2, "portion");
            return (Criteria) this;
        }

        public Criteria andPortionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTION not between", value1, value2, "portion");
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

        public Criteria andReceiveOperatorIsNull() {
            addCriterion("RECEIVE_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorIsNotNull() {
            addCriterion("RECEIVE_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorEqualTo(String value) {
            addCriterion("RECEIVE_OPERATOR =", value, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorNotEqualTo(String value) {
            addCriterion("RECEIVE_OPERATOR <>", value, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorGreaterThan(String value) {
            addCriterion("RECEIVE_OPERATOR >", value, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_OPERATOR >=", value, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorLessThan(String value) {
            addCriterion("RECEIVE_OPERATOR <", value, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_OPERATOR <=", value, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorLike(String value) {
            addCriterion("RECEIVE_OPERATOR like", value, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorNotLike(String value) {
            addCriterion("RECEIVE_OPERATOR not like", value, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorIn(List<String> values) {
            addCriterion("RECEIVE_OPERATOR in", values, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorNotIn(List<String> values) {
            addCriterion("RECEIVE_OPERATOR not in", values, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorBetween(String value1, String value2) {
            addCriterion("RECEIVE_OPERATOR between", value1, value2, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andReceiveOperatorNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_OPERATOR not between", value1, value2, "receiveOperator");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdIsNull() {
            addCriterion("FROZENBOX_ID is null");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdIsNotNull() {
            addCriterion("FROZENBOX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdEqualTo(String value) {
            addCriterion("FROZENBOX_ID =", value, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdNotEqualTo(String value) {
            addCriterion("FROZENBOX_ID <>", value, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdGreaterThan(String value) {
            addCriterion("FROZENBOX_ID >", value, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdGreaterThanOrEqualTo(String value) {
            addCriterion("FROZENBOX_ID >=", value, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdLessThan(String value) {
            addCriterion("FROZENBOX_ID <", value, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdLessThanOrEqualTo(String value) {
            addCriterion("FROZENBOX_ID <=", value, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdLike(String value) {
            addCriterion("FROZENBOX_ID like", value, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdNotLike(String value) {
            addCriterion("FROZENBOX_ID not like", value, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdIn(List<String> values) {
            addCriterion("FROZENBOX_ID in", values, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdNotIn(List<String> values) {
            addCriterion("FROZENBOX_ID not in", values, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdBetween(String value1, String value2) {
            addCriterion("FROZENBOX_ID between", value1, value2, "frozenboxId");
            return (Criteria) this;
        }

        public Criteria andFrozenboxIdNotBetween(String value1, String value2) {
            addCriterion("FROZENBOX_ID not between", value1, value2, "frozenboxId");
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