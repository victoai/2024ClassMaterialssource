package day6.arry2;

public class 원규님 {

	public static void main(String[] args) {
		String[][] favorites = { 
				{"딸기" , "키위" , "메론" , "복숭아" , "배"} , 
				{ "데미소다" , "밀키스"  , "맥콜" , "아침햇살" , "얼라이브"} 
			};

		System.out.println(favorites[0][0]);
		System.out.println(favorites[0][1]);
		System.out.println(favorites[0][2]);
		System.out.println(favorites[0][3]);
		System.out.println(favorites[0][4]);
		
		System.out.println(favorites[1][0]);
		System.out.println(favorites[1][1]);
		System.out.println(favorites[1][2]);
		System.out.println(favorites[1][3]);
		System.out.println(favorites[1][4]);
		
		
		for( int i=0; i< favorites.length ; i++) {     // i=0			
			for(int j=0; j <favorites[i].length; j++) {   //j=0   1  2  3  4 
				System.out.println( favorites[i][j]);
			}                                          // i=1
		}                                               //  j=0  1  2  3  4 
	}

}
