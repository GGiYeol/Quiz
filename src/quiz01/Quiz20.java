package quiz01;

import java.util.Arrays;

public class Quiz20 {

	public static void main(String[] args) {
		//중첩 반복문을 이용해서 정렬 //스왑(swap)
		//정렬의 알고리즈을 알아야함 (선택, 버블, 퀵)
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
//		for(int i = 0; i<arr.length-1; i++) {
//			
//			for(int j = i+1; j<arr.length; j++ ) {
//				
//				//System.out.println(i + "-" + j);
//				if(arr[i] > arr[j]) {
//					int temp =arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//		}
//		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr); //정렬해주는 Arrays.sort();
		System.out.println(Arrays.toString(arr));
	}
	
}
