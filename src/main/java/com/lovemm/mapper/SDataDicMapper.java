package com.lovemm.mapper;

import com.lovemm.model.SDataDic;
import com.lovemm.model.SDataDicExample;
import com.lovemm.model.SDataDicKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SDataDicMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	long countByExample(SDataDicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	int deleteByExample(SDataDicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(SDataDicKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	int insert(SDataDic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	int insertSelective(SDataDic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	List<SDataDic> selectByExample(SDataDicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	SDataDic selectByPrimaryKey(SDataDicKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") SDataDic record, @Param("example") SDataDicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") SDataDic record, @Param("example") SDataDicExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(SDataDic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table s_data_dic
	 * @mbg.generated
	 */
	int updateByPrimaryKey(SDataDic record);
}