package com.peisia.c.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// 키 - 밸류	
		// id	
			
		// 1. dsfskflksdfalka 개	
		// 2. dfsfasfsfsfdffs 고양이	
		// 3. dfsfasfsfsfdffs 고양이2	
			
		HashMap<String, String> hs = new HashMap<>();
		
		// <>두번째 타입에 String 외에 다 올수 있음.
//		HashMap<String, Product> ps  = new HashMap<>();	
			
		//0 커피	
		//1 오렌지주스	
		//2 쿠키	

		//데이터 삽입 순서는 상관 없음
		//키는 고유 값을 지정하고 값은 타입에 맞춰 넣으면 됨
		hs.put("M-S-003", "사자");	
		hs.put("M-S-001", "개");	
		hs.put("M-S-002", "고양이");
		
		//같은 키에 데이터를 넣으면 기존 데이터가 지워짐
		hs.put("M-S-002", "고양삼");	
			
		String cat = hs.get("M-S-002");
		System.out.println(cat);
			
		////	이 방식으로 꺼내면 에러남. 	
//		for(String s:hs) {	
//			
//		}	
			
		////	한방에 다 값들 꺼내려면 아래쪽 방식으로 해야함.
		Set<String> keys = hs.keySet();	// 1. 셋 형태의 키 모음을 꺼낸 다음	
		
		//2. 그다음에 이 키 리스트를 순회하면서
		for(String s:keys) {	
			System.out.println(s);
			System.out.println(hs.get(s));	// 3. 값 꺼내면 됨.
		}
		
		Map<String, Map<String, String>> bookMap = new HashMap<>();
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("더 해빙", "이서윤, 홍주연");
		map1.put("말 그릇", "김윤나");
		map1.put("메모의 마법", "마에다 유지");
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("어린왕자", "생텍쥐페리");
		map2.put("아몬드", "손원평");
		map2.put("나미야 잡화점의 기적", "히가시노 게이고");
		map2.put("해변의 카프카", "무라카미 하루키");
		
		Map<String, String> map3 = new HashMap<>();
		map1.put("시간은 흐르지 않는다", "카를로 로벨리");
		map1.put("코스모스", "칼 세이건");
		map1.put("평행우주", "미치오 카쿠");
		
		bookMap.put("자기개발", map1);
		bookMap.put("소설", map2);
		bookMap.put("과학", map3);
		
		System.out.println(bookMap);
	}
}
