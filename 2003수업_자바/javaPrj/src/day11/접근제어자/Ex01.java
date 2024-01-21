package day11.접근제어자;

import day11.접근제어자.test.C;

public class Ex01 {

	public static void main(String[] args) {

		//접근제어자 : 접근에 대한 내용
		// public  :완전오픈,  private:  내 클래스안에서만 접근 허용
		// default : (접근에 대해서 명시하지 않으면 )default 접근제어자를 가진다.''
		
		A.매서드1();
		A.매서드2();
		
		
		B.매서드1();
		B.매서드2();
		
		// C의 매서드1 , 매서드2의 접근제어자가  생략되었음으로  default  갖는다
		// C와 같은 폴더안에 있는 클래스들만 접근 허용 
		//C.매서드1();
		//C.매서드2();
		
	}

}
