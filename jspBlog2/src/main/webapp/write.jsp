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
<title>write</title>
</head>
<body>
	<form action="writeproc.jsp" method="get">
		글제목:<input name="title"><br>
		글작성자id:<input name="id"><br>
		글내용:<textarea name="content" rows="5" cols="50"></textarea><br>
		<input type="submit" value="글쓰기">
	</form>
</body>
</html>