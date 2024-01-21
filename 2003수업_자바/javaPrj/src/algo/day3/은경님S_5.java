package algo.day3;

public class 은경님S_5 {

	public static void main(String[] args) {
		// 등비수열   각 항에 *3 씩 규칙 적용됨
		// 공비: 3 
		// 1  2  3   4   5      6    7  ....
		// 2  6  18  54  162   486 .....
		
		int sum=0;
		int n=2;
		int i=1;		
		
		System.out.print( n +", ");
		while( i <=7) {
			 sum += n;  //항의 누적
			 n=n*3;   // n*=3 
			 System.out.print(  n + ", ");
			 i++;  // i= i+1;			
		}
		System.out.println( "\n sum="+ sum); 

	}

}
