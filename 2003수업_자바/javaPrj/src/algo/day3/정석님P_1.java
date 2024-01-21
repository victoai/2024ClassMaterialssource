package algo.day3;

public class 정석님P_1 {

	public static void main(String[] args) {
		//항의 순번   1    2    3   4  5  6    
		//항       1 +  3 +  5 + 7 + 9 +11 .......99  합을 구하시오
		
		//항의 누적합을 출력하는 문제
		
		int sum=0 ;// 출력변수
		int n=1;
		
		
		while( n <=99) {
			sum+= n;
			n=n+2;// n+=2;
		}		
		System.out.println( n);	

	}

}
