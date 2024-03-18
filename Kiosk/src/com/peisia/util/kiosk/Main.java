package com.peisia.util.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("============================================");
		System.out.println("================= 고양이카페       ===========");
		System.out.println("============================================");

		ArrayList<Product> basket = new ArrayList<Product>();
		
		Scanner sc = new Scanner(System.in);
		String cmd;
		
		Product p1 = new Product("1.아아", 1500);
		Product p2 = new Product("2.뜨아", 1500);
		Product p3 = new Product("3.바닐라라떼", 3000);
		Product p4 = new Product("4.초코라떼", 3500);
		Product p5 = new Product("1.마카롱", 4000);
		Product p6 = new Product("2.쿠키", 3500);
		Product p7 = new Product("3.케잌", 4500);
		
		loop_a:
			while(true) {
				System.out.println("어떤 메뉴를 주문하시겠습니까?");
				System.out.println("1번 음료 2번 디저트 x는 프로그램 종료입니다.");
				cmd = sc.next();
				switch (cmd) {
				case "1":
					loop_b:
					while(true) {
						System.out.println("==================================");
						System.out.println("============= 음료 리스트    =======");
						System.out.println("==================================");
						p1.info();
						p2.info();
						p3.info();
						p4.info();
						System.out.println("=======음료를 주문하세요.=======");
						cmd = sc.next();
						switch (cmd) {
						case "1":
							System.out.println("아아를 주문했습니다.");
							Product x1 = new Product("아아",1500);
							basket.add(x1);
							break;
						case "2":
							System.out.println("뜨아를 주문했습니다.");
							Product x2 = new Product("뜨아",1500);
							basket.add(x2);
							break;
						case "3":
							System.out.println("바닐라라떼를 주문했습니다.");
							Product x3 = new Product("바닐라라떼",3500);
							basket.add(x3);
							break;
						case "4":
							System.out.println("초코라떼를 주문했습니다.");
							Product x4 = new Product("초코라떼",3000);
							basket.add(x4);
							break;
						case "x":
							System.out.println("초기 화면으로 갑니다.");
							break loop_b;
						default:
							System.out.println("옵션에 없습니다. 다시 해주세요.");
							break;
						}
					}
					break;
					
				case "2":
					loop_c:
						while(true) {
							System.out.println("==================================");
							System.out.println("============= 디저트 리스트    =======");
							System.out.println("==================================");
							p5.info();
							p6.info();
							p7.info();
							System.out.println("=======디저트를 주문하세요.=======");
							cmd = sc.next();
							switch (cmd) {
							case "1":
								System.out.println("마카롱를 주문했습니다.");
								Product x5 = new Product("마카롱",4000);
								basket.add(x5);
								break;
							case "2":
								System.out.println("쿠키를 주문했습니다.");
								Product x6 = new Product("쿠키",3500);
								basket.add(x6);
								break;
							case "3":
								System.out.println("케잌를 주문했습니다.");
								Product x7 = new Product("케잌",4500);
								basket.add(x7);
								break;
							case "x":
								System.out.println("초기 화면으로 갑니다.");
								break loop_c;
							default:
								System.out.println("옵션에 없습니다. 다시 해주세요.");
								break;
							}
						}
					break;
					
				case "x":
					System.out.println("프로그램을 종료합니다.");
					int count = basket.size();
					System.out.println("장바구니에 담긴 상품 갯수: " + count);
					int sum = 0;
					for(int i = 0; i < basket.size(); i++) {
						sum = sum + basket.get(i).price;
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
