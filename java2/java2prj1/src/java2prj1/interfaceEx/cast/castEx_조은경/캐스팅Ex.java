package java2prj1.interfaceEx.cast.castEx_조은경;

public class 캐스팅Ex {

	public static void main(String[] args) {

		Score s = new Score("홍길동", 100, 90, 80);
		Score s2 = new Score("홍길연", 90, 70, 100);
		
		if(s.compareTo(s2)>0) {
			System.out.println(s);
		}else if(s.compareTo(s2)==0) {
			System.out.println("평균이 같습니다");
		}else {
			System.out.println(s2);
		}
		
	}

}
