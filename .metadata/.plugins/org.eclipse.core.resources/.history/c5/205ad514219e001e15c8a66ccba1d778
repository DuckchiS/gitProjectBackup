package com.peisia.c.kioskV2;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.c.kioskV2.Product;

public class Kiosk {
	public static ArrayList<Product> basket = new ArrayList<Product>();
	public static String cmd;
	public static Scanner sc = new Scanner(System.in);
	
	ProcMenuDrink procMenuDrink = new ProcMenuDrink();
	ProcMenuDessert procMenuDessert = new ProcMenuDessert();
	
	public static Product p1 = new Product("1.아아", 1500);
	public static Product p2 = new Product("2.뜨아", 1500);
	public static Product p3 = new Product("3.바닐라라떼", 3000);
	public static Product p4 = new Product("4.초코라떼", 3500);
	public static Product p5 = new Product("1.마카롱", 4000);
	public static Product p6 = new Product("2.쿠키", 3500);
	public static Product p7 = new Product("3.케잌", 4500);
	void run(){
		Display.title();
		
		loop_a:
			while(true) {
				System.out.println("어떤 메뉴를 주문하시겠습니까?");
				System.out.println("1번 음료 2번 디저트 x는 프로그램 종료입니다.");
				cmd = sc.next();
				switch (cmd) {
				case "1":
					procMenuDrink.run();
					break;
					
				case "2":
					procMenuDessert.run();
					break;
					
				case "x":
					System.out.println("프로그램을 종료합니다.");
					int count = basket.size();
					System.out.println("장바구니에 담긴 상품 갯수: " + count);
					int sum = 0;
//					기존에 처음에 배운 for문
//					for(int i = 0; i < basket.size(); i++) {
//						sum = sum + basket.get(i).price;
//					}
					
//					for-each문
					for(Product p : basket) {
						sum = sum + p.price;
					}
					System.out.println("계산하실 금액은 " + sum + "원 입니다.");
					break loop_a;
					
				default:
					System.out.println("옵션에 없습니다. 다시 해주세요.");
					break;
				}
			}
	}
}
