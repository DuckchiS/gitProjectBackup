package com.example.dc.jsp.board;

import java.util.ArrayList;

import com.example.dc.jsp.board.dao.BoardDao;
import com.example.dc.jsp.board.dto.BoardDto;

public class BoardListProcessor {
	private BoardDao dao;
	public String category;
	public ArrayList<BoardDto> posts;
	public int totalPage = 0;
	public int currentPage = 0;
	public String word;
	
	int totalBlock = 0;
	int currentBlockNo = 0;
	int blockStratNo = 0;
	int blockFinalNo = 0;
	
	int prevPage = 0;
	int nextPage = 0;
	
	boolean hasPrev = true;
	boolean hasNext = true;
	
	public BoardListProcessor(BoardDao dao,String category,String currentPage,String word) {
		super();
		this.dao = dao;
		this.category = category;
		this.currentPage = Integer.parseInt(currentPage);
		if(word == null) {
			this.totalPage = getCountPage();
			getList();
		} else {
			this.totalPage = getCountPage(word);
			getList(word);
		}
		totalBlock = (int)Math.ceil((double)totalPage/Board.Page_Link_Amount);
		currentBlockNo = (int)Math.ceil((double)this.currentPage/Board.Page_Link_Amount);
		blockStratNo = (currentBlockNo - 1) * Board.Page_Link_Amount + 1;
		blockFinalNo = currentBlockNo * Board.Page_Link_Amount;
		if(blockFinalNo > totalPage) {
			blockFinalNo = totalPage;
		}
		if(currentBlockNo == 1) {
			hasPrev = false;
		} else {
			hasPrev = true;
			prevPage = (currentBlockNo - 1) * Board.Page_Link_Amount;
		}
		if(currentBlockNo < totalBlock) {
			hasNext = true;
			nextPage = currentBlockNo * Board.Page_Link_Amount + 1;
		} else {
			hasNext = false;
		}
	}
	
	public void getList() {
		int startIndex = (currentPage - 1)*Board.List_Amount;
		posts = dao.list(category, startIndex);
	}
	
	public void getList(String word) {
		int startIndex = (currentPage - 1)*Board.List_Amount;
		posts = dao.listSerach(word, word, startIndex);
	}
	
	public int getCountPage() {
		int totalPageCount = 0;
		int count = dao.getCount(category);
		if(count % Board.List_Amount == 0) {
			totalPageCount = count / Board.List_Amount;
		} else {
			totalPageCount = count / Board.List_Amount + 1;
		}
		return totalPageCount;
	}
	
	public int getCountPage(String word) {
		int totalPageCount = 0;
		int count = dao.getSerachCount(category, word);
		if(count % Board.List_Amount == 0) {
			totalPageCount = count / Board.List_Amount;
		} else {
			totalPageCount = count / Board.List_Amount + 1;
		}
		return totalPageCount;
	}
	
	public ArrayList<BoardDto> getPost(){
		return posts;
	}
	
	public String getHtmlPageList() {
		String html = "";
		if(hasPrev) {
			if(word == null) {
				html = html+String.format("<a href='/board/list?category=%s&page=%d'>이전블럭가기</a>", category,prevPage);
			} else {
				html = html+String.format("<a href='/board/list?category=%s&page=%d&word=%s'>이전블럭가기</a>", category,prevPage,word);
			}
		}
		for(int i = blockStratNo; i <= blockFinalNo; i++) {
			if(word == null) {
				html = html + String.format("<a href='/board/list?category=%s&page=%d'>%d</a>&nbsp;&nbsp;",category,i,i);
			} else {
				html = html + String.format("<a href='/board/list?category=%s&page=%d&word=%s'>%d</a>&nbsp;&nbsp;",category,i,word,i);
			}
		}
		if(hasNext) {
			if(word == null) {
				html = html+String.format("<a href='/board/list?category=%s&page=%d'>다음블럭가기</a>", category,nextPage);
			} else {
				html = html+String.format("<a href='/board/list?category=%s&page=%d&word=%s'>다음블럭가기</a>", category,nextPage,word);
			}
		}
		return html;
	}
}
