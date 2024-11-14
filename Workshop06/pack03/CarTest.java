package Workshop.Workshop06.pack03;

public class CarTest {

	public static void main(String[] args) {
		
		// Car type의 객체 배열을 2개 만든다.
		Car[] car = new Car[2];
		
		// 배열에 사용데이터에서 제공된 2개의 Car 객체를 넣는다.
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 70, 35, 0);
		
		// 생성된 자동차의 기본 정보 출력
		System.out.println("vehicleName \tengineSize \toilTank \toilSize \tdistance \ttemperature");
		System.out.println("-----------------------------------------------------------------------------------------------");
		for (Car c : car) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%d\t\t%d\t\t%d\n", c.getName(), c.getEngine(), c.getOilTank(), c.getOilSize(), c.getDistance(), ((Temp) c).getTempGage());

		}
		System.out.println();
		
		// 각각의 자동차에 25씩 주유한다.
		car[0].setOil(25);
		car[1].setOil(25);
		
		// 25씩 주유한 자동차의 정보를 출력한다.
		System.out.println("25L 주유");
		System.out.println("vehicleName \tengineSize \toilTank \toilSize \tdistance \ttemperature");
		System.out.println("-----------------------------------------------------------------------------------------------");
		for (Car c : car) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%d\t\t%d\t\t%d\n", c.getName(), c.getEngine(), c.getOilTank(), c.getOilSize(), c.getDistance(), ((Temp) c).getTempGage());

		}
		System.out.println();
		
		// 각각의 자동차에 80씩 주행한다.
		car[0].go(80);
		car[1].go(80);
		
		// 80씩 주행한 정보를 출력하며 엔진온도 정보를 출력한다.
		System.out.println("80 주헹");
		System.out.println("vehicleName \tengineSize \toilTank \toilSize \tdistance \ttemperature");
		System.out.println("-----------------------------------------------------------------------------------------------");
		for (Car c : car) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%d\t\t%d\t\t%d\n", c.getName(), c.getEngine(), c.getOilTank(), c.getOilSize(), c.getDistance(), ((Temp) c).getTempGage());

		}
		System.out.println();
	}

}
