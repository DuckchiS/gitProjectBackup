<%@page import="com.example.dc.jsp.board.dto.BoardDto"%>
<%@page import="com.example.dc.jsp.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/common.css">
<meta charset="UTF-8">
<title>Read</title>
</head>
<body>
<%
	BoardDto d = (BoardDto)request.getAttribute("post");
	String category = request.getParameter("category");
	if(d != null){
%>
<hr>
	<a href='../index.jsp'>홈페이지이동</a>
	<a href='list?category=<%=d.b_category%>'>리스트이동</a>
<hr>
카테고리:<%=d.b_category %>
<%=d.no %>
<%=d.title %>
<%=d.id %>
<%=d.datetime %>
<hr>
<%=d.content %>
<hr>
<a href="edit?category=<%=d.b_category %>&no=<%=d.no%>">글수정</a>
<a href="del?category=<%=d.b_category %>&no=<%=d.no%>">글삭제</a>
<%
	}
%>
</body>
</html>