package day4.계산기;

public class ACalculator  implements Calculator{

	@Override
	public int add(int a, int b) {
		 System.out.println( "A");
		return a+b;
	}

}
