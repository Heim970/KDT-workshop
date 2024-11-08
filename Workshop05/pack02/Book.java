package Workshop.Workshop05.pack02;

public class Book {
	// 변수
	private String bookName;
	private int bookPrice;
	private double bookDiscounRate;
	
	// 생성자
	public Book() {}
	
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscounRate = bookDiscountRate;
	}
	
	// 메서드
	public double getDiscountBookPrice() {
		// 인하된 책 가격을 리턴
		return this.bookPrice * (1 - this.bookDiscounRate / 100);
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscounRate() {
		return bookDiscounRate;
	}

	public void setBookDiscounRate(double bookDiscounRate) {
		this.bookDiscounRate = bookDiscounRate;
	}
	
	
}
