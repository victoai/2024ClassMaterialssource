package day6.arry3;

public class 나정님3차원배열 {

	public static void main(String[] args) {
		String [][][] cityArr = {
				{
					{"서울","부산","대구"},
					{"도쿄","오사카","후쿠오카"},
					{"베이징","상하이","하얼빈"}
				},
				{
					{"뉴욕","시카고","로스앤젤레스"},
					{"토론토","몬트리올","캘거리"},
					{"상파울루","브라질리아","사우바도르"}
				},
				{
					{"로마","밀라노","나폴리"},
					{"베를린","함부르크","뮌헨"},
					{"바셀","마드리드","말라가"}
				}
		};
		for(int i=0; i<cityArr.length; i++) {
			for(int j=0; j<cityArr[i].length; j++) {
				for(int k=0; k<cityArr[i][j].length; k++) {
					System.out.print(cityArr[i][j][k]+"\t\t");
				}System.out.println();
			}System.out.println();
		}

	}

}
