package Workshop.Workshop08.list2;

public class ListTest02 {

	public static void main(String[] args) {
		/*
		 * 다음에 주어진 배열을 ArrayList에 넣고 ArrayList의 내용을 출력 하는 프로그램을 작성 하시오.
		 * ArrayList에 값을 넣을 때는 배열의 뒤에서부터 넣는다.
		 * int array[] = {3,4,2,5,2,3,6,7,5,7,9}; 
		 */
		
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		ConvertList cl = new ConvertList();
		
		cl.convertList(array);
	}

}
