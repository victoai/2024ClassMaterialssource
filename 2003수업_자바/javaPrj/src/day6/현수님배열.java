package day6;

public class 현수님배열 {

	public static void main(String[] args) {
		
		//배열은 초기화를 해준다 
		//자료형의 기본값 으로 초기화해 줌
		
		//배열은 기억단계와 처리단계가 다를 때 반드시 필요함 
		String[] arr = new String[5];
		for(int i=0; i<arr.length; i++) {
			//arr[i] = String.format("%d번째 원소", i+1);
			arr[i] =  (i+1) +"번째 원소";
			System.out.println(arr[i]);
		}		
		
		System.out.println("변수 한 개 사용");
		String str;
		for( int i=0 ;i< 5; i++) {
			str=(i+1) +"번째 요소";
			System.out.println( str);
		}
		
		
	}

}
