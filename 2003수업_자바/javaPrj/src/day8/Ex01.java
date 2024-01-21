package day8;

public class Ex01 {

	public static void main(String[] args) {
		 
		
		getSum();		
		getSum();  //  함수호출
		
		
		
	}
              // void   =>반환값이 없다
	          // 반환type  함수명()   // (입력정보)  
	public static void getSum() {
		int sum=0;		
		for( int i=1; i<=10 ; i++) {
			sum+=i;
		}		
		System.out.println( sum);
	}

}
