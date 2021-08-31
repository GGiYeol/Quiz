package quiz06;

public class ArrayPrint {

	//Array.toString기능을 따라해보기(int 배열, String배열, char 배열을)
	//배열 내부의 요소를 문자열의 형태로 가로로 반환해주는 메서드를 오버로딩
	
	String arrt(int[] a) {
		String arr = "[";
		for(int i = 0; i<a.length; i++) {
			arr += a[i];
			if(a.length -1 == i) break;
			arr +=", ";
		}
		arr +="]";
		return arr;
	}
	String arrt(char[] a) {
		String arr = "[";
		for(int i = 0; i<a.length; i++) {
			arr += a[i];
			if(a.length -1 == i) break;
			arr +=", ";
		}
		arr +="]";
		return arr;
	}
	String arrt(String[] a) {
		String arr = "[";
		for(int i = 0; i<a.length; i++) {
			arr += a[i];
			if(a.length -1 == i) break;
			arr +=", ";
		}
		arr +="]";
		return arr;
	}
}
