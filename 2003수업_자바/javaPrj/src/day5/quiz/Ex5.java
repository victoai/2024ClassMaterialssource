package day5.quiz;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		 
		
		
		//입력   메뉴 : menu
		//출력   메뉴에 해당하는 코드 실행  
		
		Scanner sc = new Scanner( System.in);
		
		//1. 등록, 2.조회 3.변경,  4.삭제 5. 종료
		int menu;
		
		loop: while( true) {
			menu = sc.nextInt();		
			switch( menu) {
			
			case 1:
				System.out.println("일정등록");
				break;
			case 2:
				System.out.println("조회");
				break;
			case 3:
				System.out.println( "변경");
				break;
			case  4:
				System.out.println( "삭제");
				break;
			case 5 :
				System.out.println( "종료");
				break loop;
			default:
				System.out.println(  " 선택 잘못");
			}
			 
		}
		
	}

}
