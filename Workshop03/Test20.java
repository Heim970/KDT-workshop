package Workshop.Workshop03;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		/* 보너스를 지급하려고 한다. 근무시간과 월급을 입력 받아
		 * 근무시간에 따라 보너스를 계산하여 실행결과와 같이 출력하는 코드 작성.
		 * 다음은 근무시간에 해당되는 보너스 값으로서 참고하여 구현한다. 
		 *  근무시간           보너스
		 *  25시간 이상      월급의 100%
		 *  20시간 이상      월급의 80%
		 *  18시간 이상      월급의 50%
		 *  18시간 미만         없음 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보너스 및 월급 구하기");
		
		System.out.print("근무시간입력 : ");
		int time = sc.nextInt();
		
		System.out.print("월급입력 : ");
		int salary = sc.nextInt();
		
		int bonus = 0;
		
		if (time >= 25 ) {
			bonus = salary;
		} else if (time >= 20) {
			bonus = salary * 4 / 5;			
		} else if (time >= 18) {
			bonus = salary / 2;			
		}
		
		salary += bonus;
		
		System.out.println("====================");
		
		System.out.printf("보너스 : %d\n", bonus);
		System.out.printf("지급될 급여 : %d", salary);
		
		sc.close();
	}

}
