package ajax;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Request일기 {
	public static void main(String[] args) throws IOException {
		
		
   	    FileInputStream fileInputStream = new FileInputStream("request.txt");		
		BufferedReader  buf = new BufferedReader( new InputStreamReader(fileInputStream  ));
		
		String  요청줄 =  buf.readLine();
		String  요청헤더 = buf.readLine();
		String  공백줄 = buf.readLine();


		System.out.println( "요청바디 읽기 시작!");
		String line="";
		while(  ( line= buf.readLine()) != null) {
			
			System.out.println( line);
		}
		
		
	}

}
