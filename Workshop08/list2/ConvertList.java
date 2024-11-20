package Workshop.Workshop08.list2;

import java.util.ArrayList;

public class ConvertList {
	public ArrayList<Integer> convertList(int[] array) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
			arr.add(array[i]);
		}
		return arr;
	}
}
