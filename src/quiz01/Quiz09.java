package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		//간단한 사칙연산이 되는 간략한 프로그램
		System.out.print("정수1>");
		Scanner scan1 = new Scanner(System.in);
		int a1 = scan1.nextInt();
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		Scanner scan2 = new Scanner(System.in);
		String b = scan2.next();
		System.out.print("정수2>");
		Scanner scan3 = new Scanner(System.in);
		int a2 = scan3.nextInt();
		
		switch (b) {
		case "+":
			System.out.print("두 수의 덧샘은: " + (a1 + a2));
			break;
		case "-":
			System.out.print("두 수의 뺄셈은: " + (a1 - a2));
			break;
		case "*":
			System.out.println("두 수의 곱샘은: "+ (a1 * a2));
			break;
		case "/":
			System.out.println("두 수의 곱샘은: " + (a1 / a2));
		default:
			System.out.println("연산자를 잘못 입력하셨습니다");
			break;
		}
	}	
}
