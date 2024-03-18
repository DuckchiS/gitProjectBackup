package com.peisia.c.board.shop.display;

public class Display {
	static private String TITLE_BAR = "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	static public String TITLE 	= "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈     쇼핑몰     🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	
	static private String MAIN_MENU_BAR = "===========================================================================";
	static private String MAIN_MENU	 	= "[1]제품리스트 [2]제품상세 [3]제품등록 [4]제품삭제 [5]제품수정 [6]검색 [0]관리자 [x]이전화면";
	
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
		System.out.println("상품번호 제품명 작성자id 작성시간 조회수 추천수");
	}
	
	public static void replyBar() {
		System.out.println("================= 리뷰 리스트 ==================");
	}
}
