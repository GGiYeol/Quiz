package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입해 주세요>");
		int don = scan.nextInt();
		int jandon = don;
		while(jandon>=0) {
			System.out.println("남은금액 : " + jandon);
			System.out.println("[1] 덤이소다:400원, [2] 밀킥스:500원, [3]코가콜라:600원, [4]잔돈받기");
			System.out.print("음료수 선택>" );
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.println("덤이소다를 받았습니다");
				jandon = jandon - 400 ;
				break;
			case 2:
				System.out.println("밀킥스를 받았습니다.");
				jandon = jandon - 500 ;
				break;
			case 3:
				System.out.println("코가골라를 받았습니다.");
				jandon = jandon - 600 ;
				break;
			case 4:
				System.out.println("남은 금액" + jandon + "을 반환합니다");
				break;
			}
			
		}System.out.println("금액이 부족합니다");
		
	}
}
