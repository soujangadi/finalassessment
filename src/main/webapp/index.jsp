<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.menu{
	width:100%;
	max-width:100%;
	height:50px;
	background-color:#000;
}

ul{
	list-style-type:none;
	display:flex;
	background-color:#000;
}

li{
	margin-left:20px;
	padding:30px;
}
li a{
color:#fff;
text-decoration:none;
}

li a:hover{
color:#ff6600;
text-decoration:none;
}

li a:visited{
color:#fff;
text-decoration:none;
}

</style>
</head>
<body>
<div class="menu">
<ul>
<li><a href="empform">New Employee</a></li>
<li><a href="Viewemp">View Employee</a></li>

</ul>
</div>

</body>
</html>