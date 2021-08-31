package quiz06;

public class ArrayMain {

	public static void main(String[] args) {
		
		int[] c = {1,2,3,4};
//		System.out.println(Arrays.toString(c));
		ArrayPrint main = new ArrayPrint();
		main.arrt(c);
		System.out.println(main.arrt(c));
		
		char[] b = {'a', 'b'};
		System.out.println(main.arrt(b));
		
		String[] d = {"가", "나"};
		System.out.println(main.arrt(d));
	}
}
