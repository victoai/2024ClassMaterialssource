package day4.reflect;

public class 객체생성하기3 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		Class  clazz  =Class.forName("day4.reflect.Member");
		Member member  = (Member)clazz.newInstance();
		member.method2(2);
		
		
	}
}
