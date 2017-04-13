<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include  file="../../base/taglibs.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>注册</title>
		<jsp:include page = "../../base/css-base.jsp" flush="true"/>
		
	</head>
	<body class="background-color-in">
		<div class="container-fluid">
			<jsp:include page="../../base/header.jsp" flush="true"/>
			<form id="signIn" class="form-horizontal" style="margin-top: 60px;" onsubmit="false;">
				<h2 class="label-color-in text-center">欢迎注册</h2>
				
				<div class="row mag-top">
						<label for="userEmail" class="col-xs-3 col-xs-offset-1 control-label label-color-in">邮箱</label>
						<div class="col-xs-5">
							<input type="text" name="userEmail" id="userEmail" placeholder="邮箱不能为空--可作为登录账号" class="form-control" />	
						</div>
						<label class="col-xs-2 control-label error-tips" for="form-field-1"></label>
				</div>
				
				<div class="row mag-top">
						<label for="userName" class="col-xs-3 col-xs-offset-1 control-label label-color-in">昵称</label>
						<div class="col-xs-5">
							<input type="text" name="userName" id="userName" placeholder="昵称不能为空" class="form-control" />	
						</div>
						<label class="col-xs-2 control-label error-tips" for="form-field-1"></label>
				</div>
				
				<div class="row mag-top">
					<label for="userPassword" class="col-xs-3 col-xs-offset-1 control-label label-color-in">密码</label>
					<div class="col-xs-5">
						<input type="password" class="form-control" name="userPassword" id="userPassword" placeholder="密码长度为6-18位的字母或数字" />
					</div>
					<label class="col-xs-2 control-label error-tips" for="form-field-1"></label>
				</div>
				
				<div class="row mag-top">
					<label for="userPasswordSuc" class="col-xs-3 col-xs-offset-1 control-label label-color-in">确认密码</label>
					<div class="col-xs-5">
						<input type="password" class="form-control" name="userPasswordSuc" id="userPasswordSuc" placeholder="确认密码" />
					</div>
					<label class="col-xs-2 control-label error-tips" for="form-field-1"></label>
				</div>
			
				<div class="row mag-top">
					<label for="emailSecurityCode" class="col-xs-3 col-xs-offset-1 control-label label-color-in">邮箱验证码</label>
					<div class="col-xs-5">
						<input type="text" class="form-control" name="emailSecurityCode" id="emailSecurityCode"  placeholder="请输入验证码" />
					</div>
					<label class="col-xs-2 control-label error-tips" for="form-field-1"></label>
				</div>
				
					<div class="row mag-top">
						<div class="col-xs-offset-4 col-xs-5 text-right">
							<button type="button" id="toSecourityCode" class="btn">发送验证码</button>
						</div>
					</div>
				
				<div class="row mag-top">
					<div class="col-xs-2 col-xs-offset-4 text-center">
						<button type="submit" id="signInSuccess" class="btn btn-success">确认注册</button>
					</div>
					<div class="col-xs-2 col-xs-offset-1 text-center">
						<button type="reset" class="btn btn-info">重新填写</button>
					</div>
				</div>
			</form>
		</div>
		<jsp:include page="../../base/script-base.jsp" flush="true"/>
		<script type="text/javascript">
			$(function() {
				
				$("#signIn").validate( {
					rules: { 
						userEmail: { required:true, email : true}, 
						userName: { required : true, minlength : 4, maxlength : 16},
						userPassword: { required : true},
						userPasswordSuc : { required : true, equalTo : "#userPassword"},
						emailSecurityCode : { required : true},
					}, 
					messages: { 
						userEmail: { required : "*邮箱不能为空" , email : "*请输入正确的邮箱"},
						userName: { required: "*昵称不能为空", minlength : "*长度小于4位", maxlength : "*长度超过16位"}, 
						userPassword : {required : "*密码不能为空"}, 
						userPasswordSuc : {required : "*确认密码不能为空", equalTo : "*输入密码不一致"}, 
						emailSecurityCode : {required : "*验证码不能为空"}, 
					}, 
					success : function(error, element) {  
						$(element).parent().parent().find(".error-tips").html("");
						$(element).parent().parent().removeClass("has-error");
					},
					errorPlacement: function(error, element) {
						$(element).parent().parent().find(".error-tips").html(error.html());
						$(element).parent().parent().addClass("has-error");
					}
				}); 
				
				$("#signInSuccess").click(function() {
					if(!$("#signIn").valid()){
						return;
					}
					
					$.ajax({
						type : "post",
						url : "",
						data : $("#signIn").submit(),
						async : true,
						success : function() {
							
						},
						error : function() {
							alert("系统异常");
						}
					});
				});
			});
		</script>
	</body>
</html>