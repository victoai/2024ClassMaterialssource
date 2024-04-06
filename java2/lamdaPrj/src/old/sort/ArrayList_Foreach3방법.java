package old.sort;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ArrayList_Foreach3방법 {

	public static void main(String[] args) {
		 ArrayList<Student> arrys = new ArrayList<>();
	        Student a = new Student("하길동", "하남시");
	        Student b = new Student("강길동", "부산시");
	        Student c = new Student("나길동", "제주도");
	        arrys.add(a);
	        arrys.add(b);
	        arrys.add(c);
	        
	        //for문 사용하여 출력하기
	        for( int i=0 ; i< arrys.size() ; i++) {
	        	System.out.println( arrys.get(i));
	        }
	        //향상된 for문 사용하기
	        
	        for( Student s : arrys) {
	        	System.out.println(  s );
	        }
	        //forEacht 사용하기
	        //1)
	       // arrys.forEach( new CunsumerImp() );
	        
	      /* 2)
	       *    arrys.forEach(new Consumer<>() {

				@Override
				public void accept(Student t) {
					// TODO Auto-generated method stub
					System.out.println( t);
				}
	        	
	        });
	        
	        */
	        
	        arrys.forEach( item -> System.out.println( item));

	}

}


class CunsumerImp  implements Consumer<Student>{

	@Override
	public void accept(Student t) {
		 
		System.out.println( t);
	}
	
}
