<%@page import="com.peisia.spring.dto.GuestDtoV3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/common.css" >
<title>Insert title here</title>
</head>
<body>
<%
	GuestDtoV3 read = (GuestDtoV3)request.getAttribute("read");
	long bno = read.getBno();
	String btext = read.getBtext();
%>	

글번호:<%=bno %><br>
글내용:	
	
	<form action="/guestv3/modify" method="post">
		<input type="hidden" name='bno' value='<%=bno %>' >
		<textarea name='btext'>
			<%=btext %>
		</textarea>
		<input type="submit" value="수정하기">
	</form>
</body>
</html>