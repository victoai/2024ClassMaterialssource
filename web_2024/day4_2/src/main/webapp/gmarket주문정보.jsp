<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

 

ul{
list-style:  none;
}

ul li{
    display: inline-block;  
 }
 

.pay_wrap{
   width:1200px;   
   margin: 28px auto;
   position: relative;     
   border:1px solid black;
}
  
  
.list_location{  
  position:absolute;
  right:0px;
  bottom: 20px;
}  
 
 
 .pay_wrap  h2{
    display: inline-block;
    font-size: 38px;
    line-height: 38px;
    font-family: Gmarket Sans, 'Gmarket Sans', sans-serif;
    font-weight: 500;
 }

</style>
</head>
<body>

<h2>Gmarket  주문정보 결재창 일부 </h2>

<div  class="pay_wrap">
		<h2>주문정보</h2>
		
		<ul class="list_location">
			<li>장바구니></li>
			<li>주문결재></li>
			<li>주문완료></li>		
		</ul>
</div>

 
</body>
</html>