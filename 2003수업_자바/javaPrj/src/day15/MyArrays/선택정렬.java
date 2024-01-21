package day15.MyArrays;

import java.util.Arrays;

public class 선택정렬 {

	public static void main(String[] args) {
		 
		
		int[] arr= {3,10,8,1,5};
		
		
		
		
		//
		// i기준
		for( int i=0; i< arr.length-1 ; i++) {
			for( int j=i+1 ; j<arr.length; j++) {
				if( arr[i]  > arr[j] ) {				//
					
					int tmp;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
				
			}
		}
		
		
		
		
	 String result  = Arrays.toString(arr);
	 System.out.println( result);
		

	}

}
