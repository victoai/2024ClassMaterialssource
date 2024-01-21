package day15.정렬;

import java.util.Arrays;

public class 정렬연습 {

	public static void main(String[] args) {
		 
		//int arr[] = {95 ,75 ,85 ,100, 50};
		
		int[] arr = {95 ,75 ,85 ,100, 50} ;
		
		
		//selection sort 선택정렬, 기본정렬
		
		
		// i : 기준
		for( int i=0; i< arr.length-1 ; i++) {
			//  j :비교대상
			for( int j= i+1 ;  j< arr.length; j++) {
				if( arr[i] > arr[j]) {  //기준의 값이 크다면 자리 교환 
					                    // 작은값이 앞으로 오는 오름차순 정렬
					int tmp;
					tmp= arr[i];
					arr[i]= arr[j];
					arr[j]= tmp;					
					
				}
			}				
		}		
		//
		System.out.println(" 정렬후 ===>");
		String result=Arrays.toString(arr);
		System.out.println( result);
		
		
		
		
		

	}

}
