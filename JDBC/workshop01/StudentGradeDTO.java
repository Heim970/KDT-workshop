package workshop01;

public class StudentGradeDTO {
	private String termNo;
	private String stuNo;
	private String stuName;
	private String className;
	private double point;
	private String grade;

	public StudentGradeDTO() {}

	public StudentGradeDTO(String termNo, String stuNo, String stuName, String className, double point, String grade) {
		this.termNo = termNo;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.className = className;
		this.point = point;
		this.grade = grade;
	}

	public String getTermNo() {
		return termNo;
	}

	public String getStuNo() {
		return stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public String getClassName() {
		return className;
	}

	public double getPoint() {
		return point;
	}

	public String getGrade() {
		return grade;
	}

	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentGradeDTO [termNo=" + termNo + ", stuNo=" + stuNo + ", stuName=" + stuName + ", className="
				+ className + ", point=" + point + ", grade=" + grade + "]";
	}

}
