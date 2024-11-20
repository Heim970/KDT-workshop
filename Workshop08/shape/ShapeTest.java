package Workshop.Workshop08.shape;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {

		ArrayList<Shape> list = new ArrayList<Shape>();
		
		// 객체의 순서대로 Circle 객체와 Rectangle 객체를 생성하여 ArrayList에 저장한다.
		list.add(new Rectangle(4, 7, 5));
		list.add(new Rectangle(5, 4, 6));
		list.add(new Circle(6, 6, 7));
		list.add(new Circle(7, 8, 3));
		
		// 모든 객체의 넓이 정보와 둘레 정보를 화면에 출력한다.
		System.out.println("구분\t\t길이\tX좌표\tY좌표\tArea\tCircumference");
		for (Shape shape : list) {
			System.out.printf("%-9s\t", shape.getClass().getSimpleName());
			
			if (shape instanceof Rectangle) {
				Rectangle r = (Rectangle) shape;
				System.out.printf("%d\t", r.getWidth());
			} else {
				Circle c = (Circle) shape;
				System.out.printf("%d\t", c.getRadius());
			}
			
			System.out.printf("%d\t%d\t%.0f\t%.0f\n", 
					shape.getPoint().getX(), shape.getPoint().getY(),
					shape.getArea(), shape.getCircumference());
		}
		
		// 모든 객체들에 move() 함수를 이용하여 x가 10, y가 10 증가되도록 변경한 후
		// 객체 정보를 화면에 출력한다.
		System.out.println("이동 후...");
		for (Shape shape : list) {
			if (shape instanceof Rectangle) {
				Rectangle r = (Rectangle) shape;
				r.move(10, 10);
				System.out.printf("Rectangle\t%d\t", r.getWidth());
			} else {
				Circle c = (Circle) shape;
				c.move(10, 10);
				System.out.printf("Circle   \t%d\t", c.getRadius());
			}
			System.out.printf("%d\t%d\t\n", 
					shape.getPoint().getX(), shape.getPoint().getY());
		}
	}

}
