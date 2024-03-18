package com.example.dc.jsp.board.service;

import com.example.dc.jsp.board.BoardListProcessor;
import com.example.dc.jsp.board.dao.BoardDao;
import com.example.dc.jsp.board.dto.BoardDto;

public class BoardService {
	BoardDao dao;

	public BoardService() {
		dao = new BoardDao();
	}
	
	public void del(String category, String no) {
		dao.del(category, no);
	}
	
	public void write(BoardDto d) {
		dao.write(d);
	}
	
	public BoardDto read(String category, String no) {
		return dao.read(category, no);
	}
	
	public void edit(BoardDto d,String no) {
		dao.edit(d, no);
	}
	
	
	public BoardListProcessor list(String category,String currentPage,String word) {
		if(currentPage == null) {
			currentPage = "1";
		}
		BoardListProcessor blp = new BoardListProcessor(dao, category, currentPage, word);
		return blp;
	}
}
