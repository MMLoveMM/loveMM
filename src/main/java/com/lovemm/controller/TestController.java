package com.lovemm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovemm.model.SUser;
import com.lovemm.model.SUserExample;
import com.lovemm.service.SUserService;

@Controller
@RequestMapping(value = "/public")
public class TestController {
	
	@Autowired
	private SUserService sUserService;
	
	@RequestMapping(value = "/getDate")
	@ResponseBody
	public List<SUser> getData() {
		
		return sUserService.selectByExample(new SUserExample());
	}
}
