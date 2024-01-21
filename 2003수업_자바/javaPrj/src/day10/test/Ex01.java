package day10.test;

import day10.MG;

public class Ex01 {

	public static void main(String[] args) {
		 //class  같은폴더 , 같은패키지에서 찾음 
		 //import  사용해서 클래스의 패키지(폴더정보)를 제공해야 함 		
		int[] result =MG.getYak(12);
		
		for( int i=0; i< result.length ; i++) {
			 System.out.print( result[i] + "  ");
		}

	}

}
