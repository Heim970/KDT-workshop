package Workshop.Workshop08.shape;

public class Rectangle extends Shape implements Movable {

	private int width;
	
	public Rectangle() {}
	
	public Rectangle(int width, int x, int y) {
		super(new Point(x, y));
		this.width = width;
	}
	
	
	@Override
	public double getArea() {
		return width * width;
	}

	@Override
	public double getCircumference() {
		return width * 4;
	}

	@Override
	public void move(int x, int y) {
		 super.getPoint().setX(super.getPoint().getX() + x + 2);
		 super.getPoint().setY(super.getPoint().getY() + y + 2);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
