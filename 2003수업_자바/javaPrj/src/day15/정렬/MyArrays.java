package day15.정렬;

public class MyArrays {	
	
	public static void sort( Object[] obj , MyComparator c) {		
		// 선택정렬 
		
		for( int i=0; i< obj.length-1 ; i++) {			
			for( int j=i+1 ; j< obj.length; j++) {
				
				if(  c.compare(obj[i], obj[j]) >0 ) {					
					Object  tmp;
					tmp = obj[i];
					obj[i] = obj[j];
					obj[j]= tmp;					
					
				}
			}
		}
		
	}
	
	
	public static void sort( Object[] obj) {		
		for( int i=0 ; i< obj.length-1; i++ ) {			
			for( int j=i+1 ; j< obj.length; j++) {					
				 
				MyComparable m  =(MyComparable) obj[i];  // i번째와 j번째 비교
				if( m.compareTo(obj[j]) >0  ) {
					
					// i번째 j번째 교환(자리바꿈)					
					Object tmp;
					tmp  = obj[i];
					obj[i]= obj[j];
					obj[j]=tmp; 
					
				}
			}
			
			
		}
		
		
	}

}
