package day15.정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList정렬 {

	public static void main(String[] args) {
	 
		
		
		
		
		ArrayList<Score2> list  = new ArrayList();
		
		 //
		list.add( new Score2("홍길동",100,90));
		list.add( new Score2("김길도",90,100));
		list.add( new Score2("다길동",70,90));
		
		// 객체의 요소가 반드시  Comparable를 구현해야 함
		Collections.sort(list);
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
			 
				Score2 s1=  (Score2)o1;
				Score2 s2 =  (Score2)o2;
				return s1.getKor() - s2.getKor();
			}});
		
		
		for( Score2  score: list) {
			System.out.println(  score);
		}
		
		Collections.sort(list, new Comparator<Score2> () {
			@Override
			public int compare(Score2 o1, Score2 o2) {				 
				return o1.getEng() - o2.getEng();
			}});
		

	}

}
