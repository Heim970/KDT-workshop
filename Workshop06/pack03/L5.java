package Workshop.Workshop06.pack03;

public class L5 extends Car implements Temp {

	// 생성자
	public L5() {}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	// 메서드
	@Override
	public void go(int distance) {
		// 주행
		// 8만큼 주행하면 현재 주유량이 1 감소
		super.setDistance(super.getDistance() + distance);   // 주행거리 기록
		super.setOilSize(super.getOilSize() - distance / 8); // 오일량 재설정
	}

	@Override
	public void setOil(int oilSize) {
		// 연료 충전
		if (super.getOilSize() + oilSize <= super.getOilTank()) {
			super.setOilSize(super.getOilSize() + oilSize);
		} else {
			super.setOilSize(super.getOilTank()); // 가득 찬 경우
		}
		
	}

	@Override
	public int getTempGage() {
		// 엔진 온도 측정
		return super.getDistance() / 5;
	}
	
}
