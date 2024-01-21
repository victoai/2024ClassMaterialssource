package day15.정렬;

public class MyArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체참조형변수를 배열로 만든것 => 주의사항  Score형 객체가 생성된 적이 없다.
		Score[] arr  = new Score[3];  //배열은 모두  null로 초기화됨
		
		arr[0]= new Score( "홍길동", 100,90);
		arr[1] = new Score("김길동", 80 , 75);
		arr[2]= new Score("다길동" , 75,  85);		
		
		//  MyArrays.sort( 배열, MyComparator 인터페이스 )
		MyComparatorImp m = new MyComparatorImp();  // 객체 생성
		MyArrays.sort(arr, m  );
		
		System.out.println("국어 점수 정렬후 ==>");
		for( Score  score: arr)
			System.out.println( score);
		
		
		//익명클래스 작성해서 객체를 생성 
		//MyArrays.sort(arr,  new MyComparator() {});
		MyArrays.sort(arr,  new MyComparator() {

			@Override
			public int compare(Object o1, Object o2) {				 
				Score s1= (Score)o1;
				Score s2 =(Score)o2;
				
				return  s1.getEng() - s2.getEng();  //기준의 영어점수가 크면 양수가 반환 아니면 음수가 반환
			}});

		System.out.println("영어 점수 정렬후 ==>");
		for( Score  score: arr)
			System.out.println( score);
		
		
		
		
	}

}
