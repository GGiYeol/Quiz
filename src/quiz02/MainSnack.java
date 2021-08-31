package quiz02;

public class MainSnack {

	public static void main(String[] args) {
		
		Snack s1 = new Snack();
		s1.name = "꼬깙콘";
		s1.price = 3000;
		s1.mount = 200;
		s1.flav = "가지맛";
		s1.info();
		
		Snack s2 = new Snack(100 , 2000, "스윈칩" ,"와사비맛");
		s2.info();
    
	
	}
}
