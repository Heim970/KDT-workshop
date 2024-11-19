package Workshop.Workshop07;

public class Test08 {

	public static void main(String[] args) {

		String mesg = "100/200";
		String[] str = mesg.split("/");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		System.out.println("정수값 합계: " + (a + b));
		System.out.println("정수값 평균: " + (a + b)/2);
	}

}
