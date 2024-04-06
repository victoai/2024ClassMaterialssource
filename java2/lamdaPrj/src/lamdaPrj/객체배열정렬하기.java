package lamdaPrj;

import java.util.Arrays;
import java.util.List;

public class 객체배열정렬하기 {
	public static void main(String[] args) {
		
		Student[] arrs = new Student[3];
		
		    Student a = new Student("하길동", "하남시");
	        Student b = new Student("강길동", "부산시");
	        Student c = new Student("나길동", "제주도");
	        
	        
	        arrs[0]= a;
	        arrs[1]=b;
	        arrs[2]=c;
	        
	        
	       Arrays.asList(arrs).forEach( item -> System.out.println( item));;
	        
	         
	}

}
