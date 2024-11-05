package Workshop.Workshop03;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		/* Scanner 클래스를 사용하여 키보드로 정수값(단)을 입력 받아서
		 * 실행결과와 같이 *을 출력하는 실습. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오른쪽 위가 직각인 삼각형");
		
		System.out.print("몇 단 삼각형입니까? : ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
