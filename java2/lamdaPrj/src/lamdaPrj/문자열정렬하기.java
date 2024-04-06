package lamdaPrj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 문자열정렬하기 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");

        // 문자열 길이를 기준으로 오름차순 정렬
        
        
        words.sort( new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}});
        
        
        words.sort(  (o1, o2)-> o1.compareTo(o2) );
        words.sort(String::compareTo);
        
       // words.sort(Comparator.comparing(String::length));
           
           

        // 정렬된 결과 출력
        for (String word : words) {
            System.out.println(word);
        }
    }
}