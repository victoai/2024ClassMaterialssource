package day8;

public class 문자연습하기 {

	public static void main(String[] args) {
		//문자는 숫자로 저장됨 키코드라고 함 
		//'a' =97로 저장
		//'0' => 48로 저장
		// '1' =>49		
		//문자 '1'  => 숫자 1로 변환하고 싶다면 48를 빼줌
		//문자
		char ch='a';	
		// 문자
		// 문자 2를 숫자로 바꾸고 싶다면  48을 빼줘야 함
		char ch2= '2';    
		int  su = ch2 - 48;
		System.out.println( su);
		
		
		String str="25";		
		char su1 =str.charAt(0); // '2'
		char su2 = str.charAt(1);  //'5';
		
		// 문자 -> 숫자로 바꾸는 작업
		// 자리값도 고려해야 함   
		

	}

}
