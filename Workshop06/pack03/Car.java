package Workshop.Workshop06.pack03;

public abstract class Car {
	
	// 변수
	private String name;
	private String engine;
	private int oilTank; // 오일 탱크 사이즈
	private int oilSize; // 현재 주유량
	private int distance; // 주행거리
	
	// 생성자
	public Car() {}
	
	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	// 메서드
	public abstract void go(int distance);
	public abstract void setOil(int oilSize);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
}