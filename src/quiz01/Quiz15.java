package quiz01;

import java.util.Arrays;

public class Quiz15 {

	public static void main(String[] args) {
		
		int x = 50;
		int y = 100;
		//두 수를 바꾸는 방법(swap) ->하나의 가짜 상자(temp)를 이용한다.
		int temp = y;
		temp = y;
		y = x;
		x = temp;
		//배열안에 있는 위치를 바꿀때
		System.out.println(x  + "  " +  y);
		
		//#아래 배열에서 절대 중복되지 않는 값을 3개 추출해서 새로운 배열을 만드는 과정.
		int[] arr = {1,2,3,4,5,6,7,8,9};
		//1.랜덤수를 생성하고 랜덤 index번째 값과 위치를 변경.(배열을 랜덤하게 섞는다.)9번 하면 된다 //*복습*
		for(int a = 0 ; a <=8 ;a ++ ) {//(int a =0 ; a < arr.length; a ++)
			int ran = (int)(Math.random() * arr.length/*개수*/ ) /*+시작 값*/ ;//arr.length(=9),(0~8) 
			int c = arr[a];
			arr[a] = arr[ran];
			arr[ran] = c;
			System.out.println(Arrays.toString(arr)); //랜덤하게 섞인 값들이 나온다.
		}
		System.out.println(arr[0]+ " " + arr[1] + " " + arr[2]);
		//2.0~2번째 값을 길이가 3인 배열에 담아주면 됩니다.
		int[] arr2 = {arr[0], arr[1], arr[2]};
		int[] arr3 = new int[3];
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr3));
	}
}

/*
for(int i = 2; i<=9 ; i++) {    //i가 2~9까지 일때 9번씩 돈다(바깥회전수 * 안의 회전수)//
	for(int j = 1; j<=9; j++) {  
	}
}	

	}
}*/