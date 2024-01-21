package day6.arry3;

public class 예진님3차원배열 {

	public static void main(String[] args) {
		char[][][] name = {
				{
					{'a','b','m'},
					{'n','o','c'},
					{'y','e','d'}
				},
				{
					{'j','i','철'},
					{'s','김','h'},       
					{'진','k','l'}
					
				},
				{	
					{'서','가','운'},
					{'문','g','예'},
					{'j','박','f'}
					
				}
				
		}; 
		// my name is seo yejin 출력
		System.out.print(name[0][0][2]); //m
		System.out.print(name[0][2][0]+" "); //y
		System.out.print(name[0][1][0]); //n
		System.out.print(name[0][0][0]); //a
		System.out.print(name[0][0][2]); //m
		System.out.print(name[0][2][1]+" "); //e
		System.out.print(name[1][0][1]); //i
		System.out.print(name[1][1][0]+" "); //s
		System.out.print(name[1][1][0]); //s
		System.out.print(name[0][2][1]); //e
		System.out.print(name[0][1][1]+" "); //o
		System.out.print(name[0][2][0]); //y
		System.out.print(name[0][2][1]); //e
		System.out.print(name[2][2][0]); //j
		System.out.print(name[1][0][1]); //i
		System.out.print(name[0][1][0]); //n

	}

}
