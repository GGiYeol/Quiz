package quiz01;

import java.util.Scanner;

public class Quiz23_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("금액을 투입하세요>");
		
		int money = scan.nextInt();
		
		ex : while(true) {
			System.out.println("남은금액" + money + "원");
			System.out.println("[1] 덤이소다:400원, [2] 밀킥스:500원, [3]코가콜라:600원, [4]잔돈받기");
			System.out.println(">");
			int menu =  scan.nextInt();
			
			//boolean flag = false; //탈출을 위한 변수
			switch (menu) {
			case 1:
				if(money>=400) {
					money-=400;			
				}else {
					System.out.println("금액이 부족합니다.");
				}
					break; //해당 스위치 구문을 빠져나가는 기능.
			case 2:
				if(money>=500) {
					money-=500;			
				}else {
					System.out.println("금액이 부족합니다.");
				}
					break;

			case 3:
				if(money>=600) {
					money-=600;			
				}else {
					System.out.println("금액이 부족합니다.");
				}
					break;

			case 4:
					System.out.println("남은 금액:" + money + "를 반환합니다");
					
					//flag = true;
					break ex;

			default:
				System.out.println("메뉴를 정확시 입력하세요");

				break;
			}
			//if(flag) break;//true 라면 탈출
		}//복잡한 반복문 안에서 실행여부를 알아볼때 변수의 사용 가능
		
	}
}
