package java2prj1.test;

public class Test {

	public static void main(String[] args) {
		//이름있는 클래스 생성하기
		A a =new A();
		int result  =a.add(5, 3);
		
		
		
		CalculatorI b = new CalculatorI() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}

			@Override
			public int sub(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}};
		 

		int result2=	b.add(5, 2);
	}

}
