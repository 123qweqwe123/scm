package com.jet.datasync.bdcor3.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PipCommRcc3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PipCommRcc3Example() {
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

        public Criteria andLatitudeLongitudeIsNull() {
            addCriterion("LATITUDE_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeIsNotNull() {
            addCriterion("LATITUDE_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeEqualTo(String value) {
            addCriterion("LATITUDE_LONGITUDE =", value, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeNotEqualTo(String value) {
            addCriterion("LATITUDE_LONGITUDE <>", value, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeGreaterThan(String value) {
            addCriterion("LATITUDE_LONGITUDE >", value, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("LATITUDE_LONGITUDE >=", value, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeLessThan(String value) {
            addCriterion("LATITUDE_LONGITUDE <", value, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeLessThanOrEqualTo(String value) {
            addCriterion("LATITUDE_LONGITUDE <=", value, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeLike(String value) {
            addCriterion("LATITUDE_LONGITUDE like", value, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeNotLike(String value) {
            addCriterion("LATITUDE_LONGITUDE not like", value, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeIn(List<String> values) {
            addCriterion("LATITUDE_LONGITUDE in", values, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeNotIn(List<String> values) {
            addCriterion("LATITUDE_LONGITUDE not in", values, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeBetween(String value1, String value2) {
            addCriterion("LATITUDE_LONGITUDE between", value1, value2, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLongitudeNotBetween(String value1, String value2) {
            addCriterion("LATITUDE_LONGITUDE not between", value1, value2, "latitudeLongitude");
            return (Criteria) this;
        }

        public Criteria andIsJoinIsNull() {
            addCriterion("IS_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andIsJoinIsNotNull() {
            addCriterion("IS_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsJoinEqualTo(Short value) {
            addCriterion("IS_JOIN =", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinNotEqualTo(Short value) {
            addCriterion("IS_JOIN <>", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinGreaterThan(Short value) {
            addCriterion("IS_JOIN >", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_JOIN >=", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinLessThan(Short value) {
            addCriterion("IS_JOIN <", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinLessThanOrEqualTo(Short value) {
            addCriterion("IS_JOIN <=", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinIn(List<Short> values) {
            addCriterion("IS_JOIN in", values, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinNotIn(List<Short> values) {
            addCriterion("IS_JOIN not in", values, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinBetween(Short value1, Short value2) {
            addCriterion("IS_JOIN between", value1, value2, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinNotBetween(Short value1, Short value2) {
            addCriterion("IS_JOIN not between", value1, value2, "isJoin");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNull() {
            addCriterion("JOIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNotNull() {
            addCriterion("JOIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_TIME =", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_TIME <>", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("JOIN_TIME >", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_TIME >=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThan(Date value) {
            addCriterionForJDBCDate("JOIN_TIME <", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_TIME <=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIn(List<Date> values) {
            addCriterionForJDBCDate("JOIN_TIME in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("JOIN_TIME not in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JOIN_TIME between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JOIN_TIME not between", value1, value2, "joinTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andInitialTaskIsNull() {
            addCriterion("INITIAL_TASK is null");
            return (Criteria) this;
        }

        public Criteria andInitialTaskIsNotNull() {
            addCriterion("INITIAL_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andInitialTaskEqualTo(String value) {
            addCriterion("INITIAL_TASK =", value, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskNotEqualTo(String value) {
            addCriterion("INITIAL_TASK <>", value, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskGreaterThan(String value) {
            addCriterion("INITIAL_TASK >", value, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskGreaterThanOrEqualTo(String value) {
            addCriterion("INITIAL_TASK >=", value, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskLessThan(String value) {
            addCriterion("INITIAL_TASK <", value, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskLessThanOrEqualTo(String value) {
            addCriterion("INITIAL_TASK <=", value, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskLike(String value) {
            addCriterion("INITIAL_TASK like", value, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskNotLike(String value) {
            addCriterion("INITIAL_TASK not like", value, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskIn(List<String> values) {
            addCriterion("INITIAL_TASK in", values, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskNotIn(List<String> values) {
            addCriterion("INITIAL_TASK not in", values, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskBetween(String value1, String value2) {
            addCriterion("INITIAL_TASK between", value1, value2, "initialTask");
            return (Criteria) this;
        }

        public Criteria andInitialTaskNotBetween(String value1, String value2) {
            addCriterion("INITIAL_TASK not between", value1, value2, "initialTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskIsNull() {
            addCriterion("RISK_TASK is null");
            return (Criteria) this;
        }

        public Criteria andRiskTaskIsNotNull() {
            addCriterion("RISK_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andRiskTaskEqualTo(String value) {
            addCriterion("RISK_TASK =", value, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskNotEqualTo(String value) {
            addCriterion("RISK_TASK <>", value, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskGreaterThan(String value) {
            addCriterion("RISK_TASK >", value, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_TASK >=", value, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskLessThan(String value) {
            addCriterion("RISK_TASK <", value, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskLessThanOrEqualTo(String value) {
            addCriterion("RISK_TASK <=", value, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskLike(String value) {
            addCriterion("RISK_TASK like", value, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskNotLike(String value) {
            addCriterion("RISK_TASK not like", value, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskIn(List<String> values) {
            addCriterion("RISK_TASK in", values, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskNotIn(List<String> values) {
            addCriterion("RISK_TASK not in", values, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskBetween(String value1, String value2) {
            addCriterion("RISK_TASK between", value1, value2, "riskTask");
            return (Criteria) this;
        }

        public Criteria andRiskTaskNotBetween(String value1, String value2) {
            addCriterion("RISK_TASK not between", value1, value2, "riskTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskIsNull() {
            addCriterion("SHORT_FOLLOWUP_TASK is null");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskIsNotNull() {
            addCriterion("SHORT_FOLLOWUP_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskEqualTo(String value) {
            addCriterion("SHORT_FOLLOWUP_TASK =", value, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskNotEqualTo(String value) {
            addCriterion("SHORT_FOLLOWUP_TASK <>", value, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskGreaterThan(String value) {
            addCriterion("SHORT_FOLLOWUP_TASK >", value, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_FOLLOWUP_TASK >=", value, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskLessThan(String value) {
            addCriterion("SHORT_FOLLOWUP_TASK <", value, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskLessThanOrEqualTo(String value) {
            addCriterion("SHORT_FOLLOWUP_TASK <=", value, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskLike(String value) {
            addCriterion("SHORT_FOLLOWUP_TASK like", value, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskNotLike(String value) {
            addCriterion("SHORT_FOLLOWUP_TASK not like", value, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskIn(List<String> values) {
            addCriterion("SHORT_FOLLOWUP_TASK in", values, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskNotIn(List<String> values) {
            addCriterion("SHORT_FOLLOWUP_TASK not in", values, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskBetween(String value1, String value2) {
            addCriterion("SHORT_FOLLOWUP_TASK between", value1, value2, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andShortFollowupTaskNotBetween(String value1, String value2) {
            addCriterion("SHORT_FOLLOWUP_TASK not between", value1, value2, "shortFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskIsNull() {
            addCriterion("LONG_FOLLOWUP_TASK is null");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskIsNotNull() {
            addCriterion("LONG_FOLLOWUP_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskEqualTo(String value) {
            addCriterion("LONG_FOLLOWUP_TASK =", value, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskNotEqualTo(String value) {
            addCriterion("LONG_FOLLOWUP_TASK <>", value, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskGreaterThan(String value) {
            addCriterion("LONG_FOLLOWUP_TASK >", value, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskGreaterThanOrEqualTo(String value) {
            addCriterion("LONG_FOLLOWUP_TASK >=", value, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskLessThan(String value) {
            addCriterion("LONG_FOLLOWUP_TASK <", value, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskLessThanOrEqualTo(String value) {
            addCriterion("LONG_FOLLOWUP_TASK <=", value, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskLike(String value) {
            addCriterion("LONG_FOLLOWUP_TASK like", value, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskNotLike(String value) {
            addCriterion("LONG_FOLLOWUP_TASK not like", value, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskIn(List<String> values) {
            addCriterion("LONG_FOLLOWUP_TASK in", values, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskNotIn(List<String> values) {
            addCriterion("LONG_FOLLOWUP_TASK not in", values, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskBetween(String value1, String value2) {
            addCriterion("LONG_FOLLOWUP_TASK between", value1, value2, "longFollowupTask");
            return (Criteria) this;
        }

        public Criteria andLongFollowupTaskNotBetween(String value1, String value2) {
            addCriterion("LONG_FOLLOWUP_TASK not between", value1, value2, "longFollowupTask");
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