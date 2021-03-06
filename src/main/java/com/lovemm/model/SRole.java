package com.lovemm.model;

import java.util.Date;

public class SRole {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_role.ROLE_ID
	 * @mbg.generated
	 */
	private String roleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_role.ROLE_NAME
	 * @mbg.generated
	 */
	private String roleName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_role.ROLE_CODE
	 * @mbg.generated
	 */
	private String roleCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_role.STATUS
	 * @mbg.generated
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_role.CREATE_TIME
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_role.LAST_MOD_TIME
	 * @mbg.generated
	 */
	private Date lastModTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_role.ROLE_ID
	 * @return  the value of s_role.ROLE_ID
	 * @mbg.generated
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_role.ROLE_ID
	 * @param roleId  the value for s_role.ROLE_ID
	 * @mbg.generated
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId == null ? null : roleId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_role.ROLE_NAME
	 * @return  the value of s_role.ROLE_NAME
	 * @mbg.generated
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_role.ROLE_NAME
	 * @param roleName  the value for s_role.ROLE_NAME
	 * @mbg.generated
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_role.ROLE_CODE
	 * @return  the value of s_role.ROLE_CODE
	 * @mbg.generated
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_role.ROLE_CODE
	 * @param roleCode  the value for s_role.ROLE_CODE
	 * @mbg.generated
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode == null ? null : roleCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_role.STATUS
	 * @return  the value of s_role.STATUS
	 * @mbg.generated
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_role.STATUS
	 * @param status  the value for s_role.STATUS
	 * @mbg.generated
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_role.CREATE_TIME
	 * @return  the value of s_role.CREATE_TIME
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_role.CREATE_TIME
	 * @param createTime  the value for s_role.CREATE_TIME
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_role.LAST_MOD_TIME
	 * @return  the value of s_role.LAST_MOD_TIME
	 * @mbg.generated
	 */
	public Date getLastModTime() {
		return lastModTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_role.LAST_MOD_TIME
	 * @param lastModTime  the value for s_role.LAST_MOD_TIME
	 * @mbg.generated
	 */
	public void setLastModTime(Date lastModTime) {
		this.lastModTime = lastModTime;
	}
}