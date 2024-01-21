package day6.arry3;

public class 민지님3차원 {

	public static void main(String[] args) {
		 
		
		String[][][] food = {
				{
					{"아메리카노", "카페라떼","바닐라라떼"},
					{"딸기라떼", "초코라떼", "녹차라떼"},
					{"딸기요거트스무디","블루베리스무디","망고스무디"}
					
				},
				{
					{"떡볶이","순대","튀김"},
					{"파스타","리조또","뇨끼"},
					{"짜장면","짬뽕","탕수육"}
				},
				{
					{"딸기","수박","참외"},
					{"메론","망고","체리"},
					{"키위","바나나","복숭아"}
				}
		};
		
		// 전체 출력
				for(int i=0; i<food.length; i++) {
					for(int j=0; j<food[i].length; j++) {
						for(int k=0; k<food[i][j].length; k++) {
							System.out.print(food[i][j][k]+" ");
						}
						System.out.println();
					}
					System.out.println();
				}
				
				// 블루베리스무디 출력
				System.out.println(food[0][2][1]);
				
				// 카페라떼 출력
				System.out.println(food[0][0][1]);
				
				// 탕수육 출력
				System.out.println(food[1][2][2]);
				
				// 뇨끼 출력
				System.out.println(food[1][1][2]);
				
				// 메론 출력
				System.out.println(food[2][1][0]);
				
				// 복숭아 출력
				System.out.println(food[2][2][2]);
		
	}

}
