package lamdaPrj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList정렬하기 {

    public static void main(String[] args) {

        ArrayList<Student> arrys = new ArrayList<>();
        Student a = new Student("하길동", "하남시");
        Student b = new Student("강길동", "부산시");
        Student c = new Student("나길동", "제주도");
        arrys.add(a);
        arrys.add(b);
        arrys.add(c);

        // 정렬 , Comparable 사용하여 객체정렬하기
       Collections.sort(arrys);
        
        // 정렬
        
        // Comparator 이용해서 정렬하는 방법  3가지
       
       //1. 인터페이스를 구현한 클래스를 작성한 다음 사용하기
        Collections.sort( arrys, new ComparatorImp());
        
        
        //2. 익명으로 인터페이스를 구현하여 사용하기
        
        Collections.sort( arrys, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {			 
				return o1.name.compareTo(o2.name);
			}});
        
        
        System.out.println( arrys);         

         
         //3. 람다식을 사용하여 구현하기
         Collections.sort(  arrys ,   ( o1, o2) -> o1.address.compareTo(o2.address) );
         
 

    }
}
 

class  ComparatorImp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		 
		return   o1.name.compareTo(o2.name);
	}
	
	
}
