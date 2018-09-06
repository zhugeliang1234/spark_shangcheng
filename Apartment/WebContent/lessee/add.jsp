<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 用户信息添加</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>添加用户信息</h3>
	<form action="${pageContext.request.contextPath}/LesseeAddServlet" method="post">
	<table class="form-table">
		<tr>
			<td>姓名</td>
			<td colspan="3" class="control">
				<input type="text" name="name" placeholder="姓名">
			</td>
		</tr>
		<tr>
			<td>电话</td>
			<td colspan="3" class="control">
				<input type="text" name="tel" placeholder="电话">
			</td>
		</tr>
		<tr>
			<td>性别</td>
			<td colspan="3" class="control">
				<select name="sex">
				<option>男</option>
				<option>女</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>籍贯</td>
			<td colspan="3" class="control">
				<input type="text" name="home" placeholder="籍贯">
			</td>
		</tr>
		<tr>
			<td>身份证号</td>
			<td colspan="3" class="control">
				<input type="text" name="card" placeholder="身份证号">
			</td>
		</tr>
	</table>
	<div class="buttons">
		<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
		<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
	</div>
	</form>
</div>
</body>
</html>