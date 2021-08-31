package quiz03;

public class MainAccount {

	public static void main(String[] args) {
		
		Account myAcc = new Account("홀깅동", "1234", 3600);
		
		myAcc.deposit(800);
		myAcc.withDraw(1900);
		
		int bal = myAcc.getbalance();
		System.out.println(myAcc.name + "님의 계좌 잔액은: " + bal + "원입니다.");
		
		Account mAcc = new Account("홍", "1234", 3000);
		myAcc.withDraw(4000);
	}
}
