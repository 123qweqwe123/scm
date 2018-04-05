package com.jet.datasync.bdcor3.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PipCommLccUser3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipCommLccUser3Example() {
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

        public Criteria andUserCodeIsNull() {
            addCriterion("USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("USER_CODE =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("USER_CODE <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("USER_CODE >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("USER_CODE <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("USER_CODE like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("USER_CODE not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("USER_CODE in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("USER_CODE not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("USER_CODE between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CODE not between", value1, value2, "userCode");
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

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLccRoleIsNull() {
            addCriterion("LCC_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andLccRoleIsNotNull() {
            addCriterion("LCC_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andLccRoleEqualTo(String value) {
            addCriterion("LCC_ROLE =", value, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleNotEqualTo(String value) {
            addCriterion("LCC_ROLE <>", value, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleGreaterThan(String value) {
            addCriterion("LCC_ROLE >", value, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleGreaterThanOrEqualTo(String value) {
            addCriterion("LCC_ROLE >=", value, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleLessThan(String value) {
            addCriterion("LCC_ROLE <", value, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleLessThanOrEqualTo(String value) {
            addCriterion("LCC_ROLE <=", value, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleLike(String value) {
            addCriterion("LCC_ROLE like", value, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleNotLike(String value) {
            addCriterion("LCC_ROLE not like", value, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleIn(List<String> values) {
            addCriterion("LCC_ROLE in", values, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleNotIn(List<String> values) {
            addCriterion("LCC_ROLE not in", values, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleBetween(String value1, String value2) {
            addCriterion("LCC_ROLE between", value1, value2, "lccRole");
            return (Criteria) this;
        }

        public Criteria andLccRoleNotBetween(String value1, String value2) {
            addCriterion("LCC_ROLE not between", value1, value2, "lccRole");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaIsNull() {
            addCriterion("IS_SIGN_SIGNA is null");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaIsNotNull() {
            addCriterion("IS_SIGN_SIGNA is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaEqualTo(String value) {
            addCriterion("IS_SIGN_SIGNA =", value, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaNotEqualTo(String value) {
            addCriterion("IS_SIGN_SIGNA <>", value, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaGreaterThan(String value) {
            addCriterion("IS_SIGN_SIGNA >", value, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SIGN_SIGNA >=", value, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaLessThan(String value) {
            addCriterion("IS_SIGN_SIGNA <", value, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaLessThanOrEqualTo(String value) {
            addCriterion("IS_SIGN_SIGNA <=", value, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaLike(String value) {
            addCriterion("IS_SIGN_SIGNA like", value, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaNotLike(String value) {
            addCriterion("IS_SIGN_SIGNA not like", value, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaIn(List<String> values) {
            addCriterion("IS_SIGN_SIGNA in", values, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaNotIn(List<String> values) {
            addCriterion("IS_SIGN_SIGNA not in", values, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaBetween(String value1, String value2) {
            addCriterion("IS_SIGN_SIGNA between", value1, value2, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsSignSignaNotBetween(String value1, String value2) {
            addCriterion("IS_SIGN_SIGNA not between", value1, value2, "isSignSigna");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeIsNull() {
            addCriterion("IS_GET_RESUME is null");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeIsNotNull() {
            addCriterion("IS_GET_RESUME is not null");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeEqualTo(String value) {
            addCriterion("IS_GET_RESUME =", value, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeNotEqualTo(String value) {
            addCriterion("IS_GET_RESUME <>", value, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeGreaterThan(String value) {
            addCriterion("IS_GET_RESUME >", value, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GET_RESUME >=", value, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeLessThan(String value) {
            addCriterion("IS_GET_RESUME <", value, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeLessThanOrEqualTo(String value) {
            addCriterion("IS_GET_RESUME <=", value, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeLike(String value) {
            addCriterion("IS_GET_RESUME like", value, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeNotLike(String value) {
            addCriterion("IS_GET_RESUME not like", value, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeIn(List<String> values) {
            addCriterion("IS_GET_RESUME in", values, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeNotIn(List<String> values) {
            addCriterion("IS_GET_RESUME not in", values, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeBetween(String value1, String value2) {
            addCriterion("IS_GET_RESUME between", value1, value2, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsGetResumeNotBetween(String value1, String value2) {
            addCriterion("IS_GET_RESUME not between", value1, value2, "isGetResume");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingIsNull() {
            addCriterion("IS_JOIN_TRAINING is null");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingIsNotNull() {
            addCriterion("IS_JOIN_TRAINING is not null");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingEqualTo(String value) {
            addCriterion("IS_JOIN_TRAINING =", value, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingNotEqualTo(String value) {
            addCriterion("IS_JOIN_TRAINING <>", value, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingGreaterThan(String value) {
            addCriterion("IS_JOIN_TRAINING >", value, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingGreaterThanOrEqualTo(String value) {
            addCriterion("IS_JOIN_TRAINING >=", value, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingLessThan(String value) {
            addCriterion("IS_JOIN_TRAINING <", value, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingLessThanOrEqualTo(String value) {
            addCriterion("IS_JOIN_TRAINING <=", value, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingLike(String value) {
            addCriterion("IS_JOIN_TRAINING like", value, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingNotLike(String value) {
            addCriterion("IS_JOIN_TRAINING not like", value, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingIn(List<String> values) {
            addCriterion("IS_JOIN_TRAINING in", values, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingNotIn(List<String> values) {
            addCriterion("IS_JOIN_TRAINING not in", values, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingBetween(String value1, String value2) {
            addCriterion("IS_JOIN_TRAINING between", value1, value2, "isJoinTraining");
            return (Criteria) this;
        }

        public Criteria andIsJoinTrainingNotBetween(String value1, String value2) {
            addCriterion("IS_JOIN_TRAINING not between", value1, value2, "isJoinTraining");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanIsNull() {
            addCriterion("ADDTOLINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanIsNotNull() {
            addCriterion("ADDTOLINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanEqualTo(String value) {
            addCriterion("ADDTOLINKMAN =", value, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanNotEqualTo(String value) {
            addCriterion("ADDTOLINKMAN <>", value, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanGreaterThan(String value) {
            addCriterion("ADDTOLINKMAN >", value, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("ADDTOLINKMAN >=", value, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanLessThan(String value) {
            addCriterion("ADDTOLINKMAN <", value, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanLessThanOrEqualTo(String value) {
            addCriterion("ADDTOLINKMAN <=", value, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanLike(String value) {
            addCriterion("ADDTOLINKMAN like", value, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanNotLike(String value) {
            addCriterion("ADDTOLINKMAN not like", value, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanIn(List<String> values) {
            addCriterion("ADDTOLINKMAN in", values, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanNotIn(List<String> values) {
            addCriterion("ADDTOLINKMAN not in", values, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanBetween(String value1, String value2) {
            addCriterion("ADDTOLINKMAN between", value1, value2, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andAddtolinkmanNotBetween(String value1, String value2) {
            addCriterion("ADDTOLINKMAN not between", value1, value2, "addtolinkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeIsNull() {
            addCriterion("LINKMAN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeIsNotNull() {
            addCriterion("LINKMAN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeEqualTo(String value) {
            addCriterion("LINKMAN_CODE =", value, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeNotEqualTo(String value) {
            addCriterion("LINKMAN_CODE <>", value, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeGreaterThan(String value) {
            addCriterion("LINKMAN_CODE >", value, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_CODE >=", value, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeLessThan(String value) {
            addCriterion("LINKMAN_CODE <", value, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_CODE <=", value, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeLike(String value) {
            addCriterion("LINKMAN_CODE like", value, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeNotLike(String value) {
            addCriterion("LINKMAN_CODE not like", value, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeIn(List<String> values) {
            addCriterion("LINKMAN_CODE in", values, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeNotIn(List<String> values) {
            addCriterion("LINKMAN_CODE not in", values, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeBetween(String value1, String value2) {
            addCriterion("LINKMAN_CODE between", value1, value2, "linkmanCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanCodeNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_CODE not between", value1, value2, "linkmanCode");
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

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("DUTY is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("DUTY =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("DUTY <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("DUTY >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("DUTY <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("DUTY <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("DUTY like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("DUTY not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("DUTY in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("DUTY not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("DUTY between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("DUTY not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
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