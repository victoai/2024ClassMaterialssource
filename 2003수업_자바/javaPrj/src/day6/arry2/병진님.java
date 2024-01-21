package day6.arry2;

public class 병진님 {

	public static void main(String[] args) {
		String[][] favorites = {
				{ "애플망고", "망고", "블랙사파이어", "블루베리", "체리" },
				{ "아아", "고구마라때", "피스타치오프라페", "아바라", "망고블랜더" }
			};

		//2차원 배열 출력
		System.out.println("2차원 배열 출력");
		for (int i = 0; i <favorites.length ; i++) {
			if (i == 0) {
				System.out.print("과일 = ");
			}
			if (i == 1) {
				System.out.print("음료 = ");
			}
			for (int j = 0; j < favorites[i].length; j++) {
				System.out.printf(" %s ", favorites[i][j]);
			}
			System.out.println();
		}

	}

}
