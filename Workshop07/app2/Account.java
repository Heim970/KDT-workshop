package Workshop.Workshop07.app2;

public class Account {
	// 변수
	private String account;
	private double balance;
	private double interestRate;
	
	// 생성자
	public Account() {}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	// 메서드
	public double calculateInterest() {
		// 현재 잔액을 기준으로 이자를 계산한다.
		return balance * (interestRate / 100);
	}
	
	public void deposit(double money) throws AccountException {
		// 입금을 통해 잔액정보를 증가
		// 입금액이 0보다 적으면 AccountException을 발생시킨다.
		if (money < 0) {
			throw new AccountException("입금 금액이 0보다 적습니다.");
		} else {
			balance += money;
		}
	}
	
	public void withdraw(double money) throws AccountException {
		// 출음을 통해 잔액정보를 감소
		// 출금액이 0보다 적으면 Exception을 발생시킨다.
		// 출금액이 현재 잔액보다 많으면 AccountException을 발생시킨다.
		if (money < 0) {
			throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		} else if (money > balance) {
			throw new AccountException("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		} else {
			balance -= money;
		}
	}

	public String getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
