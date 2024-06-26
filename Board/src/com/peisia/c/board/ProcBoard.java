package com.peisia.c.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.peisia.c.board.display.Display;
import com.peisia.c.board.util.DB;

public class ProcBoard {
	void run() {
		Display.showTitle();
		Display.showMainMenu();
		DB.dbInit();
		DB.dbPostCount();
		System.out.println("================================================================");
//		dbExecuteQuery("select * from tottenham_squad where p_number=7");

		Scanner sc = new Scanner(System.in);
		
		loop:
		while(true) {
			System.out.println("옵션을 선택하세요: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String cmd = sc.next();
			switch (cmd) {
			case "1":
				ProcList.run();
				break;
			case "2":
				ProcRead.run();	
				break;
			case "3":
				ProcWrite.run();
				break;
			case "4":
				ProcDelete.run();
				break;
			case "5":
				ProcUpdate.run();
				break;
			case "6":
				ProcList.search();
				break;
			case "0":
				break;
			case "e":
				System.out.println("시스템을 종료합니다.");
				break loop;
			default:
				System.out.println("옵션에 없습니다. 다시 입력하세요.");
				break;
			}
		}
	}
}
