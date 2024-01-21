package day6;

public class 정훈님배열 {

	public static void main(String[] args) {
		char[] p = new char[6];

		p[0] = '안';
		p[1] = '녕';
		p[2] = '하';
		p[3] = '세';
		p[4] = '요';
		p[5] = '.';

		System.out.print(p[0]);
		System.out.print(p[1]);
		System.out.print(p[2]);
		System.out.print(p[3]);
		System.out.print(p[4]);
		System.out.print(p[5]);

		System.out.println();

		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i]);

		}
	}

}
