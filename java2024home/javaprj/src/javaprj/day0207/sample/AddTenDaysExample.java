package javaprj.day0207.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddTenDaysExample {
	
	 public static void main(String[] args) {
		 	Date currentDate = new Date();

	        // Calendar 객체 생성 및 현재 날짜 설정
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(currentDate);

	        // 10일 뒤의 날짜 계산
	        calendar.add(Calendar.DAY_OF_MONTH, 10);
	        Date futureDate = calendar.getTime();

	        // 결과 출력
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        System.out.println("현재 날짜: " + dateFormat.format(currentDate));
	        System.out.println("10일 후의 날짜: " + dateFormat.format(futureDate));
	}
}
