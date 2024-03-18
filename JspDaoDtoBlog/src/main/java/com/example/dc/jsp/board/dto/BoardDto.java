package com.example.dc.jsp.board.dto;

public class BoardDto {
	public String no;
	public String title;
	public String content;
	public String id;
	public String datetime;
	public String hit;
	public String replyOri;
	public String replyCount;
	public String b_category;
	
	public BoardDto(String category, String no, String title, String content, String id, String datetime, String hit, String replyOri,
			String replyCount) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.id = id;
		this.datetime = datetime;
		this.hit = hit;
		this.replyOri = replyOri;
		this.replyCount = replyCount;
		this.b_category = category;
	}

	public BoardDto(String category, String title, String id, String content) {
		this.title = title;
		this.id = id;
		this.content = content;
		this.b_category = category;
	}

	public BoardDto(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
}
