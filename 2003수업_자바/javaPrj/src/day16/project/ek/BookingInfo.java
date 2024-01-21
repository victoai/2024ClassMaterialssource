package day16.project.ek;

import java.io.Serializable;

public class BookingInfo implements Serializable {

	static String[] area = {"인천","부산","제주"};
	static String[] date = new String[365];
	static String[] hotel = {"K", "H", "E"};
	//String[] room;
	
	
	static {
		int sum = 0;
		for(int i=1; i<=12; i++) {
			int k;
			if(i==1 || i==3||i==5||i==7||i==8||i==10||i==12){k=31;}
			else if(i==2) {k=28;}
			else {k=30;}
			for(int j=1; j<=k; j++) {
				date[sum] = "2023/"+i+"/"+j;
				sum++;
			}
		}
	}
	
	

	
	
	
	
	
	
	
}
