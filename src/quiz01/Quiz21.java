package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		
		//버블정렬-
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

//퀵정렬