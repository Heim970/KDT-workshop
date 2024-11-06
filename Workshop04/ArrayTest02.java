package Workshop.Workshop04;

public class ArrayTest02 {

	public static void main(String[] args) {
		/* 다음 배열의 짝수 번째 정수의 합을 구하는 프로그램을 작성 하시오. 
		 * int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		 * 
		 * ** 실행결과 **
		 * sum=300		 
		 */
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.printf("sum=%d\n", sum);
	}

}
