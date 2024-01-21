package day11.변수종류;

public class StudentTest {

	public static void main(String[] args) {


		// 참조형변수로 다룬다
		// 참조형변수(리모컨변수)
		//1. new를 통해서 공간을 확보한다
		//2. 생성자에 의해서 공간의 값이 초기화된다
		//3. 생성된 객체의 정보를  s1 참조형변수가 저장한다.
		//4. 참조형변수를 통해서 객체의 정보를 저장하거나 이용한다. 
		//5. 객체지향은 매서드를 통해서 값을 사용하는 방법을 이용한다.
		
		Student s1 = new Student("이정훈",100,99,"우주연");  // new 대상 => 객체, 인스턴스 
		Student s2 = new Student("이윤정",99,100,"우주연");
		Student s3 = new Student("이윤",100,99,"우주연");
		Student s4 = new Student("조은경",99,100,"우주연");
		
		
		System.out.println( s1.toString() );
		System.out.println( s2.toString() );
		
		
		
		

	}

}
