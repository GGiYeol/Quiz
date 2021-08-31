package quiz01;

public class Quiz14 {
	
	public static void main(String[] args) {
		//1. 랜덤수 2~9까지 랜덤 정수를 만들고, 구구단을 출력
		int a = (int)(Math.random() * 8) + 2;
		int c = 0;
		for(int b = 1 ;  b <= 9; b ++ ) {
			c = a * b;
			//System.out.println(a + "*" + b + "=" +c);
			//변수와 문자열의 길이가 길어질때는 printf를 써서 깔끔하게 쓰는 것이 좋다.
			System.out.printf("%d x %d = %d \n" , a,b,c);
		}
		
		//2. 50에서 100까지 두 수 사이의 합.
		int sum = 0;
		for(int d = 50; d <=100; d++ ) {
			sum +=d;
		}
		System.out.println("두 수의 사이의 합: " + sum);
		//3. A~Z까지 문자를 가로로 출력(A = 65 Z = 90)
		//char로 반복문 돌아갈 수 있음
		for(char e = 65; e <=90; e++) {/*char e = 'A' , e<= 'Z' 라고 써도 된다*/
			System.out.print(e + " ");
		}
		System.out.println();
		//4. 200까지 정수중의 if문을 사용하지 않고 짝수만 출력 /*복습*
		for(int f = 2; f <=200; f = f + 2) //f +=2(f = f + 2)
		{
			System.out.print(f + " ");
			}
		}
	}

