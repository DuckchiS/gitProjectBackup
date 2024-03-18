<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/common.css" >
<title>Insert title here</title>
</head>
<body>
<a href=""></a><a href="/">홈페이지이동</a>
<hr>
<table>
	<tr>
		<td>글번호</td>
		<td>아이디</td>
		<td>글내용</td>
		<td>조회수</td>
		<td>작성시간</td>
	</tr>
<!-- jstl 로 처리하면 더 짧게 가능 -->
<c:forEach var="guestv2" items="${list}">
	<tr>
		<td>${guestv2.bno}</td>
		<td>${guestv2.b_id}</td>
		<td><a href="/guestv2/read?bno=${guestv2.bno}">${guestv2.btext}</a></td>
		<td>${guestv2.b_hit}</td>
		<td>${guestv2.b_date}</td>
    </tr>
</c:forEach>

</table>

<a href="/guestv2/write">새글 쓰기</a>
</body>
</html>