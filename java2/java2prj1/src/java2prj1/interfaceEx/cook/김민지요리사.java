package java2prj1.interfaceEx.cook;

public class 김민지요리사 extends Cook implements 양식가능한{

	public 김민지요리사() {
		// TODO Auto-generated constructor stub
	}
	
	public 김민지요리사( String name ) {
		super(name);
	}
	
	@Override
	public String 스파게티만들기() {
		// TODO Auto-generated method stub
		return "까르보나라";
	}

	@Override
	public String 피자만들기() {
		// TODO Auto-generated method stub
		return "고르곤졸라 피자";
	}

	@Override
	public String 돈까스만들기() {
		// TODO Auto-generated method stub
		return "히레카츠";
	}
	
}
