package day4.reflect;

public class 객체생성하기3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		//클래스 정보를 로드하여 클래스 객체를 생성한다
		Class  clazz  =Class.forName("day4.reflect.Member");
		Member member  = (Member)clazz.newInstance();
		member.printSquare(2);
		
		
	}
}
