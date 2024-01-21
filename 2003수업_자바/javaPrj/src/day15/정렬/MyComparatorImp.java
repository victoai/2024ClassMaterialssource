package day15.정렬;

public class MyComparatorImp  implements MyComparator {

	@Override
	public int compare(Object o1, Object o2) {  // 앞의 내용이 크면 양수 아니면 음수
		 
		Score s1= (Score)o1;
		Score s2 =(Score)o2;
		
		return s1.getKor()-s2.getKor();   // 앞의 내용이 크면 양수  작으면 음수
	}

}
