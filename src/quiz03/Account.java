package quiz03;

public class Account {

	String name;
	String password;
	int balance;
	
	Account(String nName, String nPassword, int nBalance){
		name = nName;
		password = nPassword;
		balance = nBalance;
	}
	
	void deposit(int a) {
		balance += a;
	}
	
	void withDraw(int a) {
		if(a>balance) {
			System.out.println("잔액이 부족합니다.");
		} else {
			balance -=a;
		}
	}
	
	int getbalance() {
				
		return balance;
	}
}
