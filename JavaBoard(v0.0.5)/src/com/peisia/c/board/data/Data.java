package com.peisia.c.board.data;

import java.util.ArrayList;

public class Data {
	static public ArrayList<Post> posts;
	static public void loadData() {	//초기화를 하기 위해서
		posts = new ArrayList<>();	
	}
}
