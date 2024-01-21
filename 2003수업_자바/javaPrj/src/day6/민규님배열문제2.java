package day6;

import java.util.Scanner;

public class 민규님배열문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열합
		// 수를10개입력받아  , 입력받은 수의 합계 , 전체 수를 출력하는 문제
		// 입력 처리 분리 
		
				int[] arr = new int[10]; 
				int a = 0; //  전체합계를 저장할 변수  
				int sum;
				
				Scanner sc = new Scanner(System.in);
				
		        for (int i = 0; i < 10; i++) {
		            System.out.print("숫자 입력 ");
		            arr[i] = sc.nextInt();		           
		        }
		        
		        
		        
		        //총합 구하는 반복문
		        for (int i = 0; i < 10; i++) {
		        	a+=arr[i]; // 0에서 배열의 받은 숫자만큼 더해줌  	       
		        } 
		        //
		        sum = arr[0]+ arr[1]+ arr[2]+arr[3]+ arr[4]+arr[5]+ arr[6]+ arr[7]+arr[8]+ arr[9];
		        
		        
		        System.out.println("배열");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        
		        
		        System.out.println( a);
		        System.out.println( sum);
		       

	}

}
