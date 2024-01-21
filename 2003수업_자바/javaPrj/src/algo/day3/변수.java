package algo.day3;

public class 변수 {

	public static void main(String[] args) {
		 
		// 변수 :  메모리블럭, 기억장소(공간) , 기억장소를 식별하기 위한 이름 
		
		//변수선언
		//자료형 변수이름 
		//int a;   // 4byte 기억공간  기억장소를 확보함 , 정수형으로 해석  	
		
		//자료형 
		// 크기 + 해석방법 
		
		//자료형( 공간의 크기와 해석을 하는 방법 제공함 )
		/* 
		 *    int  : 정수형 , 4byte    예시) int a ;  (+ - 약 21억)
		 *
		 *    byte: 1byte  ( 8bit , 1bit sign  -128~+127);
		 *    short: 2byte  ( 16bit)  -32768 ~ 32767 
		 *    int  : 4byte (32bit)     -2147483648 ~ 2147483647
		 *    long  : 8byte( 64bit)   9223372036854775807L ; // 922 3372 0368 5477 5807 L   (약922경)
		 *    
         *     
   	     *    char : 문자형 :문자하나를 저장할 수 있는 공간 ,2byte 
   	     *    예시) char ch='a';      // 한 문자  ' '  표현;
   	     *    예시) char ch2 ='한';
   	     *    
   	     *    double  : 실수형데이터를 저장할 수 있는 공간  :8byte
   	     *             소수이하 15자리 표현
   	     *    float  :  4byte  소수이하 7자리 표현  
   	     *    예시) double avg=98.77;
   	     *    
   	     *    boolean: 논리형   true ( 0이 아닌값) , false(0인값)
   	     *    예시) boolean flag=true;   	     *     
		 * 
		 */				
		 		
		
		//리터럴 : 값자체   , 10 , 10.3 , 'a' ,  "hello" , true 
		//  상수영역에 저장된다. 
		//  크기를 가진다.
		//  정수형값 int형저장
		//  실수형값 double형 저장		
		
		int iNum=334;   // ok   334라는 값이 상수영역에 저장되는 것    ok
		                //      iNum 기억장소에 저장되는 것   ok
		
		//long iLong = 2200000000; (오류발생)
		               //     22억 값 상수영역에 저장하는 것에 문제 발생 X 
		               // 
		 long iLong = 2200000000L;
		              //long형리터럴값을 표현해야 함   숫자L 로 long형 리터럴표현함 
		
		 
		 double d= 23.3;  //  23.3 실수형리터럴이 double형으로 상수영역 저장  ok
		                  //   d라는 변수에 저장됨   ok
		 
		 //float  f = 23.3;  //  23.3 상수영역에 저장되는 것이  ok
		                   //  double형이 float변수에 저장될 때 문제 발생 됨 X
		 
		 
		 float f = 23.3f;  // 상수영역에   float형 값으로 저장될 수 있도록 표현해야함
		                   // 숫자f 표시해야  float형 상수로 저장됨 
		 
		 
		 char ch='a';  // 한 문자를 저장하기 위한 공간을 확보할 때 사용하는 자료형
		               //  ' '  한 문자 표현한다.
		               //2byte 사용함 
		 char ch2='김';
		 
		 System.out.println( ch);
		 System.out.println( ch2);
		 
		 // "문자열을 어떻게 표현할까요?" 
		 // 문자열은 문자여러개가 모인것 입니다. 문자집합이라고 표현한다.
		 
		 // "i like java" // 문자11개를 저장할 수 있는 공간 필요 => 문자배열로 표현함
		 // 
		 char[] str ={'i',' ','l','i','k','e',' ', 'j','a','v','a'};
		 char[] str2 = new char[11];		 
		 str2[0]='i';
		 str2[1]=' ';
		 str2[2]='l';
		 str2[3]='i';
		 str2[4]='k';
		 str2[5]='e';
		 str2[6]=' ';
		 str2[7]='j';
		 str2[8]='a';
		 str2[9]='v';
		 str2[10]='a';
				
		 System.out.println("  문자열 출력");
		 System.out.print(str2[0]);
		 System.out.print(str2[1]);
		 System.out.print(str2[2]);
		 System.out.print(str2[3]);
		 System.out.print(str2[4]);
		 System.out.print(str2[5]);
		 System.out.print(str2[6]);
		 System.out.print(str2[7]);
		 System.out.print(str2[8]);
		 System.out.print(str2[9]);
		 System.out.print(str2[10]);
		 	 
		 
		 String str3="i like java";
		 System.out.println( str3);
		 
		 char result  = str3.charAt(2);
		 System.out.println( result);
		 
		 
		 
		 // 논리값을 저장할 수  있는 자료형  boolean   true, false
		 boolean flag= true;  // 
		 
		 if( flag ==true) {
			 System.out.println(" 조건이 참입니다.");
		 }
		 
		 if( flag ) {   
			 System.out.println(" 조건이 참입니다.");
		 }else {
			 System.out.println(" 조건이 거짓입니다");
		 }
		 
		 
		 
		 		 
		 
		 
		 
		                   
		 

	}

}
