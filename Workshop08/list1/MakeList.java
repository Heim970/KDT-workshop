package Workshop.Workshop08.list1;

import java.util.ArrayList;
import java.util.Random;

public class MakeList {
	ArrayList<Integer> list;
	
	public MakeList() {
		list = new ArrayList<Integer>();
	}
	
	public void makeArrayList(int size) {
		// size 만큼의 정수형 데이터를 랜덤하게 만들어 ArrayList에 넣는다.
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			list.add(random.nextInt(10) + 10);
		}
	}
	
	public double getAverage() {
		// ArrayList의 모든 값의 평균을 계산하여 리턴
		double sum = 0.0;
		for (int i : list) {
			sum += i;
		}
		return sum / list.size();
	}
	
	public ArrayList<Integer> getList() {
		// ArrayList를 리턴
		return list;
	}
}
