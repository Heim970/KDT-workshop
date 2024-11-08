package Workshop.Workshop05.pack08;

public class Coffee {
	
	// 변수
	private String name;
	private int price;
	
	
	// 생성자
	public Coffee() {}

	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	// 메서드
	public void setPrice(int price) {
		// 가격을 세팅한다
		this.price = price;
	}
	
	public int getPrice() {
		// 가격을 리턴한다.
		return this.price;
	}
	
	public String toString() {
		// Coffee 객체의 모든 정보를 조합하여 리턴한다.
		return name + "\t" + price;
	}
	
}
