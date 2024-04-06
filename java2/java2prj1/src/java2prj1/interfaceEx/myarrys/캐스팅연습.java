package java2prj1.interfaceEx.myarrys;


public class 캐스팅연습 {
	
		public static void main(String[] args) {			 
			
			Score s =new Score( 100,90); 
			System.out.println( s);			
			
			
			//1. 1번가능?
			Object o = (Score)s;

			//2. 
			MyComparable<Score>  m = (MyComparable<Score>) s; 
			
			
			
		}
		
		
		
		 
}

