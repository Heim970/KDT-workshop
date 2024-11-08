package Workshop.Workshop05.pack03;

public class TestAccount {

	public static void main(String[] args) {
		// 고정 금리의 계좌를 생성 하여 현재 잔액을 기준으로 이자를 계산하는 프로그램을 작성 한다.
		// 객체 생성
		Account account = new Account("441-0290-1203", 500000, 7.3);

		// 기본 정보 출력
		System.out.printf("계좌정보: %s 현재잔액: %d\n", account.getAccount(), account.getBalance());

		// account 에서 600,000원 출금
		account.withdraw(600000);

		// account 에 20,000원 입금
		account.deposit(20000);

		// account 변경 정보 출력
		System.out.printf("계좌정보: %s 현재잔액: %d\n", account.getAccount(), account.getBalance());

		// 이자 출력 - 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력한다.
		System.out.printf("이자: %.1f\n", account.calculateInterest());
	}

}
