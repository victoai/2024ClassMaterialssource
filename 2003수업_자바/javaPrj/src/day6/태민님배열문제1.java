package day6;

import java.util.Scanner;

public class 태민님배열문제1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner( System.in);
		
		int[] num = new int [10];				// 배열 10개 준비
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();				// 수를 10개 입력받고 저장
		}
		
		int[] even = new int [num.length]; //  int10개 연속적으로 확보
		int even_cnt=0;
		
		
		// num 배열중에서 짝수인경우만   even배열에 저장하기
		for(int i = 0; i < num.length; i++) {   // i변수: 10번, 배열첨자(index) 사용
			if(num[i]%2 == 0) {					// 짝수인지 판단
				even[even_cnt] = num[i];		// 짝수를 even 배열에 저장
				even_cnt++;                     // 짝수카운트변수 증가 
			}			
		}
		
		
		//짝수배열 출력 , 짝수의 개수만큼만 출력함		
		for( int i=0; i < even_cnt ;i++) {
			System.out.println( even[i]);
		}		
		
	}

}
