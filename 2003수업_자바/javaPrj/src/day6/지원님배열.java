package day6;

public class 지원님배열 {

	public static void main(String[] args) {
		char[] arr_name = new char[3];
		
		arr_name[0]='박';
		arr_name[1]='지';
		arr_name[2]='원';
		
		System.out.print(arr_name[0]);
		System.out.print(arr_name[1]);
		System.out.println(arr_name[2]);
		
		for(int i=0; i<arr_name.length; i++) {
			System.out.print(arr_name[i]);
		}

	}

}
