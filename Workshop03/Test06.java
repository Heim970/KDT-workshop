package Workshop.Workshop03;

public class Test06 {

	public static void main(String[] args) {
		// 세 개의 주사위를 던졌을 때, 눈의 곱이 3의 배수인 값을 출력하는 프로그램을 작성하시오
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				for (int k = 1; k <= 6; k++) {
					int p = i * j * k;
					if (p % 3 == 0) {
						System.out.printf("%d*%d*%d = %d\n", i, j, k, p);
					}
				}
			}
		}
		
	}

}
