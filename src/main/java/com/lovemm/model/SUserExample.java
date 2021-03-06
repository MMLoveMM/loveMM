package com.lovemm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SUserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table s_user
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table s_user
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table s_user
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public SUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_user
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table s_user
	 * @mbg.generated
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

		public Criteria andUserIdIsNull() {
			addCriterion("USER_ID is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("USER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("USER_ID =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("USER_ID <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("USER_ID >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("USER_ID >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("USER_ID <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("USER_ID <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("USER_ID like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("USER_ID not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("USER_ID in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("USER_ID not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("USER_ID between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("USER_ID not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserTelIsNull() {
			addCriterion("USER_TEL is null");
			return (Criteria) this;
		}

		public Criteria andUserTelIsNotNull() {
			addCriterion("USER_TEL is not null");
			return (Criteria) this;
		}

		public Criteria andUserTelEqualTo(String value) {
			addCriterion("USER_TEL =", value, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelNotEqualTo(String value) {
			addCriterion("USER_TEL <>", value, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelGreaterThan(String value) {
			addCriterion("USER_TEL >", value, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelGreaterThanOrEqualTo(String value) {
			addCriterion("USER_TEL >=", value, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelLessThan(String value) {
			addCriterion("USER_TEL <", value, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelLessThanOrEqualTo(String value) {
			addCriterion("USER_TEL <=", value, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelLike(String value) {
			addCriterion("USER_TEL like", value, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelNotLike(String value) {
			addCriterion("USER_TEL not like", value, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelIn(List<String> values) {
			addCriterion("USER_TEL in", values, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelNotIn(List<String> values) {
			addCriterion("USER_TEL not in", values, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelBetween(String value1, String value2) {
			addCriterion("USER_TEL between", value1, value2, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserTelNotBetween(String value1, String value2) {
			addCriterion("USER_TEL not between", value1, value2, "userTel");
			return (Criteria) this;
		}

		public Criteria andUserMailIsNull() {
			addCriterion("USER_MAIL is null");
			return (Criteria) this;
		}

		public Criteria andUserMailIsNotNull() {
			addCriterion("USER_MAIL is not null");
			return (Criteria) this;
		}

		public Criteria andUserMailEqualTo(String value) {
			addCriterion("USER_MAIL =", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailNotEqualTo(String value) {
			addCriterion("USER_MAIL <>", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailGreaterThan(String value) {
			addCriterion("USER_MAIL >", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailGreaterThanOrEqualTo(String value) {
			addCriterion("USER_MAIL >=", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailLessThan(String value) {
			addCriterion("USER_MAIL <", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailLessThanOrEqualTo(String value) {
			addCriterion("USER_MAIL <=", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailLike(String value) {
			addCriterion("USER_MAIL like", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailNotLike(String value) {
			addCriterion("USER_MAIL not like", value, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailIn(List<String> values) {
			addCriterion("USER_MAIL in", values, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailNotIn(List<String> values) {
			addCriterion("USER_MAIL not in", values, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailBetween(String value1, String value2) {
			addCriterion("USER_MAIL between", value1, value2, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserMailNotBetween(String value1, String value2) {
			addCriterion("USER_MAIL not between", value1, value2, "userMail");
			return (Criteria) this;
		}

		public Criteria andUserAccountIsNull() {
			addCriterion("USER_ACCOUNT is null");
			return (Criteria) this;
		}

		public Criteria andUserAccountIsNotNull() {
			addCriterion("USER_ACCOUNT is not null");
			return (Criteria) this;
		}

		public Criteria andUserAccountEqualTo(String value) {
			addCriterion("USER_ACCOUNT =", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotEqualTo(String value) {
			addCriterion("USER_ACCOUNT <>", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountGreaterThan(String value) {
			addCriterion("USER_ACCOUNT >", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
			addCriterion("USER_ACCOUNT >=", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLessThan(String value) {
			addCriterion("USER_ACCOUNT <", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLessThanOrEqualTo(String value) {
			addCriterion("USER_ACCOUNT <=", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountLike(String value) {
			addCriterion("USER_ACCOUNT like", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotLike(String value) {
			addCriterion("USER_ACCOUNT not like", value, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountIn(List<String> values) {
			addCriterion("USER_ACCOUNT in", values, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotIn(List<String> values) {
			addCriterion("USER_ACCOUNT not in", values, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountBetween(String value1, String value2) {
			addCriterion("USER_ACCOUNT between", value1, value2, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserAccountNotBetween(String value1, String value2) {
			addCriterion("USER_ACCOUNT not between", value1, value2, "userAccount");
			return (Criteria) this;
		}

		public Criteria andUserPwdIsNull() {
			addCriterion("USER_PWD is null");
			return (Criteria) this;
		}

		public Criteria andUserPwdIsNotNull() {
			addCriterion("USER_PWD is not null");
			return (Criteria) this;
		}

		public Criteria andUserPwdEqualTo(String value) {
			addCriterion("USER_PWD =", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotEqualTo(String value) {
			addCriterion("USER_PWD <>", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdGreaterThan(String value) {
			addCriterion("USER_PWD >", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
			addCriterion("USER_PWD >=", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLessThan(String value) {
			addCriterion("USER_PWD <", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLessThanOrEqualTo(String value) {
			addCriterion("USER_PWD <=", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdLike(String value) {
			addCriterion("USER_PWD like", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotLike(String value) {
			addCriterion("USER_PWD not like", value, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdIn(List<String> values) {
			addCriterion("USER_PWD in", values, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotIn(List<String> values) {
			addCriterion("USER_PWD not in", values, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdBetween(String value1, String value2) {
			addCriterion("USER_PWD between", value1, value2, "userPwd");
			return (Criteria) this;
		}

		public Criteria andUserPwdNotBetween(String value1, String value2) {
			addCriterion("USER_PWD not between", value1, value2, "userPwd");
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

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("STATUS =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("STATUS <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("STATUS >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("STATUS >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("STATUS <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("STATUS <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("STATUS in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("STATUS not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("STATUS between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("STATUS not between", value1, value2, "status");
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

		public Criteria andRegisterIpIsNull() {
			addCriterion("REGISTER_IP is null");
			return (Criteria) this;
		}

		public Criteria andRegisterIpIsNotNull() {
			addCriterion("REGISTER_IP is not null");
			return (Criteria) this;
		}

		public Criteria andRegisterIpEqualTo(String value) {
			addCriterion("REGISTER_IP =", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpNotEqualTo(String value) {
			addCriterion("REGISTER_IP <>", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpGreaterThan(String value) {
			addCriterion("REGISTER_IP >", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpGreaterThanOrEqualTo(String value) {
			addCriterion("REGISTER_IP >=", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpLessThan(String value) {
			addCriterion("REGISTER_IP <", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpLessThanOrEqualTo(String value) {
			addCriterion("REGISTER_IP <=", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpLike(String value) {
			addCriterion("REGISTER_IP like", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpNotLike(String value) {
			addCriterion("REGISTER_IP not like", value, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpIn(List<String> values) {
			addCriterion("REGISTER_IP in", values, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpNotIn(List<String> values) {
			addCriterion("REGISTER_IP not in", values, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpBetween(String value1, String value2) {
			addCriterion("REGISTER_IP between", value1, value2, "registerIp");
			return (Criteria) this;
		}

		public Criteria andRegisterIpNotBetween(String value1, String value2) {
			addCriterion("REGISTER_IP not between", value1, value2, "registerIp");
			return (Criteria) this;
		}

		public Criteria andLoginTimesIsNull() {
			addCriterion("LOGIN_TIMES is null");
			return (Criteria) this;
		}

		public Criteria andLoginTimesIsNotNull() {
			addCriterion("LOGIN_TIMES is not null");
			return (Criteria) this;
		}

		public Criteria andLoginTimesEqualTo(Integer value) {
			addCriterion("LOGIN_TIMES =", value, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesNotEqualTo(Integer value) {
			addCriterion("LOGIN_TIMES <>", value, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesGreaterThan(Integer value) {
			addCriterion("LOGIN_TIMES >", value, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesGreaterThanOrEqualTo(Integer value) {
			addCriterion("LOGIN_TIMES >=", value, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesLessThan(Integer value) {
			addCriterion("LOGIN_TIMES <", value, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesLessThanOrEqualTo(Integer value) {
			addCriterion("LOGIN_TIMES <=", value, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesIn(List<Integer> values) {
			addCriterion("LOGIN_TIMES in", values, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesNotIn(List<Integer> values) {
			addCriterion("LOGIN_TIMES not in", values, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesBetween(Integer value1, Integer value2) {
			addCriterion("LOGIN_TIMES between", value1, value2, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLoginTimesNotBetween(Integer value1, Integer value2) {
			addCriterion("LOGIN_TIMES not between", value1, value2, "loginTimes");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpIsNull() {
			addCriterion("LAST_LOGIN_IP is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpIsNotNull() {
			addCriterion("LAST_LOGIN_IP is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpEqualTo(String value) {
			addCriterion("LAST_LOGIN_IP =", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpNotEqualTo(String value) {
			addCriterion("LAST_LOGIN_IP <>", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpGreaterThan(String value) {
			addCriterion("LAST_LOGIN_IP >", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
			addCriterion("LAST_LOGIN_IP >=", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpLessThan(String value) {
			addCriterion("LAST_LOGIN_IP <", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
			addCriterion("LAST_LOGIN_IP <=", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpLike(String value) {
			addCriterion("LAST_LOGIN_IP like", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpNotLike(String value) {
			addCriterion("LAST_LOGIN_IP not like", value, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpIn(List<String> values) {
			addCriterion("LAST_LOGIN_IP in", values, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpNotIn(List<String> values) {
			addCriterion("LAST_LOGIN_IP not in", values, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpBetween(String value1, String value2) {
			addCriterion("LAST_LOGIN_IP between", value1, value2, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginIpNotBetween(String value1, String value2) {
			addCriterion("LAST_LOGIN_IP not between", value1, value2, "lastLoginIp");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIsNull() {
			addCriterion("LAST_LOGIN_TIME is null");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIsNotNull() {
			addCriterion("LAST_LOGIN_TIME is not null");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeEqualTo(Date value) {
			addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotEqualTo(Date value) {
			addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeGreaterThan(Date value) {
			addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeLessThan(Date value) {
			addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
			addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeIn(List<Date> values) {
			addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotIn(List<Date> values) {
			addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
			addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
			addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
			return (Criteria) this;
		}

		public Criteria andIsLockedIsNull() {
			addCriterion("IS_LOCKED is null");
			return (Criteria) this;
		}

		public Criteria andIsLockedIsNotNull() {
			addCriterion("IS_LOCKED is not null");
			return (Criteria) this;
		}

		public Criteria andIsLockedEqualTo(Integer value) {
			addCriterion("IS_LOCKED =", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedNotEqualTo(Integer value) {
			addCriterion("IS_LOCKED <>", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedGreaterThan(Integer value) {
			addCriterion("IS_LOCKED >", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedGreaterThanOrEqualTo(Integer value) {
			addCriterion("IS_LOCKED >=", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedLessThan(Integer value) {
			addCriterion("IS_LOCKED <", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedLessThanOrEqualTo(Integer value) {
			addCriterion("IS_LOCKED <=", value, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedIn(List<Integer> values) {
			addCriterion("IS_LOCKED in", values, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedNotIn(List<Integer> values) {
			addCriterion("IS_LOCKED not in", values, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedBetween(Integer value1, Integer value2) {
			addCriterion("IS_LOCKED between", value1, value2, "isLocked");
			return (Criteria) this;
		}

		public Criteria andIsLockedNotBetween(Integer value1, Integer value2) {
			addCriterion("IS_LOCKED not between", value1, value2, "isLocked");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesIsNull() {
			addCriterion("PWD_WRONG_TIMES is null");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesIsNotNull() {
			addCriterion("PWD_WRONG_TIMES is not null");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesEqualTo(Integer value) {
			addCriterion("PWD_WRONG_TIMES =", value, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesNotEqualTo(Integer value) {
			addCriterion("PWD_WRONG_TIMES <>", value, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesGreaterThan(Integer value) {
			addCriterion("PWD_WRONG_TIMES >", value, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesGreaterThanOrEqualTo(Integer value) {
			addCriterion("PWD_WRONG_TIMES >=", value, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesLessThan(Integer value) {
			addCriterion("PWD_WRONG_TIMES <", value, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesLessThanOrEqualTo(Integer value) {
			addCriterion("PWD_WRONG_TIMES <=", value, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesIn(List<Integer> values) {
			addCriterion("PWD_WRONG_TIMES in", values, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesNotIn(List<Integer> values) {
			addCriterion("PWD_WRONG_TIMES not in", values, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesBetween(Integer value1, Integer value2) {
			addCriterion("PWD_WRONG_TIMES between", value1, value2, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andPwdWrongTimesNotBetween(Integer value1, Integer value2) {
			addCriterion("PWD_WRONG_TIMES not between", value1, value2, "pwdWrongTimes");
			return (Criteria) this;
		}

		public Criteria andNickNameIsNull() {
			addCriterion("NICK_NAME is null");
			return (Criteria) this;
		}

		public Criteria andNickNameIsNotNull() {
			addCriterion("NICK_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andNickNameEqualTo(String value) {
			addCriterion("NICK_NAME =", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotEqualTo(String value) {
			addCriterion("NICK_NAME <>", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameGreaterThan(String value) {
			addCriterion("NICK_NAME >", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameGreaterThanOrEqualTo(String value) {
			addCriterion("NICK_NAME >=", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLessThan(String value) {
			addCriterion("NICK_NAME <", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLessThanOrEqualTo(String value) {
			addCriterion("NICK_NAME <=", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameLike(String value) {
			addCriterion("NICK_NAME like", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotLike(String value) {
			addCriterion("NICK_NAME not like", value, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameIn(List<String> values) {
			addCriterion("NICK_NAME in", values, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotIn(List<String> values) {
			addCriterion("NICK_NAME not in", values, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameBetween(String value1, String value2) {
			addCriterion("NICK_NAME between", value1, value2, "nickName");
			return (Criteria) this;
		}

		public Criteria andNickNameNotBetween(String value1, String value2) {
			addCriterion("NICK_NAME not between", value1, value2, "nickName");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table s_user
	 * @mbg.generated
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table s_user
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}