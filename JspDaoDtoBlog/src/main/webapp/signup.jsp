<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/common.css">
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>
	<hr>
	회원가입
	<br>
	<a href="/">홈으로가기</a>
	<hr>
	<form action="/member/signup" method="post">
		이름: <input name="name" placeholder="이름"><br>
		아이디: <input name="id" placeholder="아이디"><br>
		비밀번호: <input name="pw" placeholder="암호" type="password"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>