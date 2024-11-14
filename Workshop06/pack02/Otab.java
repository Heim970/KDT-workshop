package Workshop.Workshop06.pack02;

public class Otab extends Mobile {
	
	// 변수
	
	// 생성자
	public Otab() {}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	// 메서드
	@Override
	public int operate(int time) {
		// 분당 12만큼 배터리 감소
		int batteryNow = super.getBatterySize() - time * 12;
		super.setBatterySize(batteryNow);
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		// 분당 8만큼 배터리 증가
		int batteryNow = super.getBatterySize() + time * 8;
		super.setBatterySize(batteryNow);
		return getBatterySize();
	}

}
