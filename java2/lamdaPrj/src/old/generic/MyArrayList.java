package old.generic;

import java.util.Comparator;
import java.util.function.Consumer;

public class MyArrayList<T> {
	
	private Object[] nums;
	private int current; 	
	
	
	public MyArrayList() {		 
		nums = new Object[10];
		current=0;
	}
	
	public void add(T obj) {
		nums[current] = obj;
		current++;
		
	}
	
	public void clear(){
		//current 초기화
		current=0;
		// nums= new int[3];		
	}
	
	
	public int size()
	{
		return current;
	}
	 
	
	
	public T get(int index)    {		
		return (T) nums[index];
	
	}	
	
	
	public void forEach( Consumer<T> c) {		
		for( int i=0; i<current ; i++) {
			c.accept(get(i));
		}
	}
	
	public static void main(String[] args) {
		 MyArrayList<String> list = new MyArrayList<>();
		 list.add("html");
		 list.add("css");
		 list.add("자바스크립트");
		 list.add("자바");
		 list.add("스프링");
		 
		 
		 list.forEach( new Consumer< >() {
			@Override
			public void accept(String t) {
				 System.out.println(t);				
			}
			 
		 });
		 
	}

}
