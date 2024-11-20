package Workshop.Workshop08.list3;

import java.util.ArrayList;
import java.util.Random;

public class ListTest03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			arr1.add(random.nextInt(10));
			arr2.add(random.nextInt(10));
			
			System.out.printf("%d/%d ", arr1.get(i), arr2.get(i));
			
			try {
				System.out.println(arr1.get(i) / arr2.get(i));
			} catch (Exception e) {
				System.out.println("분모가 0입니다");
			}
			
		}
		
	}

}
