<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

글 읽기
<hr>
글번호:${read.bno}
<hr>
글내용:${read.btext}
<hr>
<a href="/guest/del?bno=${read.bno}">글 삭제</a>
<a href="/guest/modify?bno=${read.bno}">글 수정</a>
<a href="/guest/getList">글 리스트</a>

</body>
</html>