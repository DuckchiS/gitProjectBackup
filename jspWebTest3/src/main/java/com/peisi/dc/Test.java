package com.peisi.dc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");        // 안하면 한글 깨짐
		System.out.println("==== 두 겟");
		response.sendRedirect("http://daum.net");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");        // 안하면 한글 깨짐
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("Post방식으로 보낸거");
		System.out.println("ID: "+id);
		System.out.println("PW: "+pw);
		if(id.equals("cat")&&pw.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("idKey", id);
			session.setMaxInactiveInterval(30);
		}
		PrintWriter out = response.getWriter();
		out.println("<h1>cat</h1>");
		out.println("<a href='index2.jsp'>인덱스2</a>");
	}

}
