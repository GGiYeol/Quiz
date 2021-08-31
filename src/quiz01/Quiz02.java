package quiz01;

public class Quiz02 {
	public static void main(String[] args) {
		
		//1. 1~100까지 랜덤한 수를 만들고 짝, 홀수를 판별.
		//100곱하고 1더한다
		/*int r = (int)(Math.random() * 100) + 1;
		System.out.println("랜덤값" + r);
		System.out.println( r % 2 == 0 ? "짝수 " : "홀수 ");
		
		
		
		
		//2. -5~5까지 랜덤한 수를 만들고, 절대값으로만 출력해주세요.
		 int r2 = 5 - (int)(Math.random() * 11);
		System.out.println("랜덤값" + r2);
		System.out.println("절대값" +  (r2 < 0 ? -r2 : r2));
		*/
		
		//삼항연산자 안에는 삼항연산자가 들어갈 수 있습니다.(한번 더)->소괄호만 잘 쳐주면 된다.	
		//3. 1~150까지의 랜덤한 수를 사과의 개수로 가정.
		//bucket은 사과를 담을 수 있는 양
		//ex) 사과가 148개? 버켓은 15개가 필요함, 사과가 150개 ? 15개
		//사과/바구니가 0이면 그대로 가져가고 0이 아니면 몫 + 1을 하면 된다.
		int bucket = 10;
		int apple = (int)(Math.random() * 150) + 1;
		System.out.println("사과의 개수 : " + apple);
		System.out.println("바구니의 개수 : " + (apple % bucket == 0 ? apple / bucket : apple / bucket + 1 ) );
		
	}
}
