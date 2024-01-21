package day8;

public class Ex04 {

	public static void main(String[] args) {		 
		int[] result  = a();		 
		for( int i=0; i< result.length ; i++) {  // 열
			System.out.println( result[i]);
		}	
		
		
		int[][] result2 = b();		
		for( int i=0; i< result2.length ; i++) {	 //행		
			for(  int j=0 ; j<= result2[i].length ; j++) { //열
				System.out.print(  result2[i][j] + " ");
			}
			System.out.println( );
		}		
	}	
	
	//반환은 한 개만 가능하다
	//여러개를 반환해야할 때는 배열, 객체 사용한다.
	//             반환type  int[]
	public static  int[]  a( ) {		
	    int[] result= {3,5};		
		return result;		
	}	
	
	// 
	public static int[][] b( ){
		int[][] result = { {1,2} , {3,4}};
		return result;		
	}

	
	
}
