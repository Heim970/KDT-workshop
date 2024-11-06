package Workshop.Workshop04;

import java.util.Scanner;

public class ArrayTest10 {

	public static void main(String[] args) {
		/* 1) eclipse Argument 에서 1~5까지의 두 개의 정수형 데이터를 입력 받는다.
		 * 2) 입력 받은 데이터가 2개 미만 또는 2개 초과로 입력 하면 “다시 입력 하세요” 출력
		 * 3) 1~5이외의 숫자가 입력 될 경우 “숫자를 확인 하세요” 출력
		 * 4) 입력 받은 두 개의 정수를 이용하여 2차원 배열을 생성한다.
		 * 5) 2차원 배열에 1~5까지의 랜덤한 숫자(중복허용)를 넣는다.
		 * 6) 배열의 내용을 출력 한다.
		 * 7) 배열의 총합과 평균을 실수형으로 출력 한다.
		 * 
		 * ** 실행 결과 ** : 2 2 입력
		 * 2 2 
		 * 5 5
		 * 
		 * sum=14.0
		 * avg=3.5
		 */

		Scanner sc = new Scanner(System.in);
		// Scanner로 정수 데이터 입력
		
		int n;
		int m;
		
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n < 1 || n > 5) || (m < 1 || m > 5)) {
				System.out.println("숫자를 확인하세요");
			} else break; // 정상입려
		}
		
		// 배열 생성
		int[][] arr4 = new int[n][m];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				// 랜덤한 숫자 r를 생성해서 배열에 삽입(1 ~ 5 정수)
				// arr4[i][j] = r;
				
				// 숫자 출력, 합계에 누적
				System.out.printf("%d ", arr4[i][j]);
				sum = arr4[i][j];
			}
			System.out.println();
		}
		
		// 평균값 구하고 출력
		double avg = sum * 1.0 / (n-1) / (m-1);
		System.out.printf("sum=%d\navg=%.1f", sum, avg);
		
		sc.close();
	}

}
