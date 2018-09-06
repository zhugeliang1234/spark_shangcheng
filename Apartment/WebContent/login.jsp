<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<%
String path =request.getContextPath()+"/";
%>
<head>
<base href="<%=path%>">
	<meta charset="UTF-8">
	<title>公寓管理系统 - 登录页面</title>
	<link rel="stylesheet" href="css/index.css">
	<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
</head>
<body>
<div class="login">
	<img src="image/logo.png" alt="智游">
	<p>公寓管理系统</p>
	<form action="UserLoginServlet" method="post" onsubmit="return check()">
	<div>
	
		账号：<input type="text" id="username" name="username" placeholder="6-18位字母开头" onchange="check1(this)"><span id="s1"></span>
	</div>
	<div>
	<input type="hidden" value="sad">
		密码：<input type="password" id="password" name="password"  placeholder="6-18位字母开头" onchange="check2(this)"><span id="s2"></span>
	</div>
	<div>
		<p class="error-message">${tip1}</p>
		<input type="submit" value="登录">
	</div>
	</form>
</div>
<script type="text/javascript">
var a=false;
var b=false;
function check1(obj){
	var res=/^[a-zA-Z][\w]{5,17}$/;
	if(res.test(obj.value)){
	a=true;
		document.getElementById("s1").innerHTML="<font color=blue>ok</font>";
	}else{
		document.getElementById("s1").innerHTML="<font color=red>notok<font>";
	
	}
	
}
function check2(obj){
	var res=/^[a-zA-Z][\w]{5,17}$/;
	if(res.test(obj.value)){
		b=true;
		document.getElementById("s2").innerHTML="<font color=blue>ok</font>";
	
	}else{
		document.getElementById("s2").innerHTML="<font color=red>notok<font>";
		
	}
	
}

function check(){
if(a==true&&b==true){
	return true;
}else{
return false;
}
}
</script>
</body>
</html>