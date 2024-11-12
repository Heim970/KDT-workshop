package Workshop.Workshop05.pack08;

public class Cafe {

	// 변수
	private Coffee[] coffeeList;
	private int index;
	
	
	// 생성자
	public Cafe() {
		coffeeList = new Coffee[3];
	}
	
	
	// 메서드
	public void setCoffee(Coffee coffee) {
		// Coffee 객체를 배열에 저장한다.
		// 배열 저장 위치는 index 값을 이용한다.
		// 배열에 모두 저장되면 "더 이상 값을 저장할 수 없습니다"를 출력한다.
		if (index <= coffeeList.length - 1) {
			coffeeList[index] = coffee;
			index++;
		} else {
			System.out.println("더 이상 값을 저장할 수 없습니다");
		}
		
	}
	
	public int totalPrice() {
		// Coffee[] 객체를 반복 수행하면서 가격의 합을 계산하고 리턴한다.
		int sum = 0;
		for (Coffee c : coffeeList) {
			sum += c.getPrice();
		}		
		return sum;
	}
	
	public Coffee[] getCoffeeList() {
		return coffeeList;
	}
	
	
}
