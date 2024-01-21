package day5.quiz;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		 //고객정보(아이디, 이름,  나이 ,키 )입력받아서 출력하기
		String id;
		String name;
		int age;
		double height;
		
		
		Scanner sc = new Scanner( System.in);
		
		id  = sc.next();
		name = sc.next();
		age = sc.nextInt();
		height= sc.nextDouble();
		
		
		System.out.println( id + name + " " +  age +  " " + height) ;
		
		
		

	}

}
