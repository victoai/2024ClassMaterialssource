package java2prj1.interfaceEx.cast.캐스팅예시_표준태;

public class order {
	public static void main(String[] args) {
		hanburger h = new setMenu();

		String order1 = h.햄버거();
		System.out.println("손님 1: " + order1);
		
		setMenu s = (setMenu) h;
		String order2 = s.셋트메뉴();
		System.out.println("손님 2: " + order2);

	}
}
