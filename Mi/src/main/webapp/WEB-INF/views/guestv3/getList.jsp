<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/resources/common.css" >
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href=""></a><a href="/">홈페이지이동</a>
<a href="/guestv3/write">새글 쓰기</a>
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
<c:forEach var="guestv3" items="${list}">
	<tr>
		<td>${guestv3.bno}</td>
		<td>${guestv3.b_id}</td>
		<td><a href="/guestv3/read?bno=${guestv3.bno}">${guestv3.b_title}</a></td>
		<td>${guestv3.b_hit}</td>
		<td>${guestv3.b_date}</td>
    </tr>
</c:forEach>
</table>
<hr>
<!-- 이전 블럭 링크 -->
<c:if test="${hasBlockPrev}" >
	<a href="/guestv3/getList?currentPage=${prevPage}">이전</b>
</c:if>

<!-- 페이지 링크 -->
<c:forEach var="i" begin="${blockStartPage}" end="${blockEndPage}">
[<a href="/guestv3/getList?currentPage=${i}">${i}<a>]	
</c:forEach>

<!-- 다음 블럭 링크 -->
<c:if test="${hasBlockNext}" >
	<a href="/guestv3/getList?currentPage=${nextPage}">다음</b>
</c:if>

</body>
</html>