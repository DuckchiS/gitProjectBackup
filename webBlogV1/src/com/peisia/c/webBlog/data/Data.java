package com.peisia.c.webBlog.data;

import java.util.ArrayList;

public class Data {
	static public ArrayList<Post> post;
	static public void loadData() {	//초기화를 하기 위해서
		post = new ArrayList<>();
	}
}
