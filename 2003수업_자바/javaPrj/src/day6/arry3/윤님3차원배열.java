package day6.arry3;

public class 윤님3차원배열 {

	public static void main(String[] args) {
		String[][][]color= {
		 {
	
			{"빨강색","주황색","노랑색"},
			{"초록색","파랑색","검정색"},
			{"보라색","청록색","분홍색"}
		},
		 
		 {
			{"흰색","연두색","회색"},
			{"갈색","자주색","황토색"},
			{"살구색","멜론색","민트색"}
		}
	};
		 System.out.println(color[0][1][2]);  //검정색
		 System.out.println(color[1][0][0]);  //흰색

	}

}
