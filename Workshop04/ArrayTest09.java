package Workshop.Workshop04;

import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {
		/* 다음과 같이 선언되어 있는 배열에 1~10까지의 랜덤한 숫자(중복허용)를 넣고
		 * 이 배열에 어떤 값이 셋팅 되었는지 출력 하고
		 * 배열 데이터의 합과 평균을 구하는 프로그램을 작성 하시오.
		 * 
		 * int[] arr3 = new int[5]
		 * 
		 * 또한, 합은 정수형으로 평균은 실수형으로 출력한다. 
		 * 
		 * ** 실행 결과 **
		 * 3 4 1 2 4 
		 * sum=14
		 * avg=2.8
		 */
		
		int[] arr3 = new int[5];
		int sum = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			// 배열에 랜덤한 숫자를 입력하고 출력
			arr3[i] = random.nextInt(9) + 1;
			System.out.printf("%d ", arr3[i]);
			// 배열 데이터의 합
			sum += arr3[i];
		}
		System.out.println();
		
		double avg = sum * 1.0 / 5;
		System.out.printf("sum=%d\navg=%.1f\n", sum, avg);
	}

}
