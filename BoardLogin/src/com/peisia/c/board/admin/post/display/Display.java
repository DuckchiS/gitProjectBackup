package com.peisia.c.board.admin.post.display;

public class Display {
	static private String TITLE_BAR = "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	static public String TITLE 	= "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈     관리자 게시판     🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	
	static private String MAIN_MENU_BAR = "==========================================================================";
	static private String MAIN_MENU	 	= "[1]글리스트 [2]글읽기 [3]글쓰기 [4]글수정 [5]검색 [0]타이틀바꾸기 [x]이전화면";
	
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
		System.out.println("================= 글리스트 ==================");
		System.out.println("==========================================");
		System.out.println("글번호 글제목 작성자id 작성시간");
	}
	
	public static void replyBar() {
		System.out.println("================= 댓글 리스트 ==================");
	}
}
