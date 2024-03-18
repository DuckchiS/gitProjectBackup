package com.pay.java.lotto;

public class LottoV2 {
	public void random2() {
		int userLotto[] = {1,2,3,4,7,5};
		int comLotto[] = new int[6];
		int bouns = 0;
		int win = 0;
		String str = "";
		
		comLotto[0] = (int)(Math.random() * 45 + 1);
		System.out.println("첫 번째 번호: " + comLotto[0]);
		
		while(true) {
			comLotto[1] = (int)(Math.random() * 45 + 1);
			if(comLotto[0] != comLotto[1]) {
				System.out.println("두 번째 번호: " + comLotto[1]);
				break;
			}
		}
		
		while(true) {
			comLotto[2] = (int)(Math.random() * 45 + 1);
			if(comLotto[0] != comLotto[2] && comLotto[1] != comLotto[2]) {
				System.out.println("세 번째 번호: " + comLotto[2]);
				break;
			}
		}
		
		while(true) {
			comLotto[3] = (int)(Math.random() * 45 + 1);
			if(comLotto[0] != comLotto[3] && comLotto[1] != comLotto[3]
					&& comLotto[2] != comLotto[3]) {
				System.out.println("네 번째 번호: " + comLotto[3]);
				break;
			}
		}
		
		while(true) {
			comLotto[4] = (int)(Math.random() * 45 + 1);
			if(comLotto[0] != comLotto[4] && comLotto[1] != comLotto[4]
					&& comLotto[2] != comLotto[4] && comLotto[3] != comLotto[4]) {
				System.out.println("다섯 번째 번호: " + comLotto[4]);
				break;
			}
		}
		
		while(true) {
			comLotto[5] = (int)(Math.random() * 45 + 1);
			if(comLotto[0] != comLotto[5] && comLotto[1] != comLotto[5] 
					&& comLotto[2] != comLotto[5] && comLotto[3] != comLotto[5]
							&& comLotto[4] != comLotto[5]) {
				System.out.println("여섯 번째 번호: " + comLotto[5]);
				break;
			}
		}
		
		while(true) {
			bouns = (int)(Math.random() * 45 + 1);
			if(bouns != comLotto[0] && bouns != comLotto[1]
					&& bouns != comLotto[2] && bouns != comLotto[3]
							&& bouns != comLotto[4] && bouns != comLotto[5]) {
				System.out.println("보너스 번호: " + bouns);
				break;
			}
		}
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 5; j++) {
				if(userLotto[i] == comLotto[j]) {
					win = win + 1;
				}
			}
		}
		
		System.out.println("당첨 갯수: " + win);
		
		switch (win) {
		case 0:
		case 1:
		case 2:
			str = "꽝 다음 기회에";
			break;
		case 3:
			str = "5등 입니다.";
			break;
		case 4:
			str = "4등 입니다.";
			break;
		case 5:
			str = "3등 입니다.";
			for(int a = 0; a < 6; a++) {
				if(bouns == userLotto[a]) {
					str = "2등 입니다.";
				}
			}
			break;
		case 6:
			str = "1등 입니다.";
			break;
		}
		System.out.println(str);
	}
}
