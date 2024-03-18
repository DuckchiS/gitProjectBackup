package com.peisia.c.KioskV3;

public class ProcMenuOptionHotCold {
	public static void run(int product) {
		loop:
			while(true) {
				System.out.println("[1.hot/2.cold/x.이전메뉴로]");
				KioskObj.cmd = KioskObj.sc.next();
				switch (KioskObj.cmd) {
				case "1":
					System.out.println(KioskObj.product.get(product).name + " hot 선택됨. 사이즈 선택을 하시오");
					System.out.println("[1.regular/2.large/3.venti/x.이전메뉴로]");
					KioskObj.cmd = KioskObj.sc.next();
					switch(KioskObj.cmd) {
					case "1":
						System.out.println(KioskObj.product.get(product).name + " hot 선택됨. 이전 메뉴 이동");
						KioskObj.basket.add(new Order(KioskObj.product.get(product),1,1));
						break loop;
					case "2":
						System.out.println(KioskObj.product.get(product).name + " hot 선택됨. 이전 메뉴 이동");
						KioskObj.basket.add(new Order(KioskObj.product.get(product),1,2));
						break loop;
					case "3":
						System.out.println(KioskObj.product.get(product).name + " hot 선택됨. 이전 메뉴 이동");
						KioskObj.basket.add(new Order(KioskObj.product.get(product),1,3));
						break loop;
					case "x":
						System.out.println("이전 메뉴 이동");
						break loop;
					default:
						System.out.println("옵션에 없습니다.");
						break;
					}
					break loop;
				case "2":
					System.out.println(KioskObj.product.get(product).name + " ice 선택됨. 사이즈 선택을 하시오");
					System.out.println("[1.regular/2.large/3.venti/x.이전메뉴로]");
					KioskObj.cmd = KioskObj.sc.next();
					switch(KioskObj.cmd) {
					case "1":
						System.out.println(KioskObj.product.get(product).name + " ice 선택됨. 이전 메뉴 이동");
						KioskObj.basket.add(new Order(KioskObj.product.get(product),2,1));
						break loop;
					case "2":
						System.out.println(KioskObj.product.get(product).name + " ice 선택됨. 이전 메뉴 이동");
						KioskObj.basket.add(new Order(KioskObj.product.get(product),2,2));
						break loop;
					case "3":
						System.out.println(KioskObj.product.get(product).name + " ice 선택됨. 이전 메뉴 이동");
						KioskObj.basket.add(new Order(KioskObj.product.get(product),2,3));
						break loop;
					case "x":
						System.out.println("이전 메뉴 이동");
						break loop;
					default:
						System.out.println("옵션에 없습니다.");
						break;
					}
					break loop;
				case "x":
					System.out.println("이전 메뉴 이동");
					break loop;
				default:
					System.out.println("옵션에 없습니다.");
					break;
				}
			}
	}
}
