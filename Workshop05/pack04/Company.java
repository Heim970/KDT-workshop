package Workshop.Workshop05.pack04;

public class Company {

	// 변수
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;

	
	// 생성자
	public Company() {}


	public Company(double salary) {
		this.salary = salary;
	}
	
	
	// 메서드
	public double getIncome() {
		// 연 기본급의 합을 계산하여 리턴
		income = salary * 12.0;
		return income;
	}
	
	public double getAfterTaxIncome() {
		// 연 기본급의 합에서 세금을 공제한 금액을 리턴
		afterTaxIncome = income * (1.0 - 10.0/100.0);
		return afterTaxIncome;
	}
	
	public double getBonus() {
		// 연 보너스의 합을 계산하여 리턴
		bonus = salary * 0.2 * 4;
		return bonus;
	}
	
	public double getAfterTaxBonus() {
		//연 보너스의 합에서 세금을 공제한 금액을 리턴
		afterTaxBonus = bonus * (1.0 - 5.5 / 100);
		return afterTaxBonus;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void setIncome(double income) {
		this.income = income;
	}


	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
	
}
