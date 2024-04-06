package day4.계산기;

public class BCalculator  implements Calculator{

	@Override
	public int add(int a, int b) {
		 System.out.println( "B");
		return a+b;
	}

}
