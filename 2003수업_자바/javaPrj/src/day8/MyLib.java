package day8;

public class MyLib {
	
	public static void main(String[] args) {
		  int  rate = parseInt("10");		  
		  int  bonus   =  25000 *rate;
		  System.out.println(bonus);
	}
	
	public static int parseInt( String str) {		
		int result=0;
		for( int i=0;  i< str.length() ;i++) {			
			char su_  = str.charAt(i);
			int su = su_-48;
			result = result * 10 +  su;		
		}	
		return result;			
	}

}
