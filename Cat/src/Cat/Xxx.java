package Cat;

public class Xxx {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
		
		cat1.info();
		cat2.name = "키티";
		cat2.age = 10;
		cat2.info();
		cat3.age = 3;
		cat3.name = "웨이";
		cat3.info();
	}
}
