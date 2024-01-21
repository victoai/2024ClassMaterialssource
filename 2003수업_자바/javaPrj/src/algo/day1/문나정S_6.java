package algo.day1;

public class 문나정S_6 {

	public static void main(String[] args) {
		 
		//코드 작성
		// double 자료형 
		double  sum=0;  //항의 누적합 
		int  multi=1;  //분모
		int  i=1;   // 항의 순번(반복제어변수)이자  분자		
		final int MAX=4; 
		int a=-1;   //부호를 구할 변수 
		double an;  //항을 구할 변수
		
		sum  += multi;   // sum = sum + multi;		
		while(i< MAX ) {
			i=i+1;
			multi =  multi * i;
			an =(a*(i/(double)multi)) ;
			sum = sum  + an ;	
			System.out.println( sum);
			a=-a; // a* -1;		
		}		
		System.out.println( sum );	            
				
		
		double result  =  3 /6.0;  //  정수/정수  => 정수
		System.out.println( "result=" + result);		
		
	  //  정수 / 정수  => 정수연산  
	  //  정수 / 실수  => 실수연산
		
		
		

		
		
		

	}

}
