package day6;

import java.util.Scanner;

public class 현수님배열문제1 {

	public static void main(String[] args) { 			 

				int[] arr = new int[10];
				int i = 0;
				int num;
				Scanner sc = new Scanner(System.in);
				
				while (i < arr.length) {
					System.out.println(i + "번째 숫자를 입력하세요.");
					num = sc.nextInt();
					if (num % 2 == 0) {
						arr[i] = num;
					}
					i++;

				}
				for (i = 0; i < arr.length; i++) {
					System.out.println("arr[" + i + "] : " + arr[i]);
				}
			} 
	 

}
