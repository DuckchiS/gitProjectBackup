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
<title>Modify</title>
</head>
<body>
<hr>
<%
	String editNo = request.getParameter("no");
	String title = "";
	String content = "";
	String id = "";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/board", "root", "root");
		Statement st = con.createStatement();
		String sql = "select * from cat_board2 where no="+editNo;
		System.out.println("==== 전송하려는 sql:" + sql);
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		title = rs.getString("title");
		content = rs.getString("content");
		id = rs.getString("id");
	} catch(Exception e){
		e.printStackTrace();
	}
%>
<form action="modifyproc.jsp" method="get">
	<input name="no" type="hidden" value=<%=editNo%>>
	제목:<input name="title" value="<%=title %>"><br>
	내용:<textarea name="content" rows="5" cols="40"><%=content %></textarea><br>
	작성자id<input name="id" value="<%=id %>"><br>
	<input type="submit" value="글수정하기">
</form>
</body>
</html>