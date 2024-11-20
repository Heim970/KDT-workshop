package Workshop.Workshop08.list1;

public class ListTest01 {

	public static void main(String[] args) {

		// argument로 정수를 받는다.
		int size = Integer.parseInt(args[0]);
		if (size > 10 || size < 5) {
			System.out.println("5 ~ 10의 정수만 입력 가능합니다.");
			return;
		}
		// MakeList 객체 생성
		MakeList arr = new MakeList();
		
		// 무작위의 번호 발생 후 저장
		arr.makeArrayList(size);
		
		// for문을 이용하여 ArrayList의 정보를 출력하고 평균을 출력한다.
		System.out.println(arr.getList());
		System.out.printf("평균 : %.1f\n", arr.getAverage());
	}

}
