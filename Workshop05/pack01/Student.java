package Workshop.Workshop05.pack01;

public class Student {
	// 변수
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	// 생성자
	public Student() {}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	// 메서드
	public double getAvg() {
		// 평균값 리턴
		double sum = this.korean + this.english + this.math + this.science;
		return sum / 4;
	}
	
	public String getGrade() {
		// 학점 리턴
		double avg = this.getAvg();
		
		String grade = "F학점";
		if (avg >= 90.0) {
			grade = "A학점";
		} else if (avg >= 70.0) {
			grade = "B학점";
		} else if (avg >= 50.0) {
			grade = "C학점";
		} else if (avg >= 30.0) {
			grade = "D학점";
		}
		
		return grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
}
