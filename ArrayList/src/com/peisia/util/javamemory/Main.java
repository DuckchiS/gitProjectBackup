package com.peisia.util.javamemory;

public class Main {
	public static void main(String[] args) {
		Cat kitty = new Cat();
		kitty.age = 3;
		kitty.name = "kitty";
		
		System.out.println(kitty.age);
		System.out.println(kitty.name);
		
		Cat yaongi = new Cat();
//		Cat yaongi;
//		yaongi = kitty;
		
		yaongi.age = 4;
		
		System.out.println(kitty.age);
		System.out.println(yaongi.age);
		System.out.println(kitty.name);
		System.out.println(yaongi.name);
		
		kitty.age = 10;
		
		System.out.println(kitty.age);
		System.out.println(yaongi.age);
		
		Hospital h = new Hospital();
		
		h.hotel(kitty);
		h.hotel(yaongi);
	}
}
