package Workshop.Workshop06.pack01;

public class VehicleTest {

	public static void main(String[] args) {
		
		Truck car = new Truck(1000, 100.0, 5.0);
		
		// 초기 트럭의 정보를 출력한다.
		System.out.printf("%s\t%s\t%s\t\t%s\t%s\n", "최대적재중량", "오일탱크크기", "잔여오일량", "현재적재중량", "연비");
		System.out.println("=======================================================================");
		System.out.println(car.toString());
		
		// 50 L 주유 후 트럭의 정보를 출력한다.
		car.addOil(50);
		System.out.println();
		System.out.println("50L 주유 후");
		System.out.println(car.toString());
		
		// 50km 주행 후 트럭의 정보를 출력한다.
		car.moving(50);
		System.out.println();
		System.out.println("50Km 주행 후");
		System.out.println(car.toString());
		
		// 100kg을 적재한 후 트럭의 정보를 출력한다.
		car.addWeight(100);
		System.out.println();
		System.out.println("100Kg 적재 후");
		System.out.println(car.toString());
		
		// 30km 주행 후 트럭의 정보를 출력한다.
		car.moving(30);
		System.out.println();
		System.out.println("30Km 주행 후");
		System.out.println(car.toString());
		
		// 100kg을 탑재하고 30km를 주행하면 요금이 얼마인지 출력한다.
		System.out.println();
		System.out.printf("요금 : %d원", car.getCost(30));
	}

}
