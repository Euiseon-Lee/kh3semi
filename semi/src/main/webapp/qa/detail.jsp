<%@page import="semi.beans.QaDto"%>
<%@page import="semi.beans.QaDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int qaNo = Integer.parseInt(request.getParameter("qaNo"));
	QaDao qaDao = new QaDao();

	qaDao.plusReadcount(qaNo);//조회수 증가
	QaDto qaDto = qaDao.selectOne(qaNo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1><%=qaDto.getQaNo() %>번 게시글</h1>
	</div>
	
	<div>
		<table>
			<tr>
				<td>
					<h2>제목 : <%=qaDto.getQaTitle() %></h2>
				</td>
			</tr>
			<tr>
				<td>
					작성자 <%=qaDto.getQaWriter() %>
				</td>
			</tr>
			<tr>
				<td>
					작성일 <%=qaDto.getQaWritedate() %>
				</td>
			</tr>
			<tr>
				<td>
					조회수 <%=qaDto.getQaReadcount() %>
				</td>
			</tr>
			<tr height="250">
				<td>
					<pre><%=qaDto.getQaContent() %></pre>
				<td>
			</tr>
			
			<tr>
			<td align="right">
			<a href="write.jsp">글쓰기</a>
			<a href="write.jsp?superNo=<%=qaNo%>">답글</a>
			<a href="edit.jsp?qaNo=<%=qaNo%>">수정</a>
			<a href="delete.kh?qaNo=<%=qaNo%>">삭제</a>
			<a href="list.jsp">목록</a>
			</td>
			</tr>
	
		</table>
	</div>
</body>
</html>