package day9.함수;

public class CallByReference {

	public static void main(String[] args) {		 	
		int[] arr  = { 10,9,8,5};		
		printArray(arr);	  //배열의 주소값 , 참조값			
		
		//기본형 변수 :  데이터값을 저장하는 변수( 메모리공간)
		//참조형 변수 :  참조값(주소값)을 저장하는 변수 ( 메모리공간)		
		
		//call by reference 
		
	}
	
	
	
	public static void printArray(int[] arr) { // arr :참조형변수
		for( int i=0;i < arr.length; i++) {
			System.out.print( arr[i] +" ");
		}
	}

}
