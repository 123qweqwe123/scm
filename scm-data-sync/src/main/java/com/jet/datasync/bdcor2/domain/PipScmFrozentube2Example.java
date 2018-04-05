package com.jet.datasync.bdcor2.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PipScmFrozentube2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipScmFrozentube2Example() {
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

        public Criteria andTubeCodeIsNull() {
            addCriterion("TUBE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTubeCodeIsNotNull() {
            addCriterion("TUBE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTubeCodeEqualTo(String value) {
            addCriterion("TUBE_CODE =", value, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeNotEqualTo(String value) {
            addCriterion("TUBE_CODE <>", value, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeGreaterThan(String value) {
            addCriterion("TUBE_CODE >", value, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TUBE_CODE >=", value, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeLessThan(String value) {
            addCriterion("TUBE_CODE <", value, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeLessThanOrEqualTo(String value) {
            addCriterion("TUBE_CODE <=", value, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeLike(String value) {
            addCriterion("TUBE_CODE like", value, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeNotLike(String value) {
            addCriterion("TUBE_CODE not like", value, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeIn(List<String> values) {
            addCriterion("TUBE_CODE in", values, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeNotIn(List<String> values) {
            addCriterion("TUBE_CODE not in", values, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeBetween(String value1, String value2) {
            addCriterion("TUBE_CODE between", value1, value2, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeCodeNotBetween(String value1, String value2) {
            addCriterion("TUBE_CODE not between", value1, value2, "tubeCode");
            return (Criteria) this;
        }

        public Criteria andTubeTypeIsNull() {
            addCriterion("TUBE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTubeTypeIsNotNull() {
            addCriterion("TUBE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTubeTypeEqualTo(String value) {
            addCriterion("TUBE_TYPE =", value, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeNotEqualTo(String value) {
            addCriterion("TUBE_TYPE <>", value, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeGreaterThan(String value) {
            addCriterion("TUBE_TYPE >", value, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TUBE_TYPE >=", value, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeLessThan(String value) {
            addCriterion("TUBE_TYPE <", value, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeLessThanOrEqualTo(String value) {
            addCriterion("TUBE_TYPE <=", value, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeLike(String value) {
            addCriterion("TUBE_TYPE like", value, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeNotLike(String value) {
            addCriterion("TUBE_TYPE not like", value, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeIn(List<String> values) {
            addCriterion("TUBE_TYPE in", values, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeNotIn(List<String> values) {
            addCriterion("TUBE_TYPE not in", values, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeBetween(String value1, String value2) {
            addCriterion("TUBE_TYPE between", value1, value2, "tubeType");
            return (Criteria) this;
        }

        public Criteria andTubeTypeNotBetween(String value1, String value2) {
            addCriterion("TUBE_TYPE not between", value1, value2, "tubeType");
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

        public Criteria andBoxColnoIsNull() {
            addCriterion("BOX_COLNO is null");
            return (Criteria) this;
        }

        public Criteria andBoxColnoIsNotNull() {
            addCriterion("BOX_COLNO is not null");
            return (Criteria) this;
        }

        public Criteria andBoxColnoEqualTo(Short value) {
            addCriterion("BOX_COLNO =", value, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoNotEqualTo(Short value) {
            addCriterion("BOX_COLNO <>", value, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoGreaterThan(Short value) {
            addCriterion("BOX_COLNO >", value, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoGreaterThanOrEqualTo(Short value) {
            addCriterion("BOX_COLNO >=", value, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoLessThan(Short value) {
            addCriterion("BOX_COLNO <", value, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoLessThanOrEqualTo(Short value) {
            addCriterion("BOX_COLNO <=", value, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoIn(List<Short> values) {
            addCriterion("BOX_COLNO in", values, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoNotIn(List<Short> values) {
            addCriterion("BOX_COLNO not in", values, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoBetween(Short value1, Short value2) {
            addCriterion("BOX_COLNO between", value1, value2, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxColnoNotBetween(Short value1, Short value2) {
            addCriterion("BOX_COLNO not between", value1, value2, "boxColno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoIsNull() {
            addCriterion("BOX_ROWNO is null");
            return (Criteria) this;
        }

        public Criteria andBoxRownoIsNotNull() {
            addCriterion("BOX_ROWNO is not null");
            return (Criteria) this;
        }

        public Criteria andBoxRownoEqualTo(Short value) {
            addCriterion("BOX_ROWNO =", value, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoNotEqualTo(Short value) {
            addCriterion("BOX_ROWNO <>", value, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoGreaterThan(Short value) {
            addCriterion("BOX_ROWNO >", value, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoGreaterThanOrEqualTo(Short value) {
            addCriterion("BOX_ROWNO >=", value, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoLessThan(Short value) {
            addCriterion("BOX_ROWNO <", value, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoLessThanOrEqualTo(Short value) {
            addCriterion("BOX_ROWNO <=", value, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoIn(List<Short> values) {
            addCriterion("BOX_ROWNO in", values, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoNotIn(List<Short> values) {
            addCriterion("BOX_ROWNO not in", values, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoBetween(Short value1, Short value2) {
            addCriterion("BOX_ROWNO between", value1, value2, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBoxRownoNotBetween(Short value1, Short value2) {
            addCriterion("BOX_ROWNO not between", value1, value2, "boxRowno");
            return (Criteria) this;
        }

        public Criteria andBloodCodeIsNull() {
            addCriterion("BLOOD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBloodCodeIsNotNull() {
            addCriterion("BLOOD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBloodCodeEqualTo(String value) {
            addCriterion("BLOOD_CODE =", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeNotEqualTo(String value) {
            addCriterion("BLOOD_CODE <>", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeGreaterThan(String value) {
            addCriterion("BLOOD_CODE >", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BLOOD_CODE >=", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeLessThan(String value) {
            addCriterion("BLOOD_CODE <", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeLessThanOrEqualTo(String value) {
            addCriterion("BLOOD_CODE <=", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeLike(String value) {
            addCriterion("BLOOD_CODE like", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeNotLike(String value) {
            addCriterion("BLOOD_CODE not like", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeIn(List<String> values) {
            addCriterion("BLOOD_CODE in", values, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeNotIn(List<String> values) {
            addCriterion("BLOOD_CODE not in", values, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeBetween(String value1, String value2) {
            addCriterion("BLOOD_CODE between", value1, value2, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeNotBetween(String value1, String value2) {
            addCriterion("BLOOD_CODE not between", value1, value2, "bloodCode");
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

        public Criteria andIsHemolysisIsNull() {
            addCriterion("IS_HEMOLYSIS is null");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisIsNotNull() {
            addCriterion("IS_HEMOLYSIS is not null");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisEqualTo(Short value) {
            addCriterion("IS_HEMOLYSIS =", value, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisNotEqualTo(Short value) {
            addCriterion("IS_HEMOLYSIS <>", value, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisGreaterThan(Short value) {
            addCriterion("IS_HEMOLYSIS >", value, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_HEMOLYSIS >=", value, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisLessThan(Short value) {
            addCriterion("IS_HEMOLYSIS <", value, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisLessThanOrEqualTo(Short value) {
            addCriterion("IS_HEMOLYSIS <=", value, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisIn(List<Short> values) {
            addCriterion("IS_HEMOLYSIS in", values, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisNotIn(List<Short> values) {
            addCriterion("IS_HEMOLYSIS not in", values, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisBetween(Short value1, Short value2) {
            addCriterion("IS_HEMOLYSIS between", value1, value2, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsHemolysisNotBetween(Short value1, Short value2) {
            addCriterion("IS_HEMOLYSIS not between", value1, value2, "isHemolysis");
            return (Criteria) this;
        }

        public Criteria andIsLipidIsNull() {
            addCriterion("IS_LIPID is null");
            return (Criteria) this;
        }

        public Criteria andIsLipidIsNotNull() {
            addCriterion("IS_LIPID is not null");
            return (Criteria) this;
        }

        public Criteria andIsLipidEqualTo(Short value) {
            addCriterion("IS_LIPID =", value, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidNotEqualTo(Short value) {
            addCriterion("IS_LIPID <>", value, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidGreaterThan(Short value) {
            addCriterion("IS_LIPID >", value, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_LIPID >=", value, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidLessThan(Short value) {
            addCriterion("IS_LIPID <", value, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidLessThanOrEqualTo(Short value) {
            addCriterion("IS_LIPID <=", value, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidIn(List<Short> values) {
            addCriterion("IS_LIPID in", values, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidNotIn(List<Short> values) {
            addCriterion("IS_LIPID not in", values, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidBetween(Short value1, Short value2) {
            addCriterion("IS_LIPID between", value1, value2, "isLipid");
            return (Criteria) this;
        }

        public Criteria andIsLipidNotBetween(Short value1, Short value2) {
            addCriterion("IS_LIPID not between", value1, value2, "isLipid");
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

        public Criteria andIsEmptyIsNull() {
            addCriterion("IS_EMPTY is null");
            return (Criteria) this;
        }

        public Criteria andIsEmptyIsNotNull() {
            addCriterion("IS_EMPTY is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmptyEqualTo(Short value) {
            addCriterion("IS_EMPTY =", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotEqualTo(Short value) {
            addCriterion("IS_EMPTY <>", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyGreaterThan(Short value) {
            addCriterion("IS_EMPTY >", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_EMPTY >=", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyLessThan(Short value) {
            addCriterion("IS_EMPTY <", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyLessThanOrEqualTo(Short value) {
            addCriterion("IS_EMPTY <=", value, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyIn(List<Short> values) {
            addCriterion("IS_EMPTY in", values, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotIn(List<Short> values) {
            addCriterion("IS_EMPTY not in", values, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyBetween(Short value1, Short value2) {
            addCriterion("IS_EMPTY between", value1, value2, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andIsEmptyNotBetween(Short value1, Short value2) {
            addCriterion("IS_EMPTY not between", value1, value2, "isEmpty");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNull() {
            addCriterion("TERMINAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("TERMINAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(String value) {
            addCriterion("TERMINAL_ID =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(String value) {
            addCriterion("TERMINAL_ID <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(String value) {
            addCriterion("TERMINAL_ID >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(String value) {
            addCriterion("TERMINAL_ID <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL_ID <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLike(String value) {
            addCriterion("TERMINAL_ID like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotLike(String value) {
            addCriterion("TERMINAL_ID not like", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<String> values) {
            addCriterion("TERMINAL_ID in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<String> values) {
            addCriterion("TERMINAL_ID not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(String value1, String value2) {
            addCriterion("TERMINAL_ID not between", value1, value2, "terminalId");
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