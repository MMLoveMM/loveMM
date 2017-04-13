package com.lovemm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovemm.mapper.SRoleResourcesMapper;
import com.lovemm.model.SResource;
import com.lovemm.model.SRoleResourcesExample;
import com.lovemm.model.SRoleResourcesKey;
import com.lovemm.service.SRoleResourcesService;

@Service
public class SRoleResourcesServiceImpl implements SRoleResourcesService {
	
	@Autowired
	private SRoleResourcesMapper sRoleResourcesMapper;

	public long countByExample(SRoleResourcesExample example) {
		
		return sRoleResourcesMapper.countByExample(example);
	}

	public int deleteByExample(SRoleResourcesExample example) {
		
		return sRoleResourcesMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(SRoleResourcesKey key) {
		
		return sRoleResourcesMapper.deleteByPrimaryKey(key);
	}

	public int insert(SRoleResourcesKey record) {
		
		return sRoleResourcesMapper.insert(record);
	}

	public int insertSelective(SRoleResourcesKey record) {
		
		return sRoleResourcesMapper.insertSelective(record);
	}

	public List<SRoleResourcesKey> selectByExample(SRoleResourcesExample example) {
		
		return sRoleResourcesMapper.selectByExample(example);
	}

	public int updateByExampleSelective(SRoleResourcesKey record, SRoleResourcesExample example) {
		
		return sRoleResourcesMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(SRoleResourcesKey record, SRoleResourcesExample example) {
		
		return sRoleResourcesMapper.updateByExample(record, example);
	}

	/**
	 * @author pangpj 2017年03月28日17:15:34
	 * 根据角色id  获取角色资源
	 * @param userId 角色id
	 * @return
	 */
	public List<SResource> getResourcesByUserId(String userid) {
		
		return sRoleResourcesMapper.getResourcesByUserId(userid);
	}

}
