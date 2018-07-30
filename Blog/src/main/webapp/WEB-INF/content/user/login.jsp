<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>login</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jslib/jquery.js">
	
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jslib/jquery.validate.js">
	
</script>
<script type="text/javascript">
	function check() {
		if (loginForm.username.value == "") {
			alert("请输入用户名！");
			loginForm.username.focus();
			return;
		} else if (loginForm.password.value == "") {
			alert("请输入密码！");
			loginForm.password.focus();
			return;
		} else {
			loginForm.submit();
		}
	}
</script>
</head>
<body class="templatemo-bg-gray">
	<div align="center">

		<c:import url="${pageContext.request.contextPath}/header.jsp"></c:import>

		<h2>login form one</h2>
		<form action="login" method="post" id="loginForm">
			<table class="templatemo-container">
				<tr>
					<td>name:<input id="username" type="text" class="form-control"
						name="username" placeholder="please input your name" /> <span
						id="nameSpan"></span>
					</td>

				</tr>
				<tr>
					<td>password:<input id="password" type="password"
						class="form-control" name="password" />
						<span id="passSapn"></span>
						</td>
				</tr>
				<tr style="height: 20px;">
					<td><font size="3" style="margin-bottom: 2px;">remember
							me:</font><input id="remember" checked="checked" type="checkbox"
						name="remember" /></td>
					<td><font color="red">${msg}</font></td>
				</tr>
				<tr>
					<td align="center"><input type="submit" value="submit"
						id="submit" class="btn" onclick="check()" /></td>
				</tr>
			</table>
		</form>
		<h2 id="new" onclick="javascript:window.location.href='regist'">create
			new account</h2>
	</div>
</body>
</html>