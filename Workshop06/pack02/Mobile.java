package Workshop.Workshop06.pack02;

public abstract class Mobile {
	
	// 변수
	private String mobileName;
	private int batterySize;
	private String osType;
	
	// 생성자
	public Mobile() {}

	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	// 추상 메서드
	public abstract int operate(int time);
	public abstract int charge(int time);

	// 메서드
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	@Override
	public String toString() {
		return mobileName + "\t\t" + batterySize + "\t\t" + osType;
	}
	
	
	
	
}
