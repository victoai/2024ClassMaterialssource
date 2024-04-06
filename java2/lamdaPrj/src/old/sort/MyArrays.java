package old.sort;

import java.util.Arrays;
import java.util.Comparator;

public class MyArrays  {
	
	 
	 
	
	//정렬하기
	public static   void sort(Object[] arr) {			
		for( int i=0;i< arr.length-1; i++) {
			for( int j=i+1; j< arr.length ;j++) {		
			 
				if( ((Comparable)arr[i]).compareTo(arr[j]) >0) {
					Object temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;			
					
				}
			 
			}
		}
		
	}
	
	
	//정렬하기
	public static  void sort(Object[] arr , Comparator   c) {
		
		for( int i=0;i< arr.length-1; i++) {
			for( int j=i+1; j< arr.length ;j++) {		
			 
				if( c.compare(arr[i], arr[j]) >0) {
					Object temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;					
				}
			 
			}
		} 
	}
	
	
	///
	 public static void main(String[] args) {
		 
		 	Student[] arrs = new Student[3];
			
		    Student a = new Student("하길동", "하남시");
	        Student b = new Student("나길동", "강원도");
	        Student c = new Student("가길동", "제주도");
	        
	        
	        arrs[0]= a;
	        arrs[1]=b;
	        arrs[2]=c;
	        
	        
	        MyArrays.sort(arrs);
	        
	        //정렬후 //
	        System.out.println( Arrays.toString(arrs));
	        
	        MyArrays.sort( arrs , new Comparator () {

				@Override
				public int compare(Object o1, Object o2) {
					
					Student s1 = (Student)o1;
					Student s2 = (Student)o2;
					
					
					return s1.name.compareTo(s2.name);
				}

			 
	        	
	        });
	        
	        //정렬후 
	        System.out.println( Arrays.toString(arrs));
		 
		
	}

}
