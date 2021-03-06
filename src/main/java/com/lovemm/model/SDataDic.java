package com.lovemm.model;

import java.util.Date;

public class SDataDic extends SDataDicKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_data_dic.DIC_VALUE
	 * @mbg.generated
	 */
	private String dicValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_data_dic.DIC_DESC
	 * @mbg.generated
	 */
	private String dicDesc;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_data_dic.CREATE_TIME
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column s_data_dic.MOD_TIME
	 * @mbg.generated
	 */
	private Date modTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_data_dic.DIC_VALUE
	 * @return  the value of s_data_dic.DIC_VALUE
	 * @mbg.generated
	 */
	public String getDicValue() {
		return dicValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_data_dic.DIC_VALUE
	 * @param dicValue  the value for s_data_dic.DIC_VALUE
	 * @mbg.generated
	 */
	public void setDicValue(String dicValue) {
		this.dicValue = dicValue == null ? null : dicValue.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_data_dic.DIC_DESC
	 * @return  the value of s_data_dic.DIC_DESC
	 * @mbg.generated
	 */
	public String getDicDesc() {
		return dicDesc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_data_dic.DIC_DESC
	 * @param dicDesc  the value for s_data_dic.DIC_DESC
	 * @mbg.generated
	 */
	public void setDicDesc(String dicDesc) {
		this.dicDesc = dicDesc == null ? null : dicDesc.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_data_dic.CREATE_TIME
	 * @return  the value of s_data_dic.CREATE_TIME
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_data_dic.CREATE_TIME
	 * @param createTime  the value for s_data_dic.CREATE_TIME
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column s_data_dic.MOD_TIME
	 * @return  the value of s_data_dic.MOD_TIME
	 * @mbg.generated
	 */
	public Date getModTime() {
		return modTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column s_data_dic.MOD_TIME
	 * @param modTime  the value for s_data_dic.MOD_TIME
	 * @mbg.generated
	 */
	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}
}