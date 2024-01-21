package day6;

public class Array2Ex {

	public static void main(String[] args) {
		 
		//내가좋아는 과일 5
		//내가좋아하는 음료 5
		
		String[] fruits= { "체리" ,"망고" , "복숭아" , "딸기" ,"수박"};
		String[] beverage= { "아메리카노" , "흑임자라떼" , "탄산수" , "레몬티" , "망고쥬스"};
		
		
		//2차원 배열		
		//2차원 배열 선언  [행][열]
		
		//String[][] favorites =new String[2][5];		
		 String[][] favorites =  { { "체리" ,"망고" , "복숭아" , "딸기" ,"수박"} ,
				                  { "아메리카노" , "흑임자라떼" , "탄산수" , "레몬티" , "망고쥬스"}};
		 	 
		 
		 System.out.println( favorites[0][0]);
		 System.out.println( favorites[0][1]);
		 System.out.println( favorites[0][2]);
		 System.out.println( favorites[0][3]);
		 System.out.println( favorites[0][4]);
		 
		 
		 System.out.println( favorites[1][0]);
		 System.out.println(favorites[1][1]);
		 System.out.println(favorites[1][2]);
		 System.out.println(favorites[1][3]);
		 System.out.println(favorites[1][4]);
		 
		
		
	}

}
