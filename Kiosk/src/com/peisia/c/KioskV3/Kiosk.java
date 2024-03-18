package com.peisia.c.KioskV3;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.c.kioskV2.ProcMenuDessert;
import com.peisia.c.kioskV2.Product;

public class Kiosk {
	void run(){
		Display.title();
		KioskObj.productLoad();	//상품로드
		loop_a:
			while(true) {
				System.out.println("어떤 메뉴를 주문하시겠습니까?");
				System.out.println("1번 음료 2번 디저트 3번 텀블러/피규어 x는 프로그램 종료입니다.");
				KioskObj.cmd = KioskObj.sc.next();
				switch (KioskObj.cmd) {
				case "1":
					ProcMenuDrink.run();
					break;
					
				case "2":
					ProcMenuDesserts.run();
					break;
					
				case "3":
					ProcMenuTumbler.run();
					break;
					
				case "x":
					int count = KioskObj.basket.size();
					System.out.println("장바구니에 담긴 상품 갯수: " + count);
					int sum = 0;
					for(Order o : KioskObj.basket) {
						sum = sum + o.selectProduct.price;
					}
					System.out.println("계산하실 금액은 " + sum + "원 입니다.");
					System.out.println("=========================");
					for(Order o : KioskObj.basket) { 		////	산거 리스팅	////
						if(o.selectProduct.type == 0) {
							String str = "";
							String str1 = "";
							if(o.optionHotCold == 1) {
								 str = "hot";
								 if(o.optionSize == 1) {
									 str1 = "regular";
								 }
								 if(o.optionSize == 2) {
									 str1 = "large";
								 }
								 if(o.optionSize == 3) {
									 str1 = "venti";
								 }
							}
							if(o.optionHotCold == 2) {
								 str = "ice";
								 if(o.optionSize == 1) {
									 str1 = "regular";
								 }
								 if(o.optionSize == 2) {
									 str1 = "large";
								 }
								 if(o.optionSize == 3) {
									 str1 = "venti";
								 }
							}
							System.out.println(str + o.selectProduct.name + " size:" + str1);
						}
						
						if(o.selectProduct.type == 1) {
							String str = "";
							if(o.optionDessert == 1) {
								str = "plain";
							}
							if(o.optionDessert == 2) {
								str = "choco";
							}
							if(o.optionDessert == 3) {
								str = "cheese";
							}
							System.out.println(str + o.selectProduct.name);
						}
						
						if(o.selectProduct.type == 2) {
							String str = "";
							if(o.optionCharacter == 1) {
								str = "Ahri";
							}
							if(o.optionCharacter == 2) {
								str = "Timo";
							}
							if(o.optionCharacter == 3) {
								str = "Zed";
							}
							System.out.println(str + o.selectProduct.name);
						}
					}
					System.out.println("=========================");
					System.out.println("프로그램을 종료합니다.");
					break loop_a;
					
				default:
					System.out.println("옵션에 없습니다. 다시 해주세요.");
					break;
				}
			}
	}
}
