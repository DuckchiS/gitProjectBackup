<%@page import="java.util.ArrayList"%>
<%@page import="com.dc.hello.Cat" %>
<%@page errorPage="error.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello world!
	<br>
	<% for(int i=0;i<3;i++){%>
		<img alt="고양이" src="cat.jpg" id=cat>
	<%} %>
	<br>
	<% ArrayList ss = new ArrayList<>();
		ss.add(0, "고양이");
		ss.add(1, "강아지");
		ss.add(2, "너굴맨");
	%>
	<% for(int i=0;i<ss.size();i++){%>
		<%= ss.get(i)  %>
	<%} %>
	<br>
	<%
		Cat cat1 = new Cat();
	%>
	<%= cat1.name %>
</body>
</html>