package day16.project;

public class 증감연산자with윤 {

	public static void main(String[] args) {
		 
		// ++는 연산자이다
		//연산하면 연산의 결과발생한다. !!! 
		int a=10;
		int b=10;
		
		int aResult;
		int bResult;
		
		int c  =10+5;  // +연산자
		
		
		aResult = a++;  //  a++을 하면 연산의 결과가 발생합니다.   a   =>11   // a변수의 값을 1 증가 ,  aResult =  후위++는  증가되기 전 
		bResult = ++b;  //  ++b를 하면 연산의 결과가 발생합니다.   b   =>11   // b변수의 값을 1증가 ,   bResult=   전위++는 증가된 후 		
				

		System.out.println( a);
		System.out.println( b);
		
		System.out.println( aResult);
		System.out.println( bResult);
		
		
		// i++ 예시 
		for( int i=1; i<=5; i++) {
			System.out.println("윤님 홧팅");			
		}

	}

}
