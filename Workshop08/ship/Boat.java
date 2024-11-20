package Workshop.Workshop08.ship;

public class Boat extends Ship{

	public Boat() {}

	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}

	@Override
	public void sail(int dist) {
		// 1 운행 시 연료 10 감소
		super.setFuelTank(super.getFuelTank() - dist * 10);
	}

	@Override
	public void refuel(int fuel) {
		// 1 주유 시 연료 10 증가
		super.setFuelTank(super.getFuelTank() + fuel * 10);
	}
	
	@Override
	public String toString() {
		return super.getShipName() + "\t\t" + super.getFuelTank();
	}
}
