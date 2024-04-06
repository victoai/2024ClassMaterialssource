package java2prj1.interfaceEx.cook;


public class cook이정훈  extends Cook implements 한식가능한{
	public cook이정훈() {
		
	}
	public cook이정훈(String name) {
		super(name);
	}
	
	@Override
	public String 된장찌게만들기() {
		// TODO Auto-generated method stub
		return "두부된장찌게";
	}

	@Override
	public String 불고기만들기() {
		// TODO Auto-generated method stub
		return "철판 불고기";
	}

	@Override
	public String 김밥만들기() {
		// TODO Auto-generated method stub
		return "참치김밥";
	}


}
