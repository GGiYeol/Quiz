package quiz02;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, 100);
		p1.info();
		
		System.out.println("--------------------");
		/*매개변수를 생성하는 생성자를 만들면, 기본생성자를 자동으로 만들어주지
		 *않는다. 그래서 직접 만들어줘야한다. ->클래스 안에 기본생성자 만들기
		 */
		Person p2 = new Person();
		p2.age = 40;
		p2.name = "김길동";
		p2.tall = 170;
		
		p2.info();
		
	}
	
}
