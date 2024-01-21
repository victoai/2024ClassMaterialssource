package algo.day2;

import java.util.Scanner;

public class 재화님P_3 {

	public static void main(String[] args) {
		 
		//입력변수
		int num;			
		//출력변수
		int pos=0;
		int neg=0;
		int posEven=0;
		int posOdd =0;
		
		//처리변수
		int count=0; 
		final int MAX =10;
		
		Scanner sc = new Scanner( System.in);
		
		while( count  < MAX) {			
			 count++ ; //count= count+1 ;
			 num= sc.nextInt();			 
			 if( num >0 ) {				 
				 pos= pos+1;  // pos++ ;
				 if( num %2 ==0) {
					 posEven++;   
				 }else {
					 posOdd++; // posOdd= posOdd+1;
				 }				 
			 }else {
				 neg= neg+1;  // neg++;
			 }	
			 
		}
		
		//
		/*int pos=0;
		//int neg=0;
		//int posEven=0;
		//int posOdd =0;*/
		System.out.println("양수의 개수" + pos);
		System.out.println("음수의 개수" + neg);
		System.out.println("양수의 중 짝수 개수" + posEven);
		System.out.println("양수의 중 음수 개수" + posOdd); 
	}

}
