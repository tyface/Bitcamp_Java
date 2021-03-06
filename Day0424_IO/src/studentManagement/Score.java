package studentManagement;

import java.io.Serializable;

public class Score implements Serializable {
	private int kor;
	private int eng;
	private int math;
	private final int TOTAL_SUBJECT = 3;
	public Score() {}
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getkor() {
		return kor;
	}
	public void setkor(int kor) {
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
	public int getTotalSub() {
		return TOTAL_SUBJECT;
	}
	
	
	@Override
	public String toString() {
		return "Score [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
