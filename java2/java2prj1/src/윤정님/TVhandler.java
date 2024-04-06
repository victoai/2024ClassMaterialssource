package 윤정님;

import java.util.ArrayList;
import java.util.Scanner;

public class TVhandler {
	
	static Scanner scanner = new Scanner(System.in);
	int menu = scanner.nextInt();
	static ArrayList<TV> list = new ArrayList<>();
	
	public static void 안내() {
		
		System.out.println("==== TV 프로그램 등록 ====");
		System.out.println("1. 등록");
		System.out.println("2. 조회");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
	}
	
	
	public static void 등록() {
		
		System.out.println("TV 정보를 새롭게 등록하세요");
		System.out.print("TV 이름 : ");
		String name = scanner.nextLine();
		System.out.print("감독 이름: ");
		String supervise = scanner.nextLine();
		System.out.print("방영 시간: ");
		String airtime = scanner.nextLine();
		
		list.add(new TV(name, supervise, airtime));
	}
	
	
	public static void 조회() {
		for(TV tv : list) {
			System.out.println(tv);
		}
	}
	
	

	public static void 수정() {
		
	}
	
	
	public static void 삭제() {
		System.out.print("삭제할 TV 프로그램 이름을 입력하세요: ");
		String delete = scanner.nextLine();
		
		for(TV tv : list) {
		if(tv.getName().equals(delete)) {
			list.remove(tv);
		} else {
			System.out.println("삭제할 TV 프로그램이 존재하지 않습니다.");
		}
	}
		
	}

}
