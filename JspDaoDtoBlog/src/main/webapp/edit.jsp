<%@page import="com.example.dc.jsp.board.dto.BoardDto"%>
<%@page import="com.example.dc.jsp.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/common.css">
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
	<%
			BoardDto dto = (BoardDto)request.getAttribute("post");
			String category = request.getParameter("category");
	%>
	<form action="/board/edit_proc" method="get">
		<input name="category" type="hidden" value="<%=category %>">
		<input name="no" type="hidden" value="<%=dto.no%>">
		제목:<input name="title" value="<%=dto.title %>"><br>
		내용:<textarea name="content" rows="5" cols="40"><%=dto.content %></textarea><br>
		<input type="submit" value="글수정하기">
	</form>
</body>
</html>