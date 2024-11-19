package Workshop.Workshop07.app3;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		/*
		 * 다음 String에 있는 정수들의 합을 구하시오.
		 * 단, StringTokenizer class를 이용한다.
		 * 
		 * ** 실행결과 **
		 * 22
		 */

		String str = "4,2,3,6,7";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		int sum = 0;
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);
	}

}
