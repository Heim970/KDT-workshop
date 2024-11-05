package Workshop.Workshop03;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		/* 제공된 다음 코드를 사용하여 실행결과와 같이 출력하도록 코드를 구현.
		 **** 실행결과 ****
		 * 임의의수 입력: 5
		 * 입력하신 숫자의 총합:15 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("임의의 수 입력: ");
		int num = scan.nextInt();
		
		int sum = 0;
		int i = num;
		
		while (1 <= i) {
			sum += i;
			i--;
		}
		
		System.out.println("입력하신 숫자의 총합:"+sum); 
		
		scan.close();
	}

}
