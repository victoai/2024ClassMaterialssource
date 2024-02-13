package javaprj.day0207.ExceptionEx;


// Exception ( 필수예외 )
public class NegativeNumberException extends Exception {
	

	public NegativeNumberException() {
		// 
		super( "음수이면 안된다");
	}

}
