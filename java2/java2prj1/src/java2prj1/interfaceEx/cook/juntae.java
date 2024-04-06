package java2prj1.interfaceEx.cook;

public class juntae  extends Cook implements 한식가능한{
	
	Cook c = new Cook();
	
	public juntae() {
		// TODO Auto-generated constructor stub
	}
	
	public juntae(String name) {
		super(name);
	}
	
	@Override
	public String 된장찌게만들기() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String 불고기만들기() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public String 김밥만들기() {
		System.out.print("재료를 ");
		c.썰기();
		System.out.println("잘 말아주면 완성");
		return "깻잎참치김밥";
	}

}
