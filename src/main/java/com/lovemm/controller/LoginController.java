package com.lovemm.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovemm.model.SUser;
import com.lovemm.model.SUserExample;
import com.lovemm.service.SUserService;

@Controller
@RequestMapping(value="/test")
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private SUserService sUserService;

	@RequestMapping(value="/toIndex")
	public String toIndex() {
		logger.info("用户跳转到首页");
		
		return "index";
	}
	
	@RequestMapping(value="/toLogin")
	public String toLogin() {
		logger.info("用户跳转到登录页面");
		
		return "login";
	}
	
	@RequestMapping(value="/userLogin")
	@ResponseBody
	public String userLogin(SUser sUser) {
		logger.info("用户登录。。。");
		
		SUser uLogin = new SUser();
		
		SUserExample example = new SUserExample();
		SUserExample.Criteria criteria = example.createCriteria();
		
		if(sUser.getUserTel() != null && !"".equals(sUser.getUserTel())) {
			criteria.andUserTelEqualTo(sUser.getUserTel());
		}
		
		List<SUser> userLoginList = sUserService.selectByExample(example);
		if(userLoginList.isEmpty()) {
			logger.error("账号不存在");
			return "账号不存在";
		}
		
		uLogin.setUserId(userLoginList.get(0).getUserId());
		
		if(!sUser.getUserPwd().equals(userLoginList.get(0).getUserPwd())) {
			logger.error("密码错误");
			uLogin.setLoginTimes(userLoginList.get(0).getLoginTimes() + 1);
			uLogin.setLoginTimes(userLoginList.get(0).getLoginTimes() + 1);
			sUserService.updateByPrimaryKeySelective(uLogin);
			return "密码错误";
		}
		
		
		uLogin.setLoginTimes(userLoginList.get(0).getLoginTimes() + 1);
		uLogin.setLoginTimes(userLoginList.get(0).getLoginTimes() + 1);
		int num = sUserService.updateByPrimaryKeySelective(uLogin);
		
		if(num < 1) {
			logger.error("更新数据失败");
			return "登录失败.系统出错";
		}
		
		return "0";
	}
	
	@RequestMapping(value="/toSignIn")
	public String toSignIn() {
		logger.info("用户进入注册页面");
		
		return "user/sign_in";
	}
	
}
