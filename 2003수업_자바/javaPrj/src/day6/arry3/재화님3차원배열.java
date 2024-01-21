package day6.arry3;

public class 재화님3차원배열 {

	public static void main(String[] args) {
		String[][][] food = {

				{ { "짜장면", "짬뽕", "울면" }, { "볶음밥", "삼선볶음밥", "김치볶음밥" }, { "된장찌개", "김치찌개", "미역국" } },
				{ { "탕수육", "양꼬치", "칭따오" }, { "아사히", "삿포로", "기린" }, { "거북알", "뽕따", "탱크보이" } }

		};
		System.out.println(food[0][1][1]); // 삼선볶음밥
		System.out.println(food[1][2][2]); // 탱크보이
	}

}
