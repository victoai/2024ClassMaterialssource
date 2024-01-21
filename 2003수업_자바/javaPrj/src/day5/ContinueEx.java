package day5;

public class ContinueEx {

	public static void main(String[] args) {
		 
		// continue 명령  반복문에서 다음 반복으로 바로 진행될 수 있도록 하는 명령 
		//1~10까지 홀수합구하기
		//1 2 3 4 5 6 7 8 9 10
		
		int sum=0;  // 홀수합을 저장할 변수
		for( int i=1 ;  i<=10 ; i++) {
			if( i %2 ==0 ) {	  // i가 짝수이면
				continue;  
			}			
			sum += i; // sum  = sum + i; 
		}
		System.out.println("홀수합" + sum);
		//  1               0
		//  i     i%2     sum
		//  1      1       1
		//  2      0       1
		//  3      1       4  
		//  4      0       4
		//  5      1       9
		//  6      0       9
		//  7      1       16
		//  8      0       16
		//  9      1       25
		//  10     0       25
		//  11  반복종료
		
		
		

	}

}
