package day5.quiz;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i=1; i<=9; i++) {
			System.out.println( 2* i);
		}
		/////////////////////////////////
		// 
		System.out.println("전체 구구단 출력");
		for(  int j=2; j<=9 ; j++) {
			System.out.println( j+"단 출력");
			for( int i=1; i<=9; i++) {
				System.out.println( j* i);
			} 
		}

	}

}
