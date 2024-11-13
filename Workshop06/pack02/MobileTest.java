package Workshop.Workshop06.pack02;

public class MobileTest {
	
	public static void main(String[] args) {
		
		// 각각의 Mobile 객체를 생성한다.
		Mobile m1 = new Ltab("Ltab", 500, "AP-01");
		Mobile m2 = new Otab("Otab", 1000, "AND-20");
		
		// 생성된 객체의 정보를 출력한다.
		System.out.printf("%s\t\t%s\t\t%s\n", "Mobile", "Battery", "OS");
		System.out.println("------------------------------------------");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println();
		
		// 각각의 Mobile 객체에 10분씩 충전을 한다.
		m1.charge(10);
		m2.charge(10);
		
		// 10분 충전 후 객체 정보를 출력한다.
		System.out.println("10분 충전");
		System.out.printf("%s\t\t%s\t\t%s\n", "Mobile", "Battery", "OS");
		System.out.println("------------------------------------------");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println();
		
		// 각각의 Mobile 객체에 5분씩 통화를 한다.
		m1.operate(5);
		m2.operate(5);
		
		// 5분 퉁화 후 객체 정보를 출력한다.
		System.out.println("5분 통화");
		System.out.printf("%s\t\t%s\t\t%s\n", "Mobile", "Battery", "OS");
		System.out.println("------------------------------------------");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println();
	}
}
