package day10.classType;

public class CutomerTest오류발생 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//자료형이 있으면 자료형 맞는 변수를 만들 수 있어야 한다.
		
		
		int a;   
		a=10;
				
		//Customer형 변수를 만들어 봅시다		
		//Customer customer  = new Customer();
		
		//참조형변수의 초기값은  null입니다.
		//참조형변수를 초기화하고 싶을 땐  null로 초기화
		// null => 아무것도 참조하지 않음을 나타내는 값
		Customer customer=null;  // customer형 변수가 만들어지지 않았다.
		//  ; // 이 코드가 반드시 있어야함 
		//=> customer 변수가 만들어지지 않았음
		//=> 오류발생 (NullPointerException)
		//!! 주의해야 함  customer  = new Customer()  이코드 필요함
		customer.id="test01";
		customer.pw="1234";
		customer.name="홍길동";
		customer.address="서울시 마포구";		
		
		System.out.println( customer.id);
		System.out.println( customer.pw);
		System.out.println( customer.name);
		System.out.println( customer.address);
		
		
		
	}

}
