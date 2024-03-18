<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/common.css" >
<title>Insert title here</title>
</head>
<body>

글 읽기
<hr>
글번호:${read.bno}
아이디:${read.b_id}
조회수:${read.b_hit} 
작성시간:${read.b_date}
수정시간:${read.b_update}
<hr>
글내용:${read.btext}
<hr>
<a href="/guestv3/del?bno=${read.bno}">글 삭제</a>
<a href="/guestv3/modify?bno=${read.bno}">글 수정</a>
<a href="/guestv3/getList">글 리스트</a>
</body>
</html>