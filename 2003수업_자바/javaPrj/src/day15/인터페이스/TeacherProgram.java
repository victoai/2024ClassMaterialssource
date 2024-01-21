package day15.인터페이스;
public class TeacherProgram {	
	MyRunnable r;	 // 참조형변수  null초기화 됨 
	public void setR(MyRunnable r) {
		this.r = r;
	}	
	public void run() {
		r.run();
	}
	public static void main(String[] args) {	 
		System.out.println("학생들이 작성한 코드를 실행시켜드립니다");
		TeacherProgram p = new TeacherProgram();
		/*p.setR( new MyRunnable() {
			@Override
			public void run() {
			     System.out.println("태민코드 실행합니다");				
			}} );
			
			*/
		//준태님 실행코드
		p.setR(new Juntae());
		p.run();
		
		//민규님 실행코드
		p.setR( new MinGyu());
		p.run();
		
		//재열님 실행코드 
		p.setR(new Kjy());
		p.run();		
		
		//
		
		
		
	}
}
