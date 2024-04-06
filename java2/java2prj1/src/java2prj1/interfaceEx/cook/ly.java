package java2prj1.interfaceEx.cook;

public class ly extends Cook implements 중식가능한{

	public ly() {
	// TODO Auto-generated constructor stub
	}
	
	public ly(String name) {
		super(name);
	}
	
	@Override
	public String 마라탕만들기() {
		// TODO Auto-generated method stub
		return "차돌마라탕";
	}

	@Override
	public String 탕수육만들기() {
		// TODO Auto-generated method stub
		return "찹쌀탕수육";
	}

	@Override
	public String 짜장면만들기() {
		
		// TODO Auto-generated method stub
		return "간짜장";
	}
	
	
	
}
