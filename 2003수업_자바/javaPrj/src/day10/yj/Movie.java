package day10.yj;


public class Movie {

	//멤버변수
	private String name;
	private String actor;
	private String time;
	
	
	//멤버매서드  함수
	
	public void input( String name, String actor, String time) {
		this.name  =name;
		this.actor=actor;
		this.time = time;
	}
	
	
	public void printInfo() {
		System.out.println( name);
		System.out.println( actor);
		System.out.println( time);
	}

}
