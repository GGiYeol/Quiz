package quiz01;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		//가로 세로를 입력받아 직사각형 출력 /단 윤곽만 출력
		System.out.print("가로>");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.print("세로>");
		int y = scan.nextInt();
		
		for(int a =1; a<=x; a++) {
			for(int b= 1; b<=y; b++) {
				if(a == 1 | a == x | b ==1 | b == y) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
