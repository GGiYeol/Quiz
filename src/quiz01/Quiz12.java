package quiz01;

import java.util.Scanner;

public class Quiz12 {

	 public static void main(String[] args) {
		 
		 System.out.print("정수입력>");
		 Scanner scan = new Scanner(System.in);
		 /* 강사님 코드
		 int k = 1;
		 int sum1 = 0; //합계변수
		 while(k != 0) {
			 System.out.println(">");
			 k = scan.nextInt();
			 sum1 += k;
		 }
		 System.out.println("합:" + sum1);
		 */
		 int sum = 0;
		 int a = scan.nextInt(); ;
		 sum = a;
		while(a != 0) {
			
			System.out.print("정수입력>");
			a = scan.nextInt();
			sum += a;
		}
		
		System.out.println("출력값" + sum);
	}
	 /*
	  *nextint가 계속 돌고 있으므로, while문안에 들어가 있어야 한다.
	  *조건은 0을 받지 않으면 계속 돌아야한다.
	  *조건을 하나하나 뜯어서 보기.
	  */
}



