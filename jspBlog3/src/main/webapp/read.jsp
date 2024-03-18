<%@page import="com.dc.db.Dto"%>
<%@page import="com.dc.db.Dao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
<hr>
<%=d.content %>
<hr>
<a href="modify.jsp?no=<%=no%>">글수정</a>
<a href="del.jsp?no=<%=no%>">글삭제</a>
</body>
</html>