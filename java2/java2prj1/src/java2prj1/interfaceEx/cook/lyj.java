package java2prj1.interfaceEx.cook;

public class lyj extends Cook implements 한식가능한 {
	
	public lyj() {
		// TODO Auto-generated constructor stub
	}
	

	public lyj( String name) {
		 super( name);  //부모의 매개변수가 있는 생성자 호출 
		 
	}
	
	@Override
	public String 된장찌게만들기() {
		// TODO Auto-generated method stub
		return "차돌된장찌개";
	}

	@Override
	public String 불고기만들기() {
		// TODO Auto-generated method stub
		return "뚝배기불고기";
	}

	@Override
	public String 김밥만들기() {
		// TODO Auto-generated method stub
		return "참치김밥";
	}
	

	
	
}
