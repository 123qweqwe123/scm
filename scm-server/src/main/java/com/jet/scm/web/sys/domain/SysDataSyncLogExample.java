package com.jet.scm.web.sys.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDataSyncLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDataSyncLogExample() {
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

        public Criteria andInsertCountIsNull() {
            addCriterion("INSERT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andInsertCountIsNotNull() {
            addCriterion("INSERT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInsertCountEqualTo(Integer value) {
            addCriterion("INSERT_COUNT =", value, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountNotEqualTo(Integer value) {
            addCriterion("INSERT_COUNT <>", value, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountGreaterThan(Integer value) {
            addCriterion("INSERT_COUNT >", value, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("INSERT_COUNT >=", value, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountLessThan(Integer value) {
            addCriterion("INSERT_COUNT <", value, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountLessThanOrEqualTo(Integer value) {
            addCriterion("INSERT_COUNT <=", value, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountIn(List<Integer> values) {
            addCriterion("INSERT_COUNT in", values, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountNotIn(List<Integer> values) {
            addCriterion("INSERT_COUNT not in", values, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountBetween(Integer value1, Integer value2) {
            addCriterion("INSERT_COUNT between", value1, value2, "insertCount");
            return (Criteria) this;
        }

        public Criteria andInsertCountNotBetween(Integer value1, Integer value2) {
            addCriterion("INSERT_COUNT not between", value1, value2, "insertCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNull() {
            addCriterion("UPDATE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIsNotNull() {
            addCriterion("UPDATE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCountEqualTo(Integer value) {
            addCriterion("UPDATE_COUNT =", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotEqualTo(Integer value) {
            addCriterion("UPDATE_COUNT <>", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThan(Integer value) {
            addCriterion("UPDATE_COUNT >", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_COUNT >=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThan(Integer value) {
            addCriterion("UPDATE_COUNT <", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_COUNT <=", value, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountIn(List<Integer> values) {
            addCriterion("UPDATE_COUNT in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotIn(List<Integer> values) {
            addCriterion("UPDATE_COUNT not in", values, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_COUNT between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andUpdateCountNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_COUNT not between", value1, value2, "updateCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountIsNull() {
            addCriterion("DELETE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andDeleteCountIsNotNull() {
            addCriterion("DELETE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteCountEqualTo(Integer value) {
            addCriterion("DELETE_COUNT =", value, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountNotEqualTo(Integer value) {
            addCriterion("DELETE_COUNT <>", value, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountGreaterThan(Integer value) {
            addCriterion("DELETE_COUNT >", value, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETE_COUNT >=", value, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountLessThan(Integer value) {
            addCriterion("DELETE_COUNT <", value, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountLessThanOrEqualTo(Integer value) {
            addCriterion("DELETE_COUNT <=", value, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountIn(List<Integer> values) {
            addCriterion("DELETE_COUNT in", values, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountNotIn(List<Integer> values) {
            addCriterion("DELETE_COUNT not in", values, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_COUNT between", value1, value2, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andDeleteCountNotBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_COUNT not between", value1, value2, "deleteCount");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andSyncIdIsNull() {
            addCriterion("SYNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSyncIdIsNotNull() {
            addCriterion("SYNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSyncIdEqualTo(String value) {
            addCriterion("SYNC_ID =", value, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdNotEqualTo(String value) {
            addCriterion("SYNC_ID <>", value, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdGreaterThan(String value) {
            addCriterion("SYNC_ID >", value, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_ID >=", value, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdLessThan(String value) {
            addCriterion("SYNC_ID <", value, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdLessThanOrEqualTo(String value) {
            addCriterion("SYNC_ID <=", value, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdLike(String value) {
            addCriterion("SYNC_ID like", value, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdNotLike(String value) {
            addCriterion("SYNC_ID not like", value, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdIn(List<String> values) {
            addCriterion("SYNC_ID in", values, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdNotIn(List<String> values) {
            addCriterion("SYNC_ID not in", values, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdBetween(String value1, String value2) {
            addCriterion("SYNC_ID between", value1, value2, "syncId");
            return (Criteria) this;
        }

        public Criteria andSyncIdNotBetween(String value1, String value2) {
            addCriterion("SYNC_ID not between", value1, value2, "syncId");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIsNull() {
            addCriterion("IS_SUCCESS is null");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIsNotNull() {
            addCriterion("IS_SUCCESS is not null");
            return (Criteria) this;
        }

        public Criteria andIsSuccessEqualTo(Short value) {
            addCriterion("IS_SUCCESS =", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotEqualTo(Short value) {
            addCriterion("IS_SUCCESS <>", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessGreaterThan(Short value) {
            addCriterion("IS_SUCCESS >", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_SUCCESS >=", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessLessThan(Short value) {
            addCriterion("IS_SUCCESS <", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessLessThanOrEqualTo(Short value) {
            addCriterion("IS_SUCCESS <=", value, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessIn(List<Short> values) {
            addCriterion("IS_SUCCESS in", values, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotIn(List<Short> values) {
            addCriterion("IS_SUCCESS not in", values, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessBetween(Short value1, Short value2) {
            addCriterion("IS_SUCCESS between", value1, value2, "isSuccess");
            return (Criteria) this;
        }

        public Criteria andIsSuccessNotBetween(Short value1, Short value2) {
            addCriterion("IS_SUCCESS not between", value1, value2, "isSuccess");
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