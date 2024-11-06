package Workshop.Workshop04;

public class ArrayTest01 {

	public static void main(String[] args) {
		/* 다음 배열의 합과 평균을 구하는 프로그램을 작성 하시오. 
		 * int[] arr = {10, 20, 30, 40, 50};
		 *
		 * ** 실행 결과 **
		 * sum=150 
		 * avg=30
		 */
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		int avg = sum / arr.length;
		System.out.printf("sum=%d\navg=%d", sum, avg);
	}

}
