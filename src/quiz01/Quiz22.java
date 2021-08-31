package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int cor = 0;
		int wrong = 0;
		while(true) {
			int a = (int)(Math.random() * 100) +1;
			int b = (int)(Math.random() * 100) +1;
			System.out.println(a + " + " + b + "= + ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print(">");
			
			int dap = scan.nextInt();
			
		if(dap == 0) {
			System.out.println("프로그램을 종료합니다.");
			System.out.println("----------------------");
			System.out.println("정답 횟수: " + cor + "회");
			System.out.println("틀린 횟수: " + wrong + "회" );
			break;
		}else if(a + b != dap) {
			System.out.println("틀렸습니다!");
			System.out.println("----------------------");
			wrong++;
		}
		else if(a + b == dap) {
			System.out.println("정답입니다!");
			System.out.println("----------------------");
			cor ++;
			break;
		}
		
	   }
	}
}
