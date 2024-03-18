package com.peisia.dc;

public class Dto {
	public String no;
	public String title;
	public String content;
	public String id;
	public String datetime;
	public String hit;
	public String replyOri;
	public String replyCount;
	
	public Dto(String no, String title, String content, String id, String datetime, String hit, String replyOri,
			String replyCount) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.id = id;
		this.datetime = datetime;
		this.hit = hit;
		this.replyOri = replyOri;
		this.replyCount = replyCount;
	}

	public Dto(String title, String id, String content) {
		this.title = title;
		this.id = id;
		this.content = content;
	}

	public Dto(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
