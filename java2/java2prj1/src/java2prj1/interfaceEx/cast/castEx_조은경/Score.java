package java2prj1.interfaceEx.cast.castEx_조은경;

public class Score implements MyComparable{

	String name;
	int kor;
	int eng;
	int math;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	@Override
	public int compareTo(Object other) {
		Score s = (Score)other;
		int avg = (this.kor + this.eng + this.math)/3;
		int avg2 = (s.kor + s.eng + s.math)/3;
		return avg - avg2;
	}
	
	

}
