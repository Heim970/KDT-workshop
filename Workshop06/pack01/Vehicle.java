package Workshop.Workshop06.pack01;

public class Vehicle {
	
	// 변수
	private int maxWeight;      // 최대 적재중량
	private double oilTankSize; // 오일탱크 크기
	private double efficiency;  // 연비
	
	// 생성자
	public Vehicle() {}
	
	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	
	// 메서드
	public int getMaxWeight() {
		return maxWeight;
	}
	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	public double getOilTankSize() {
		return oilTankSize;
	}
	
	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}
	
	public double getEfficiency() {
		return efficiency;
	}
	
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}

	@Override
	public String toString() {
		// 최대적재량과 오일탱크 크기를 문자열로 리턴한다.
		return maxWeight + "\t\t" + oilTankSize;
	}
	
	
}
