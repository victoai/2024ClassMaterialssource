package algo.day3;

public class 윤정님S_6 {

	public static void main(String[] args) {
		// 등비수열   각 항에 *3 씩 규칙 적용됨
		// 공비: 3 
	    // 1  2  3   4   5      6    7  ....
	    // 2  6  18  54  162   486  .....
		//    
		
		
		int sum=2;  
		int n=2;
		int i=1;
		
		while( i<7){
			n= (n*4)- n;        //항을 구한다
			sum =sum + n;  //항을 누적한다
			i++;			
		}	
		
		System.out.println( sum);
		
		

	}

}
