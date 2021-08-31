package quiz10;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard key;
	private Mouse mouse;
	private Monitor mo;
	
	
	//기본생성자를 생성하고(public), 변수를 클래스로 초기화 하세요
	public Computer() {
		this.key = new KeyBoard();
		this.mouse = new Mouse();
		this.mo = new Monitor();
	}

	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	void computerInfo() {
		key.info();
		mouse.info();
		mo.info();
	}

	
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKey() {
		return key;
	}

	public void setKey(KeyBoard key) {
		this.key = key;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Monitor getMo() {//변수명을 따라감(클래스명 x)
		return mo;
	}

	public void setMo(Monitor mo) {
		this.mo = mo;
	}
	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
