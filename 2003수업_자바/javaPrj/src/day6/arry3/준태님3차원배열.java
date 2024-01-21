package day6.arry3;

public class 준태님3차원배열 {

	public static void main(String[] args) {
		String[][][] su ={
				{
					{"개","늑대","사자"},
					{"호랑이","고양이","여우"},
					{"쥐","친친라","햄스터"}
				},
				{
					{"제비","기러기","두루미"},
					{"까마귀","비둘기","참새"},
					{"닭","타조","펭귄"}
				},
				{
					{"게","가재","새우"},
					{"돌돔","백상아리","참치"},
					{"송사리","잉어","메기"}
				}
		};
		//배열 전부 보기
		for(int i=0; i<su.length; i++) {
			for(int k=0; k<su[i].length; k++) {
				for(int j=0; j<su[i].length; j++) {
					System.out.print(su[i][k][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//호랑이 찾기
		System.out.println(su[0][1][0]); 
	}

}
