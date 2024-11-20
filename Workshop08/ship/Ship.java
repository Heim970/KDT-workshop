package Workshop.Workshop08.ship;

public abstract class Ship {
	private String shipName;
	private int fuelTank;
	
	public Ship() {}
	
	public Ship(String shipName, int fuelTank) {
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	
	public abstract void sail(int dist); // 운항
	public abstract void refuel(int fuel); // 주유

	public String getShipName() {
		return shipName;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}

	@Override
	public String toString() {
		return shipName + "\t" + fuelTank;
	}
	
	
	
}
