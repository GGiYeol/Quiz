package quiz01;

public class Quiz08 {
	
	public static void main(String[] args) {
		
		String [] arr = {"안녕하세요", "hi", "니취팔로마", "!@$"};
		
		/*
		 * Math.random()을 이용해서 0~3까지의 랜덤수를 발생시키고,
		 * 해당 인덱스를 배열에 적용해서 , 선택된 값이 한국어, 영어, 중국어, 외계어인지 구별하면 됩니다.
		 */
		
		int r = (int)(Math.random() * 4);
		System.out.println(arr[r]);
		switch (arr[r]) {
		
		case "안녕하세요":
			System.out.println("한국어");
			break;
		case "hi":
			System.out.println("영어");
			break;
		case "니취팔로마":
			System.out.println("중국어");
			break;
		case "!@$":
			System.out.println("외계어");
			break;
		
		}
	}
}
