package Workshop.Workshop04;

public class ArrayTest03 {

	public static void main(String[] args) {
		/* 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오. 
		 * int[][] arr2 = {
		 * { 5, 5, 5, 5, 5},
		 * {10,10,10,10,10}, 
		 * {20,20,20,20,20},
		 * {30,30,30,30,30} };
		 * 
		 * ** 실행결과 **
		 * total=325
		 * average=16.25
		 */
		
		int[][] arr2 = { 
				{ 5, 5, 5, 5, 5}, 
				{10,10,10,10,10}, 
				{20,20,20,20,20}, 
				{30,30,30,30,30} 
				};
		
		int total = 0;
		int count = 0;
		
		for (int[] lines : arr2) {
			for (int num : lines) {
				total += num;
				count++;
			}
		}
		
		double avg = total * 1.0 / count;
		
		System.out.printf("total=%d\n", total);
		System.out.printf("average=%.2f\n", avg);
		
	}

}
