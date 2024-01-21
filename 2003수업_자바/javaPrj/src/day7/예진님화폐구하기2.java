package day7;

import java.util.Scanner;

public class 예진님화폐구하기2 {

	public static void main(String[] args) {

	System.out.println("출장비 입력");
		
	Scanner sc = new Scanner(System.in);
	
	//  오만원화폐매수
	//  만원화폐매수
	//  오천원매수
	//  천원
	//  오백원
	//  백원
	// 오십원
	// 십원
	
	
	//int money = sc.nextInt();	
	int money=312510; 
	
	// 오만원권 구하기
	int money1 = money/50000;   // ( / ) 정수 / 정수   => 정수  10/3 =>3
	money=money-(50000*money1);
 	System.out.println( money1);
 	System.out.println( money);
	
	// money=12510	
	int money2 = money/10000;
	money= money-(10000*money2);
	 
	
	// money=2510	
	int money3 = money/5000;
	money= money-(5000*money3);
	
	//money=2510
	int money4 = money/1000;   // 2
	money=money-(1000*money4);
	
	//money = 510
	 
	int money5 = money/500;   //1
	money=money-(500*money5);  // 510 - 500
	//money  = 10
	
	int money6 = money/100; //0
	money=money-(100*money6);
	// 10
	
	int money7 = money/50;  //0
	money=money-(50*money7); //
	//10
	 
	int money8 = money/10;  //1
	money=money-(10*money8); //10-10
	
	
	System.out.println("50000=>"+money1+" 10000=>"+money2+" 5000=>"+money3+" 1000=>"+money4+" 500=>"+money5+" 100=>"+money6+" 50=>"+money7+" 10=>"+money8);
	
		

	}

}
