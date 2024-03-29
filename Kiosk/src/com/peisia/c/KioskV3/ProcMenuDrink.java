package com.peisia.c.KioskV3;

import com.peisia.c.KioskV3.product.Drink;

public class ProcMenuDrink {
	public static void run() {
		System.out.println("==================================");
		System.out.println("============= 음료 리스트    =======");
		System.out.println("==================================");
		loop_b:
		while(true) {
			for(Product p : KioskObj.product) {
				if(p instanceof Drink) {
					System.out.println(p.name + " " +p.price + "원");
				}
			}
			
			System.out.println("[1.아메리카노/2.초코라떼/3.바닐라라떼/4.녹차라떼/5.주스/x.이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch (KioskObj.cmd) {
			case "1":
				ProcMenuOptionHotCold.run(0);
				break;
			case "2":
				ProcMenuOptionHotCold.run(1);
				break;
			case "3":
				ProcMenuOptionHotCold.run(2);
				break;
			case "4":
				ProcMenuOptionHotCold.run(3);
				break;
			case "5":
				System.out.println(KioskObj.product.get(4).name + " 선택했습니다.");
				KioskObj.basket.add(new Order(KioskObj.product.get(4)));
				break;
			case "x":
				System.out.println("이전 화면으로 이동");
				break loop_b;
			default:
				System.out.println("옵션에 없습니다. 다시 해주세요.");
				break;
			}
		}
	}
}
