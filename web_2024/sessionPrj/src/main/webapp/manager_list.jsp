<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>manager_list</title>
<link href="./manager_list.css" rel="stylesheet"/>
</head>
<body>
	<header>
		<img alt="" src="./img/로고.png">
		<h2>🔵관리자 조회🔵</h2>
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
		<div class = "b">
		
		<!-- 바디 내용 -->
		<form>
		
			<table>
				
				<tr>
					<td>아이디</td>
					<td>이름</td>
					<td>전화번호</td>
					<td>나이</td>
					<td>관리</td>
				</tr>
			
			<%
	Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		//데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		 //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password);
		 //3. statement 얻어오기
		st = con.createStatement();
		 //4. 필요한 sql 작성
		String sql ="select * from t_customer"; //5. 최종적으로 실행
		rs = st.executeQuery( sql) ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		while( rs.next() ) {
%>
		<tr>
			<td> <%=rs.getString(1) %></td>
			<td> <%=rs.getString(2) %></td>
			<td> <%=rs.getString(3)%></td>
			<td> <%=rs.getString(4)%></td>
			<td> <a href="manager_updateForm.jsp?userid=<%=rs.getString(1) %>">수정</a>
		</tr>
			
			<%
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}

	
%>	
			
			</table>
		
		</form>
		
		
		
		
		</div>
		<div>
			<img alt="" src="./img/r마스코드.png">
		</div>
		</section>
	<footer>
	
	
	
	</footer>
</body>
</html>