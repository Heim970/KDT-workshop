package Workshop.Workshop05.pack02;

public class BookTest {

	public static void main(String[] args) {
		// 서로 다른 Book 객체를 생성 하고 각각의 정보를 출력 하는 프로그램을 작성 하시오.
		
		Book b1 = new Book("SQL Plus", 50000, 5.0);
		Book b2 = new Book("Java 2.0", 40000, 3.0);
		Book b3 = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.printf("  %-10s %-6s %-5s %-5s\n", "책이름", "가격", "할인율", "할인후금액");
		System.out.println("------------------------------------------");
		
		System.out.printf("%-12s %5d원 %5.1f%%   %6.1f원\n", 
				b1.getBookName(), b1.getBookPrice(), b1.getBookDiscounRate(), b1.getDiscountBookPrice());
		System.out.printf("%-12s %5d원 %5.1f%%   %6.1f원\n", 
				b2.getBookName(), b2.getBookPrice(), b2.getBookDiscounRate(), b2.getDiscountBookPrice());
		System.out.printf("%-12s %5d원 %5.1f%%   %6.1f원\n", 
				b3.getBookName(), b3.getBookPrice(), b3.getBookDiscounRate(), b3.getDiscountBookPrice());
		
	}

}
