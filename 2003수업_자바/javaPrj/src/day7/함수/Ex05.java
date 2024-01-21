package day7.함수;

public class Ex05 {
	//요구사항 : 성적표의  *  => / 

	public static void main(String[] args) {   //프로그램 시작		

		printTitle();
		
		System.out.println("코드 실행1");
		
		printTitle();
		
		
		System.out.println("코드 실행2");
		printTitle(); // 함수호출 

	} // 프로그램 종료
	
	
	public static void printTitle() {	 // 시작	
		System.out.println( "/////성적표/////");
		System.out.println( "//////////////");
		System.out.println( "//////////////");		
	}//종료

}
