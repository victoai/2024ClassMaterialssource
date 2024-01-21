package day14.ExceptionEx;


// RuntimeException ( 선택예외)
public class NegativeNumberException2 extends RuntimeException {
	
	public NegativeNumberException2() {
		// 
		super( "음수이면 안된다");
	}

}
