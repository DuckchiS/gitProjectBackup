<%@page import="com.peisia.dc.Dto"%>
<%@page import="com.peisia.dc.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
</head>
<body>
	<%
		String no = request.getParameter("no");
		Dao dao = new Dao();
		Dto dto = dao.read(no);
	%>
	<form action="editProc.jsp">
		<input name="no" type="hidden" value="<%=no%>">
		제목:<input name="title" value="<%=dto.title %>"><br>
		내용:<textarea name="content" rows="5" cols="40"><%=dto.content %></textarea><br>
		<input type="submit" value="글수정하기">
	</form>
</body>
</html>