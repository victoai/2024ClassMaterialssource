package algo.day3;

public class switch문 {

	public static void main(String[] args) {
		 
		
		int menu=1; 
		
		switch(menu) {
		case 1:
			System.out.println(" 등록을 선택 하셨어요");
			break;
		case 2:
			System.out.println(" 변경을 선택 하셨어요 ");
			break;
		case 3:
			System.out.println( "삭제를 선택 하셨군요");
			break;
		case  4:
			System.out.println("조회를 선택하셨군요");
			break;
		default:
			System.out.println(" 잘못된 메뉴");	
			
		}

	}

}
