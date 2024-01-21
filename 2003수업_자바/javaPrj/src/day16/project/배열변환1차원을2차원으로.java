package day16.project;

public class 배열변환1차원을2차원으로 {

	public static void main(String[] args) {
	 
		
		//1차원 배열
		int[]  numbers  = { 1,2,3,4,5,6,7,8,9,10,11,12};	
		
		//				
		
		//2차원으로 변환		
		int[][] numbers2 = new  int[4][3];
		
		int index=0;
		for( int i=0 ; i< numbers2.length;i++) {			
			for( int  j=0 ; j< numbers2[i].length; j++) {				
				numbers2[i][j]=  numbers[index];
				index++;				
			}			
		}		
		
		
		// 2차원 배열 출력
		for( int i=0 ; i< numbers2.length;i++) {			
			for( int  j=0 ; j< numbers2[i].length; j++) {					  
				System.out.print(numbers2[i][j] +"  ");				 			
			}			
			
			System.out.println();
		}
		
		
		
		
		

	}

}
