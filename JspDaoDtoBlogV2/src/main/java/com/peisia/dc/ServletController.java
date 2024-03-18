package com.peisia.dc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/*")
public class ServletController extends HttpServlet{
	String nextPage;
	Dao dao;
	
	@Override
	public void init() throws ServletException{
		dao = new Dao();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo();
		System.out.println("action: " + action);
		if(action != null) {
			switch(action) {
			case "/del":
				System.out.println("삭제");
				nextPage = "list.jsp";
				dao.del(request.getParameter("no"));
				break;
			case "/write":
				System.out.println("쓰기");
				nextPage = "/list.jsp";
				Dto dto = new Dto(
						request.getParameter("title"),
						request.getParameter("id"),
						request.getParameter("content")
						);
				dao.write(dto);
				break;
			case "/edit":
				System.out.println("수정");
				nextPage = "edit.jsp";
				break;
			case "/read":
				System.out.println("수정");
				nextPage = "read.jsp";
				break;
			case "/list":
				nextPage = "list.jsp";
				break;
			}
			RequestDispatcher d = request.getRequestDispatcher(nextPage);
			d.forward(request, response);
		}
	}
}
