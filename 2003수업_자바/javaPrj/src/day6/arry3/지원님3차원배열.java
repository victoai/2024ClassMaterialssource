package day6.arry3;

public class 지원님3차원배열 {

	public static void main(String[] args) {
		String[][][] animal = {
				{
					{"강아지","고양이","토끼"},
					{"코끼리","원숭이","사자"},
					{"말","하마","침팬지"}
			},
				{
					{"기린","곰","판다"},
					{"양","알파카","라마"},
					{"사슴","고슴도치","당나귀"}
				}
			};
		System.out.println(animal[0][0][1]); //고양이
		System.out.println(animal[1][1][1]); //알파카
		
		for(int i=0; i<animal.length; i++) {
			for(int j=0; j<animal[i].length; j++) {
				for(int z=0; z<animal[i][j].length; z++) {
					System.out.print(animal[i][j][z]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
