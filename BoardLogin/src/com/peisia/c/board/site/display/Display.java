package com.peisia.c.board.site.display;

public class Display {
	private static String Site_Name = "BoardLogin";
	private static String Version = "V 0.0.9";
	private static String Name = "DC";
	static private String TITLE_BAR = "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈"; 
	public static void entranceTitle() {
		System.out.println(TITLE_BAR);
		System.out.print("🐈🐈🐈🐈🐈🐈🐈🐈🐈 ");
		System.out.print(Site_Name);
		System.out.print(" "+Version);
		System.out.print(" "+Name);
		System.out.println(" 🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈");
		System.out.println(TITLE_BAR);
	}
}
