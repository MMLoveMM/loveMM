<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include  file="../base/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<input type="button" value="登录" id="login" />
	
	<input type="button" value="注册" id="signIn" />
	
	<%@ include file="../base/script-base.jsp" %>
	<script type="text/javascript">
		$(function () {
			$("#login").click(function() {
				location.href = "${appCtx}/test/toLogin";
			});
			
			$("#signIn").click(function() {
				location.href = "${appCtx}/test/toSignIn";
			});
		});
	</script>
</body>
</html>