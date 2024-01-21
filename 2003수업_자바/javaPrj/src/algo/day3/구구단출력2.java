package algo.day3;

public class 구구단출력2 {

	public static void main(String[] args) {


	//2단 ~4단 출력
		
		//2단
		for( int i=1; i<=9; i++) {
			System.out.println( 2*i);
		}		
		//3단
		for( int i=1 ; i<=9 ;i++) {
			System.out.println( 3*i);
		}
		//4단 출력		
		for( int i=1; i<=9; i++) {
			System.out.println( 4*i);
		}
		
		//5단 출력		
		for(int i=1; i<=9; i++) {
			System.out.println( 5*i);
		}

		
		//6단 출력
		for( int i=1; i<=9 ; i++) {
			System.out.println( 6*i);
		}
		
		//7단출력
		for( int i=1; i<=9; i++) {
			System.out.println( 7*i);
		}
		
		//8단 
		for( int i=1; i<=9 ;i++) {
			System.out.println( 8*i);
		}
		
		//9단 출력
		System.out.println("<<9단>>");		
		for(int i=1 ; i<=9 ; i++) {
			System.out.println( 9*i);
		}
		
		
		//
		for( int j=2 ;j<=9;j++) {  //8번 반복제어변수 이면서 구구단의 단정보를 만들어내는 변수 
		
			//8단 
			for( int i=1; i<=9 ;i++) {
				System.out.println( j*i);
			}			
			
		}
		
	}

}
