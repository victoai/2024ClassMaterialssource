package day16.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class 문자열쓰기 {
    public static void main(String[] args) {
        String content = "안녕하세요";

        try {
            String filePath = "res/test.txt"; // 
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            // 문자열을 파일에 쓰기
            writer.write(content);

            // 파일 쓰기 완료 후 닫기
            writer.close();
            
            System.out.println("문자열이 파일로 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}