package day9.함수;

public class 배열삭제 {

	public static void main(String[] args) {
		 
		
		//           0 1 2 3 4
		int[] arr = {1,2,3,4,5};
		// 삭제할 index :2 ( 3을 삭제)
		
		int index=2;
		int[] newArry = new int[arr.length-1];
		 
		//배열삭제
		
		for(int i=0; i<index ; i++) {
			newArry[i]= arr[i];
		}
		
		for( int i=index ; i<newArry.length ; i++) {
			newArry[i]= arr[i+1];
		}	
		
		

	}

}
