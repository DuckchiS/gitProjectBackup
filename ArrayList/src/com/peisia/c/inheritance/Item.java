package com.peisia.c.inheritance;

public class Item extends GameObj{
	int weight;	//무게
	int life;	//아이템 수명
	Item(String name, int grade, int weight, int life){
		super(name,grade);	//맨 처음에 온다 이거는 부모 클래스를 나타내는거다.
		//위 코드에서 부모 클래스에게 name과 grade를 세팅하게 해달라고 부탁하는 의미
		//super();도 가능하지만 이렇게 하면 출력할때 name과 grade에 null 표시가 뜬다.
		this.weight = weight;
		this.life = life;
	}
}
