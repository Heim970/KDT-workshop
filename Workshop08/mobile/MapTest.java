package Workshop.Workshop08.mobile;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<String, Mobile> map = new HashMap<String, Mobile>();
		double sum = 0.0;
		
		// 4개의 Mobile 객체 생성
		Mobile m1 = new Mobile("LU6800", "Optimus 2X", 800000);
		Mobile m2 = new Mobile("SU6600", "Optimus Black", 900000);
		Mobile m3 = new Mobile("KU5700", "Optimus Big", 700000);
		Mobile m4 = new Mobile("SU7600", "Optimus Mach", 950000);
		
		// map에 4개의 객체를 code를 키 값으로 하여 넣는다.
		map.put(m1.getCode(), m1);
		map.put(m2.getCode(), m2);
		map.put(m3.getCode(), m3);
		map.put(m4.getCode(), m4);
		
		// Mobile 정보를 출력하고 합계를 계산
		for (String k : map.keySet()) {
			System.out.println(map.get(k).printInfo());
			sum += map.get(k).getPrice();
		}
		System.out.printf("합계: %.1f\n", sum);
		
		sum = 0.0;
		System.out.println("\n가격 변경 후");
		for (String k : map.keySet()) {
			map.get(k).setPrice(map.get(k).getPrice() * 1.1);
			System.out.println(map.get(k).printInfo());
			sum += map.get(k).getPrice();
		}
		System.out.printf("합계: %.1f\n", sum);
	}

}
