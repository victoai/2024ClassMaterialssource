package day11.생성자;

public class ScoreTest {

	public static void main(String[] args) {
		 
		 //객체는 new (동적메모리) 방식으로 공간을 확보합니다. ! 
		 // 확보된 공간의 주소(래퍼런스)를 저장한 뒤 사용합니다
		// 반드시 참조형변수가 필요하다 !!!!!!
		// 참조형변수 : 주소(래퍼런스)를 저장하는 변수입니다.
		// 참조형변수의 기본값 : null 
		// null :  참조하지 않는 상태를 의미하는 값입니다. 
		 Score s =null;  // s 참조형변수 
		 s = new Score();
		 s.calResult();
		 s.printInfo();
		 
		 Score s2 = new Score("허재혁", 100 ,100,100);
		 s2.calResult();
		 s2.printInfo();
		 
		 Score s3 = new Score("홍길동");
		 s3.calResult();
		 s3.printInfo();
		 		 
		 Score s4 = new Score("김민규", 100 ,100,100);
		 s4.calResult();
		 s4.printInfo();
		 
		 
		 //매서드오버로딩 
		 //매서드이름이 동일하고 매개변수의 정보가 다른것을 말한다.
		 //매서드의 이름이 무겁다는 의미는 이 이름으로 만들어진 매서드가 많다라는 의미
		 System.out.println("i like java");
		 System.out.println(30);
		 System.out.println(25.3);
		 
		 System.out.println( new char[] {'a','b','c'});		 
		 char[] chs = new char[] {'a','b','c'};
		 System.out.println(chs); 
		 

	}

}
