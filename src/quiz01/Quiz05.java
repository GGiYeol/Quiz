package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		System.out.println("정수를 입력하세요");
		System.out.print(">");
		
		Scanner scan = new Scanner(System.in);
		int su = scan.nextInt();
		
		if(su<0) {
			System.out.println(su + "은(는) 음의 정수입니다.");
		}else if(su == 0) {
			System.out.println("입력한 정수는 0입니다");
		}else if(su % 2 == 0) {
			System.out.println(su + "은(는)짝수 입니다.");
		}else {
			System.out.println(su + "은(는)홀수 입니다.");
		}
		
	}
}
