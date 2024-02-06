package javaprj.day0130;

public class Main {

	public static void main(String[] args) {		
		
		//
		int time  = 양치질하기() ;
		
		if(time >=3) {
			System.out.println( "참잘했어요");
		}else {
			System.out.println("담엔 좀 더 꼼꼼하게 하자");
		}
		

	}
	
	
	
	public static int 양치질하기() { 
		
		// 양치를 위한 일련의 과정 
		//한다
		//한다
		
		int random  = (int)( Math.random()*4); 
		return random;
	}

}
