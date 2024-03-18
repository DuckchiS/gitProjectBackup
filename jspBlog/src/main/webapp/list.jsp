<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
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
<a href="index.jsp">홈으로 이동</a><br>
<a href='write.jsp'>게시글 쓰기</a>
<hr>
글번호 | 제목 | 글내용 | 작성자id
<hr>
<%

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/board", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from cat_board");
		while(rs.next()){
					String num = rs.getString("no");
					String title = rs.getString("title");
					String content = rs.getString("content");
					String id = rs.getString("id");

%>
					<%=num %> <a href="read.jsp?no=<%=num %>"><%=title %></a> <%=id %><br>
<%				
		}
	} catch (Exception e) {		
		e.printStackTrace();
	}	
%>
</body>
</html>