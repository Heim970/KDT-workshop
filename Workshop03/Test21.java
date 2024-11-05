package Workshop.Workshop03;

public class Test21 {

	public static void main(String[] args) {
		/* for문을 사용하여 실행결과와 같이 출력하는 코드 작성. 

		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%c", 'A' + j);
			}
			System.out.println();
		}
	}

}
