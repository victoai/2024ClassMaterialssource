package java2prj1.day3.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("hi");
		set.add("hi2");
		set.add("hi2");		
		
		
		//list , 중복허용 , 순서있음,
		List<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hi2");
		list.add("hi2");
		
		
		Collection<String> collection=null;
		collection = set;
		
	
		Iterator<String> ir =collection.iterator();
		while( ir.hasNext()) {
			System.out.println( ir.next());
		}
		
		
		collection =list;		
		Iterator<String> ir2= collection.iterator();
		
		while( ir2.hasNext()) {
			System.out.println( ir2.next());
		}
		 
		
		
		
		

	}

}
