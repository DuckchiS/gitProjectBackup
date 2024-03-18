<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Taste</title>
</head>
<body>
	<%
		Cookie [] cookies = request.getCookies();
		System.out.println("쿠키길이:"+cookies.length);
		if(cookies != null){
			for(int i=0;i<cookies.length;i++){
				if(cookies[i].getName().equals("myCookie")){
	%>
					쿠키이름: <%=cookies[i].getName() %>
					쿠키값: <%=cookies[i].getValue() %>
	<% 
				}
			}
		}
	%>
</body>
</html>