package com.jet.scm.web.dict.domain;

import java.util.ArrayList;
import java.util.List;

public class PipCommDictVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipCommDictVersionExample() {
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

        public Criteria andDictTypeIsNull() {
            addCriterion("DICT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIsNotNull() {
            addCriterion("DICT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeEqualTo(String value) {
            addCriterion("DICT_TYPE =", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotEqualTo(String value) {
            addCriterion("DICT_TYPE <>", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThan(String value) {
            addCriterion("DICT_TYPE >", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE >=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThan(String value) {
            addCriterion("DICT_TYPE <", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLessThanOrEqualTo(String value) {
            addCriterion("DICT_TYPE <=", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeLike(String value) {
            addCriterion("DICT_TYPE like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotLike(String value) {
            addCriterion("DICT_TYPE not like", value, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeIn(List<String> values) {
            addCriterion("DICT_TYPE in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotIn(List<String> values) {
            addCriterion("DICT_TYPE not in", values, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeBetween(String value1, String value2) {
            addCriterion("DICT_TYPE between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictTypeNotBetween(String value1, String value2) {
            addCriterion("DICT_TYPE not between", value1, value2, "dictType");
            return (Criteria) this;
        }

        public Criteria andDictVersionIsNull() {
            addCriterion("DICT_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andDictVersionIsNotNull() {
            addCriterion("DICT_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andDictVersionEqualTo(String value) {
            addCriterion("DICT_VERSION =", value, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionNotEqualTo(String value) {
            addCriterion("DICT_VERSION <>", value, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionGreaterThan(String value) {
            addCriterion("DICT_VERSION >", value, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_VERSION >=", value, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionLessThan(String value) {
            addCriterion("DICT_VERSION <", value, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionLessThanOrEqualTo(String value) {
            addCriterion("DICT_VERSION <=", value, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionLike(String value) {
            addCriterion("DICT_VERSION like", value, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionNotLike(String value) {
            addCriterion("DICT_VERSION not like", value, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionIn(List<String> values) {
            addCriterion("DICT_VERSION in", values, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionNotIn(List<String> values) {
            addCriterion("DICT_VERSION not in", values, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionBetween(String value1, String value2) {
            addCriterion("DICT_VERSION between", value1, value2, "dictVersion");
            return (Criteria) this;
        }

        public Criteria andDictVersionNotBetween(String value1, String value2) {
            addCriterion("DICT_VERSION not between", value1, value2, "dictVersion");
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

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("FILE_ID like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("FILE_ID not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
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