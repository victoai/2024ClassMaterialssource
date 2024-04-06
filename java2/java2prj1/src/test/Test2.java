package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test2 {

	public static void main(String[] args) {
		 
		
		ArrayList<Score> list = new ArrayList<>();
		
		list.add( new Score("hone1",100,900,100));		
		list.add( new Score("hone2",90,900,100));		
		list.add( new Score("hone3",100,900,100));
		
		
		
		Collections.sort(list,  new Comparator<>() {

			@Override
			public int compare(Score o1, Score o2) {
				 
				return o1.kor-o2.kor;
			}
			
		});
		
		list.forEach( i ->System.out.println( i));
		

	}

}
