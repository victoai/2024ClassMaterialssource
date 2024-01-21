package day6.arry3;

public class 정훈님3차원배열 {

	public static void main(String[] args) {
		char[][][] a = {
				{
					{'a','b','c'},
					{'d','e','f'},
					{'g','h','i'},
				},
				{
					{'j','k','l'},
					{'m','n','o'},
					{'p','q','r'},
				},
				{
					{'s','t','u'},
					{'v','w','x'},
					{'y','z',' '},
				}
		};
		System.out.print(a[0][0][0]);
		System.out.print(a[0][0][2]);
		System.out.print(a[1][1][2]);
		System.out.print(a[1][1][1]);
		System.out.print(a[2][2][2]);
		System.out.print(a[0][0][0]);
		System.out.print(a[0][0][2]);
		System.out.print(a[0][0][0]);
		System.out.print(a[0][1][0]);
		System.out.print(a[0][1][1]);
		System.out.print(a[1][1][0]);
		System.out.print(a[2][2][0]);

	}

}
