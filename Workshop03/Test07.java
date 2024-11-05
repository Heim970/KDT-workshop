package Workshop.Workshop03;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		/* 1부터 100까지 더하는 프로그램을 작성 한다. 
		 * 단, Scanner로 1자리 정수형 데이터를 입력 받아 입력 받은 수의 배수만 더한다. 
		 * 입력 예1: 5  
		 * 5,10,15, … , 100의 합 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한 자리 정수값을 입력하시오");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % n == 0) {
				if (sum == 0) {
					System.out.printf("%d", i);
				} else {
					System.out.printf("+%d", i);					
				}
				
				sum += i;
			}
		}
		
		System.out.println(" = " + sum);
		
		sc.close();
		
	}

}
