<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 用户管理</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>用户管理</h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/user/add.jsp">添加用户</a>
		</div>
	</div>
	<table class="list">
		<tr>
			<th>序号</th>
			<th>账号</th>
			<th>密码</th>
			<th>姓名</th>
			<th>电话</th>
			<th>性别</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list}" var="u" varStatus="status" >
		<tr>
			<td>${status.count}</td>
			<td>${u.u_username}</td>
			<td>${u.u_password}</td>
			<td>${u.u_name}</td>
			<td>${u.u_tel}</td>
			<td>${u.u_sex}</td>
			<td>
				<a class="fa fa-info" title="详情" href="#"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="#"></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="${pageContext.request.contextPath}/UserDeleteServlet?u_id=${u.u_id}"></a>
			</td>
		</tr>
		</c:forEach>
	</table>
	</div>
<script src="p1-flats/lib/jquery/jquery.js"></script>
<script>

</script>
</body>
</html>