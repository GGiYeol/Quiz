package quiz08;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("떳가땻가비행기");
		ap.takeOff();
		ap.fly(); //어버라이딩된 메서드
		ap.flymode = 1;
		ap.fly();
		ap.land(); //물려받은
		System.out.println("이름: " + ap.info());
		

		
	
	
	
	}
}
