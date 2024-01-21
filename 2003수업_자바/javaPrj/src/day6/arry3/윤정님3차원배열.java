package day6.arry3;

public class 윤정님3차원배열 {

	public static void main(String[] args) {
		 

		String[][][] menu = {
				
				{
					{"빠삐코", "와", "스크류바"},
					{"보석바", "누가바", "수박바"},
					{"죠스바", "와일드바디", "돼지바"}
				}
				,
				
				{
					{"포카칩", "고구마깡", "새우깡"},
					{"칸쵸", "초코송이", "제크"},
					{"눈을감자", "바나나킥", "웨하스"}
				}
				
		};



		System.out.println(menu[0][1][1]);
		System.out.println(menu[1][1][1]);
		System.out.println(menu[1][2][0]);
	}

}
