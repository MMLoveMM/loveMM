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
	手机号码 : <input type="text" id="userPhoneNumber" />
	
	密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" id="password" />

	<input type="button" value="登录" id="login" />
	
	<%@ include file="../base/script-base.jsp" %>
	<script type="text/javascript">
		$(function () {
			$("#login").click(function() {
				 $.ajax({
					url : "${appCtx}/test/userLogin",
					type : "post",
					data: {
						userPhoneNumber : $("#userPhoneNumber").val().trim(),
						userPassword : $("#password").val().trim()
					},
					success : function(data) {
						if(data == 0){
							alert("登录成功");
						}else{
							alert(data);
						}
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