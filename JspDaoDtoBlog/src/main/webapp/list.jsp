<%@page import="com.example.dc.jsp.board.BoardListProcessor"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.example.dc.jsp.board.Board"%>
<%@page import="com.example.dc.jsp.board.dto.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.example.dc.jsp.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/list.css">
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
    게시판-리스트
    <hr>
    <%
            BoardListProcessor blp = (BoardListProcessor)request.getAttribute("blp");
            if (blp != null) {
                ArrayList<BoardDto> posts = blp.getPost();
    %>
            <fieldset id="link">
                <legend>링크</legend>
                <a href='/'>홈페이지이동</a>
                <a href='/write.jsp?category=<%=blp.category%>'>게시글쓰기</a>
            </fieldset>
            <fieldset>
                <legend><%=blp.category %> 게시판</legend>
                <hr>
                글번호 | 제목 | 작성자
                <hr>
                <%
                    if (posts != null) {
                        for (int i = 0; i < posts.size(); i++) {
                %>
                            <%=posts.get(i).no %>
                            <a href="/board/read?category=<%=blp.category%>&no=<%=posts.get(i).no%>"><%=posts.get(i).title %></a>
                            <%=posts.get(i).id %>
                            <hr>
                <%
                        }
                    } else {
                %>
                        <!-- posts가 null일 때의 처리 -->
                        게시글이 없습니다.
                <%
                    }
                %>
            </fieldset>
            <fieldset>
                <legend>페이지 블럭</legend>
                <%=blp.getHtmlPageList() %>
            </fieldset>
            <fieldset>
                <legend>링크</legend>
            </fieldset>
            <fieldset>
                <legend>검색</legend>
                <form action="/board/list">
                    <input name="category" type="hidden" value="<%=blp.category %>">
                    <input name="word">
                    <input type="submit" value="검색">
                </form>
            </fieldset>
    <%
        } else {
    %>
            <!-- blp가 null일 때의 처리 -->
            게시판 정보를 가져올 수 없습니다.
    <%
        }
    %>
</body>
</html>