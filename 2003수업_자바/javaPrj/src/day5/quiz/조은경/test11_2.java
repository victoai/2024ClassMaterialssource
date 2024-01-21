package day5.quiz.조은경;

import java.util.Scanner;

public class test11_2 {

	public static void main(String[] args) {

		System.out.print("\n--------------11번--------------\n");

		System.out.println("Q. 1부터 100까지 사이에 소수를 찾으시오.");

		for (int i = 2; i <= 100; i++) { // 판별할 수
			
			boolean flag=true;
			for (int j = 2; j < i; j++) { // 판별할 수를 2부터 나누기
				
				if (i%j == 0) { // 나머지가 0이면 약수이므로 다음 수 판별
					flag=false;
					break;
				} 
			}
			
			if( flag) {
				System.out.print( i + ", ");
			}
		}
	}

}
