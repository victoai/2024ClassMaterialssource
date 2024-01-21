package day15;

import java.io.IOException;

public class 입출력 {

	public static void main(String[] args) {


		
		
		try {
			int result  = System.in.read();
			System.out.println( result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
			
		}
		

	}

}
