package quiz09;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("----------문제1----------");
		/* 문제1
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		User user1 = new User("홍길동", 123123, 20);
		user1.info();
		//생성자를 통해 만들면서 바로 집어넣어도 되고, get set을 이용해서 해도된다.
		
		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		//클래스도 참조타입이 될 수 있다.(데이터타입)
		User[] arr = new User[2];//클래스를 통채로 저장할 수 있는 배열
		User user2 = new User("김길동", 456456, 30);
		arr[0] = user1;
		arr[1] = user2;
		//향상된 포문for(꺼낼수 있는 타입의 선언 :배열 )
		for(User user : arr) {
			//System.out.println(user); 주소만 나옴. 한단계 더 해줘야함(getter)
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println(user.getRrn());
		}
		System.out.println("----------문제3----------");
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		Scanner scan = new Scanner(System.in);
		User[] arr2 = new User[5];
		
		int i = 0;
		while(i<arr2.length) {
			System.out.println("이름>");
			String name = scan.next();
			System.out.println("번호>");
			int rrn = scan.nextInt();
			System.out.println("나이>");
			int age = scan.nextInt();
			
			User u = new User(name, rrn, age);
			arr2[i] = u;
			
			i++;
			System.out.println(Arrays.toString(arr2));
			//값을 뽑고 싶으면 2번문제처럼 돌려서 뽑으면 된다.
		}
		
		
		
		
		
		
		
		
	}
}
