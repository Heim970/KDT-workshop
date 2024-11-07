package Workshop.Workshop04;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {
		/* Scanner 클래스를 사용하여 입력 받은 사람 수 만큼
		 * 랜덤하게 키(height)값을 구하여 시행결과와 같이
		 * 출력하도록 구현. (Random 클래스 사용) 
		 * 
		 * ** 실행 결과 **
		 * 키의 최댓값을 구합니다. 
		 * 사람 수 : 5
		 * 사람 1: 159
		 * 사람 2: 187 
		 * 사람 3: 189
		 * 사람 4: 112
		 * 사람 5: 161
		 * 최댓값은 189입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		int max = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < num; i++) {			
			// 랜덤 키 값을 생성하고 배열에 저장, 출력하는 코드
			height[i] = random.nextInt(120) + 100;
			
			System.out.printf("사람 %d: %d\n", i + 1, height[i]);
			
			if (height[i] > max) {
				max = height[i];
			}
		}
		System.out.printf("최댓값은 %d입니다.", max);
		
		sc.close();
	}

}
