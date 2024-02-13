package javaprj.day0207.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDateExample {
    public static void main(String[] args) {
        // 현재 날짜 가져오기
        Date currentDate = new Date();

        // 원하는 형식으로 포맷팅
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);

        // 결과 출력
        System.out.println("현재 날짜: " + formattedDate);
    }
}
