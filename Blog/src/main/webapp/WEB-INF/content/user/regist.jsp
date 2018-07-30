<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>regist</title>

<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/regist.js"></script>
</head>

<body class="templatemo-bg-gray">
	<div align="center">

		<h1>regist form</h1>
		<form id="form1" action="regist" method="post">
			<table class="templatemo-container" style="width: 650px;">
				<tr>
					<td>username:<input id="name" onblur="nameBlur()" type="text"
						class="form-control" name="username"
						placeholder="please input your name" /> 
					</td>
					<td><span id="namespan"></span></td>
				</tr>
				<tr>
					<td>password:<input id="pass1" onblur="pass1Blur()"  type="password"
						class="form-control" name="password" /></td>
						<td><span id="pass1span"></span></td>
				</tr>
				<tr>
					<td>passsure:<input id="pass2" onblur="pass2Blur()" type="password"
						class="form-control" name="repassword" /></td>
				</tr>
				<tr>
					<td>age:<br />
					<input id="age" type="text" class="form-control" name="age" onblur="ageBlur()"
						style="text-align: center; display: inline; width: 15%; margin-right: 8%;" />
						<span id="ageSpan"></span>
						<input type="radio" checked="checked" name="sex" value="f" />female&nbsp;&nbsp;
						<input type="radio" name="sex" value="m" />male
					</td>
				</tr>
				<tr>
					<td>tel:<input id="tel" type="text" class="form-control"onblur="telBlur()"
						name="tel" /><span id="telSpan"></span></td>
				</tr>
				<tr>
					<td align="center">
					<input type="submit" value="submit" class="btn" onclick="return registSubmit()"/></td>
				</tr>
			</table>
		</form>
		<h2 onclick="javascript:history.go(-1);">The history back</h2>
	</div>
</body>
</html>
