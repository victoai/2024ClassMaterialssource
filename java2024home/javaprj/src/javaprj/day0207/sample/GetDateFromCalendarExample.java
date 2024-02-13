package javaprj.day0207.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDateFromCalendarExample {
    public static void main(String[] args) {
        // 특정한 날짜로 Calendar 객체 생성
        int year = 2024;
        int month = 5; // 1월이 0, 12월이 11
        int day = 15;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // 월은 0부터 시작하므로 1을 빼줌

        // Calendar에서 Date 얻기
        Date specificDate = calendar.getTime();

        // 결과 출력
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("특정한 날짜: " + dateFormat.format(specificDate));
    }
}
