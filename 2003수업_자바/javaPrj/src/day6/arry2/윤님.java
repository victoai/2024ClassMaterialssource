package day6.arry2;

public class 윤님 {

	public static void main(String[] args) {
		System.out.println("\n----- 2차원 배열-----");
		 String[][]donut = {
					   {"크림브륄레","피넛버터","버터피스타치오","버터넛","시나몬슈가"},
					   {"라즈베리슈가볼","우유크림도넛브레드","얼그레이","블루베리","초코크런치"}
				   };
		   
		  System.out.print(donut[0][0] + " ");
		  System.out.print(donut[0][1]+ " ");
		  System.out.print(donut[0][2]+ " ");
		  System.out.print(donut[0][3]+ " ");
		  System.out.println(donut[0][4]);
		  
		   
		  System.out.print(donut[1][0]+ " ");
		  System.out.print(donut[1][1]+ " ");
		  System.out.print(donut[1][2]+ " ");
		  System.out.print(donut[1][3]+ " ");
		  System.out.println(donut[1][4]);
		  
		  
		  for( int i=0; i<donut.length ; i++ ) {
			  
			  for( int j=0; j< donut[i].length; j++) {
				  System.out.println(donut[i][j]);
			  }
		  }

	}

}
