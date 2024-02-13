package javaprj.day0207.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		 
		        String date1 = "2023/08/07"; //날짜1
		        String date2 = "2023/08/02"; //날짜2
		       
		        Date format1 = new SimpleDateFormat("yyyy/MM/dd").parse(date1);
		        Date format2 = new SimpleDateFormat("yyyy/MM/dd").parse(date2);
		        
		        long diffSec = (format1.getTime() - format2.getTime()) / 1000; //초 차이
		        long diffMin = (format1.getTime() - format2.getTime()) / (10000*60); //분 차이
		        long diffHor = (format1.getTime() - format2.getTime()) / (1000*60*60); //시 차이
		        long diffDays = diffSec / (24*60*60); //일자수 차이
		        
		        System.out.println(diffSec + "초 차이");
		        System.out.println(diffMin + "분 차이");
		        System.out.println(diffHor + "시 차이");
		        System.out.println(diffDays + "일 차이");
		  
		        
		        
		        
		        Date date= new Date();
		        System.out.println( date);
		        
		        
		        SimpleDateFormat sf= new SimpleDateFormat("yyyy/MM/dd");
		        String dates= sf.format(date);
		        System.out.println( dates);
		        
		      
		       // 현재 날짜 가져오기
		        Date currentDate = new Date();

		        // Calendar 객체 생성 및 현재 날짜 설정
		        Calendar calendar = Calendar.getInstance();
		        calendar.setTime(currentDate);

		        // 3개월 뒤의 날짜 계산
		        calendar.add(Calendar.MONTH, 3);
		        Date futureDate = calendar.getTime();

		        // 결과 출력
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        System.out.println("현재 날짜: " + dateFormat.format(currentDate));
		        System.out.println("3개월 뒤의 날짜: " + dateFormat.format(futureDate));
		        
	}

}
