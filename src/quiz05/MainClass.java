package quiz05;

public class MainClass {

	public static void main(String[] args) {
		/* 요구사항
		 * Calculator를 부모클래스로 선언하세요.
		 * Calculator를 상속받는 Computer클래스 생성 합니다.
		 * 
		 * Calculator의 멤버변수 result, pi를 선언하세요
		 * Calculator의 메서드
		 * add(int) - result에 값을 누적시키는 기능
		 * sub(int) - result에 값을 차감시키는 기능
		 * circle(int) - pi를 이용해서 원의 넓이를 구하는 기능
		 * 
		 * Computer클래스의 메서드
		 * Math.PI를 사용해서 원의넓이를 구하도록 circle메서드를 오버라이딩하세요
		 * 
		 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
		 */
		Computer com =  new Computer();
		System.out.println(com.rect(4));
		System.out.println(com.rect(4, 5));
		System.out.println(com.rect(1, 2, 3));
	}
}
