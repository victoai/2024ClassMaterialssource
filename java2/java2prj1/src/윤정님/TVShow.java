package 윤정님;

import java.awt.Menu;
import java.util.Scanner;

public class TVShow {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			TVhandler.안내();
			int menu = scanner.nextInt();
			
			switch (menu) {
			case 1: {
				TVhandler.등록();	
				break;
			}
			
			case 2: {
				TVhandler.조회();	
				break;
			}
			
			case 3: {
				TVhandler.수정();
				break;
			}
			
			case 4: {
				TVhandler.삭제();
				break;
			}
			
			default:
				System.out.println("잘못된 입력입니다");
			}
			
		}
		

	}

}
