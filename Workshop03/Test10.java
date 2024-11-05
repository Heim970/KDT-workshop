package Workshop.Workshop03;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		/* Scanner 클래스를 사용하여 키보드로 정수값을 입력 받아서
		 *  1부터 입력 받은 정수값까지의 총합을 구하는 실습.
		 * 단, 음수 및 0 을 입력한 경우에는 다시 입력 받는다. 
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 총합 구하기");
		
		int n;
		while (true) {
			System.out.printf("n 값: ");
			n = sc.nextInt();
			if (n > 0) break;
		}
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 총합: %d", n, sum);
		
		
		sc.close();
	}

}
