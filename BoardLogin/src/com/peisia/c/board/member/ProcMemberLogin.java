package com.peisia.c.board.member;

import com.peisia.c.board.util.Ci;
import com.peisia.c.board.util.DB;

public class ProcMemberLogin {
	public static String run() {
		System.out.println("======== [로그인] =========");
		String id = "";
		String pw = "";
		while(true) {
			id = Ci.r("아이디를 입력하세요.");
			if(id.length() > 0) {
				break;
			} else {
				System.out.println("아이디가 없습니다. 다시 입력하세요.");
			}
		}

		while(true) {
			pw = Ci.r("비밀번호를 입력하세요.");
			if(pw.length() > 0) {
				break;
			} else {
				System.out.println("비밀번호가 없습니다. 다시 입력하세요.");
			}
		}
		
		if(DB.isProcLogin(id, pw)) {
			return id;
		} else {
			return null;
		}
	}
}
