package com.example.dc.jsp.member.service;

import com.example.dc.jsp.member.dao.MemberDao;
import com.example.dc.jsp.member.dto.MemberDto;

public class MemberService {
	MemberDao dao;
	
	public MemberService() {
		dao = new MemberDao();
	}
	
	public void signup(MemberDto d) {
		dao.memberSignUp(d);
	}
	
	public boolean login(String id, String pw) {
		return dao.memberLogin(id, pw);
	}
}
