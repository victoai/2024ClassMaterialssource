package java2prj1.interfaceEx.cast.캐스팅연습_병진;

public class main {

	public static void main(String[] args) {
		CafeRun c = new CafeRun();
		점장 m = new 점장();
		c = m;
		c.run();
		
		System.out.println("===================");
		직원 m2 = new 직원();
		c = m2;
		c.run();
	}
}
