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
		<a href='list.jsp'>리스트로 이동</a>
		<a href='index.jsp'>홈페이지로 이동</a>
<hr>
<%
	String readNo = request.getParameter("no");
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/board", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from cat_board where no="+readNo);	//sql문 조합.
		rs.next();
		String num = rs.getString("no");
		String title = rs.getString("title");
		String content = rs.getString("content");
		String id = rs.getString("id");
%>
		글번호:<%= num %><br>
		글제목:<%=title %><br>
		작성자id:<%=id %><br>
		글내용:<br>
		<%= content %> 		
<%
	} catch (Exception e) {		
		e.printStackTrace();
	}	
%>
	<hr>
	<a href='modify.jsp?no=<%= readNo %>'>글수정</a>
	<a href='del.jsp?no=<%= readNo %>'>글삭제</a>
</body>
</html>