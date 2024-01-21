package day15.MyArrays;

public class MyArrays테스트 {

	public static void main(String[] args) {
		Score0[] arr = new Score0[3];		
		arr[0]= new Score0("이길동",90,71);
		arr[1]= new Score0("김길동",70,99);
		arr[2]= new Score0("박길동",60,89);
		
		YJ y = new YJ();
		MyArrays.sort(arr, y);
		//MyArrays.sort(arr, new YJ());
		
		 
		
		for( Score0 score : arr)
			System.out.println( score);
		
		
		//MyArrays.sort( arr , new  MyComparator() {});
		MyArrays.sort( arr , new  MyComparator() {   // 익명클래스  익명객체

			@Override
			public int compare(Object o1, Object o2) {
				Score0 s1=   (Score0)o1;
				Score0 s2=   (Score0)o2;	
				
				return s1.getKor()-s2.getKor(); // 100 -90   90 -100 
			 
			}});
		
		
		
		for( Score0 score : arr)
			System.out.println( score);
		
		
		
		
		
		MyArrays.sort(arr);

	}

}
