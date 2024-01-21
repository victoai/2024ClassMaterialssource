package day16.project.ek;

import java.io.Serializable;

public class Booking  implements Serializable{

	String area;
	String hotel;
	String date;
	boolean empty;

	public Booking() {
	}

	public Booking(String area, String hotel, String date, boolean empty) {
		super();
		this.area = area;
		this.hotel = hotel;
		this.date = date;
		this.empty = empty;
	}

	@Override
	public String toString() {
		return "지역: " + area + " 호텔:" + hotel + " 날짜: " + date + " 예약여부: " + empty;
	}

}
