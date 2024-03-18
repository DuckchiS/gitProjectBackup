package com.peisia.c.dargers.display;

public class Display {
	static private String TITLE_BAR = "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	static private String TITLE 	= "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈     선수 창     🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	
	static private String MAIN_MENU_BAR = "================================================================";
	static private String MAIN_MENU	 	= "[1]선수리스트 [2]선수정보 [3]영입 [4]방출 [5]부상정보수정 [0]관리자";
	
	static public void showTitle() {
		System.out.println(TITLE_BAR);
		System.out.println(TITLE);
		System.out.println(TITLE_BAR);
	}
	
	static public void showMainMenu() {
		System.out.println(MAIN_MENU_BAR);
		System.out.println(MAIN_MENU);
		System.out.println(MAIN_MENU_BAR);
		
	}
}
