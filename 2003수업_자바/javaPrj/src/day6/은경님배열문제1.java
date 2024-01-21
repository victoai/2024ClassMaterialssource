package day6;

import java.util.Scanner;

public class 은경님배열문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n---------- 1. ----------");
		int[] number = new int[10];
		int in = 0;
		int cnt =0; // 짝수 인덱스
		
		for (int i = 0; i < number.length; i++) {
			in = sc.nextInt();
			if (in % 2 == 0) {
				number[cnt] = in;
				//System.out.print(number[cnt] + " ");
				cnt++;
			} 
		}
		
		System.out.println("");
		//number 배열 출력
		// cnt  =4      0  1  2 3
		
		for(int i=0; i< cnt  ; i++ ) {
			System.out.println(number[i]);
		}
		
		

	}

}
