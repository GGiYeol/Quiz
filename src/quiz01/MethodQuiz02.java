package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		String a = suk(6);
		System.out.println(a);
		int b = sum(4);
		System.out.println(b);
		int c = primeNum(5);
		System.out.println(c);
		System.out.println("7~9사이의 합:" + sumNum(7,9));
		System.out.println("9~7사이의 합:" + sumNum(9,7));
		System.out.println("5~5사이의 합:" + sumNum(5,5));
		System.out.println(jaSum(1562));
		System.out.println(jaSum1(1562));
	}
	static String suk(int a) {
		 String b = "";	
		for(int i = 1; i<=a; i++) {
			if(i % 2 == 0) {
				b += "바";
			} else {
				b +="자";
			}
		}
		return b;
		
	}

	static int sum(int a) {
		int sum = 0;
		for(int i = 1; i<=a; i++) {
			if(a % i == 0) {
				sum +=i;
			}
		}
		return sum;
	}
	
	static int primeNum(int a) {
		int soNum = 0;
		for(int i = 1; i<=a ; i++) {
			int num = 0;
			for(int j = 1; j <=i; j++) {
				if(i % j ==0) {
					num++;
				   }
				}
			if(num == 2) {
				soNum++;
			}
		}
		return soNum;	
	}

	static int sumNum(int a, int b) {
//		int sum = 0;
//		if(a == b) {
//			sum = a;
//		}else if(a > b) {
//			for(int i = b; i<=a; i++) {
//				sum += i;
//			}
//		}else {
//			for(int j = a ; j<=b ; j++) {
//				sum += j;
//			}
//		}
//		return sum;
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		int sum = 0;
		for(int i = min ; i <=max ; i++) {
			sum += i;
		}
		return sum;
	}
	/*
	 * 자연수 자리수의 합 구하기
	 * 자연수 n이 매개변수로 구해지면 n자리수의 합을 구해서 return하는 매서드
	 * 조건
	 * n은 1억 이하의 자연수
	 * n의 자료형을 바꾸면 안됩니다.
	 * ex)10230543 - > 18
	 */
	static int jaSum(int a) {
		int sum = 0;
		while(true) {
			if(a>=1) {
				sum += a%10;
				a = a/10;
			} else break;
		}
		
		return sum;
	}
	static int jaSum1(int a) { //강사님
		int sum = 0;
		for(int i = 100000000; i>=1; i /= 10) {
			if(a / i != 0) { //몫이 있는 경우
				sum += (a / i);//몫을 구해서 누적
				a %=i ;
			}
		}
		return sum;
		
	}
}
