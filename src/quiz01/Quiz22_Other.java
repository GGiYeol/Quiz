package quiz01;

import java.util.Scanner;

public class Quiz22_Other {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dap = 0;
		int odap = 0;
		
		while(true) {
			int num1 = (int)(Math.random() * 100) + 1;
			int num2 = (int)(Math.random() * 100) + 1;
			int pan = (int)(Math.random() *2) ;
			
			String[] arr = { "+" , "-"};
			System.out.println("-------------------------");
		
			if(arr[pan] == "+") {
				System.out.println(num1 + " + " + num2 + "=?");
				System.out.println("문제를 중단하려면 0을 입력하세요");
				System.out.print(">");
				int answer = scan.nextInt();
				if(answer ==0) break;
				if(answer == num1 + num2) {
					System.out.println("정답입니다");
					dap ++;
				}else {
					System.out.println("오답입니다");
					odap++;
				}
				
				
			}else {
				System.out.println(num1 + " - " + num2 + "=?");
				System.out.println("문제를 중단하려면 0을 입력하세요");
				System.out.print(">");
				int answer = scan.nextInt();
				if(answer ==0) break;
				if(answer == num1 - num2) {
					System.out.println("정답입니다");
					dap ++;
				}else {
					System.out.println("오답입니다");
					odap++;
					
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");
		System.out.println("-------------------------------");
		System.out.println("오답:" + odap);
		System.out.println("정답:" + dap);
		
	}
}

