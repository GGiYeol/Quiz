package quiz01;

public class Quiz16 {

	public static void main(String[] args) {
		
		for(int a = 1; a<=9; a++) {
			for(int b = 1; b<=a; b++) {//미만 일때는 i+1
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int a = 1; a<=9; a++) {
			for(int b = 9; b>=a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k = 1; k <=8; k++) {
			for(int l = 8; l>=0 ; l-- ) {
				if(k<=l) {
					System.out.print(" ");
					
				}else if(l-k<l) {
					System.out.print("*");
				} 
			}
			System.out.println();
		}
	}
}
