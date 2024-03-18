<%@page import="com.peisia.dc.Dto"%>
<%@page import="com.peisia.dc.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="common.css">
<meta charset="UTF-8">
<title>Read</title>
</head>
<body>
	<hr>
		<a href='index.jsp'>홈페이지이동</a>
		<a href='list.jsp'>리스트이동</a>
	<hr>
	<%
		String no = request.getParameter("no");
		Dao dao = new Dao();
		Dto d = dao.read(no);
	%>
	<%=d.no %>
	<%=d.title %>
	<%=d.id %>
	<%=d.datetime %>
	<hr>
	<%=d.content %>
	<hr>
	<a href="edit.jsp?no=<%=no%>">글수정</a>
	<a href="del.jsp?no=<%=no%>">글삭제</a>
</body>
</html>