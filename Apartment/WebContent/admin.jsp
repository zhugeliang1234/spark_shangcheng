<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 后台管理</title>
	<link rel="stylesheet" href="css/admin.css">
	<link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="header">
	<h1><a href="#">XX系统</a></h1>

	<div class="user">
		<a href="#">欢迎${sessionScope.username}</a>
		<a href="login.jsp">退出</a>
	</div>
</div>
<div class="main">
	<ul class="left-side">
		<li class="menu-title active">
			<a href="#">
				<i class=" fa fa-users"></i>&nbsp;&nbsp;公寓管理
			</a>
		</li>
		<li class="sub-menu">
			<ul>
				<li class="active">
					<a href="HouseSelectWithPageServlet"  target="pageBox">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房屋信息
					</a>
				</li>
				<li>
					<a href="#">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;租赁合同
					</a>
				</li>
				<li>
					<a href="LesseeSelectServlet">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;租户信息
					</a>
				</li>
				<li>
					<a target="pageBox" href="RentSelectServlet">
					<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;房租信息
					</a>
				</li>

			</ul>
		</li>
		<li class="menu-title">
			<a href="#">
				<i class=" fa fa-file-text"></i>&nbsp;&nbsp;服务管理
			</a>
		</li>
		<li class="sub-menu">
			<ul>
				<li>
					<a target="pageBox" href="">
						<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;后勤人员
					</a>
				</li>
				<li>
					<a target="pageBox" href="">
					<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;修缮记录
					</a>
				</li>
				<li>
					<a target="pageBox" href="">
					<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;公寓活动
					</a>
				</li>

			</ul>
		</li>
		<li class="menu-title">
			<a href="#" >
				<i class=" fa fa-sitemap"></i>&nbsp;&nbsp;管理员
			</a>
		</li>
		<li class="sub-menu">
			<ul class="menu">
				<li>
					<a target="pageBox" href="">
					<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;角色管理
					</a>
				</li>
				<li>
					<a target="pageBox" href="${pageContext.request.contextPath}/UserSelectAllServlet">
					<i class=" fa fa-circle-thin"></i>&nbsp;&nbsp;用户管理
					</a>
				</li>

			</ul>
		</li>
	</ul>
	<div class="right-side">
		<iframe name="pageBox"  src="${pageContext.request.contextPath}/image/2.jpg"></iframe>
		<div class="footer">
			智游教育 ©2018 河南智游臻龙教育科技有限公司
		</div>
	</div>
</div>
<script src="lib/jquery/jquery.js"></script>
<script src="js/admin.js"></script>
</body>
</html>