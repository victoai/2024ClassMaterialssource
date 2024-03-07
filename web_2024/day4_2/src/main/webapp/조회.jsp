<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
}

table {
	margin: 0 auto;
	width: 350px;
	height: 150px;
	border: 1px solid skyblue;
	margin-bottom: 300px;
}

td {
	text-align: center;
	border: 1px solid skyblue;
}
a{
	color: black;
	text-decoration: none;
}
a:hover{
	color: skyblue;
}
</style>

 <script>
 
  function a(){
	   
	  let  userid  = document.querySelector("#userid").value;	  
	  window.location.href="조회_action.jsp?userid="+ userid;
	  
  }
 </script>

</head>
<body>
	<header>
		<img alt="" src="./img/로고.png">
		<h2>🔵매표소 : 표 정보🔵</h2>
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
			<form name="frm" action="조회_action.jsp" method="post"
				onsubmit="return check()">
				<table>

					<caption>
						<h1>🧿&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp🧿</h1>
					</caption>
					<tr>
						<td>아이디 입력</td>
					</tr>
					<tr>
						<td><input type="text"   id="userid"></td>
					</tr>
					<tr>
						<td><button><a href="javascript:a()">입력완료</a></button></td>
					</tr>

				</table>
			</form>
			
		</div>
		<div>
			<img alt="" src="./img/r마스코드.png">
		</div>
	</section>
	<footer> </footer>
</body>
</html>