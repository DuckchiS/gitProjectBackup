package com.pay.catclass.c.jav;

public class Main {
	public static void main(String[] args) {
		Cat kitty = new Cat("키티", 10, "식빵굽기");
		
		Cat yaongi = new Cat();
		yaongi.age = 10;
		
		Cat norangi = new Cat("노랑이", 13);
		
		int sum = norangi.add(1, 2);
		System.out.println(sum);
	}
}
