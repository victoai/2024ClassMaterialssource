<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>


<%

//jsp  내장객체 
// request, response , out 

//0. 넘어온 값들에 대해서 encoding
request.setCharacterEncoding("UTF-8");

//1. 넘어온 값들 꺼내기 

String receipt_id  =request.getParameter("receipt_id");
String ticket_id = request.getParameter("ticket_id");
String cus_id  = request.getParameter("cus_id");
String receipt_date  = request.getParameter("receipt_date");
String receipt_pay  = request.getParameter("receipt_pay");
String receipt_count  = request.getParameter("receipt_count");

System.out.println(receipt_id);
System.out.println(ticket_id);
System.out.println(cus_id);
System.out.println( receipt_date);
System.out.println( receipt_pay);
System.out.println(receipt_count);
//2. 데이터베이스에 연결하고  테이블에  insert 쿼리 실행하기 

 
	Connection con=null;
	PreparedStatement st = null;
	 
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
		String sql ="insert into receipt_tbl values(  receipt_seq.nextval ,?,?,?,?,?) "; 		
		st = con.prepareStatement(sql);
		
		
		 
		st.setString(1, ticket_id);
		st.setString(2, cus_id);	
		st.setString(3, receipt_date);
		st.setString(4, receipt_pay);
		st.setString(5, receipt_count);	 
		
	    st.executeUpdate();	 
	 
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납		 
		if( st != null) st.close();
		if( con != null) con.close();
	}


//3. 특정페이지로 재요청할 수 있도록 한다 (  웹브라우저가  sendRedirect("url") 응답받으면 다시 지정된  url로 자동요청한다.)
//   
   response.sendRedirect("a_finish.html");
%>


 