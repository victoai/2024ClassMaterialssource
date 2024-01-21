package day6;

public class 은경님배열 {

	public static void main(String[] args) {

		
		//자바 문자표현  : char  :2byte , 한글 한자 표현 가능함 
		// 한 문자 표현함   "가나다라마"
		// 문자열은 char[]로 표현됨 
		// 자바는 문자열을 사용할 수 있는  String 클래스 제공함 
		
		char[] arr_ch = new char[5];
		arr_ch[0] = '가';
		arr_ch[1] = '나';
		arr_ch[2] = '다';
		arr_ch[3] = '라';
		arr_ch[4] = '마';
		System.out.println("\n---------- 배열(char) ----------");
		for (int i = 0; i < arr_ch.length; i++) {
			System.out.println(arr_ch[i]);
		}

	}

}
