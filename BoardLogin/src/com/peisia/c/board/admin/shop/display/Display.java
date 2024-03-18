package com.peisia.c.board.admin.shop.display;

public class Display {
	static private String TITLE_BAR = "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	static private String TITLE 	= "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈    관리자 쇼핑몰     🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	
	static private String MAIN_MENU_BAR = "========================================================================";
	static private String MAIN_MENU	 	= "[1]제품리스트 [2]제품상세 [3]제품등록 [4]제품수정 [5]검색 [0]타이틀바꾸기 [x]이전화면";
	
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
	
	public static void titleList() {
		System.out.println("==========================================");
		System.out.println("================= 상품리스트 ================");
		System.out.println("==========================================");
		System.out.println("상품번호 상품제목 작성자id 작성시간");
	}
	
	public static void replyBar() {
		System.out.println("================= 리뷰 리스트 ==================");
	}
}
