package day14.ExceptionEx;

public class 예외테스트2 {

	public static void main(String[] args) {
		 
		
		MyMath m = new  MyMath();		
		try {
			m.add2(-5, 3);		
		}catch( Exception e) {
			
			System.out.println( e.getMessage());
		}
		
		

	}

}
