<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="w01.Book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문제바꾸기</title>
</head>
<body>



	<h2>객체정보 제공하기</h2>

	<%
	Book book = new Book("김진명", "떠돌이 을불  고구려1", 14420);	 
	out.println(book.toString());
	%>

</body>
</html>