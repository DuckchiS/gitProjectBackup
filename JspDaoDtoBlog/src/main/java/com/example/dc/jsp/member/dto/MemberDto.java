package com.example.dc.jsp.member.dto;

public class MemberDto {
	public String id;
	public String pw;
	public String name;
	
	public MemberDto(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public MemberDto(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public MemberDto(String id) {
		this.id = id;
	}
}
