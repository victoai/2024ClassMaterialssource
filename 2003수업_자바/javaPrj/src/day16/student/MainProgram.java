package day16.student;

import java.util.ArrayList;

public class MainProgram {
	
	

	public static void main(String[] args) {
	
		ArrayList<Student> list = new ArrayList<>();
		
		
		//학생등록
		
		//학생정보 //홍길동, hong1004 입력받는다
		
		String name="홍길동";
		String id ="hong1004";		
		Student s  = new Student(name, id);
		
		//학생리스트에 등록한다
		list.add(s);
		System.out.println("학생이 등록되었습니다.");
		
		//학생의 성적등록 해 보기 
		//학생의 아이디로 학생 찾기
		//학생의 성적을 등록한다
		
		
		String searchId="hong1004";
		
		//Student  찾기
		Student sStudent=null;
		for( Student student : list) {			
			 if( student.getId().equals(searchId)) {				   //
				 sStudent= student;  // 찾은 학생의 정보
			 }
		}
		
		
		//
		if( sStudent==null) {
			System.out.println(" 학생을 찾을 수 없다");
			return;  //작업종료
		}
		
		// 학생성적 등록 2개 해 보기
		int kor=90;
		int eng=80;
		int math=70;
		
		Score score = new Score( kor, eng, math);		
		sStudent.scorelist.add(score);  //학생성적 등록		
		
		
		 kor=30;
		 eng=80;
		 math=80;		
		 
		Score score2 = new Score( kor, eng, math);		
		sStudent.scorelist.add(score2);  //학생성적 등록				
		sStudent.printScore();
		
		 
		
	}

}
