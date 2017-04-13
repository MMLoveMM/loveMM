package com.lovemm.service;

import com.lovemm.mapper.SUserMapper;
import com.lovemm.model.SUser;

/**
 * 
 * @author pangpj 2017年03月28日16:33:25
 * 角色登录
 *
 */
public interface SUserService extends SUserMapper {

	/**
	 * 根据用户帐号（邮箱、手机、自定义）查询用户
	 * @param username
	 * @return
	 */
	SUser selectByUserMultiName(String username);

}
