package java2prj1.interfaceEx.cook;

public class Seoyejin extends Cook implements 양식가능한{
	
	public Seoyejin() {
		 
	}
	public Seoyejin(String name) {
		 super(name);
	}
	

	@Override
	public String 스파게티만들기() {
		// TODO Auto-generated method stub
		return  "명란오일파스타";
	}

	@Override
	public String 피자만들기() {
		// TODO Auto-generated method stub
		return "콤비네이션피자";
	}

	@Override
	public String 돈까스만들기() {
		// TODO Auto-generated method stub
		return "치즈돈까스";
	}

	
}
