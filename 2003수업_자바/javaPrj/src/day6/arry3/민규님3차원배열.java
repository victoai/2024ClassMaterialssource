package day6.arry3;

public class 민규님3차원배열 {

	public static void main(String[] args) {
		//무작위 패스워드 설정 
		
				String [][][] password = 
					{
						{
							{"a2","g8","c7"},
							{"nv", "fj","gc"},
							{"35","bj","z3"}
						}
						,
						{
							{"fz","kc","87"},
							{"7v", "hu","cc"},
							{"jc","bk","30"}
						}
						,
						{
							{"72","68","23"},
							{"nv", "jf","zk"},
							{"z8","ky","39"}
						}
						
						
				};
				System.out.print(password[0][1][1]);
				System.out.print(password[1][2][2]);
				System.out.print(password[2][1][0]);
				System.out.print(password[1][1][2]);
				System.out.print(password[0][1][1]);
				System.out.print(password[2][2][1]);
				System.out.print(password[1][2][0]);
				System.out.print(password[1][2][2]);				 
				
		    }	 

}
