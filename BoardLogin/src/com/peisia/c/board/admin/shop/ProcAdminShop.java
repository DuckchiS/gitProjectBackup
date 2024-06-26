package com.peisia.c.board.admin.shop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.peisia.c.board.admin.shop.display.Display;
import com.peisia.c.board.shop.ProcS_List;
import com.peisia.c.board.util.DB;

public class ProcAdminShop {
	public static void run() {
		Display.showTitle();
		DB.dbInit();
		
		Scanner sc = new Scanner(System.in);
		loop:
		while(true) {
			Display.showMainMenu();
			System.out.println("옵션을 선택하세요:");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String cmd = sc.next();
			switch(cmd) {
			case "1":
				ProcS_List.run();
				break;
			case "2":
				ProcAdminShopRead.run();
				break;
			case "3":
				ProcAdminShopWrite.run();
				break;
			case "4":
				ProcAdminShopUpdate.run();
				break;
			case "5":
				ProcS_List.search();
				break;
			case "0":
				ProcAdminShopEditTitle.run();
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
