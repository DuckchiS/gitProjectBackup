<%@page import="com.dc.db.Dao"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String delNo = request.getParameter("no");
	Dao dao = new Dao();
	dao.del(delNo);
	response.sendRedirect("list.jsp");
%>

</body>
</html>