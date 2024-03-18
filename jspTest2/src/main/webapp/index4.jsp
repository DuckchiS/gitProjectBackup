<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href='index.jsp'>index로 가기</a>
<br>
<jsp:forward page="common.jsp">	
	<jsp:param name="x" value="11" />
	<jsp:param name="y" value="22" />
</jsp:forward>
<br>
개2
</body>
</html>