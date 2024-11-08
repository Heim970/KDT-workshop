package Workshop.Workshop05.pack04;

public class TestCompany {

	public static void main(String[] args) {
		/* 
		 * 1) eclipse Argument 에서 월 기본급을 입력 받는다. (정수형으로 입력)
		 * 2) 입력된 기본급을 기준으로 직원들의 연봉을 계산하는 프로그램을 작성 한다. 
		 * 
		 * * 연봉 계산 기준 
		 * 1) 기본급: 입력 데이터
		 * 2) 보너스: 분기별로 월 기본급의 20% 지급
		 * 3) 세금: 기본급은 10% 공제, 보너스는 5.5% 공제
		 * 
		 * 1년 동안 세금을 제외한 총 지급 금액을 계산 한다. 
		 */

		double salary = Integer.parseInt(args[0]);
		
		Company c = new Company(salary);
		
		System.out.printf("연 기본급 합: %.1f 세후: %.1f\n", c.getIncome(), c.getAfterTaxIncome());
		System.out.printf("연 보너스 합: %.1f 세후: %.1f\n", c.getBonus(), c.getAfterTaxBonus());
		System.out.printf("연 지급액 합: %.1f\n", c.getAfterTaxIncome() + c.getAfterTaxBonus());
		
		
		
	}

}
