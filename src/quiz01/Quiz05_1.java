package quiz01;

import java.util.Scanner;

public class Quiz05_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		System.out.print(">");
		
		int num = scan.nextInt();
		
		if(num>=0) {
			if(num == 0) {
				System.out.println("0입니다.");
			}else if (num % 2 == 0) {
				System.out.println(num + "은 짝수 입니다.");
			}else {
				System.out.println(num + "은 홀수 입니다.");
			}
			}else {
				System.out.println(num + "은 음수 입니다.");
			}
		}
		
}
