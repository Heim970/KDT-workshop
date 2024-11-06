package Workshop.Workshop04;

public class ArrayTest08 {

	public static void main(String[] args) {
		/* 다음과 같이 제공된 배열에서 최대값과 최소값을 구하는 코드 작성.
		 * int [] score= {99,34,67,22,11,9};
		 * 
		 * ** 실행 결과 **
		 * 최대값:99 
		 * 최소값:9 
		 */
		
		int [] score= {99,34,67,22,11,9};
		int max = score[0];
		int min = score[0];
		
		for (int n : score) {
			if (max < n) {
				max = n;
			}
			if (min > n) {
				min = n;
			}
		}
		System.out.printf("최대값:%d\n최소값:%d\n", max, min);
		
	}

}
