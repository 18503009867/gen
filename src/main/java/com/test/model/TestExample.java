package com.test.model;

import java.util.ArrayList;
import java.util.List;

public class TestExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public TestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
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

        public Criteria andIdtestIsNull() {
            addCriterion("idtest is null");
            return (Criteria) this;
        }

        public Criteria andIdtestIsNotNull() {
            addCriterion("idtest is not null");
            return (Criteria) this;
        }

        public Criteria andIdtestEqualTo(Integer value) {
            addCriterion("idtest =", value, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestNotEqualTo(Integer value) {
            addCriterion("idtest <>", value, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestGreaterThan(Integer value) {
            addCriterion("idtest >", value, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestGreaterThanOrEqualTo(Integer value) {
            addCriterion("idtest >=", value, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestLessThan(Integer value) {
            addCriterion("idtest <", value, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestLessThanOrEqualTo(Integer value) {
            addCriterion("idtest <=", value, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestIn(List<Integer> values) {
            addCriterion("idtest in", values, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestNotIn(List<Integer> values) {
            addCriterion("idtest not in", values, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestBetween(Integer value1, Integer value2) {
            addCriterion("idtest between", value1, value2, "idtest");
            return (Criteria) this;
        }

        public Criteria andIdtestNotBetween(Integer value1, Integer value2) {
            addCriterion("idtest not between", value1, value2, "idtest");
            return (Criteria) this;
        }

        public Criteria andTestcolIsNull() {
            addCriterion("testcol is null");
            return (Criteria) this;
        }

        public Criteria andTestcolIsNotNull() {
            addCriterion("testcol is not null");
            return (Criteria) this;
        }

        public Criteria andTestcolEqualTo(String value) {
            addCriterion("testcol =", value, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolNotEqualTo(String value) {
            addCriterion("testcol <>", value, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolGreaterThan(String value) {
            addCriterion("testcol >", value, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolGreaterThanOrEqualTo(String value) {
            addCriterion("testcol >=", value, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolLessThan(String value) {
            addCriterion("testcol <", value, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolLessThanOrEqualTo(String value) {
            addCriterion("testcol <=", value, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolLike(String value) {
            addCriterion("testcol like", value, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolNotLike(String value) {
            addCriterion("testcol not like", value, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolIn(List<String> values) {
            addCriterion("testcol in", values, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolNotIn(List<String> values) {
            addCriterion("testcol not in", values, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolBetween(String value1, String value2) {
            addCriterion("testcol between", value1, value2, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcolNotBetween(String value1, String value2) {
            addCriterion("testcol not between", value1, value2, "testcol");
            return (Criteria) this;
        }

        public Criteria andTestcol1IsNull() {
            addCriterion("testcol1 is null");
            return (Criteria) this;
        }

        public Criteria andTestcol1IsNotNull() {
            addCriterion("testcol1 is not null");
            return (Criteria) this;
        }

        public Criteria andTestcol1EqualTo(String value) {
            addCriterion("testcol1 =", value, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1NotEqualTo(String value) {
            addCriterion("testcol1 <>", value, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1GreaterThan(String value) {
            addCriterion("testcol1 >", value, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1GreaterThanOrEqualTo(String value) {
            addCriterion("testcol1 >=", value, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1LessThan(String value) {
            addCriterion("testcol1 <", value, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1LessThanOrEqualTo(String value) {
            addCriterion("testcol1 <=", value, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1Like(String value) {
            addCriterion("testcol1 like", value, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1NotLike(String value) {
            addCriterion("testcol1 not like", value, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1In(List<String> values) {
            addCriterion("testcol1 in", values, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1NotIn(List<String> values) {
            addCriterion("testcol1 not in", values, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1Between(String value1, String value2) {
            addCriterion("testcol1 between", value1, value2, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol1NotBetween(String value1, String value2) {
            addCriterion("testcol1 not between", value1, value2, "testcol1");
            return (Criteria) this;
        }

        public Criteria andTestcol2IsNull() {
            addCriterion("testcol2 is null");
            return (Criteria) this;
        }

        public Criteria andTestcol2IsNotNull() {
            addCriterion("testcol2 is not null");
            return (Criteria) this;
        }

        public Criteria andTestcol2EqualTo(String value) {
            addCriterion("testcol2 =", value, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2NotEqualTo(String value) {
            addCriterion("testcol2 <>", value, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2GreaterThan(String value) {
            addCriterion("testcol2 >", value, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2GreaterThanOrEqualTo(String value) {
            addCriterion("testcol2 >=", value, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2LessThan(String value) {
            addCriterion("testcol2 <", value, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2LessThanOrEqualTo(String value) {
            addCriterion("testcol2 <=", value, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2Like(String value) {
            addCriterion("testcol2 like", value, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2NotLike(String value) {
            addCriterion("testcol2 not like", value, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2In(List<String> values) {
            addCriterion("testcol2 in", values, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2NotIn(List<String> values) {
            addCriterion("testcol2 not in", values, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2Between(String value1, String value2) {
            addCriterion("testcol2 between", value1, value2, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol2NotBetween(String value1, String value2) {
            addCriterion("testcol2 not between", value1, value2, "testcol2");
            return (Criteria) this;
        }

        public Criteria andTestcol3IsNull() {
            addCriterion("testcol3 is null");
            return (Criteria) this;
        }

        public Criteria andTestcol3IsNotNull() {
            addCriterion("testcol3 is not null");
            return (Criteria) this;
        }

        public Criteria andTestcol3EqualTo(String value) {
            addCriterion("testcol3 =", value, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3NotEqualTo(String value) {
            addCriterion("testcol3 <>", value, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3GreaterThan(String value) {
            addCriterion("testcol3 >", value, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3GreaterThanOrEqualTo(String value) {
            addCriterion("testcol3 >=", value, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3LessThan(String value) {
            addCriterion("testcol3 <", value, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3LessThanOrEqualTo(String value) {
            addCriterion("testcol3 <=", value, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3Like(String value) {
            addCriterion("testcol3 like", value, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3NotLike(String value) {
            addCriterion("testcol3 not like", value, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3In(List<String> values) {
            addCriterion("testcol3 in", values, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3NotIn(List<String> values) {
            addCriterion("testcol3 not in", values, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3Between(String value1, String value2) {
            addCriterion("testcol3 between", value1, value2, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol3NotBetween(String value1, String value2) {
            addCriterion("testcol3 not between", value1, value2, "testcol3");
            return (Criteria) this;
        }

        public Criteria andTestcol4IsNull() {
            addCriterion("testcol4 is null");
            return (Criteria) this;
        }

        public Criteria andTestcol4IsNotNull() {
            addCriterion("testcol4 is not null");
            return (Criteria) this;
        }

        public Criteria andTestcol4EqualTo(String value) {
            addCriterion("testcol4 =", value, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4NotEqualTo(String value) {
            addCriterion("testcol4 <>", value, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4GreaterThan(String value) {
            addCriterion("testcol4 >", value, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4GreaterThanOrEqualTo(String value) {
            addCriterion("testcol4 >=", value, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4LessThan(String value) {
            addCriterion("testcol4 <", value, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4LessThanOrEqualTo(String value) {
            addCriterion("testcol4 <=", value, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4Like(String value) {
            addCriterion("testcol4 like", value, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4NotLike(String value) {
            addCriterion("testcol4 not like", value, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4In(List<String> values) {
            addCriterion("testcol4 in", values, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4NotIn(List<String> values) {
            addCriterion("testcol4 not in", values, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4Between(String value1, String value2) {
            addCriterion("testcol4 between", value1, value2, "testcol4");
            return (Criteria) this;
        }

        public Criteria andTestcol4NotBetween(String value1, String value2) {
            addCriterion("testcol4 not between", value1, value2, "testcol4");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test
     *
     * @mbg.generated do_not_delete_during_merge Sat Jul 14 22:46:25 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test
     *
     * @mbg.generated Sat Jul 14 22:46:25 CST 2018
     */
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