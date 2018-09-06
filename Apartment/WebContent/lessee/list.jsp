<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 租户管理</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>租户管理</h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/lessee/add.jsp">添加租户</a>
		</div>
	</div>
	<table class="list">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>电话</th>
			<th>性别</th>
			<th>籍贯</th>
			<th>身份证号</th>
			<th>添加时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${page.list}" var="l" >
		<tr>
			<td>${l.l_id}</td>
			<td>${l.l_name}</td>
			<td>${l.l_tel}</td>
			<td>${l.l_sex}</td>
			<td>${l.l_home}</td>
			<td>${l.l_card}</td>
			<td><fmt:formatDate value="${l.l_addtime}" pattern="yyyy年MM月dd HH:mm:ss"/> </td>
			<td>
				<a class="fa fa-info" title="详情" href="#"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="${pageContext.request.contextPath}/LesseeFindByIdServlet?l_id=${l.l_id}"></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="${pageContext.request.contextPath}/LesseeDeleteServlet?l_id=${l.l_id}"></a>
			</td>
		</tr>
		</c:forEach>
	</table>
		<c:choose >
	<c:when test="${page.currentPage<=1}">
	
		<a href="#">上一页</a>
	</c:when>
	
	<c:otherwise>
<a href="${pageContext.request.contextPath}/LesseeSelectServlet?page=${page.currentPage-1}">上一页</a>
	</c:otherwise>
	</c:choose>
	 ${page.currentPage}/${page.pageCount}
		<c:choose >
	<c:when test="${page.currentPage>=page.pageCount}">
		
	<a href="#">下一页</a>
	</c:when>
	
	<c:otherwise>
<a href="${pageContext.request.contextPath}/LesseeSelectServlet?page=${page.currentPage+1}">下一页</a>
	</c:otherwise>
	</c:choose>
	
	</div>
<script src="p1-flats/lib/jquery/jquery.js"></script>
<script>

</script>
</body>
</html>