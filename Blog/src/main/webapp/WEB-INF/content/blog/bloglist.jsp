<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>    
<!DOCTYPE>
<html>
  <head>
    <title>bloglist</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  
  <body class="templatemo-bg-gray">
	<div align="center">
		<c:import url="${pageContext.request.contextPath}/header.jsp"></c:import>
    	<h2>blog list</h2>
    	<table class="templatemo-container blog_type_list">
        		<tr>
                	<th>作者</th>
                    <th>标题</th>
                    <th>类型</th>
                    <th>发表时间</th>
                    <th>浏览量</th>
                </tr>
				
                <c:forEach var="blog" items="${blogList }">
					<tr>
						<td><a href="showbloglist.action?type=1&uid=${blog.uid }">作者：${blog.authorName }</a></td>
	                    <td><a href="showbloginfo.action?id=${blog.id }">标题：${blog.title }</a></td>
	                    <td><a href="showbloglist.action?type=3&kid=${blog.kid }">${blog.kindName }</a></td>
	                    <td>${blog.dateTime }</td>
	                    <td>${blog.clicks }</td>
					</tr>
				</c:forEach>					
        </table>
    </div>
  </body>
</html>
