<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 房租管理</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>房租管理</h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/rent/add.jsp">添加房租信息</a>
		</div>
	</div>
	<table class="list">
		<tr>
			<th>编号</th>
			<th>房屋编号</th>
			<th>租户编号</th>
			<th>缴纳金额</th>
			<th>缴纳时间</th>
			<th>备注</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${page.list}" var="l" >
		<tr>
			<td>${l.r_id}</td>
			<td>${l.house.h_id}</td>
			<td>${l.lessee.l_id}</td>
			<td>${l.r_money}</td>
		<td><fmt:formatDate value="${l.r_time}" pattern="yyyy年MM月dd HH:mm:ss"/> </td>
			<td>${l.r_remark}</td>
			
			<td>

				<a class="fa fa-remove" title="删除" href="${pageContext.request.contextPath}/RentDeleteServlet?r_id=${l.r_id}"></a>
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