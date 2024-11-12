package Workshop.Workshop05.pack08;

public class CafeTest {

	public static void main(String[] args) {
		/* 3개의 Coffee 객체를 배열에 저장하고 있는 Cafe 객체를 생성 하여
		 * 총 금액을 출력하는 프로그램을 작성 한다.
		 */
		
		Cafe cafe = new Cafe();
		
		// Coffee 객체를 3개 생성하고, setCoffee()를 이용하여 Coffee 배열에 넣는다.
		
		Coffee c1 = new Coffee("Americano", 4000);
		Coffee c2 = new Coffee("Caffelatte", 5000);
		Coffee c3 = new Coffee("Macchiato", 6000);
		
		cafe.setCoffee(c1);
		cafe.setCoffee(c2);
		cafe.setCoffee(c3);
		
		
		// Coffee 배열에 있는 객체 정보를 모두 출력한다.
		for (Coffee c : cafe.getCoffeeList()) {
			System.out.println(c.toString());
		}
		
		// Coffee 가격의 합을 출력한다.
		int sum = cafe.totalPrice();
		System.out.println();
		System.out.printf("Coffee 가격의 합 : %d원\n", sum);
	}

}
