package quiz01;

public class MethodQuiz01 {
	//항상 우측에서 좌측으로 보는 생각 보기
	public static void main(String[] args) {
		method1();
		System.out.println(method2("c"));
		System.out.println(method3(1,2,1.3));
		System.out.println(method4(2));
		method5("가",5);
		int result = maxNum(1,2);
		System.out.println(maxNum(1, 2));
		int result2 = abs(-1);
		System.out.println(abs(-3));
		System.out.println(seat(3));
	}
	
	static void method1() {
		System.out.println("안녕");
		return;
	}
	
	static String method2(String a) {
		String i = a;
		
		return i;
	}
	static double method3(int a, int b, double c) {
		 double d = 0;
		d = a + b + c;
		return d;
	}
	static String method4(int a) {
		String b = "";
			if(a % 2 == 0 && a !=0) {
				b = "짝수";
			} else {
				b = "홀수";
			}
			
		return b;
	}
//	static void method5(int a, String b) {
//		for(int i = 0; i<a; i++) {
//			System.out.print(b);
//		}
//		System.out.println();
//	}
	static void method5(String a, int b) {
		
		for(int i = 1; 1<=b; i++) {
			System.out.print(a);
		}
	}
	
//	static double maxNum(double a, double b) {
//		if(a > b) {
//			return a;
//		}else return b;
//	}
	static int maxNum(int a, int b) {
//		return a>=b ? a : b ;
		return a == b ? 0 : (a>b ? a : b);
	}
//	static int abs(int a) {
//		if(a >= 0){
//			return a;
//		}else {
//			return a * -1;
//		}
//	}
	static int abs(int a) {
		return a>0 ? a: -a;
	}
	static int seat(int a) {
	  int b = (int)(Math.random() * (a-1)) + 1;
	  int[] arr = new int[a-1];
	  for(int i = 0; i<a; i++) {
		  for(int j = a; j<i; j--) {
			  arr[j - i] = b;
		  }
	  }
			  
	  return arr[a-1];	  
	}
}
