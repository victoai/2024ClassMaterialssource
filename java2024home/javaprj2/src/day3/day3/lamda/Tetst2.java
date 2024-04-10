package day3.day3.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class Tetst2 {

	public static void main(String[] args) {
		 
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		for( String s : list) {			
			System.out.println( s);
		}
		
		
		
		list.forEach( item -> System.out.println( item) );
		
		
		list.forEach( new Consumer<>() {
			@Override
			public void accept(String t) {
				 System.out.println( t);				
			}});
		
			
		//Collections.sort(list, new Comparator<>() {});
		Collections.sort(list, new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {				 
				return o1.compareTo(o2);
			}});
		
	 
		System.out.println( "==>정렬후 ");
		list.forEach( item -> System.out.println( item) );
		
				
		Collections.sort( list , (o1,o2)-> o1.compareTo(o2) );
		
		
		

	}

}
