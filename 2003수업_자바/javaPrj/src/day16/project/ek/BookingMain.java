package day16.project.ek;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookingMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ArrayList<Booking> list = new ArrayList<>();
		
		 ObjectOutputStream oos=null;		 
		 oos  = new ObjectOutputStream(new FileOutputStream("res/scoreList.txt"));
			
		for (int i = 0; i < BookingInfo.area.length; i++) {
			for (int j = 0; j < BookingInfo.hotel.length; j++) {
				for (int k = 0; k < BookingInfo.date.length; k++) {
					Booking b = new Booking(BookingInfo.area[i],BookingInfo.hotel[j], BookingInfo.date[k], true);
					//list.add(b);
					 
					oos.writeObject(b);
					
				}
			}
		}

	}

}
