package Workshop.Workshop03;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		/* Scanner 클래스를 사용하여 키보드로 두 개의 정수값을 입력 받아서
		 * a와 b 변수에 저장하고 b-a 값을 출력하는 실습.
		 * 단 b 변수값이 a 변수값보다 작으면 b 변수값을 다시 입력 받는다.
		 */
	
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("a의 값: ");
		a = sc.nextInt();
		
		while (true) {
			System.out.print("b의 값: ");
			b = sc.nextInt();
			if (a > b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			} else break;
		}
		
		System.out.println("b - a는 " + (b-a) + "입니다.");
		sc.close();
	}

}
