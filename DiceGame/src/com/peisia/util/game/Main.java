package com.peisia.util.game;

public class Main {
	public static void main(String[] args) {
//		Dice dice = new Dice();
//		
//		System.out.println(dice.roll(100));
		//둘다 같은 용도이다. 가능한 이유는 Dice클래스에 roll함수에 static이 있어서 이다.
		System.out.println(Dice.roll(100));
	}
}
