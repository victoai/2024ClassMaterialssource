package day1.interfaceEx.cook;

public class SampleCook2  extends Cook implements 한식가능한 {

	public SampleCook2(String name) {
		super(name);
		 
	}

	@Override
	public String 비빔밥만들기() {
		
		//
		
		
		return "전주비빔밥";
	}

}
