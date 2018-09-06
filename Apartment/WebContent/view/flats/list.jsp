<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 房屋信息管理</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>房屋信息管理  </h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="add.jsp">添加房屋信息</a>
		</div>
	</div>

	<table class="list">
		<tr>
			<th>序号</th>
			<th>所属地区</th>
			<th>所属小区</th>
			<th>单元号</th>
			<th>所属楼层</th>
			<th>房间号</th>
			<th>面积</th>
			<th>朝向</th>
			<th>限住人数</th>
			<th>出租价格(元)</th>
			<th>出租状态</th>
			<th>操作</th>
		</tr>
		<tr>
			<td>1</td>
			<td>经开区</td>
			<td>富田太阳城</td>
			<td>2</td>
			<td>10</td>
			<td>1002</td>
			<td>120</td>
			<td>南北</td>
			<td>3</td>
			<td>2000</td>
			<td>未出租</td>
			<td>
				<a class="fa fa-info" title="详情" href="detail.html"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="edit.html"></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="#" onclick="confirmDelete(1)"></a>
			</td>
		</tr>
	</table>
	<div class="pager-info">
		<div>共有 1 条记录，第 1/1 页 </div>
		<div>
			<ul class="pagination">
				<li class="paginate_button previous disabled }">
				<a href="#">上一页</a>
				</li>
				<li class="paginate_button active"><a href="#">1</a></li>
				<li class="paginate_button next disabled">
				<a href="#">下一页</a>
				</li>
			</ul>
		</div>
	</div>
</div>
<script src="${pageContext.request.contextPath }/lib/jquery/jquery.js"></script>
<script>
function confirmDelete(id){
	if (confirm("确定要删除码？")) {
		alert('发送删除请求，刷新页面（不要异步）');
	}
	return false;
}
</script>
</body>
</html>