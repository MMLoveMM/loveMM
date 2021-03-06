package com.lovemm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovemm.mapper.SResourceMapper;
import com.lovemm.model.SResource;
import com.lovemm.model.SResourceExample;
import com.lovemm.service.SResourceService;

@Service
public class SResourceServiceImpl implements SResourceService {
	
	@Autowired
	private SResourceMapper sResourceMapper;

	public long countByExample(SResourceExample example) {
		
		return sResourceMapper.countByExample(example);
	}

	public int deleteByExample(SResourceExample example) {
		
		return sResourceMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String resId) {
		
		return sResourceMapper.deleteByPrimaryKey(resId);
	}

	public int insert(SResource record) {
		
		return sResourceMapper.insert(record);
	}

	public int insertSelective(SResource record) {
		
		return sResourceMapper.insertSelective(record);
	}

	public List<SResource> selectByExample(SResourceExample example) {
		
		return sResourceMapper.selectByExample(example);
	}

	public SResource selectByPrimaryKey(String resId) {
		
		return sResourceMapper.selectByPrimaryKey(resId);
	}

	public int updateByExampleSelective(SResource record, SResourceExample example) {
		
		return sResourceMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(SResource record, SResourceExample example) {
		
		return sResourceMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(SResource record) {
		
		return sResourceMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SResource record) {
		
		return sResourceMapper.updateByPrimaryKey(record);
	}

}
