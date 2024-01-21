package day5;

public class BreakEx {

	public static void main(String[] args) {
		 
		
		// switch , 
		// while , for 반복문에서   break;
		// 자신이 속한 반복문 빠져나옴 
		
		// 1~10까지의 합
		
		int i=0;
		int sum=0;
		while(true) {  // 무한반복 , 탈출조건 반드시 있어야 함 
			i++;
			sum = sum + i; //  sum+=i;
			if( i >=10) break;			
		}		
		System.out.println( sum);

	}

}
