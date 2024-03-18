package com.peisia.c.board.admin;

import com.peisia.c.board.admin.post.ProcAdminBoard;
import com.peisia.c.board.admin.shop.ProcAdminShop;
import com.peisia.c.board.post.display.Display;
import com.peisia.c.board.util.Ci;

public class ProcAdmin {
	private static String cmd = "";
	public static void run() {
		System.out.println("============== [관리자 메뉴] ==============");
		adminmain:
		while(true) {
			cmd = Ci.r("관리자 비밀번호를 입력하세요.");
			if(cmd.equals("1111")) {
				System.out.println("관리자님 환영합니다.");
				loop:
				while(true) {
					cmd = Ci.r("[1]관리자 게시판 / [2] 관리자 쇼핑몰 / [x] 나가기");
					switch (cmd) {
					case "1":
						ProcAdminBoard.run();
						break;
					case "2":
						ProcAdminShop.run();
						break;
					case "x":
						System.out.println("관리자 페이지를 종료합니다");
						break adminmain;
					default:
						System.out.println("해당사항은 옵션에 없습니다.");
						break;
					}
				}
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
				break;
			}
		}
	}
}
