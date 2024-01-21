package day15;

public class F  implements MyRunnable {

	@Override
	public void run() {
		System.out.println("3단 출력");
		
		for( int i=1; i<=9 ;i++) {
			System.out.println( 3*i);
		}
		
	}

}
