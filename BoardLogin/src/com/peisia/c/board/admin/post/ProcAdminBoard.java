package com.peisia.c.board.admin.post;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.peisia.c.board.admin.post.display.Display;
import com.peisia.c.board.post.ProcB_List;
import com.peisia.c.board.util.DB;

public class ProcAdminBoard {
	public static void run() {
		Display.showTitle();
		DB.dbInit();
		DB.dbPostCount();
//		System.out.println("================================================================");
		
		Scanner sc = new Scanner(System.in);
		
		loop:
		while(true) {
			Display.showMainMenu();
			System.out.println("옵션을 선택하세요: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String cmd = sc.next();
			switch (cmd) {
			case "1":
				ProcB_List.run();
				break;
			case "2":
				ProcAdminBoardRead.run();
				break;
			case "3":
				ProcAdminBoardWrite.run();
				break;
			case "4":
				ProcAdminBoardUpdate.run();
				break;
			case "5":
				ProcB_List.search();
				break;
			case "0":
				ProcAdminBoardEditTilte.run();
				break;
			case "x":
				System.out.println("이전 화면으로 돌아갑니다.");
				break loop;
			default:
				System.out.println("옵션에 없습니다. 다시 입력하세요.");
				break;
			}
		}
	}
}
