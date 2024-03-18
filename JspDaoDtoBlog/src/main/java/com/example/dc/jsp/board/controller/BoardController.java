package com.example.dc.jsp.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dc.jsp.board.BoardListProcessor;
import com.example.dc.jsp.board.dao.BoardDao;
import com.example.dc.jsp.board.dto.BoardDto;
import com.example.dc.jsp.board.service.BoardService;


@WebServlet("/board/*")
public class BoardController extends HttpServlet{
	String category;
	String nextPage;
	BoardService service;
	
	@Override
	public void init() throws ServletException{
		service = new BoardService();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		category = request.getParameter("category");
		String action = request.getPathInfo();
		System.out.println("action: " + action);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");   
		PrintWriter out = response.getWriter();
		if(action != null) {
			switch(action) {
			case "/del":
				System.out.println("삭제");
				nextPage = "/board/list";
				service.del(category, request.getParameter("no"));
				break;
			case "/write":
				System.out.println("쓰기");
				nextPage = "/board/list";
				BoardDto dto = new BoardDto(
						category,
						request.getParameter("title"),
						request.getParameter("id"),
						request.getParameter("content")
						);
				service.write(dto);
				break;
			case "/edit":
				System.out.println("수정-insert");
				nextPage = "/edit.jsp";
				request.setAttribute("post", service.read(category, request.getParameter("no")));
				break;
			case "/edit_proc":
				System.out.println("수정-proc");
				nextPage = "/board/list";
				service.edit(new BoardDto(
						request.getParameter("title"),
						request.getParameter("content")
						), request.getParameter("no"));
				break;
			case "/read":
				System.out.println("읽기");
				nextPage="/read.jsp";
				BoardDto d=service.read(category,request.getParameter("no"));
				request.setAttribute("post", d);
				break;
			case "/list":
				nextPage = "/list.jsp";
				BoardListProcessor blp = service.list(category, request.getParameter("page"),
						request.getParameter("word"));
				request.setAttribute("blp", blp);
				break;
			}
			RequestDispatcher d = request.getRequestDispatcher(nextPage);
			d.forward(request, response);
		}
	}
}
