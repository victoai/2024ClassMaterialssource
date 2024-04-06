package java2prj1.interfaceEx.cook;

public class kbj extends Cook implements 양식가능한{
	
	public kbj() {
		
	}
	
	public kbj(String name) {
		super(name);
	}
	
	
	
	@Override
	public String 돈까스만들기() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String 스파게티만들기() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String 피자만들기() {
		// TODO Auto-generated method stub
		return "오븐을 예열합니다.";
	}
}
