package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz13 {

		public static void main(String[] args) {
			
			//1.
			int [] arr = {1000,500,100,50,10};//동전
			int money = 17520; //금액
			
			int a = 0;
			int b = 0;
			while(a < arr.length) {
				b = money / arr[a];
				System.out.println(arr[a] +" 원: " + b );
				//money %= arr[a]; //money = money % arr[a]//나눈 나머지로 치환;
				money = money - (b * arr[a]);
				a++;
			}
			//2.양수를 입력받아, 입력 받은 수 크기의 배열을 생성하세요
			// 배열에 1~입력받은 수 까지 차례대로 값을 넣으세요
			
			System.out.print("수를 입력하세요:");
			Scanner scan =  new Scanner(System.in);
			int im = scan.nextInt();
			int[] iarr = new int[im];
			int k = 0;
			while (k < iarr.length) {
				iarr[k] = k + 1;
				k++;
			}
			System.out.println("배열 iarr는:" + Arrays.toString(iarr));
		}
}
