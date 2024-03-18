<%@page import="com.dc.db.Dto"%>
<%@page import="java.util.ArrayList"%>
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
<link rel="stylesheet" href="list.css">
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
게시판-리스트
<hr>
<fieldset id="link">
	<legend>링크</legend>
	<a href='index.jsp'>홈페이지이동</a>
	<a href='write.jsp'>게시글쓰기</a>
</fieldset>
<hr>
글번호 | 제목 | 글내용 | 작성자
<hr>
<%
	Dao dao = new Dao();
	ArrayList<Dto> posts = null;
	for(int i=0;i<posts.size();i++){
%>
<%=posts.get(i).no %>
<a href="read.jsp?no=<%=posts.get(i).no %>"><%=posts.get(i).title %></a>
<%=posts.get(i).id %>
<hr>
<%} %>
</body>
</html>