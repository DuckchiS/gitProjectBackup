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
	<jsp:param name="x" value="1" />
	<jsp:param name="y" value="2" />
</jsp:forward>
<!-- forword 사용시 그 뒤에 내용들은 출력안됨 -->
<br>
개1
</body>
</html>