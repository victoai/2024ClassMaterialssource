package algo.day3;

public class 민규님S_1 {

	public static void main(String[] args) {
		double ha=2500000;
		double ka=1800000;
		
		final double ALPHA= 1.036;
		final double BETA = 1.042;
		
		int y=1999;
		
		while( ha > ka) {
			y++;
			ha= ha*ALPHA;
			ka= ka*BETA;			
		}		
		System.out.println( y);		

	}

}
