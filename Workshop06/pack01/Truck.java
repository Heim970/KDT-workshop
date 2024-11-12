package Workshop.Workshop06.pack01;

public class Truck extends Car {
	
	// 생성자
	public Truck() {}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	
	// 메서드
	public double getEfficiency() {
		// 현재 적재 중량 5 Kg 당 연비 0.2 km씩 감소시킨 값을 리턴한다.
		return super.getEfficiency() - (getCurWeight() / 5 * 0.2);
	}
	
	public void moving(int distance) {
		// calcOil()을 호출하여 오일 감소량을 획득하고,
		// 잔여오일량에서 감소량을 뺀 새로운 잔여오일량으로 재설정한다.
		setRestOil(getRestOil() - calcOil(distance));
	}
	
	private double calcOil(int distance) {
		// 거리를 연비로 나누어 오일 소모량을 추출하고 리턴한다.
		return distance / getEfficiency();
	}
	
	public int getCost(int distance) {
		// calcOil()을 호출하여 오일 감소량을 획득하고,
		// 1 L당 3000원의 요금을 산정하여 리턴한다.
		// 단, 소수점 이하는 버린다.
		return (int)calcOil(distance) * 3000;
	}

	@Override
	public String toString() {
		// 부모의 toString()에 연비를 추가하여 리턴한다.
		return super.toString() + "\t\t" + getEfficiency();
	}
	
	
}
