package day6;

public class 단야님배열 {

	public static void main(String[] args) {
		int[] arr5 = new int[5];
		int[] arr6 = {1,0,3,2,4};
		
		arr5[0]=1;
		arr5[1]=0;
		arr5[2]=3;
		arr5[3]=2;
		arr5[4]=4;
		
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		System.out.println(arr5[3]);
		System.out.println(arr5[4]);
		for(int i=0; i<arr5.length; i++) {
			System.out.println(arr5[i]);
		}
	}

}
