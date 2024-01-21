package day6.arry2;

public class 민지님 {

	public static void main(String[] args) {
		
		// char[][] language= new char[2][5];
		
		char [][] language = {
				                {'가','나','다','라','마'},
								{'a','b','c','d','e'}
				             };
		
		System.out.println(language[0][0]);
		System.out.println(language[0][1]);
		System.out.println(language[0][2]);
		System.out.println(language[0][3]);
		System.out.println(language[0][4]);
		
		System.out.println(language[1][0]);
		System.out.println(language[1][1]);
		System.out.println(language[1][2]);
		System.out.println(language[1][3]);
		System.out.println(language[1][4]);
		
		for(int i=0; i< language.length ; i++) {
			for(int j=0; j<language[i].length ; j++) {
				System.out.println(language[i][j]);
			}
		}
	}
	 

}
