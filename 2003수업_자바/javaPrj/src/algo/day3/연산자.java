package algo.day3;

public class 연산자 {

	public static void main(String[] args) {
	
		//연산을 수행하면 연산의 결과가 발생한다.
		// 단항연산자  ++n ,  n++
		// 이항연산자  a+b  , * , -  , /   , % (나머지를 구함)
		// 삼항연산자   ( 조건 )? 참 : 거짓 
		
		
		
		//대입연산자
		int num=10;//
		
		System.out.println( num);
		// 부호연산자  + , -
		num  =  -num;   // num* -1
		
		System.out.println( num);
		
		
		//산술연산자   +  -  *  /   %
		int a=90 , b=80;
		int sum = a+b; 
		int sub = a-b;
		int multi = a*b;
		double devide = a/(double)b;  // ( 소수이하의 값을 저장하기 위해서는 실수연산이 이루어질 수 있도록 해야 함)
		                              // ( 둘 중 하나를 실수형으로 형변환 시킴)
		int remain = a%b;
		
		System.out.println( sum);
		System.out.println( sub);
		System.out.println( multi);
		System.out.println( devide);
		System.out.println( remain);
		
		
		
		
		
		
		
		
		
	}

}
