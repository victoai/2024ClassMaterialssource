package day8;

public class Ex02 {

	public static void main(String[] args) {
		 
		
		//1~입력받은 수까지의 합
		
		 int n=100;		
		 getSum2(n);
		
	}

	
	public static void getSum2(int n) {
		int sum=0;
		 for( int i=1; i<=n; i++) {
			 sum = sum+i;
		 }	
		 System.out.println( sum);
	}

 
	
	
          
	 

}
