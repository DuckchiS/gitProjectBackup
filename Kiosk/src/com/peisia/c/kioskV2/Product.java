package com.peisia.c.kioskV2;

public class Product {
	String name;
	int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("상품 이름: " + name + "상품 가격:" + price + "원");
	}
}
