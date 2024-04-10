package day3.계산기;



public class SMCalculator implements CalculatorI {
	@Override
	public int add(int a, int b) {
		 System.out.println( "SM");
		return a+b;
	}

	@Override
	public int sub(int a, int b) {	 
		System.out.println( "SM");
		return a-b;
	}

}
