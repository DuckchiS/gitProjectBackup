<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<%@page import="com.dc.hello.Cat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cat cat = new Cat();
// 	Cat cat = null;
	System.out.println("콘솔로찍기:"+cat.name);
%>

<%=cat.name %>
<br>
<a href='index3.jsp'>index3페이지로 가기</a>
<br>
<a href='index4.jsp'>index4페이지로 가기</a>
<br>
<%
	request.setCharacterEncoding("UTF-8");	// 이거 안하면 한글 깨짐.
	String s = request.getParameter("tel");
	out.println(s);	// 1.이걸로 출력하거나
%>
<br>
<a href='index.html'>전화번호 입력</a>
<br>
입력한 전화번호:<%=s%><%-- 2. 이걸로 출력 --%>
<br>
<a href='index2.html'>index2페이지로 가기</a>
<br>
<a href='index5.jsp'>외부 특정 사이트 강제이동</a>
</body>
</html>