package Workshop.Workshop07.app4;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		/*
		 * 아래 데이터를 변수로 선언하여 실행 결과와 같이 출력되는 프로그램을 작성하시오.
		 * 문자 수를 계산할 때는 StringTokenizer class를 이용한다.
		 * 단어 수 계산은 char []를 이용한다.
		 * 
		 * ** 실행결과 **
		 * I a m s e c o n d t o n o n e 문자개수: 15 
		 * I am second to none 단어개수: 5 
		 */
		
		String str = "I am second to none";
		
		char[] s = str.toCharArray();
		int sumChar = 0;
		for (char c : s) {
			if (c != ' ') {
				System.out.printf("%c ", c);
				sumChar++;
			}
		}
		System.out.println("문자 개수: " + sumChar);
		
		StringTokenizer st = new StringTokenizer(str);
		int sumWords = 0;
		while (st.hasMoreTokens()) {
			sumWords++;
			System.out.printf("%s ", st.nextToken());				
		}
		System.out.println("단어개수: " + sumWords);
		
		
	}

}
