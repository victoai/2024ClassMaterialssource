package day11.클래스샘플;
 

public class car_test {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.print();
		
		c.input("Avante", "Hyundai", 2022, "white", 50);
		c.print();
		
		c.start();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.now();
		
		Singer singer = new Singer();
		 
	}

}
