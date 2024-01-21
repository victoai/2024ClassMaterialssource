package day6.arry3;

public class Array3Ex2 {

	public static void main(String[] args) {

                           
		int[][] even= {
				{2,4,6},
				{8,10,12},
				{14,16,18}
		} ;  
		                           
	  
		
		 int[][] odd = {
				 {1,3,5},
				 {7,9,11},
				 {13,15,17}
		 };   
		 
		 //짝수배열
		 for( int i=0; i< even.length; i++) {
			 // 
			 for( int j=0; j< even[i].length ; j++) {
				 //
				System.out.print( even[i][j] + " " );
				 
			 }
			 System.out.println( );
		 }
		     
		 
		 //홀수배열		 
		 for( int i=0; i<odd.length; i++) {
			for( int j=0; j< odd[i].length; j++) {
				System.out.print( odd[i][j] + " ");
			}			
			System.out.println();
		 }
		                               
		 
		

	}

}
