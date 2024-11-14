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
		// 분당 10만큼 배터리 감소
		int batteryNow = super.getBatterySize() - time * 10;
		super.setBatterySize(batteryNow);
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		// 분당 10만큼 배터리 증가
		int batteryNow = super.getBatterySize() + time * 10;
		super.setBatterySize(batteryNow);
		return getBatterySize();
	}

}
