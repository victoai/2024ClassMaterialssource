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
	width: 1890px;
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
a{
	color: black;
	text-decoration: none;
}
a:hover{
	color: skyblue;
}
ul>li {
	padding: 10px;
	display: inline-block;
}

.b {
	width: 60%;
	magin: 0 auto;
}

table {
	margin: 0 auto;
	width: 600px;
	height: 400px;
	border: 1px solid #8e582a;
	background-color: #f5e2b1;
	margin-bottom: 100px;
}

td {
	width: 300px;
	border: 1px solid #8e582a;
	background-color: #f5e2b1;
}
td:nth-child(1) {
	text-align: center;
}
td:nth-child(2) {
	padding-left: 10px; 
}
</style>
<script>
	function check() {
		//return false;
		let receipt_id = document.receipt_id;
		let ticket_id = frm.ticket_id;
		let cus_id = frm.cus_id;
		let receipt_date = frm.receipt_date;
		let receipt_pay = frm.receipt_pay;
		let receipt_count = frm.receipt_count;

		if (receipt_id.value == "") {
			alert("영수증번호입력");
			receipt_id.focus();
			return false;
		} else if (ticket_id.value == "") {
			alert("티켓번호입력");
			ticket_id.focus();
			return false;
		} else if (cus_id.value == "") {
			alert("고객번호입력");
			cus_id.focus();
			return false;
		} else if (receipt_date.value == "") {
			alert("결제날짜입력");
			receipt_date.focus();
			return false;
		} else if (receipt_pay.value == "") {
			alert("결제방식입력");
			receipt_pay.focus();
			return false;
		} else if (receipt_count.value == "") {
			alert("구매장수입력");
			receipt_count.focus();
			return false;
		} 
		return true;

	}
</script>
</head>
<body>
	<header>
		<img alt="" src="./img/로고.png">
		<h2>🔵매표소 : 결제하기🔵</h2>
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
			<section>
				<form name="frm" action="결제하기_action.jsp" method="post"
					onsubmit="return check()">
					<table>
						<caption>
							<h2>결제하기</h2>
						</caption>

						<tr>
							<td>영수증번호</td>
							<td> </td>
						</tr>
						<tr>
							<td>티켓번호</td>
							<td><input type="text" name="ticket_id"></td>
						</tr>
						<tr>
							<td>고객번호</td>
							<td><input type="text" name="cus_id"></td>
						</tr>
						<tr>
							<td>결제날짜</td>
							<td><input type="text" name="receipt_date"></td>
						</tr>
						<tr>
							<td>결제방식</td>
							<td><select name="receipt_pay">
									<option value="선택하기">선택하기</option>
									<option value="현금">현금</option>
									<option value="카드">카드</option>
									<option value="카카오페이">카카오페이</option>
									<option value="네이버페이">네이버페이</option>
							</select></td>
						</tr>
						<tr>
							<td>구매장수</td>
							<td><input type="text" name="receipt_count"></td>
						</tr>
						<tr>

							<td colspan="2">

								<button>결제하기</button>

								<button>
									<a href="index.jsp">돌아기기</a>
								</button>

							</td>
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