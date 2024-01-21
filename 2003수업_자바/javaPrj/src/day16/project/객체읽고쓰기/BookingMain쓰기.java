package day16.project.객체읽고쓰기;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookingMain쓰기 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
 
		 
		
		Booking  b =  new Booking("제주","2023/08/01","제주신라호텔","스탠다드 마운틴 더블",532400, true);
		ObjectOutputStream oos = null;
		 
			oos = new ObjectOutputStream(new FileOutputStream("res/testin.txt"));		 
			oos.writeObject( b);
		
	}
			
			

}
 