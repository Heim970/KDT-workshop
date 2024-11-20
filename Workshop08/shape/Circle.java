package Workshop.Workshop08.shape;

public class Circle extends Shape implements Movable {

	private int radius;
	
	public Circle() {}
	
	public Circle(int radius, int x, int y) {
		super(new Point(x, y));
		this.radius = radius;
	}
	
	
	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public double getCircumference() {
		return 2 * radius * 3.14;
	}

	@Override
	public void move(int x, int y) {
		 super.getPoint().setX(super.getPoint().getX() + x + 1);
		 super.getPoint().setY(super.getPoint().getY() + y + 1);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
