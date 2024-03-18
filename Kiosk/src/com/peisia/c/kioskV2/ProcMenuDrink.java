package com.peisia.c.kioskV2;

public class ProcMenuDrink {
	public void run() {
		loop_b:
		while(true) {
			System.out.println("==================================");
			System.out.println("============= 음료 리스트    =======");
			System.out.println("==================================");
			Kiosk.p1.info();
			Kiosk.p2.info();
			Kiosk.p3.info();
			Kiosk.p4.info();
			System.out.println("=======음료를 주문하세요.=======");
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("아아를 주문했습니다.");
				Kiosk.basket.add(Kiosk.p1);
				break;
			case "2":
				System.out.println("뜨아를 주문했습니다.");
				Kiosk.basket.add(Kiosk.p2);
				break;
			case "3":
				System.out.println("바닐라라떼를 주문했습니다.");
				Kiosk.basket.add(Kiosk.p3);
				break;
			case "4":
				System.out.println("초코라떼를 주문했습니다.");
				Kiosk.basket.add(Kiosk.p4);
				break;
			case "x":
				System.out.println("초기 화면으로 갑니다.");
				break loop_b;
			default:
				System.out.println("옵션에 없습니다. 다시 해주세요.");
				break;
			}
		}
	}
}