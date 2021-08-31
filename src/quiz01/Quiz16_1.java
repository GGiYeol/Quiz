//강사님
package quiz01;

public class Quiz16_1 {

	public static void main(String[] args) {
		
		int star = 5;
		for(int i = 1; i<=star; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a = 1; a<=star; a++)
		{
			for(int b =1; b <=star-a; b++) {//공백출력
				System.out.print(" ");
			}
			for(int c= 1; c<=2*a-1; c++) {//별출력
				System.out.print("*");
			}
			System.out.println();
			
			//머릿으로 알고리즘을 찍어보고, 규칙을 찾아본다.
		}
	}
}
