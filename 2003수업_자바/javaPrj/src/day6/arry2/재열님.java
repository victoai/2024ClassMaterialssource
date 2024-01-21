package day6.arry2;

public class 재열님 {

	public static void main(String[] args) {
		String[][] favorites = {
				{ "시간", "돈", "지갑", "차", "집" },
				{ "사랑", "우정", "행복", "슬픔", "행복" }
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

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(favorites[i][j]);
			}

		}

	}

}
