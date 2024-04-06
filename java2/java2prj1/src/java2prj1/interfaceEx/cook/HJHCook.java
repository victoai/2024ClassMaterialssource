package java2prj1.interfaceEx.cook;

public class HJHCook extends Cook implements 한식가능한{

	public HJHCook() {
	
	}
	
	public HJHCook(String name) {
		super(name);
	}
	
	
	@Override
	public String 된장찌게만들기() {
		return null;
	}

	@Override
	public String 불고기만들기() {
		return "고추장불고기";
	}

	@Override
	public String 김밥만들기() {
		return null;
	}
	
	
	
}
