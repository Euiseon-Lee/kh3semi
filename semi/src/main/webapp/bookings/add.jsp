<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//현재 날짜 구하기
	LocalDate today = LocalDate.now();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 정보 받는 jsp(타입,체크인아웃)</title>
</head>  
<body>  
	<h1>원하시는 객실 타입, 체크in-out날짜를 입력해주세요</h1>
	<form action = "possibleRooms.jsp" method = "get">
	<div>
		<label>객실 타입</label>
		<select name = "bookingRoomType">
			<option>스탠다드</option>
			<option>디럭스</option>
			<option>프리미어</option>
			<option>스위트</option>
		</select>
	</div>
	
	<div>
			<label>체크인</label>
		<input type = "date" name = "bookingCheckIn" required min = "<%=today%>">		 
	</div>
	
	<div>
		<label>체크아웃</label>
		<input type = "date" name = "bookingCheckOut" required min = "<%=today%>">		 
	</div>
	<div>
		<input type ="submit" value = "다음">
	</div>
	</form>
	
</body>
</html>