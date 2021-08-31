package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		System.out.print("구구단 단수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = 0;
		int c = 0;
		System.out.println("랜덤 구구단" + a + "단" );
		System.out.println("========================");
		while(b<9) {
			b++;	
		c = a * b;
		
		System.out.println(a + " x " + b + " = " + c );
		}

	}
}
