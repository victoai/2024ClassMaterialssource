package day16.project;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class 파일추가 {
    public static void main(String[] args) {
        String filePath = "res/test.txt";
        String content = "test문자열ㅇㄹㅇㄹㅇㄹㅇㄹ";

        try {
            // 파일에 문자열을 추가하기 위해 FileWriter와 BufferedWriter를 사용합니다.
            FileWriter fileWriter = new FileWriter(filePath, true); // true는 append 모드를 나타냅니다.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // 새로운 문자열을 파일에 추가합니다.
            bufferedWriter.write(content);
            bufferedWriter.newLine(); // 새로운 줄로 이동합니다.

            // 리소스를 정리합니다.
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("성공");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
