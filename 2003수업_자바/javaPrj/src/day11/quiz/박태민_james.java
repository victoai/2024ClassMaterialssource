package day11.quiz;

public class 박태민_james {

	public static void main(String[] args) {
		
		System.out.println("나이 이름 성별 결혼여부 자식수");
		
		박태민_james_class manInfo = new 박태민_james_class(20, "james", "male", true, 3);
		String result = manInfo.toString();
		System.out.println(result);		
		//
		
		박태민_james_class  a= new 박태민_james_class();
		String result2 = manInfo.toString();
		System.out.println(result);
		
		
	}

}
