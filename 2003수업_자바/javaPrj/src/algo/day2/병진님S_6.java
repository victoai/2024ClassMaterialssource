package algo.day2;

public class 병진님S_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int k=1; 
		double num=0;
		double sum=0;
		int sw=0;
	
		final int MAX=4;
		while( k<=MAX) {			
			num=k;
			
			while( i < k ) {  
				num = num /( k-i);
				i=i+1;			
			}
			System.out.println( num);
			i=0;
			
			if( sw ==0) {
				sum=sum+num;
				sw=1;
			}else {
				sum = sum-num;
				sw=0;
			}		
			
			k=k+1;
		}
		System.out.println( "누적합" + sum);		

	}

}
