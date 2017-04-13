package com.lovemm.controller.config.shiro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lovemm.model.SResource;
import com.lovemm.model.SResourceExample;
import com.lovemm.model.SRole;
import com.lovemm.model.SRoleExample;
import com.lovemm.model.SRoleResourcesExample;
import com.lovemm.model.SRoleResourcesKey;
import com.lovemm.model.SUser;
import com.lovemm.model.SUserRoleExample;
import com.lovemm.model.SUserRoleKey;
import com.lovemm.service.SResourceService;
import com.lovemm.service.SRoleResourcesService;
import com.lovemm.service.SRoleService;
import com.lovemm.service.SUserRoleService;
import com.lovemm.service.SUserService;
import com.lovemm.util.StringUtil;


public class UserRealm extends AuthorizingRealm {

	private static final Logger logger = LoggerFactory.getLogger(UserRealm.class);

	@Autowired
	private SUserService sUserService;
	@Autowired
	private SRoleService sRoleService;
	@Autowired
	private SUserRoleService sUserRoleService;
	@Autowired
	private SRoleResourcesService sRoleResourceService;
	@Autowired
	private SResourceService sResourceService;
	/**
	 * 设置密码凭证验证方式
	 */
	@PostConstruct
	public void initCredentialsMatcher(){
		setCredentialsMatcher(new CustomCredentialsMatcher());
	}
	
	/**
	 * 授权验证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SUser user = (SUser) super.getAvailablePrincipal(principals);
		logger.info("do shiro authorization - {}", user.getUserId());
		// 加载用户角色
		SUserRoleExample surEx = new SUserRoleExample();
		surEx.createCriteria().andUserIdEqualTo(user.getUserId());
		List<SUserRoleKey> surs = sUserRoleService.selectByExample(surEx);
		List<String> roleIds  = new ArrayList<String>();
		if (surs != null && !surs.isEmpty()) {
			surs.forEach(blogUserRoleKey -> {
				roleIds.add(blogUserRoleKey.getRoleId());
			});
		}
		SRoleExample srEx = new SRoleExample();
		srEx.createCriteria().andRoleIdIn(roleIds);
		List<SRole> roles = sRoleService.selectByExample(srEx);
		Set<String> rolesName = new HashSet<String>();
		for (SRole role : roles) {
			rolesName.add(role.getRoleName());
		}
		
		// 加载用户权限
		SRoleResourcesExample srrEx = new SRoleResourcesExample();
		srrEx.createCriteria().andRoleIdIn(roleIds);
		srrEx.setDistinct(true);
		List<SRoleResourcesKey> brrs = sRoleResourceService.selectByExample(srrEx);
		List<String> resIds = new ArrayList<String>();
		if (brrs != null && !brrs.isEmpty()) {
			brrs.forEach(blogRoleResourceKey -> {
				resIds.add(blogRoleResourceKey.getResId());
			});
		}
		SResourceExample sresEx = new SResourceExample();
		sresEx.createCriteria().andResIdIn(resIds);
		List<SResource> ress = sResourceService.selectByExample(sresEx);
		Set<String> resNames = new HashSet<String>();
		for (SResource res : ress) {
			if (StringUtil.isNotEmpty(res.getPermission())){
				resNames.add(res.getPermission());
			}
		}

		// 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setRoles(rolesName);
		info.setStringPermissions(resNames);

		logger.info("load roles：{}, load permissions：{}", rolesName, resNames);

		return info;


	}

	/**
	 * 身份验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		SUser user = sUserService.selectByUserMultiName(usernamePasswordToken.getUsername());
		if (user == null) {
			 throw new UnknownAccountException();
		}
		if(user.getIsLocked() == 1){
			 throw new LockedAccountException();
		}
		if(user.getStatus() != 1) {
			throw new DisabledAccountException();
		}
		
		return new SimpleAuthenticationInfo(user, user.getUserPwd(), getName());
	}

}
