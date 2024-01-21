package day5.quiz;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	 
		
		// 1~ 원하는 수까지 합계
		// 입력받은수 :5
		// 1  2   3  4  5
		 
		int su ;  //입력
		int sum=0; // 합 , 출력변수
		Scanner sc = new Scanner( System.in);
		
		su = sc.nextInt();
		
		for( int i=1; i<= su; i++) {
			sum +=i;
		}
		
		System.out.println( sum);
		
		
		/*
		 * 1. 수를 입력
		 * 2. 반복
		 *     수를 구한다, (항을 구한다)
		 *     항을 누적한다.
		 * 3. 항을 누적출력
		 * 4. 종료
		 */
		 
		

	}

}
