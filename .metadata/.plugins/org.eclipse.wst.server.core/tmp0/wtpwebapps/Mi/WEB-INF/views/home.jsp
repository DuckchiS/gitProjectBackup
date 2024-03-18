<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
<link rel="stylesheet" href="/resources/common.css" >
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="/spring/test/getOnePlusTwo">1+2 결과 보러가기</a>
<hr>
<a href="/guest/getList">방명록</a>
<hr>
<a href="/guestv2/getList">방명록V2</a>
<hr>
<a href="/guestv3/getList">[방명록V3]</a>
<hr>
<a href="/fconline/fc">FC온라인 유저확인</a>
<hr>
<a href="/fconline/match">FC온라인 전적확인</a>
<a href="/fconline/user">FC온라인 테스트</a>
<hr>
<a href="${cp}/ajax/testapi">test api</a>
<a href="${cp}/api/catOne">고양이1</a>
<a href="${cp}/api/catTwo">고양이2</a>


</body>
</html>