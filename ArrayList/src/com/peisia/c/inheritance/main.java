package com.peisia.c.inheritance;

import java.util.ArrayList;

import com.peisia.c.util.So;

public class main {
	public static void main(String[] args) {
		// 게임 오브젝트들 로딩
		Character c = new Character("고양이",3,100);
		
		//아버지 - 자식
		//형 변환
		//type 변환
		//Character 클래스가 GameObj로 바꼈다.
		//
		GameObj go = new Character("고양이", 3, 100);
		//풀어서 쓰면
		// Character x = new Character("고양이", 3, 100);
		// GameObj go = x;	이러한 type변환을 자동형변환, 묵시적 타입 변환
		
		//1.아버지 양복을 훔쳐입어서 아버지 객체로 취급이됨.
		
		//2.아버지로 변신했기 때문에 자기 자신의 행동을 못함.
//		System.out.println(go.hp);       이렇게 쓰면 에러가 난다.
		
		//3.자기꺼를 하려면 다시 변신을 풀어야한다.
		//변신을 풀 때 자동형변환으로 하면 안된다.
		//Character cc = go;	이렇게 하면 에러가 나고
		Character cc = (Character)go;	//이렇게 해야한다.
		System.out.println(cc.hp);
		
		Sword s = new Sword("단검",2,100,50,70);
		Sword l = new Sword("장검",3,150,100,70);

		//할아버지형 리스트에 손자,아들,본인 다 넣을수 있음. (상속의 중요 특성)
		ArrayList<GameObj> gs = new ArrayList<>();
		gs.add(c);	//자동 형변환이 일어남.
		gs.add(s);
		gs.add(l);
		for(GameObj o : gs) {
			So.ln(o.name);
			So.ln(o.grade);
		}
		//So.ln(o.attack);을 출력할려고 하면 출력이 안된다.
		//이유는 부모형(할아버지형) 리스트에 대한 변수들만 출력이 가능하고 나머지 자식 변수들의 출력은 안된다.
 	}
}
