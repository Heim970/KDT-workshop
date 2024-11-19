package Workshop.Workshop07.app1;

public class Calculator {
	public double plus(int a, int b) {
		return a * 1.0 + b;
	}
	
	public double minus(int a, int b) {
		return a * 1.0 - b;
	}
	
	public double multiplication(int a, int b) {
		return a * b * 1.0;
	}
	
	public double divide(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Exception 이 발생 하였습니다. 다시 입력해 주세요");
		}
		return a * 1.0 / b;
	}
}
