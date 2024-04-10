package day3.계산기;



public class LGCalculator implements CalculatorI {
	@Override
	public int add(int a, int b) {
		 System.out.println( "LG");
		return a+b;
	}

	@Override
	public int sub(int a, int b) {	 
		System.out.println( "LG");
		return a-b;
	}

}
