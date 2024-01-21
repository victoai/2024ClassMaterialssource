package day14.ExceptionEx;

public class MyMath {
	                                     //예외던지기, 예외미루기
	public int add( int num1 , int num2) throws NegativeNumberException  {
	 
		if( num1  <0   || num2 <0) {
			//예외발생 시키기 (일으키다)
			//예외발생시키는 키워드   throw
			throw new NegativeNumberException();			
		}
		return num1+  num2;
	}
	
	
	
	public int add2( int num1 , int num2)  {
		 
		if( num1  <0   || num2 <0) {
			//예외발생 시키기 (일으키다)
			//예외발생시키는 키워드   throw
			throw new NegativeNumberException2();			
		}
		return num1+  num2;
	}

}
