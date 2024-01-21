package algo.day1;

public class 박태민P_2 {

	public static void main(String[] args) {
		
		//변수선언
		
		// n
		// sum
		// int : 자료형  <-  변수선언시 정수값을 저장하기 위한 변수선언
		
		int n=0;
		int sum=0; 
				
		
		while(n<100) {  // 100미만일때 
			n=n+1;
			sum = sum + n*(101-n);
		}	
		
		System.out.println( sum);
		
		 
	}

}
