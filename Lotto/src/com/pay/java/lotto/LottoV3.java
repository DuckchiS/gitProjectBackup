package com.pay.java.lotto;

public class LottoV3 {
	public void random3() {
		int userLotto[] = new int[6];
		int comLotto[] = new int [6];
		int bouns = 0;
		int win = 0;
		String str = "";
		
		for(int i = 0; i < userLotto.length; i++) {
			userLotto[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++) {
				if(userLotto[i] == userLotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int k = 0; k < userLotto.length; k++) {
			System.out.println("유저: " + userLotto[k]);
		}
		
		for(int a = 0; a < comLotto.length; a++) {
			comLotto[a] = (int)(Math.random() * 45 + 1);
			for(int b = 0; b < a; b++) {
				if(comLotto[a] == comLotto[b]) {
					a--;
					break;
				}
			}
		}
		
		for(int c = 0; c < comLotto.length; c++) {
			System.out.println("컴퓨터: " + comLotto[c]);
		}
		
		
		if(bouns != comLotto[0] && bouns != comLotto[1]
				&& bouns != comLotto[2] && bouns != comLotto[3]
						&& bouns != comLotto[4] && bouns != comLotto[5]) {
			bouns = (int)(Math.random() * 45 + 1);
		}
		System.out.println("보너스 번호:" + bouns);
		
		
		for(int q = 0; q < 6; q++) {
			for(int w = 0; w < 6; w++) {
				if(userLotto[q] == comLotto[w]) {
					win = win + 1;
				}
			}
		}
		System.out.println("맞춘 갯수: " + win);
		
		switch (win) {
		case 0:
		case 1:
		case 2:
			str = "꽝";
			break;
		case 3:
			str = "5";
			break;
		case 4:
			str = "4";
			break;
		case 5:
			str = "3";
			if(bouns == userLotto[0] && bouns == userLotto[1]
					&& bouns == userLotto[2] && bouns == userLotto[3]
							&& bouns == userLotto[4] && bouns == userLotto[5]) {
				str = "2";
			}
			break;
		case 6:
			str = "1";
			break;
		}
		System.out.println(str + "등 입니다.");
	}
}
