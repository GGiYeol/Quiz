package quiz01;

import java.util.Scanner;

public class Quiz18_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int w = scan.nextInt();
		System.out.print("세로>");
		int h = scan.nextInt();
		
		for(int i =1; i<=h ; i++) {
			for(int j = 1; j<=w; j++) {
				if(i ==1||i ==h) {
					System.out.print("*");
				}else {
					if(j ==1 ||j ==w) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	
	}
}
