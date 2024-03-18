  package com.peisia.c.board.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 입력을 담당하는 클래스. (Scanner 등)
 */


public class Ci {
	static Scanner sc = new Scanner(System.in);
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static public String r() {
		return sc.next();
	}
	static public String r(String comment) {
		System.out.println(comment +":");
		return sc.next();
	}
	public static String rl(String comment) {
		System.out.println(comment +":");
		try {
			return reader.readLine();
		} catch(IOException e){
			e.printStackTrace();
			return null;
		}
	}
}
