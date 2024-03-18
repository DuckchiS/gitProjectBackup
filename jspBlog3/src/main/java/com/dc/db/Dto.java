package com.dc.db;

public class Dto {
	public String no;
	public String title;
	public String content;
	public String datetime;
	public String hit;
	public String id;
	public String reply_count;
	public String reply_ori;
	
	public Dto(String title, String id, String content) {
		this.title = title;
		this.id = id;
		this.content = content;
	}
	
	public Dto(String no, String title, String content, String datetime, String hit, String id,
			String replyCount, String replyOri) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.datetime = datetime;
		this.hit = hit;
		this.id = id;
		this.reply_count = replyCount;
		this.reply_ori = replyOri;
	}
	
	public Dto(String title, String content) {
		this.title = title;
		this.content = content;
	}
}
