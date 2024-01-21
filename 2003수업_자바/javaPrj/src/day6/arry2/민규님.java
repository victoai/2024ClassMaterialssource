package day6.arry2;

public class 민규님 {

	public static void main(String[] args) {

		String[][] favor = { { "개", "똥", "아" }, { "똥", "쌌", "니" }, { "아", "니", "오" } };
		// 첫번째 행 출력하기
		System.out.print(favor[0][0]);
		System.out.print(favor[0][1]);
		System.out.println(favor[0][2]);

		// 2번째 행 출력하기
		System.out.print(favor[1][0]);
		System.out.print(favor[1][1]);
		System.out.println(favor[1][2]);

		// 3번째 행 출력하기
		System.out.print(favor[2][0]);
		System.out.print(favor[2][1]);
		System.out.print(favor[2][2]);

		// 첫번째 행 출력하기
		for (int i = 0; i < favor[0].length; i++) {
			System.out.print(favor[0][i]);
		}

		for (int i = 0; i < favor[1].length; i++) {
			System.out.println(favor[1][i]);
		}

		for (int i = 0; i < favor[2].length; i++) {
			System.out.println(favor[2][i]);
		}
		
		
		
		for( int j=0; j< favor.length ;  j++) {
			
			for (int i = 0; i < favor[i].length; i++) {
				System.out.println(favor[i][i]);
			}

		}
		
		
		

	}

}
