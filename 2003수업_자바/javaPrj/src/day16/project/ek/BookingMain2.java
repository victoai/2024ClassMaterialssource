package day16.project.ek;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookingMain2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ArrayList<Booking> list = new ArrayList<>();
		
		  BufferedWriter writer = new BufferedWriter(new FileWriter("res/book"));

          // 문자열을 파일에 쓰기
         
			
		for (int i = 0; i < BookingInfo.area.length; i++) {
			for (int j = 0; j < BookingInfo.hotel.length; j++) {
				for (int k = 0; k < BookingInfo.date.length; k++) {
					Booking b = new Booking(BookingInfo.area[i],BookingInfo.hotel[j], BookingInfo.date[k], true);
					//list.add(b);
					 
					 writer.write(BookingInfo.area[i]);
					
				}
			}
		}
		
		
	    writer.flush();
	    writer.close();

	}

}
