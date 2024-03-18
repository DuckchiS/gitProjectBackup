package com.peisia.c.inher;

public class GameObj {
	int grade;
	String name;
	
	void info() {
		System.out.println("이름:"+name+" 등급:"+grade);
	}
	
	GameObj(){
		System.out.println("게임 오브젝트 생성되었음. 생성자 함수 호출됨.");
	}
}
