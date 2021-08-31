package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		//1. 1~100까지의 정수 중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력
			int a = 1;
			while(a<=100) {
				if(a % 3 == 0 | a % 4 == 0)
					System.out.print(a + " ");
				a++;
			}
			System.out.println();//개행
		//2. 1~200까지 정수 중 5의 배수의 합
			int sum = 0;
			int x = 1;
			while(x <=200) {
				if(x %5 ==0) sum +=x;//한줄일때는 {} 생략 가능
				x++;
			}
			System.out.println("2000 까지 4의 배수의 합:" + sum);
			
		//3. 1~200까지 정수 중 4의 배수이면서 8의 배수가 아닌 수의 개수
			int i = 1;
			int count = 0;
			while(i <=200) {
				if(i % 4 == 0 && i % 8 != 0) {
					count++; 
			}
			i++;
			}
			System.out.println("200까지의 개수:" + count);
			
		//4. 두 정수를 입력 받아서 두 정수 사이의 합(같은 경우는 없다.)
			//입력값 : 5,1 -> 출력값 : 1+2+3+4+5 = 15
			//큰수와 작은수를 먼저 구별 한 후 반복문
			/*
			Scanner scan = new Scanner(System.in);
			System.out.print("입력값: ");
			int b1 = scan.nextInt();
			int b2 = scan.nextInt();
			int b3 = 0;
			
			if(b1 < b2) {
				while(b1<=b2) {
					b3 += b1;
					System.out.print("출력값: " + b1 + "=" + b3);
					b1++;
				}
				
				
			}else {
				while(b2<=b1) {
					b3 +=b2;
					b2++;
			}
				System.out.println("출력값: " + b2 + "+" + "=" + b3);
			}
			*/
			//4_1 강사님
			Scanner scan1 = new Scanner(System.in);
			System.out.println(">");
			int num1 = scan1.nextInt();
			System.out.println(">");
			int num2 = scan1.nextInt();
			
			int max = num1 > num2 ? num1 : num2;
			int min = num1 < num2 ? num1 : num2;
			//일반적이고 보기 편한 것이 좋다.
			int result = 0;
			while(min <= max) {
				result += min;
				min++;
			}
			System.out.println("두 수의 합:" + result);
	}
}
