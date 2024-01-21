package day6;

public class 병진님배열 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 8;
		arr[3] = 9;
		arr[4] = 25;
		System.out.println(arr); //배열명을 출력시 배열의 첫 주소값을 출력
		
		char[] arr1 = new char[5]; //char은 ''으로
		double[] arr2 = new double[5];
		String[] arr3 = new String[5]; //문자열은 ""으로
		int[] arr4 = new int[5];
		
		arr1[0] = '홍';
		arr1[1] = '대';
		arr1[2] = '에';
		arr1[3] = '이';
		arr1[4] = '콘';		
		System.out.println(arr1);

	}

}
