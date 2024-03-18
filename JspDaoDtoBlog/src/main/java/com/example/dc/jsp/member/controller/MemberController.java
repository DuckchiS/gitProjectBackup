package com.example.dc.jsp.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.dc.jsp.member.dto.MemberDto;
import com.example.dc.jsp.member.service.MemberService;

@WebServlet("/member/*")
public class MemberController extends HttpServlet {
	MemberService service;
	String nextPage;
	
	@Override
	public void init() throws ServletException{
		service = new MemberService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String action = request.getPathInfo();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");   
		System.out.println("action: "+action);
		if(action != null) {
			switch (action) {
			case "/login":
				System.out.println("로그인");
				response.sendRedirect("/login.jsp");
				break;
			case "/signup":
				System.out.println("회원가입");
				response.sendRedirect("/signup.jsp");
				break;
			case "/logout":
				HttpSession session2 = request.getSession(false);
				if(session2 != null) {
					session2.invalidate();
				}
				response.sendRedirect("/index.jsp");
				break;
			}
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo();
		System.out.println("action: "+action);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");   
		if(action != null) {
			switch (action) {
			case "/login":
				String id = request.getParameter("ps_id");
				String pw = request.getParameter("ps_pw");
				System.out.println("로그인");
				if(service.login(id, pw)) {
					HttpSession session = request.getSession();
					session.setAttribute("userId", id);
					response.sendRedirect("/index.jsp");
				} else {
					System.out.println("로그인 실패");
					response.sendRedirect("/login.jsp");
				}
				break;
			case "/signup":
				System.out.println("회원가입");
				nextPage = "/login.jsp";
				service.signup(new MemberDto(
						request.getParameter("id"),
						request.getParameter("pw"),
						request.getParameter("name")
						));
				RequestDispatcher d = request.getRequestDispatcher(nextPage);
				d.forward(request, response);
				break;
			}
		}
	}

}
