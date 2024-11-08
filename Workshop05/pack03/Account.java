package Workshop.Workshop05.pack03;

public class Account {
	// 변수
	private String account;
	private int balance;
	private double interestRate;
	
	// 생성자
	public Account() {}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	// 메서드
	public double calculateInterest() {
		// 현재 잔액을 기준으로 이자를 계산한다.
		return this.balance * this.interestRate / 100;
	}
	
	public void deposit(int money) {
		// 입금을 통해 잔액정보를 증가시킨다.
		this.balance += money;
	}
	
	public void withdraw(int money) {
		// 출금을 통해 잔액정보를 감소시킨다.
		// 단, 출금을 통해 잔액이 0보다 작으면 "출금할 수 없습니다."를 출력한다.
		if (this.balance - money < 0) {
			System.out.println("출금할 수 없습니다.");
		} else {
			this.balance -= money;
		}
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
