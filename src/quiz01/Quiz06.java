package quiz01;

import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
	
		/*
		 * 정수를 3개 순서대로 입력받습니다.
		 * 가장 큰값, 중간값, 가장 작은 값을 구해서 Max, mid, min 변수에 저장하고
		 * 출력하면 됩니다.
		 */
		System.out.println("정수를 세 개 입력하세요");
		int max = 0, mid = 0, min = 0;
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();
		
		
		if(a1>a2) {
			if(a1>a3) {
				if(a2>a3) {
					max = a1;
					mid = a2;
					min = a3;
				}else {
					max = a1;
					mid = a3;
					min = a2;
							
				}
			}else if(a1<a3) {
				max = a3;
				mid = a1;
				min = a2;
			}
		}else if(a1<a2) {
			if(a1>a3) {
				max = a2;
				mid = a1;
				min = a3;
			}else if(a3<a2){
				max = a2;
				mid = a3;
				min = a1;
			}else {
				max = a3;
				mid = a2;
				min = a1;
			}
		}
		System.out.println("가장 큰값: " + max);
		System.out.println("중간값 " + mid);
		System.out.println("가장 작은값: " + min);
	}
}
