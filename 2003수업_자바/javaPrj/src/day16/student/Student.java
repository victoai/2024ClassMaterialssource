package day16.student;

import java.util.ArrayList;

public class Student {
	String name;
	String id;
	ArrayList<Score> scorelist  = new ArrayList<>();
	
	
	
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "   ]";
	}
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	 //생성자
	// 세터 게터
	// toString
	
	//학생성적 조회하는 기능 제공
	
	
	public void printScore() {
		
		for( Score s : scorelist)
			System.out.println( s);
		
	}
}
