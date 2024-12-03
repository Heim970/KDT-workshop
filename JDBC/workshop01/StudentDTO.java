package workshop01;

public class StudentDTO {

	private String stuNo;
	private String departNo;
	private String stuName;
	private String stuSsn;
	private String stuAddress;
	private String entDate;
	private char absYn;
	private String coachProfessorNo;

	public StudentDTO() {
	}

	public StudentDTO(String stuNo, String departNo, String stuName, String stuSsn, String stuAddress, String entDate,
			char absYn, String coachProfessorNo) {
		this.stuNo = stuNo;
		this.departNo = departNo;
		this.stuName = stuName;
		this.stuSsn = stuSsn;
		this.stuAddress = stuAddress;
		this.entDate = entDate;
		this.absYn = absYn;
		this.coachProfessorNo = coachProfessorNo;
	}

	public String getStuNo() {
		return stuNo;
	}

	public String getDepartNo() {
		return departNo;
	}

	public String getStuName() {
		return stuName;
	}

	public String getStuSsn() {
		return stuSsn;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public String getEntDate() {
		return entDate;
	}

	public char getAbsYn() {
		return absYn;
	}

	public String getCoachProfessorNo() {
		return coachProfessorNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public void setDepartNo(String departNo) {
		this.departNo = departNo;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuSsn(String stuSsn) {
		this.stuSsn = stuSsn;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public void setEntDate(String entDate) {
		this.entDate = entDate;
	}

	public void setAbsYn(char absYn) {
		this.absYn = absYn;
	}

	public void setCoachProfessorNo(String coachProfessorNo) {
		this.coachProfessorNo = coachProfessorNo;
	}

	@Override
	public String toString() {
		return "StudentDTO [stuNo=" + stuNo + ", departNo=" + departNo + ", stuName=" + stuName + ", stuSsn=" + stuSsn
				+ ", stuAddress=" + stuAddress + ", entDate=" + entDate + ", absYn=" + absYn + ", coachProfessorNo="
				+ coachProfessorNo + "]";
	}

	
	
}
