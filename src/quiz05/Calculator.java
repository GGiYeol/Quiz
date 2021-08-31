package quiz05;

public class Calculator {

	double result;
	double pi;
	
	double add(int a) {
		result +=a;
		
		return result;
	}
	double sub(int a) {
		result -= a;
		
		return result;
	}
	double circle(int a) {
		double k = 0;
		k = 2 * pi * a;
		
		return k;
		
	}
	
//	void rect(int a, int b) {
//		if(a == b) {
//			System.out.println("정사각형의 넓이 : "+ a*b);
//		}else {
//			System.out.println("직사각형의 넓이 : " + a * b);
//		}
//	}
//	
//	void rect(int a, int b, int c) {
//		System.out.println("직육면체의 넓이: " + ((a * b) + (a * c) + (b * c)) * 2 );
//	}
}
