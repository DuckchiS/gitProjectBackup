package com.peisia.util.inheritance;

public class Character extends GameObj{
//	String name;
	int hp;
	int attack;
	
	void Cinfo() {
		System.out.println("공격력: " + attack);
	}
}
