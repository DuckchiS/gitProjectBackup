<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="common.css">
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
게시판-리스트
<hr>
<a href='index.jsp'>리스트이동</a>
<a href='write.jsp'>게시글쓰기</a>
<hr>
글번호 | 제목 | 글내용 | 작성자
<br>
<%
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/board", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from cat_board2");
		while(rs.next()){
			String no = rs.getString("no");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String id = rs.getString("id");
%>
			<%= no %> <a href='read.jsp?no=<%= no %>'><%= title %></a> <%= id %><br>
<%	
		}
	} catch(Exception e){
		e.printStackTrace();
	}
%>
<hr>
</body>
</html>