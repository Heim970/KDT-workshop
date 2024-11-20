package Workshop.Workshop08.set1;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		/*
		 * 스페이스가 없는 String을 입력받아 문자들을 HashSet에 저장한 후 이를 이용하여 출력한다.
		 * String 형태의 문자열을 스페이스 없이 eclipse에서 argument로 받아들여 각각의 문자를
		 * HashSet에 넣고 출력한다. (출력 순서는 무시한다.)
		 */
		
		HashSet<String> hset = new HashSet<>();
		char[] str = args[0].toCharArray();
		
		for (char c : str) {
			hset.add(String.valueOf(c));
		}
		
		System.out.println(hset.toString());
	}

}
