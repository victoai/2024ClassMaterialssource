package day7.함수;

public class Ex08 {

	public static void main(String[] args) {
		int result  =a(5);
		System.out.println( result);
	}

	public static int a(int a) {
		System.out.println(" a 호출");
		return 3;
	}

	public static int b(char a) {
		return 4;
	}

	public static char c(int a) {
		return 'c';
	}

	public static double d() {
		return 2.5;
	}

	public static String e() {
		return "안녕";
	}

}
