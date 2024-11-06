package Workshop.Workshop04;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		/* Scanner 클래스를 사용하여 키보드로 키(height)값을 입력 받아서
		 * 최대값을 구하는 코드 작업. 
		 * 입력 받은 사람 수만큼 배열을 생성하여 사용한다.
		 * 
		 * ** 실행 결과 **
		 * 키의 최댓값을 구합니다. 
		 * 사람 수 : 4 
		 * 사람 1: 175
		 * 사람 2: 185 
		 * 사람 3: 164
		 * 사람 4: 174
		 * 최댓값은 185입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		int max = 0;
		
		for (int i = 0; i < num; i++) {
			System.out.printf("사람 %d: ", i + 1);
			height[i] = sc.nextInt();
			if (height[i] > max) {
				max = height[i];
			}
		}
		System.out.printf("최댓값은 %d입니다.", max);
		
		sc.close();
	}

}
