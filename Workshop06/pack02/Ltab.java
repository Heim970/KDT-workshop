package Workshop.Workshop06.pack02;

public class Ltab extends Mobile {

	// 변수
	
	// 생성자
	public Ltab() {}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	// 메서드
	@Override
	public int operate(int time) {
		int amount = time * -10;
		int batteryNow = super.getBatterySize() + amount;
		super.setBatterySize(batteryNow);
		return batteryNow;
	}

	@Override
	public int charge(int time) {
		int amount = time * 10;
		int batteryNow = super.getBatterySize() + amount;
		super.setBatterySize(batteryNow);
		return batteryNow;
	}

}
