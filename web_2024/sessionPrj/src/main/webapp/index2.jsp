<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@  page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	padding: 0px;
	margin: 0px;
}

body {
	margin: 0 auto;
	width: 1890px;
	border: 5px solid skyblue;
}

header {
	text-align: center;
	margin: 0 auto;
	width: 285px;
}

section div {
	display: inline-block;
}

ul {
	list-style: none;
	width: 500px;
}

ul>li {
	padding: 10px;
	display: inline-block;
}

.b {
	width: 60%;
	padding: 10px;
}
a{
	color: black;
	text-decoration: none;
}
a:hover{
	color: skyblue;
}
table {
	margin: 0 auto;
	width: 900px;
	border: 1px solid #8e582a;
	background-color: #f5e2b1;
}

td {
	border: 1px solid #8e582a;
	text-align: center;
}

thead {
	background-color: #f5e2b1;
}

thead>tr>td {
	height: 32px;
}

tbody {
	background-color: white;
}

tbody>tr>td {
	height: 28px;
}
</style>
</head>
<body>
	<header>
		<img alt="" src="./img/로고.png">
		<h2>🔵매표소 : 티켓 정보🔵</h2>
	</header>
	<nav>
		<hr>
		<ul>
			<li><a href="register.jsp">회원가입</a></li>
			<li><a href="결제하기.jsp">결제하기</a></li>
			<li><a href="조회.jsp">사용자조회</a></li>
			<li><a href="manager_list.jsp">관리자조회</a></li>
			<li><a href="index.jsp">홈으로</a></li>
		</ul>
		<hr>
	</nav>
	<section>
		<div>
			<img alt="" src="./img/l마스코드.png">
		</div>
		<div class="b">
			<table>
	
				<thead>
					<tr>
						<td>티켓번호</td>
						<td>티켓종류</td>
						<td>티켓이용시간 종류</td>
						<td>티켓이용시간</td>
						<td>나이</td>
						<td>가격</td>
					</tr>
				</thead>
			 
			</table>
		</div>
		<div>
			<img alt="" src="./img/r마스코드.png">
		</div>
	</section>
	<footer> </footer>
</body>
</html>