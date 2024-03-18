<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/resources/common.css" >
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/guestv3/write" method="post">
		제목:<textarea rows="1" name='b_title'></textarea><br>
		내용:<textarea rows="3" name='btext'></textarea><br>
		<input type="submit" value="글쓰기">
	</form>
</body>
</html>