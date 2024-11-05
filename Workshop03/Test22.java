package Workshop.Workshop03;

public class Test22 {

	public static void main(String[] args) {
		/* for문을 사용하여 1부터 100가지 출력한다. 
		 * 단, 한 줄에 10개씩 실행결과와 같이 출력한다.
		 */
		
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%-2d ", i * 10 + j);
			}
			System.out.println();
		}
	}

}
