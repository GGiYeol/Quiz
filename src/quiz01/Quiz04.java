package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		System.out.print(">");
		int a1 = scan.nextInt();
		System.out.print(">");
		int a2 = scan.nextInt();
		
		if(a1 > a2) {
			System.out.println(a1 + "가 더 큰수입니다.");
		}else if(a1 < a2) {
			System.out.println(a2 + "가 더 큰수입니다.");
		}else {
			System.out.println("같은 수 입니다.");
		}
	}
}
