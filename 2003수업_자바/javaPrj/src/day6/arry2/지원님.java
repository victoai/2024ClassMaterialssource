package day6.arry2;

public class 지원님 {

	public static void main(String[] args) {
		String[][] food = {
					{ "김치볶음밥", "짜장면", "냉면", "우동", "라면" },
					{ "탕수육", "카레", "텐동", "마라탕", "돈까스" }
				};

		System.out.println(food[0][0]);
		System.out.println(food[0][1]);
		System.out.println(food[0][2]);
		System.out.println(food[0][3]);
		System.out.println(food[0][4]);
		
		System.out.println(food[1][0]);
		System.out.println(food[1][1]);
		System.out.println(food[1][2]);
		System.out.println(food[1][3]);
		System.out.println(food[1][4]);
		
		
		for (int i = 0; i < food.length; i++) {
			for (int j = 0; j < food[i].length; j++) {
				System.out.println(food[i][j]);
			}
		}

	}

}
