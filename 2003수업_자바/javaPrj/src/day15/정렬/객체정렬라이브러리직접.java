package day15.정렬;

public class 객체정렬라이브러리직접 {

	public static void main(String[] args) {
	 
		
		Score[] arr  = new Score[3];  //객체배열은 모두  null로 초기화됨
		
		
		arr[0]= new Score( "홍길동", 100,90);
		arr[1] = new Score("김길동", 80 , 75);
		arr[2]= new Score("다길동" , 75,  85);
			
		
		MyArrays.sort(arr);
		
		System.out.println("국어점수 정렬===>");
		for( Score s: arr)
			System.out.println( s);
		
		
		
		
	}

}
