package day9.함수;

import java.util.Arrays;

public class 배열복사2 {

	public static void main(String[] args) {
		 
	//원본배열	
	 int[] arr=  new int[] {3,5,9};
	 
	 //새로운배열
	 int[] newArr  = new int[3];
	                 // 원본배열 , 시작위치 , 새로운배열 , 시작위치 , 개수
	 System.arraycopy(arr, 0, newArr, 0, 3);	 
				
	 System.out.println(  Arrays.toString(arr));
	 System.out.println( Arrays.toString(newArr));
	 
	 
	}

}
