<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 房屋信息管理</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
	<h3>房屋信息管理</h3>
<table>
<tr>
<td>	<div>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/house/add.jsp">添加房屋信息</a>
		</div></td>
		<td>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  </td>
<td>
<form action="HouseSelectLikeServlet">
<select name="zd">
<option value="h_dq">地区</option>
<option value="h_xq">小区名</option>
<option value="h_zt">出租状态</option>
</select>
<input name="zfc">
<input type="submit">

</form>


</td>
</tr>

</table>

<div class="box">

	<div class="actions">
	
	</div>
	<table class="list">
		<tr>
			<th>房屋编号</th>
			<th>地区</th>
			<th>小区名</th>
			<th>单元号</th>
			<th>楼层</th>
			<th>房间号</th>
			<th>面积</th>
			<th>朝向</th>
			<th>装修</th>
			<th>是否双气</th>
			<th>限住人数</th>
			<th>配套设施</th>
			<th>价格</th>
			<th>出租状态</th>
			<th>地址</th>
			<th>添加时间</th>
			<th>修改时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${house}" var="h" >
		<tr>
			<td>${h.h_id}</td>
			<td>${h.h_dq}</td>
			<td>${h.h_xq}</td>
			<td>${h.h_dy}</td>
			<td>${h.h_lc}</td>
			<td>${h.h_fj}</td>
			<td>${h.h_mj}</td>
			<td>${h.h_cx}</td>
			<td>${h.h_zx}</td>
			<td>${h.h_sq}</td>
			<td>${h.h_xz}</td>
			<td>${h.h_pz}</td>
			<td>${h.h_jg}</td>
			<td>${h.h_zt}</td>
			<td>${h.h_dz}</td>
			<td><fmt:formatDate value="${h.h_tjsj}" pattern="yyyy年MM月dd日  HH:mm:ss"/></td>
			<td><fmt:formatDate value="${h.h_xgsj}" pattern="yyyy年MM月dd日  HH:mm:ss"/></td>
			<td>
				<a class="fa fa-info" title="详情" href="#"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="${pageContext.request.contextPath}/HouseFindByIdServlet?h_id=${h.h_id}"></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="${pageContext.request.contextPath}/HouseDeleteServlet?h_id=${h.h_id}"></a>
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