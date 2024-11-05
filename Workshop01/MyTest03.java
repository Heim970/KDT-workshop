package Workshop.Workshop01;
public class MyTest03 {

	public static void main(String[] args) {
		int n = 10;
		int n2 = 20;
		
		int t = n2;
		n2 = n;
		n = t;
		
		System.out.println("n 값은 " + n);
		System.out.println("n2값은 " + n2);
	}

}
