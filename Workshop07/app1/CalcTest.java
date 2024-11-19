package Workshop.Workshop07.app1;

public class CalcTest {

	public static void main(String[] args) {
		/*
		 * eclipse argument를 통해 정수형 숫자, 연산 부호, 정수형 숫자 3가지를 입력 받아 들인다. 
		 * Argument가 3개 미만, 3개 초과 일 경우 “다시 입력 하세요”라고 출력 한다.
		 * 연산 기호는 (+, -, x(소문자x), /)를 입력 받는다. 
		 */
		
		// Argument 수 확인
		if (args.length != 3) {
			System.out.println("다시 입력하세요");
			return;
		}
		
		// 정수와 연산기호 분리
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		String ex = args[1];
		
		// 계산
		Calculator c = new Calculator();
		
		double result = 0.0;

		if (ex.equals("+")) {
			result = c.plus(a, b);
		} else if (ex.equals("-")) {
			result = c.minus(a, b);
		} else if (ex.equals("x")) {
			result = c.multiplication(a, b);
		} else if (ex.equals("/")) {
			try {
				result = c.divide(a, b);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.printf("결과: %.1f", result);
	
	}

}
