package java2prj1.interfaceEx.cook;

public class 중국cook extends Cook implements 중식가능한 {

	public 중국cook() {

	}
	
	public 중국cook(String name) {
		super(name);

	}

	@Override
	public String 마라탕만들기() {
		return null;
	}

	@Override
	public String 탕수육만들기() {
		return "목화솜 탕수육을 만듭니다.";
	}

	@Override
	public String 짜장면만들기() {
		return null;
	}

}