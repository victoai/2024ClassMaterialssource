package day16.project.객체읽고쓰기;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class BookingMain읽기 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
 
		ObjectInputStream ois = null;
	 
				ois = new ObjectInputStream(new FileInputStream("res/testin.txt"));				 
 		       Booking booking = (Booking) ois.readObject();  		    
			    System.out.println(booking );
		
	}

}
 