package java2prj1.generic;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {	 
		
		ArrayList<Score> list = new ArrayList<>();
		
		list.add(new Score( "이윤", 99 ,100));
		list.add( new Score( "서예진", 100,99));
		
		for( int i=0; i< list.size() ; i++) {
			System.out.println( list.get(i));
		}
		

	}

}
