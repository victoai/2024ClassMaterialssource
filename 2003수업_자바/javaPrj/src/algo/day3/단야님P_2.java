package algo.day3;

public class 단야님P_2 {

	public static void main(String[] args) {
		 
		
		//
		int sum=0;  // 누적합
		
		//처리
		int jsum=0;
		
		int i=1; //  반복을 제어하 변수 
		int j=i-1;  // j=0
		
		final int MAX=5;
		
		  
		//i = 1  2     3      4         5             6   7    8   9  ... 100
		//j=  0  1     2      3         4             5   6    7   8.......99
		//    1 (1+2) (1+2+3) (1+2+3+4) (1+2+3+4+5)
		//    1   3       6      10        15 		
		while( i<=MAX) {
			j=i-1;
			jsum= jsum +j;  // jsum+= j; 
			sum= sum  + (jsum+i);	
			i++;
		}		
		System.out.print( sum);
		
		
	}

}
