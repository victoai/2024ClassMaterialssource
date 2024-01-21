package com.acorn;

 

public class MG2 {

	public static int[]  getYak( int num) {		
		// 12 - > 1 2 3 4 5 6 7 8 9 10 11 12
		//        1 2 3 4 6 12 
		
        int[] yak = new int[20];  // type의 기본형,0으로 초기화   

        int cnt = 0; // 배열시작 0...19
        for (int i = 1; i <= num; i++) {   //   i:  12  => 12/1  ~12/12   
            if (num % i == 0){//약수 구하는식 
                yak[cnt] = i; // i 가 배열에 들어가게함
                cnt++;	
            }
        }        
        // 약수개수만큼의 배열 생성하기
        int[] result_yak = new int[cnt];
        System.arraycopy(yak, 0, result_yak, 0, cnt);        
        
       return result_yak;
        
    }
}