package Workshop.Workshop03;

public class Test08 {

	public static void main(String[] args) {
		/* 1부터 100까지 반복하면서 
		 * 3의 배수는 foo, 5의 배수는 bar, 7의 배수는 baz
		 * 값을 출력하는 프로그램을 작성하시오
		 */
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			
			if (i % 3 == 0) {
				System.out.print(" foo");
			}
			if (i % 5 == 0) {
				System.out.print(" bar");
			}
			if (i % 7 == 0) {
				System.out.print(" baz");
			}
			System.out.println();
			
		}
		
	}

}
