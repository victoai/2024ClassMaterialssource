package day10.classType;

public class 자판기프로그램_객체지향 { 
	
	public static void main(String[] args) {	
				
		커피데이타2 coffee =null;
		coffee = new  커피데이타2();		//printInfo(coffee);  
		coffee.printInfo();  // 	//fillCoffee(coffee);
		coffee.fillCoffee();//커피데이타정보가 제공됨	
		coffee.printInfo();  //
		
		int money=100;				
		String result = coffee.밀크커피만들기(money);//String result  =밀크커피만들기( coffee, money);
		System.out.println( result);
		coffee.printInfo();  //
		
	}

 
 
	
	 
}
