<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 房租信息添加</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>添加房租信息</h3>
	<form action="${pageContext.request.contextPath}/RentAddServlet" method="post">
	<table class="form-table">
		<tr>
			<td>房屋编号</td>
			<td colspan="3" class="control">
				<input type="text" name="h_id" placeholder="房屋编号">
			</td>
		</tr>
		<tr>
			<td>租户编号</td>
			<td colspan="3" class="control">
				<input type="text" name="l_id" placeholder="租户编号">
			</td>
		</tr>

		<tr>
			<td>缴纳房租额</td>
			<td colspan="3" class="control">
				<input type="text" name="r_money" placeholder="缴纳房租额">
			</td>
		</tr>
		<tr>
			<td>备注</td>
			<td colspan="3" class="control">
			<textarea  name="r_remark" placeholder="备注"></textarea>
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