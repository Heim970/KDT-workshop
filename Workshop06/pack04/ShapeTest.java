package Workshop.Workshop06.pack04;

public class ShapeTest {

	public static void main(String[] args) {
		
		// (1. 조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성하여
		// 6개의 도형 객체를 배열에 넣는다.
		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		
		// 모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용하여 화면에 출력한다.
		System.out.println("기본정보");
		for (Shape s : shape) {
			System.out.printf("%s\t%.1f\t%s\n", s.getClass().getSimpleName(), s.getArea(), s.getColors());
		}
		
//		for (Shape s : shape) {
//			if (s instanceof Triangle) {
//				System.out.printf("Triangle\t");
//			} else {
//				System.out.printf("Rectangle\t");
//			}
//			system.out.printf("%1.f\t%s\n", s.getArea(), s.getColor());
//		}
		
		// 모든 객체들을 setResize 함수를 이용하여 5를 입력하고 사이즈를 변경 후 화면에 출력한다.
		// 단 for Loop 문을 이용한다.
		System.out.println("\n사이즈를 변경 후 정보");
		for (Shape s : shape) {
			((Resize) s).setResize(5); // 업캐스팅 -> Resize
			System.out.printf("%s\t%.1f\t%s\n", s.getClass().getSimpleName(), s.getArea(), s.getColors());
		}
		
	}

}
