package Workshop.Workshop08.ship;

import java.util.ArrayList;

public class ShipTest {

	public static void main(String[] args) {
		
		// ArrayList를 만들어 각각의 Boat 객체와 Cruise 객체를 생성하여 넣는다.
		ArrayList<Ship> list = new ArrayList<Ship>();
		list.add(new Boat("Boat01", 500));
		list.add(new Cruise("Cruise01", 1000));
		
		// 생성된 객체의 정보 출력 - for문 사용
		System.out.printf("%s\t%s\t\n", "shipName", "fuelTank");
		System.out.printf("-------------------------\n");
		for (Ship ship : list) {
			System.out.println(ship.toString());
		}
		
		// Boat인 경우에는 10 운항하고 Cruise인 경우에는 15 운항 후 객체 정보 출력
		System.out.println("\n운항");
		System.out.printf("%s\t%s\t\n", "shipName", "fuelTank");
		System.out.printf("-------------------------\n");
		for (Ship ship : list) {
			if (ship instanceof Boat) {
				ship.sail(10);
			} else if (ship instanceof Cruise) {
				ship.sail(15);
			}
			System.out.println(ship.toString());
		}
		
		// Boat인 경우에는 20 주유하고 Cruise인 경우에는 30 주유 후 객체 정보 출력
		System.out.println("\n주유");
		System.out.printf("%s\t%s\t\n", "shipName", "fuelTank");
		System.out.printf("-------------------------\n");
		for (Ship ship : list) {
			if (ship instanceof Boat) {
				ship.refuel(20);
			} else if (ship instanceof Cruise) {
				ship.refuel(30);
			}
			System.out.println(ship.toString());
		}
	}

}
