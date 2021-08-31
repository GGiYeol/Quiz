package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요>");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum = 0;
		for(int i = 1; i<=a; i++) {
			//i값을 판별
			int count = 0;
			for(int j = 1; j<=i; j++) {
				if(i % j == 0)
			{
				count++; //count의 수가 2개면 소수
			
			}
		}
		if(count == 2) {  //i의 약수의 개수가 2개 이므로 i는 소수이다.
			sum  += i;
		}
		}
		System.out.println("1에서" + a + "까지 합:" + sum);
	}
}
