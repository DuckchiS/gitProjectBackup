package com.pay.java.array;

public class Main {
	public static void main(String[] args) {
		//정수형 배열
				int n[] = new int[2];
				n[0] = 1;
				n[1] = 2;
				System.out.println(n[0]);
				System.out.println(n[1]);
				
				//문자열 배열
				String s[] = new String[3]; 
				s[0] = "개";
				s[1] = "고양이";
				s[2] = "삶이다";
				
				System.out.println(s[0]);
				System.out.println(s[1]);
				System.out.println(s[2]);
				
				//배열 선언 법 - 2.바로 값도 주는 선언(방식1)
				int m[] = new int[]{3,4};
				
				System.out.println(m[0]);
				System.out.println(m[1]);
				
				//배열 선언 법 - 3.바로 값도 주는 선언(방식2)
				int x[] = {5,6};
				
				System.out.println(x[0]);
				System.out.println(x[1]);
				
	}
}