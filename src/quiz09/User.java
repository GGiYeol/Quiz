package quiz09;

public class User {

	private String name;
	private  int rrn;
	private int age;
	//프라이빗은 게터, 세터를 만들어줘야한다.
	public User() {
		
	}
	
	public User(String name, int rrn, int age) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRrn() {
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void info() {
		System.out.println( name + rrn + age);
	}
	
}
