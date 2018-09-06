<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 房屋信息修改</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>修改房屋信息</h3>
	<form action="${pageContext.request.contextPath }/HouseUpdateServlet" method="post">
	<table class="form-table">
<tr>
			<td>编号</td>
			<td colspan="3" class="control">
				<input type="text" name="id" value="${house.h_id}">
			</td>
		</tr>
		<tr>
			<td>地区</td>
			<td colspan="3" class="control">
				<input type="text" name="dq" value="${house.h_dq}">
			</td>
		</tr>
		<tr>
			<td>小区名字</td>
			<td colspan="3" class="control">
				<input type="text" name="xq" value="${house.h_xq}">
			</td>
		</tr>
		<tr>
			<td>单元号</td>
			<td colspan="3" class="control">
				<input type="text" name="dy" value="${house.h_dy}">
			</td>
		</tr>
		<tr>
			<td>楼层</td>
			<td colspan="3" class="control">
				<input type="text" name="lc" value="${house.h_lc}">
			</td>
		</tr>
		<tr>
			<td>房间号</td>
			<td colspan="3" class="control">
				<input type="text" name="fj" value="${house.h_fj}">
			</td>
		</tr>
		<tr>
			<td>面积（平米）</td>
			<td colspan="3" class="control">
				<input type="text" name="mj" value="${house.h_mj}">
			</td>
		</tr>
		<tr>
			<td>朝向</td>
			<td colspan="3" class="control">
				<input type="text" name="cx" value="${house.h_cx}">
			</td>
		</tr>
		<tr>
			<td>装修</td>
			<td colspan="3" class="control">
				<input type="text" name="zx" value="${house.h_zx}">
			</td>
		</tr>
		<tr>
			<td>是否双气</td>
			<td colspan="3" class="control">
				<input type="text" name="sq" value="${house.h_sq}">
			</td>
		</tr>
		<tr>
			<td>限住人数</td>
			<td colspan="3" class="control">
				<input type="text" name="xz" value="${house.h_xz}">
			</td>
		</tr>
		<tr>
			<td>配套设施</td>
			<td colspan="3" class="control">
				<input type="text" name="pz" value="${house.h_pz}">
			</td>
		</tr>
		<tr>
			<td>出租价格（元/月）</td>
			<td colspan="3" class="control">
				<input type="text" name="jg" value="${house.h_jg}">
			</td>
		</tr>
		<tr>
			<td>出租状态</td>
			<td colspan="3" class="control">
				<select name="zt">
				<option>${house.h_zt}</option>
				<option>停止出租</option>
					<option>已出租</option>
					<option>未出租</option>
				</select>
			</td>
		</tr>
			<td>完整地址信息</td>
			<td colspan="3" class="control">
				<input type="text" name="dz" value="${house.h_dz}">
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