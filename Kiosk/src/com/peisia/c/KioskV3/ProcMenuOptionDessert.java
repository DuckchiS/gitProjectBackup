package com.peisia.c.KioskV3;

public class ProcMenuOptionDessert {
	public static void run(int product) {
		loop:
			while(true) {
				System.out.println("[1.plain/2.choco/3.cheese/x.이전메뉴로]");
				KioskObj.cmd = KioskObj.sc.next();
				switch (KioskObj.cmd) {
				case "1":
					System.out.println("plain " + KioskObj.product.get(product).name + "선택됨. 이전 메뉴 이동");
					KioskObj.basket.add(new Order(1, KioskObj.product.get(product)));	//오더 추가
					break loop;
				case "2":
					System.out.println("choco " + KioskObj.product.get(product).name + "선택됨. 이전 메뉴 이동");
					KioskObj.basket.add(new Order(2, KioskObj.product.get(product)));	//오더 추가
					break loop;
				case "3":
					System.out.println("cheese " + KioskObj.product.get(product).name + "선택됨. 이전 메뉴 이동");
					KioskObj.basket.add(new Order(3, KioskObj.product.get(product)));	//오더 추가
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
