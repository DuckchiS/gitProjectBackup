<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String delNo = request.getParameter("no");
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/board", "root", "root");
		Statement st = con.createStatement();
		String sql = "delete from cat_board2 where no="+delNo;
		System.out.println("==== 전송하려는 sql:" + sql);		
		int resultCount = st.executeUpdate(sql);	// 글쓰기 sql 전송
		if(resultCount == 1){
			System.out.println("==== 글삭제 성공");
		} else {
			System.out.println("==== 글삭제 실패");
		}
	} catch(Exception e){
		e.printStackTrace();
	}
	response.sendRedirect("list.jsp");
%>