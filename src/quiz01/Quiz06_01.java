package quiz01;

import java.util.Scanner;

public class Quiz06_01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("세 수를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = 0, min = 0, mid = 0;
		
		if(num1 > num2 && num1 > num3) { //num1이 가장 큰 경우
			max = num1;// 가장 큰 값
			if(num2 > num3) { //num2가 중간값
				mid = num2;
				min = num3;
			}else { //num3이 중간값
				mid = num3;
				min = num2;
			}
		}else if(num2 > num1 && num2 > num3) {//num2가 가장 큰 경우
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			}else {
				mid = num3;
				min = num1;
			}
		}else {//num3이 가장 클 경우
			max = num3;
			if(num2 > num1) {
				mid = num2;
				min = num1;
				
			} else {
				mid = num1;
				min = num2;
			}
		}
		System.out.println("max:" + max + "mid:" + mid + "min:" + min);
	}
}
