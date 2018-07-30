<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div style="position:absolute; padding: 20px 0 0 2%;">
<span class="btn" onclick="javascript:window.location='index';">
	door
</span>
<span class="btn" onclick="javascript:window.location='showBlogList?type=2';">
	home
</span>
<c:if test="${loginUser==null}">
	<span id="login_menu" class="btn" onclick="javascript:window.location='login'">
	login
	</span>
</c:if>
<c:if test="${loginUser!=null}">
<!-- onclick="javascript:window.location='showBlogList?type=1&uid='+${loginUser.id};" -->
	<span class="btn" onclick="javascript:window.location='showBlogList?uid='+${loginUser.id};">
		myblog
	</span>
	<span class="btn" onclick="javascript:window.location='createblog.action?type=1';">
		creatblog
	</span>
	<span class="btn" onclick="javascript:window.location='exit';"><!-- 退出登录 -->
		exit
	</span>
</c:if>
<span class="btn" onclick="javascript:history.go(-1);">
	back
</span>
</div>
<h1>welcome blog club</h1>
<hr>