<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/reserve.css" rel="stylesheet" />
</head>
<body>
	<%@ include file="nav.jsp"%>


	<form name="frm" action="reserve_action.jsp" method="post"
		onsubmit="return check()">
		<table>
			<caption>
				<strong>CGV 예매</strong>
			</caption>
			<tr>
				<td>예약번호</td>
				<td><input type="text" name="R_NUM"></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="ID"></td>
			</tr>
			<tr>
				<td>영화정보</td>
				<td><select name="M_CODE">
						<option value="선택하기">영화선택</option>
						<option value="010">Avengers: Endgame | 09:00~12:00 |
							13000원</option>
						<option value="020">Avengers: Endgame | 15:00~18:00|
							13000원</option>
						<option value="030">Avengers: Endgame | 21:00~24:00 |
							13000원</option>
						<option value="011">Avengers: Endgame1 | 09:00~12:00 |
							11000원</option>
						<option value="111">Avengers: Endgame1 | 15:00~18:00 |
							11000원</option>
						<option value="211">Avengers: Endgame1 | 21:00~24:00 |
							11000원</option>
						<option value="012">Avengers: Endgame2 | 09:00~12:00 |
							12000원</option>
						<option value="112">Avengers: Endgame2 | 21:00~24:00 |
							12000원</option>
						<option value="212">Avengers: Endgame2 | 09:00~12:00 |
							12000원</option>
						<option value="013">엘리멘탈 | 09:00~12:00 | 10000원</option>
						<option value="113">엘리멘탈 | 21:00~24:00 | 10000원</option>
						<option value="213">엘리멘탈 | 09:00~12:00 | 10000원</option>
						<option value="014">쏘우 | 09:00~12:00 | 15000원</option>
						<option value="114">쏘우 | 21:00~24:00 | 15000원</option>
						<option value="214">쏘우 | 09:00~12:00 | 15000원</option>

				</select></td>
			</tr>
			<tr>
				<td>예매수량</td>
				<td><input type="text" name="O_CNT"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button>등록</button>
					<button>
						<a href="reserve.jsp">다시입력</a>
					</button>

				</td>


			</tr>
		</table>
	</form>
	<%@ include file="section.jsp"%>
</body>
</html>