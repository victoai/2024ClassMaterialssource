package day6.arry3;

public class 병진님3차원배열 {

	public static void main(String[] args) {
		char word[][][] = { 
				{ { 'ㄱ', 'ㄲ', 'ㄴ' }, { 'ㄷ', 'ㄸ', 'ㄹ' }, { 'ㅁ', 'ㅂ', 'ㅃ' }, },
				{ { 'ㅅ', 'ㅆ', 'ㅐ' }, { 'ㅈ', 'ㅉ', 'ㅊ' }, { 'ㅋ', 'ㅌ', 'ㅍ' }, }
			};
		System.out.println(word[1][1][1]); // 특정 데이터 접근
		System.out.println(word[1][1]); // 해당행 문자열로 출력

		System.out.println("ㅡㅡ 전체 출력 ㅡㅡ");
		for (int i = 0; i < word.length; i++) {
			for (int j= 0; j < word[i].length; j++) {
				for (int z = 0; z < word[i][j].length; z++) {
					System.out.printf(" %c ",word[i][j][z]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
