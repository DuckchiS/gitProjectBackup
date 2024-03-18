<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cook</title>
</head>
<body>
	<%
		String cookieName = "myCookie";
		Cookie cookie = new Cookie(cookieName,"apple");
		cookie.setMaxAge(60);
		/* cookie.setValue("melon"); */
		response.addCookie(cookie);
	%>
	cookie는 구워졌고
	cookie의 내용은 <a href="tasteCookie.jsp">여기로</a>
</body>
</html>