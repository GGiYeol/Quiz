package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		Monitor mo1 = c.getMo();
		mo1.info();
		c.computerInfo();
	}
}
