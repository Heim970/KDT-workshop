package Workshop.Workshop07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test05 {

	public static void main(String[] args) {
		/*
		 * Scanner 클래스를 사용하여 키보드로 주소값을 입력 받아서 실행결과와 같이 출력하는 코드
		 *
		 * ** 실행결과 **
		 * 주소를 입력하시오.
		 * 서울시 강남구 역삼동
		 * 문자 갯수(공백포함): 11 
		 * 단어 갯수: 3 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력하시오.");
		String str = sc.nextLine();
		
		char[] s = str.toCharArray();
		int sumChar = 0;
		for (char c : s) {
			sumChar++;
		}
		System.out.println("문자 갯수(공백포함): " + sumChar);
		
		StringTokenizer st = new StringTokenizer(str);
		int sumWords = 0;
		while (st.hasMoreTokens()) {
			st.nextToken();
			sumWords++;
		}
		System.out.println("단어 갯수: " + sumWords);
		
		sc.close();
		
	}

}
