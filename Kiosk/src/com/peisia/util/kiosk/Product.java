package com.peisia.util.kiosk;

public class Product {
	String name;
	int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println(name + " 가격:" + price + "원");
	}
}
