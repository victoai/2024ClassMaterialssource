package day5.quiz;

import java.util.Scanner;

public class Ex9_3 {

	public static void main(String[] args) {
		 
		
		//입력 : 단정보 : dan
		//출력
		
		Scanner sc  = new Scanner( System.in);
		
		int dan=3;
		dan= sc.nextInt();
				
		for( int i=1;i<=9; i++) {
			System.out.println( dan*i);
		} 

	}

}
