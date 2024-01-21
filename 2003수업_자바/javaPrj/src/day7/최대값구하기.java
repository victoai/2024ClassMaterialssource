package day7;

public class 최대값구하기 {

	public static void main(String[] args) {
		 
		
		int[] arr = { 8,3,7,11,9};
		
		//값의범위에서 최소값으로 초기화
		//배열의 첫번째 요소 
		int max=1;
		
		
		for( int i=0; i< arr.length; i++) {
			if( max < arr[i]) {
				max = arr[i];
			}
		}		
		
		System.out.println(" 최대값" + max);

	}

}
