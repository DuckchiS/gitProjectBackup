package com.peisia.c.KioskV3;

import com.peisia.c.KioskV3.product.Drink;
import com.peisia.c.KioskV3.product.Products;

public class ProcMenuTumbler {
	public static void run() {
		System.out.println("========================================");
		System.out.println("============= 텀블러&피규어 리스트    =======");
		System.out.println("========================================");
		
		loop_c:
		while(true) {
			for(Product p : KioskObj.product) {
				if(p instanceof Products) {
					System.out.println(p.name + " " +p.price + "원");
				}
			}
			
			System.out.println("[1.텀블러/2.피규어/x.이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch (KioskObj.cmd) {
			case "1":
				ProcMenuOptionCharcter.run(8);
				break;
			case "2":
				ProcMenuOptionCharcter.run(9);
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
