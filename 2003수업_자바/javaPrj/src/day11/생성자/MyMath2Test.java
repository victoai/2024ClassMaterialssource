package day11.생성자;

public class MyMath2Test {

	public static void main(String[] args) {
	 
		//static 매서드방법  =>  new필요하지 않음  클래스명.매서이름()
		double result  =MyMath2.add(2.5, 3.5);
		double result2 = MyMath2.add(5, 3);
		
		
		System.out.println(result );
		System.out.println( result2);

	}

}
