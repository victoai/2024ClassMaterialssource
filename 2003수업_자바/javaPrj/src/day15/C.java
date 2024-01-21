package day15;

public class C {
	
	public void 매서드( int su) throws OverNumberException       {
		
		//예외을 일으키는 코드, 발생시키는 코드,
		if( su >100) {
			throw new  OverNumberException() ;
		}
		 System.out.println( "c  매서드");
	}

}
