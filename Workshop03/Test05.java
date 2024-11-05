package Workshop.Workshop03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// Scanner를 이용하여 임의의 정수값을 입력받고, 입력받은 정수값만큼 1부터 반복한다.
		// 이 때 짝수값의 총합과 평균값을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int num = sc.nextInt();
		
		int evenSum = 0;
		int evenCount = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				evenSum += i;
				evenCount++;
			}
		}
		System.out.println("총합:" + evenSum);
		System.out.println("평균값:" + evenSum/(double)evenCount);
		
		sc.close();
	}

}
