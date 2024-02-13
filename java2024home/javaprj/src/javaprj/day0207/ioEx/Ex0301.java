package javaprj.day0207.ioEx;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex0301 {
    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);

        try {
            int data;            
            // 엔터키 입력 전까지 반복
            while ((data = is.read()) != '\n') {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
