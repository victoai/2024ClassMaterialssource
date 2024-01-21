package day15.MyArrays;

public class 업캐스팅다운캐스팅 {

	public static void main(String[] args) {
		 // 상속관계  ( 클래스 상속 extends  ,  인터페이스   implements  )
		
	    Score0 a = new Score0("홍",90,90);	    // 기준객체	   
	    Score0 b = new Score0("윤정", 100,100);  // 비교객체
	 
	    
	    //이게 가능하냐?????
	    MyComparable c =(MyComparable) a;  // 상속관계 
	    // 실행했을 때 가능하냐???
	    	   
	    
	    int result  =  c.compareTo(b);      //기준객체가 크면 양수, 아니면 음수 
	    
	    System.out.println( result);
	    
	    

	}

}
