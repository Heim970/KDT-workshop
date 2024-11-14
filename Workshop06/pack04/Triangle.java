package Workshop.Workshop06.pack04;

public class Triangle extends Shape implements Resize {

	// 생성자
	public Triangle() {
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	// 메서드
	@Override
	public double getArea() {
		// 도형의 넓이를 리턴
		return super.getWidth() * super.getHeight() * 0.5;
	}
	
	@Override
	public void setResize(int size) {
		// 도형의 사이즈 변경
		// 세로(height)의 값에 size 값을 더한다
		super.setHeight(super.getHeight() + size);
	}
	
}
