package day5.quiz;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		
		//switch
		
		//입력 : 주문수량  qty , 메뉴  menu
		//출력:  주문금액   amount
        //준비 : 메뉴별단가 
		       // 아메리카노: 2000
		       // 카푸치노 :2900
		       // 모카라떼 : 3200
		
		
		/*
		 * 1.메뉴, 주문수량입력
		 * 2.메뉴에 해당하는 주문금액 구한다
		 * 3.주문금액 출력 
		 * 
		 */
		//
		 String menu;
		 int qty;
		 
		 int amount;
		 
		 int 아메리카노=2000;   
		 int 카푸치노=2900;  
		 int 모카라떼 = 3200;  
		 
		 
		 Scanner sc = new Scanner( System.in);
		 System.out.println("메뉴와 수량을 입력하세요");
		 menu = sc.next();
		 qty   =sc.nextInt();
		 
		
		 switch(menu) {
			 case  "아메리카노" :
				 amount    =아메리카노 *qty;
				 break;
			 case  "카푸치노":
				 amount  = 카푸치노 * qty;
				 break;
			 case "모카라떼":
				 amount = 모카라떼* qty;
				 break;
			 default:
				 System.out.println( " 없는 메뉴");
				 amount=0;
		 }
		 
		 System.out.println(  amount);
		 
		
	}

}
