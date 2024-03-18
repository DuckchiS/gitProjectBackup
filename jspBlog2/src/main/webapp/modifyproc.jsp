<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String editNo = request.getParameter("no");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String id = request.getParameter("id");
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/board", "root", "root");
		Statement st = con.createStatement();
		String sql = "update cat_board2 set title='"+title+"',content='"+content+"',id='"+id+"'"
				+" where no="+editNo;
		System.out.println("==== 전송하려는 sql:" + sql);
		int resultCon = st.executeUpdate(sql);
		if(resultCon == 1){
			System.out.println("==== 글수정 성공");
		} else{
			System.out.println("==== 글수정 실패");
		}
	} catch(Exception e){
		e.printStackTrace();
	}
	response.sendRedirect("list.jsp");
%>