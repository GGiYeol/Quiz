package quiz01;

public class Quiz17 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=9; i++) {
			for(int j = 1; j<=3; j++) {// \t 여덟칸 띄어쓰기
				System.out.print(j + " x " + i + " = " +  i * j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i<=9; i++) {
			for(int j = 4; j<=6; j++) {// \t 여덟칸 띄어쓰기
				System.out.print(j + " x " + i + " = " +  i * j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i<=9; i++) {
			for(int j = 7; j<=9; j++) {// \t 여덟칸 띄어쓰기
				System.out.print(j + " x " + i + " = " +  i * j + "\t");
			}
			System.out.println();
		} 
	}
}
