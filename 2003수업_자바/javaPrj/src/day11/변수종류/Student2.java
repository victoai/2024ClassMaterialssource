package day11.변수종류;

//  학생 한명이 가져할 정보를 표현하기 위한 자료형 
public class Student2 {

	String name;
	int kor;
	int eng;
	double avg;
	static String teacher="우주연";  //클래스변수 : 클래스안에서 하나만 만들어짐
	                        //클래스안에서 공통적으로 사용하는 값을 저장하기 위한 변수 
	                        //클래스변수는 프로그램시작하면 만들어짐 프로그램 종료까지 
	
	
	//기본생성자
	public Student2() {
		 
	}
	
	//매개변수있는 생성자
	public Student2(String name, int kor, int eng ) {	 
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.avg = (kor+eng)/2.0;		 
	}
	
	
	public String toString() {
		return  name +  kor + " " +  eng + " " + avg+" "+ teacher;
	} 
	
}
