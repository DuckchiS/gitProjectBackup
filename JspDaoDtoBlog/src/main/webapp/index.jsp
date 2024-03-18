<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/common.css">
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	jsp를 이용한 블로그 홈페이지
	<hr>
	<%
    HttpSession session2 = request.getSession(false);
    if (session != null && session.getAttribute("userId") != null) {
    	String userId = (String)session2.getAttribute("userId");
        // 로그인 되어 있는 경우
    %>
        <!-- 로그인 되어 있는 경우에 표시할 내용 -->
        <%= userId%>님 환영합니다!
        <a href="/member/logout">로그아웃</a> <!-- 로그아웃 링크 -->
    <%
    } else {
        // 로그인 되어 있지 않은 경우
    %>
        <!-- 로그인 되어 있지 않은 경우에 표시할 내용 -->
        <a href="/member/login">로그인</a> <!-- 로그인 링크 -->
        <a href="/member/signup">회원가입</a> <!-- 회원가입 링크 -->
    <%
    }
    %>
<fieldset>
	<legend>일반</legend>
	<a href="/board/list?category=free">자유게시판</a>
	<hr>
	<a href="/board/list?category=notice">공지게시판</a>
</fieldset>
<fieldset>
	<legend>게임</legend>
	<a href="/board/list?category=lol">롤</a>
	<hr>
	<a href="/board/list?category=dia2">디아2</a>
	<hr>
	<a href="/board/list?category=loa">로아</a>
	<hr>
	<a href="/board/list?category=bag">배그</a>
</fieldset>
<fieldset>
	<legend>커뮤니티</legend>
	<a href="/board/list?category=humor">유머</a>	
	<hr>
	<a href="/board/list?category=animal">동물</a>
	<hr>
	<a href="/board/list?category=plants">식물</a>
	<hr>
	<a href="/board/list?category=car">자동차</a>
	<hr>
	<a href="/board/list?category=politics">정치</a>
	<hr>
	<a href="/board/list?category=soccer">축구</a>
	<hr>
</fieldset>
</body>
</html>	