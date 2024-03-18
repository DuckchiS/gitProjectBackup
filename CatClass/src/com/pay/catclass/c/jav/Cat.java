package com.pay.catclass.c.jav;

public class Cat {
	String name;
	String hobby;
	int age;
	
	void x() {
		
	}
	
	int y() {
		return 100;
	}
	
	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public Cat() {
		
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Cat(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
}
