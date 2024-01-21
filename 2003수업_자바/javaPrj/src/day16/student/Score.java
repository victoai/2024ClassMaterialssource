package day16.student;

public class Score {	
	
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
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
		return "Score [kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg=" + avg + "]";
	}
	public Score(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자
	// 세터 게터
	// toString

}
