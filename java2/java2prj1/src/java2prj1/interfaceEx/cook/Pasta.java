package java2prj1.interfaceEx.cook;

public class Pasta extends Cook implements 양식가능한{
	
	public Pasta() {
		// TODO Auto-generated constructor stub
	}
	public Pasta(String name) {
		super(name);
	}
	
	
	@Override
	public String 스파게티만들기() {
		String pasta = "토마토스파게티";
		return pasta;
	}

	@Override
	public String 피자만들기() {
		return null;
	}

	@Override
	public String 돈까스만들기() {
		return null;
	}
}
