package Workshop.Workshop06.pack01;

public class Car extends Vehicle {
	
	// 변수
	private double restOil;  // 오일 잔여량
	private int curWeight;   // 현재 적재량
	
	// 생성자
	public Car() {}
	
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	
	// 메서드
	public void addOil(int oil) {
		// 현재 오일량에 추가한다. 단, 오일 탱크 크기를 넘어서면 안 된다.
		if (getRestOil() + oil <= getOilTankSize()) {
			this.setRestOil(getRestOil() + oil);
		} else {
			this.setRestOil(getOilTankSize());
		}
	}
	
	public void moving(int distance) {
		// 연비와 주행거리에 따라 오일량을 감소시킨다.
		this.setRestOil(getRestOil() - getEfficiency() * distance);
	}
	
	public void addWeight(int weight) {
		// 현재 적재량에 물건을 추가한다.
		// 단, 최대적재중량을 넘어서면 안 된다.
		if (getCurWeight() + weight <= getMaxWeight()) {
			this.setCurWeight(weight + getCurWeight());
		}
	}

	@Override
	public String toString() {
		// 부모의 toString()에 잔여오일량과 현재적재중량을 추가하여 리턴한다.
		return super.toString() + "\t\t" + restOil + "\t\t" + curWeight;
	}

	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	
	
}
