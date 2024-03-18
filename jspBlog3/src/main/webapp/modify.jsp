<%@page import="com.dc.db.Dao"%>
<%@page import="com.dc.db.Dto"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modify</title>
</head>
<body>
	<%
		String no = request.getParameter("no");
		Dao dao = new Dao();
		Dto dto = dao.read(no);
	%>
	<form action="modifyProc.jsp">
		<input name="no" type="hidden" value="<%=no%>">
		제목:<input name="title" value="<%=dto.title %>"><br>
		내용:<textarea name="content" rows="5" cols="40"><%=dto.content %></textarea><br>
		<input type="submit" value="글수정하기">
	</form>
</body>
</html>