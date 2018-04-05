package com.jet.scm.mobile.web.spem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PipScmTransProcDetailBoxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipScmTransProcDetailBoxExample() {
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