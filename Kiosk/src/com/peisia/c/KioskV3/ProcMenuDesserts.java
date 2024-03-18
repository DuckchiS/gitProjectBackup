package com.peisia.c.KioskV3;

public class ProcMenuDesserts {
	public static void run() {
		System.out.println("==================================");
		System.out.println("============= 디저트 리스트    =======");
		System.out.println("==================================");
		loop_c:
		while(true) {
			System.out.println("[1.마카롱/2.쿠키/3.케잌/x.이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch (KioskObj.cmd) {
			case "1":
				System.out.println(KioskObj.product.get(5).name + " 선택했습니다.");
				KioskObj.basket.add(new Order(KioskObj.product.get(5)));
				break;
			case "2":
				ProcMenuOptionDessert.run(6);
				break;
			case "3":
				ProcMenuOptionDessert.run(7);
				break;
			case "x":
				System.out.println("이전 화면으로 이동");
				break loop_c;
			default:
				System.out.println("옵션에 없습니다. 다시 해주세요.");
				break;
			}
		}	
	}

		
}
