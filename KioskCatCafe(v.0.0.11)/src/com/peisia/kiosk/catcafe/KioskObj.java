package com.peisia.kiosk.catcafe;

import java.util.ArrayList;
import java.util.Scanner;

import com.peisia.kiosk.catcafe.product.Dessert;
import com.peisia.kiosk.catcafe.product.Drink;
import com.peisia.kiosk.catcafe.product.Product;

public class KioskObj {
	public static ArrayList<Order> basket = new ArrayList<>();	//주문들
	public static ArrayList<Product> products = new ArrayList<>();	//상품들
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static void productLoad() {
		products.add(new Drink("커피",1000));	////	상품목록 처리	////
		products.add(new Drink("오렌지쥬스",2000));
		
//		product.add(new xxxxx("yyyy",1000));길게 플어서 쓴거
//		Dessert d = new Dessert("쿠키", 1200);
//		Product p = (Product)d;
//		products.add(p);
		
		products.add(new Dessert("마카롱",3000));
//		products.add(new Product("키티피규어",10000));
	}
}
