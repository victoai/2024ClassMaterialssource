package day5.재귀호출;

public class 별출력하기 {

	
	
	void printStar( int n) {
		
		if( n==0) {
			return;
		}
		System.out.println( "*");
		printStar( n-1 );
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		별출력하기  m = new 별출력하기();
		m.printStar(5);

	}

}
