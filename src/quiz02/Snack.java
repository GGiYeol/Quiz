package quiz02;

public class Snack {

	int mount;
	int price;
	String name;
	String flav;
	
	Snack(){
		
	}
	
	Snack(int sMount, int sPrice, String sName, String sFlav){
		mount = sMount;
		price = sPrice;
		name = sName;
		flav = sFlav;
	}

	
	void info() {
		System.out.println("-------------------");
		System.out.println(name);
		System.out.println(flav);
		System.out.println("양:" + mount + "g");
		System.out.println("가격:" + price + "원");
		
	}
}
