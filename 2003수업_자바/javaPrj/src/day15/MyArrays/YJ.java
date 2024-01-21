package day15.MyArrays;

public class YJ  implements  MyComparator {

	@Override
	public int compare(Object o1, Object o2) {
	
		Score0 s1=   (Score0)o1;
		Score0 s2=   (Score0)o2;		
		
		return s1.getEng()-s2.getEng(); // 100 -90   90 -100 
	}

}
