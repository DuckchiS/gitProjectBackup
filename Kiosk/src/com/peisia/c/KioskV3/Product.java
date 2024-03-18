package com.peisia.c.KioskV3;

public class Product {
	String name;
	int price;
	int type;
	
	public Product(String name, int price, int type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}
	

	public void info() {
		System.out.println("상품 이름: " + name + "상품 가격:" + price + "원");
	}
}
