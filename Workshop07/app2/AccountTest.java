package Workshop.Workshop07.app2;

public class AccountTest {

	public static void main(String[] args) {
		
		// account 객체 생성
		Account account = new Account("441-0290-1203", 500000, 7.3);
		
		// account 기본 정보 출력
		System.out.printf("계좌정보: %s %.1f %.1f\n", account.getAccount(), account.getBalance(), account.getInterestRate());
		
		// account 에 -10원 입금 - Exception 처리
		try {
			account.deposit(-10);
		} catch (AccountException e){
			System.out.println(e.getMessage());
		}
		
		// account 에 600000원 출금 - Exception 처리
		try {
			account.withdraw(600000);
		} catch (AccountException e){
			System.out.println(e.getMessage());
		}
		
		// 이자 출력
		System.out.printf("이자: %.1f\n", account.calculateInterest());
	}
}
