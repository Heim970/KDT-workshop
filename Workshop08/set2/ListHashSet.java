package Workshop.Workshop08.set2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ListHashSet {

	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		
		// ArrayList에 size만큼 랜덤한 숫자를 넣는다.
		for (int i = 0; i < size; i++) {
			list.add(random.nextInt(10) + 1);
		}
		System.out.println(list);
		// ArrayList의 정보를 HashSet에 넣는다.
		for (int i = 0; i < size; i++) {
			set.add(list.get(i));
		}
		System.out.println(set);
	}

}
