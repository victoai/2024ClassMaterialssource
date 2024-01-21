package day6.arry3;

public class 재열님3차원배열 {

	public static void main(String[] args) {
		char[][][] numbers = {
				{ { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } },
				{ { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r' } },
				{ { 's', 't', 'u' }, { 'v', 'w', 'x' }, { 'y', 'z', '♥' } }

		};

		System.out.print(numbers[1][0][1]);
		System.out.print(numbers[1][0][0]);
		System.out.print(numbers[2][2][0]);
		System.out.print(numbers[2][2][2]);

		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				for (int k = 0; k < numbers[i][j].length; k++) {
					System.out.print("\n" + numbers[i][j][k]);
				}
			}

		}
	}

}
