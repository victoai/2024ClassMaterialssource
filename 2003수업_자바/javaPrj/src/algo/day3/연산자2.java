package algo.day3;

public class 연산자2 {

	public static void main(String[] args) {
		 
		
		//a++ , ++a   a--, --a
		
		int a=10;
		int b=10;
		
		int resulta;
		int resultb;
		
		
		resulta =a++;
		resultb= ++b;
		
		System.out.println( a);  //11
		System.out.println( b);  //11
		
		System.out.println(  resulta);   //10
		System.out.println(  resultb);   //11
		
		
		int c=10;
		int d=10;
		int resultc;
		int resultd;
		
		resultc= c--;
		resultd = --d;
		
	
		
		System.out.println( resultc); // 10
		System.out.println( resultd); // 9
		
		System.out.println(a);   // 11
		System.out.println(b);   // 11
		System.out.println(c);   //  9
		System.out.println(d);   //  9		
				
		// 문제 
		int result   = a++ +  --b  + c++ - d--;		
		  // result  ? 	21
		System.out.println( result);
		
		

	}

}
