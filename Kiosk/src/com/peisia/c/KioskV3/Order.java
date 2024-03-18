package com.peisia.c.KioskV3;

public class Order {
	public Product selectProduct;
	int optionHotCold = 0;	//1.hot 2.cold
	int optionDessert = 0; 	//1.plain 2.choco 3.cheese
	int optionCharacter = 0; 	//1.Ahri 2.Timo 3.Zed
	int optionSize = 0;		//1.regular 2.large 3.venti
	
	public Order(Product selectProduct) {
		this.selectProduct = selectProduct;
	}
	
//	public Order(Product selectProduct, int optionHotCold) {
//		this.selectProduct = selectProduct;
//		this.optionHotCold = optionHotCold;
//	}
	
	public Order(Product selectProduct, int optionHotCold, int optionSize) {
		this.selectProduct = selectProduct;
		this.optionHotCold = optionHotCold;
		this.optionSize = optionSize;
	}
	
	public Order(Product selectProduct, int optionCharacter) {
		this.selectProduct = selectProduct;
		this.optionHotCold = optionHotCold;
	}
	
	public Order(int optionDessert, Product seleProduct) {
		this.selectProduct = seleProduct;
		this.optionDessert = optionDessert;
	}
}
