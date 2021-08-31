package quiz03;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("김길동", 3, 100, 40 , 23);
		s1.getTotal();
		s1.getAvg();
		
		Student s2 = new Student("박영하", 4, 90, 60, 34);
		s2.getTotal();
		s2.getAvg();
		
		double pyoeng = s1.getAvg() + s2.getAvg() ;
		System.out.println(pyoeng);
		
	}
}
