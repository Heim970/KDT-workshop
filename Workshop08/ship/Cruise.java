package Workshop.Workshop08.ship;

public class Cruise extends Ship {
	
	public Cruise() {}
	
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int dist) {
		// 1 운행 시 연료 13 감소
		super.setFuelTank(super.getFuelTank() - dist * 13);
	}

	@Override
	public void refuel(int fuel) {
		// 1 주유 시 연료 8 증가
		super.setFuelTank(super.getFuelTank() + fuel * 8);
	}
	
	@Override
	public String toString() {
		return super.getShipName() + "\t" + super.getFuelTank();
	}
}
