package day5;

public class TenEx {

	public static void main(String[] args) {		
		 
		// 10 9 8 7 6 5 4 3 2 1 
		int sum=0;		
		for( int i=10; i>0; i--) {
			sum = sum + i;			
		}			
		System.out.println( "합" +  sum);
	}

}
