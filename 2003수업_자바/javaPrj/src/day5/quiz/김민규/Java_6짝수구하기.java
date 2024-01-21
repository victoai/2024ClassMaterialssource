package day5.quiz.김민규;

public class Java_6짝수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		int sum=0;
		for(int i=1 ; i<=10;  i++) {
			if(i%2==1) {
				continue;
		}
			sum+=i;
		}
		System.out.println(sum);
		
		
	}

}
