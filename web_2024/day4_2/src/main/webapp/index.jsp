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
				<%
				Connection con = null;
				Statement st = null;
				ResultSet rs = null;
				try {
					String driver = "oracle.jdbc.driver.OracleDriver";
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "scott";
					String password = "tiger";

					//1. 오라클드라이버 로딩
					Class.forName(driver); //2. 데이터베이스 연결
					con = DriverManager.getConnection(url, user, password); //3. statement 얻어오기
					st = con.createStatement();
					//4. 필요한 sql 작성
					String sql = "select * from ticket_tbl";
					//5. 최종적으로 실행
					System.out.println(sql);
					rs = st.executeQuery(sql);
					//6. 가져온 쿼리 결과를 화면에 출력하기
					while (rs.next()) {
				%>
				<!-- db연동후 데이터 조회부분 -->
				<tbody>
					<tr>
						<td><%=rs.getString(1)%></td>
						<td><%=rs.getString(2)%></td>
						<td><%=rs.getString(3)%></td>
						<td><%=rs.getString(4)%></td>
						<td><%=rs.getString(5)%></td>
						<td><%=rs.getString(6)%></td>
					</tr>
				</tbody>
				<%
				}
				} catch (Exception e) {
				e.printStackTrace();
				} finally { //자원의 반납
				if (rs != null)
				rs.close();
				if (st != null)
				st.close();
				if (con != null)
				con.close();
				}
				%>
			</table>
		</div>
		<div>
			<img alt="" src="./img/r마스코드.png">
		</div>
	</section>
	<footer> </footer>
</body>
</html>