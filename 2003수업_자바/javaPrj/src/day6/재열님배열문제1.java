package day6;

import java.util.Scanner;

public class 재열님배열문제1 {

	public static void main(String[] args) {

		int[] num = new int[10];
		int[] evennum = new int[10];
		int count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("수를 입력하세요");

		for (int i = 0; i < num.length; i++) { //수 입력
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) { // 짝수 구분
			if (num[i] % 2 == 0) {
				evennum[count] = num[i];
				count++;
			}
		}

		for (int i = 0; i < count; i++) { // 출력
			System.out.print(evennum[i] + " ");
		}

	}

}
