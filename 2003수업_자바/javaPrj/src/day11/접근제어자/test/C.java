package day11.접근제어자.test;

public class C {
	
	// 접근제어자를 명시하지 않으면 기본적으로 갖는 접근제어자는   default 
	// default =>  같은 패키지 안에 있는 클래스에게만 접근을 허용
	
	  static void 매서드1() {
			System.out.println("매서드1 동작");
	  }

	  static void 매서드2() {
			System.out.println("매서드2 동작");
	  }
}
