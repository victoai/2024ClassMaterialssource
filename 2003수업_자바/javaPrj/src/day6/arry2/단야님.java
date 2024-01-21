package day6.arry2;


// 자동 줄맞춤
// ctrl+ shift + F

public class 단야님 {

	public static void main(String[] args) {
		String[][] companys = {
				{ "SAMSUNG", "SK", "HYUNDAI", "LG", "POSCO" },
				{ "JFE", "POSCO", "ARCELOR", "VALE", "NSSMC" } 
			};
		
		System.out.println(companys[0][0]);

		for (int i = 0; i < companys.length; i++) {
			for (int j = 0; j < companys[i].length ; j++) {
				System.out.println(companys[i][j]);
			}
		}

	}

}
