package quiz03;

public class Student {
//getavg()
//100곱하고 casting하고 100나누면 됨.
	
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String sName, int sNo, int sKor, int sEng, int sMath){
		name = sName;
		kor = sKor;
		no = sNo;
		eng = sEng;
		math = sMath;
		
	}
	
	double getTotal() {
		return kor + eng + math;
	}
	//실수로 나눠야 실수 몫이 나누기때문에,형변환을 해줘야한다.
	double getAvg() {
		double avg = (int)(getTotal() / 3 * 100) / 100.00;//같은 클래스 파일의 메서드는 그냥 호출해서 사용가능
		
		return avg;
	}
	
}
