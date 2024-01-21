package algo.day3;

public class 예진님S_5 {

	public static void main(String[] args) {
	 
		// 등비수열   각 항에 *3 씩 규칙 적용됨
		// 공비: 3 
		// 1  2  3   4   5      6    7  ....
		// 2  6  18  54  162   486 .....
	
		int sum=0;
		int n=2;
		int i=0;
		
		while( i< 7) {
			sum+=n;
			n*=3;  // n= n *3 ;
			i++;
		}		
		System.out.println( sum);

	}

}
