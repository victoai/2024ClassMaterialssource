package day6.arry3;

public class 은경님3차원배열 {

	public static void main(String[] args) {
		char[][][] word = new char[4][5][5];

		char q = 65;
		
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < word[i].length; j++) {
				for (int k = 0; k < word[i][j].length; k++) {
					word[i][j][k] = q;
					q++;
				}
			}
			if(i==0) {q=97;}
			else if(i==1) {q=12593;}
			else if(i==2) {q=44032;}
		}
		
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < word[i].length; j++) {
				for (int k = 0; k < word[i][j].length; k++) {
					System.out.print(word[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}

}
