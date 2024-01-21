package day10.라이브러리테스트;

import day10.길드가입신청서;

public class 준태님테스트 {

	public static void main(String[] args) {		 
		
		길드가입신청서  a= new 길드가입신청서();
		a.신청("길동", 25, "학생", 2);
		
		String result  = a.접수완료();		
		System.out.println( result);
		

	}

}
