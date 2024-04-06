package day4.계산기;

import java.util.Scanner;

 

public class Program3 {	
	 
	
	public static void main(String[] args) {
		
		int su1 , su2;			
		Scanner sc = new Scanner( System.in);
		su1= sc.nextInt();
		su2= sc.nextInt();
		
		ACalculator calculator= new ACalculator();
		int result  =calculator.add(su1, su2);
		System.out.println( result);
		
		
		
		 
	}
	
}
