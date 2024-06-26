package day4.계산기;

import java.util.Scanner;

/*  Program    
 *  Calculator(인터페이스)   -   ACalculator , BCalculator 
 *  외부설정파일을 이용해서 A-> B로 코드의 변경없이 바뀔수 있도록 하겠다
 *  */


public class Program2 {	
	int su1;
	int su2;	
	Calculator calculator;		
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	void run() {		
		// //동작코드 두 수를 입력받아서 덧셈을 하고 출력하기 
		Scanner sc = new Scanner(System.in);
		this.su1 =  sc.nextInt() ;
		this.su2 = sc.nextInt();		
		int result  =calculator.add(su2, su1);
		System.out.println( result);
	}	
	
	public static void main(String[] args) {
		Program2 p = new Program2();
		
		//외부설정파일을 만들고 외부설정파일을 읽어서  
		//동적으로 클래스를 생성하는 코드로 변경하시오
		//Animal Ex04예제를 참고하면 됩니다.
		p.setCalculator( new ACalculator() );
		p.run();
	}
	
}
