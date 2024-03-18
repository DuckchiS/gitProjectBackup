<%@page import="java.net.URLEncoder"%>
<%@page import="com.peisia.dc.Board"%>
<%@page import="com.peisia.dc.Dto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.peisia.dc.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="list.css">
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
게시판-리스트
<hr>
	<fieldset id="link">
		<legend>링크</legend>
		<a href='index.jsp'>홈페이지이동</a>
		<a href='write.jsp'>게시글쓰기</a>
	</fieldset>
	<hr>
		글번호 | 제목 | 아이디 | 작성자
	<hr>
	<%
		String pageNum = request.getParameter("page");
		if(pageNum == null){
			pageNum = "1";
		}
		Dao dao = new Dao();
		int totalPage = 0;
		ArrayList<Dto> posts = null;
		String searchWord = request.getParameter("word");
		if(searchWord == null || searchWord.equals("null")){
			posts = dao.list(pageNum);
			totalPage = dao.getTotalCountPage();
		} else{
			posts = dao.listSearch(pageNum, searchWord);
			totalPage = dao.getTotalSearchCountPage(searchWord);
		}
		for(int i = 0; i < posts.size(); i++){
	%>
			<%=posts.get(i).no %>
			<a href="read.jsp?no=<%=posts.get(i).no %>"><%=posts.get(i).title %></a>
			<%=posts.get(i).id %>
			<hr>
	<% 
		}
		int nPageNum = Integer.parseInt(pageNum);
		int totalBlock = (int)Math.ceil((double)totalPage/Board.Page_Link_Amount);
		int currentBlockNo = (int)Math.ceil((double)totalPage/Board.List_Amount);
		int blockStartNo = (currentBlockNo - 1) * Board.Page_Link_Amount + 1;
		int blockFinalNo = currentBlockNo * Board.Page_Link_Amount;
		if(blockFinalNo > totalPage){
			blockFinalNo = totalPage;
		}
		int prevPage = 0;
		int nextPage = 0;
		boolean hasPrev = true;
		if(currentBlockNo == 1){
			hasPrev = false;
		} else{
			hasPrev = true;
			prevPage = currentBlockNo * Board.Page_Link_Amount;
		}
		boolean hasNext = true;
		if(currentBlockNo < totalBlock){
			hasNext = true;
			nextPage = currentBlockNo * Board.Page_Link_Amount + 1;
		} else{
			hasNext = false;
		}
		if(hasPrev){
			if(searchWord == null){
	%>
				<a href="list.jsp?page=<%=prevPage %>">이전블럭가기</a>
	<% 		
			} else{
	%>
				<a href="list.jsp?page=<%=prevPage %>&word=<%=searchWord %>">이전블럭가기</a>
	<% 
			}
		}
		for(int i = blockStartNo; i <= blockFinalNo; i++){
			if(nPageNum == i){
	%>
				<%=i %>
	<% 
			} else{
				if(searchWord == null){
	%>
					<a href="list.jsp?page=<%=i %>"><%=i %></a>
	<% 
				} else{
					String urlEncodedSerachWord = URLEncoder.encode(searchWord);
	%>
					<a href="list.jsp?page=<%=i %>&word=<%=urlEncodedSerachWord%>"><%=i %></a>
	<% 
				}
			}
		}
		if(hasNext){
			if(searchWord == null){
	%>
				<a href="list.jsp?page=<%=nextPage%>">다음블럭가기</a>
	<% 	
			} else{
	%>
				<a href="list.jsp?page=<%=nextPage%>&word=<%=searchWord%>">다음블럭가기</a>
	<% 		
			}
		}
	%>
	
	<form action="list.jsp">
	<input name="word">
	<input type="submit" value="검색">
	</form>
	<hr>
	<fieldset id="log">
		<legend>로그</legend>
	전체 페이지 수: <%=totalPage %><br>
	현재 페이지 번호: <%=pageNum %><br>
	</fieldset>
</body>
</html>