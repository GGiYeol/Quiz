package quiz01;

import java.util.Scanner;

public class Quiz22_1 {

	public static void main(String[] args) {
	//사이클이 돌아가는건 반복문으로 표현
	//돌아갈떄마다 랜덤한 수 표현. 반복문 안쪽에 Scanner 표현
		
		Scanner scan =  new Scanner(System.in);
		
		int okCount = 0;
		int noCount = 0;
		while(true) {
			
			int num1 = (int)(Math.random() * 100) +1;
			int num2 = (int)(Math.random() * 100) +1;
		
			System.out.println("-------------------");
			System.out.println(num1 + " + " + num2 + " =? " );
			System.out.println("[문제를 중단하려면 0을 입력하세요]");
			System.out.println(">");
			
			int answer = scan.nextInt();
			if(answer ==0) break;
			
			if(answer == num1 + num2) {
				System.out.println("정답입니다.");
				okCount++;
			}else {
				System.out.println("오답입니다.");
				noCount++;
				
			}
		}
		System.out.println("오답:" + noCount);
		System.out.println("정답:" + okCount);
	}
}
