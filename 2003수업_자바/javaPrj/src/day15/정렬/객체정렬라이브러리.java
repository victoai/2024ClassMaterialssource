package day15.정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 객체정렬라이브러리 {

	public static void main(String[] args) {
		//객체참조형변수를 배열로 만든것 => 주의사항  Score형 객체가 생성된 적이 없다.
		Score[] arr  = new Score[3];  //객체배열은 모두  null로 초기화됨
		
		
		arr[0]= new Score( "홍길동", 100,90);
		arr[1] = new Score("김길동", 80 , 75);
		arr[2]= new Score("다길동" , 75,  85);
		
		
		//Arrays.sort(arr);
		//영어점수 순으로 오름차순 정렬 해줘
		Arrays.sort( arr, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				  Score s1 = (Score)o1;
				  Score s2 = (Score)o2;
				return  s1.getEng() - s2.getEng();
			}});
		
		
		for( Score s : arr)
			System.out.println( s);
				
		
		Arrays.sort( arr, new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {				 
				return  o1.getKor() - o2.getKor();
			}});
		
		
		System.out.println("국어점수 오름차순 ==>");
		for( Score s : arr)
			System.out.println( s);
	
				
		// 배열의 요소  객체가   Comparable  인터페이스를 구현해야 한다.
		Arrays.sort(arr);
		
		System.out.println("영어점수 순 오름차순 ==>");
		for( Score s : arr)
			System.out.println( s);
	

	}

}
