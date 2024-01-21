package day15;

public class CTest {

	public static void main(String[] args) {
	 
		C c = new C();
		try {
			c.매서드(200);
		} catch (OverNumberException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
			//System.out.println(e.getMessage());
			
		}finally {
			// 예외발생하든 하지 않든 수행되는 코드
		}
		
		System.out.println("정상종료");
		
		
		 

	}

}
