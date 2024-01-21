package day15.정렬;

public class 객체정렬연습 {

	public static void main(String[] args) {

		//객체참조형변수를 배열로 만든것 => 주의사항  Score형 객체가 생성된 적이 없다.
		Score[] arr  = new Score[3];  //배열은 모두  null로 초기화됨
		
		
		arr[0]= new Score( "홍길동", 100,90);
		arr[1] = new Score("김길동", 80 , 75);
		arr[2]= new Score("다길동" , 75,  85);
		
		// 정렬 전
		
		for( Score   score : arr) {
			System.out.println(score );  // score.toString()
		}
				
	
		
		for( int i=0 ; i< arr.length-1 ; i++) {
			
			for( int j=i+1 ; j< arr.length; j++) {
				
				if( arr[i].getKor() > arr[j].getKor()) {
					// 자리의 교환					
					Score tmp;
					tmp = arr[i];
					arr[i]= arr[j];
					arr[j]=tmp;						
				}				
			}
		}
		
		
		// 정렬  후
		System.out.println("정렬후 ====>");
		for( Score s: arr)
			System.out.println( s);
		

		//이름순으로 정렬
			for( int i=0 ; i< arr.length-1 ; i++) {			
				for( int j=i+1 ; j< arr.length; j++) {     //  비교했을 때  기준이 크면  ( 사전상 뒤에 위치) 양수
					                                       //  비교했을 때  기준이 작으면 ( 사전상 앞에 위치) 음수 반환함  
					
					if( arr[i].getName().compareTo(arr[j].getName()) > 0) {
						// 자리의 교환					
						Score tmp;
						tmp = arr[i];
						arr[i]= arr[j];
						arr[j]=tmp;						
					}				
				}
			}
			//이름순으로 정렬 완성 			
			System.out.println("이름순으로 정렬==>");
			for( Score score: arr) {
				System.out.println( score);
			}
		
	}

}
