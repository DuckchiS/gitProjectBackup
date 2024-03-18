package com.peisia.c.kioskV2;

public class ProcMenuDessert {
	
	public void run() {
		loop_c:
		while(true) {
			System.out.println("==================================");
			System.out.println("============= 디저트 리스트    =======");
			System.out.println("==================================");
			Kiosk.p5.info();
			Kiosk.p6.info();
			Kiosk.p7.info();
			System.out.println("=======디저트를 주문하세요.=======");
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("마카롱를 주문했습니다.");
				Kiosk.basket.add(Kiosk.p5);
				break;
			case "2":
				System.out.println("쿠키를 주문했습니다.");
				Kiosk.basket.add(Kiosk.p6);
				break;
			case "3":
				System.out.println("케잌를 주문했습니다.");
				Kiosk.basket.add(Kiosk.p7);
				break;
			case "x":
				System.out.println("초기 화면으로 갑니다.");
				break loop_c;
			default:
				System.out.println("옵션에 없습니다. 다시 해주세요.");
				break;
			}
		}	
	}

		
}
