<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>

<style>

.yy{
   background-color: red;
}</style>
</head>
<body>


<%

   String result =(String) request.getAttribute("a");
   if( result!=null){
	   
	   
	   //실패했을 떄
	   if( result.equals("a")){
%>
	    
	    <script>
	    
	    $(document).ready( function(){
	   	 $(".id").focus( function(){
    		 
    		 $(".id").addClass("yy");
    		 
    	 });
	   	 
	   	 
	    	 $(".id").focus();
	    
	    	 
	    	 
	    
	    });
	    
	    
	    </script> 	   
		   
<%		 
	   }else{
		   
	   }
   }
%>

<form  action="/a/login" method="post">
<input type="text"  name="id" class="id">
<button>로그인</button>
</form>
</body>
</html>