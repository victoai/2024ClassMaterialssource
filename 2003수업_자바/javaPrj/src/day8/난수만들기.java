package day8;

public class 난수만들기 {
	public static void main(String[] args) {		
		//0~34 사이의 난수를 만드는 코드 		
		// Math.random();  0~ 1이 안되는 임의의 실수를 반환함
		// 이 값을 이용하여 일정범위의 난수를 만들수 있음 		
		int randomNumber  =  (int) (Math.random()*35);
		//0~34사이의 난수가 만들어짐
	}

}
