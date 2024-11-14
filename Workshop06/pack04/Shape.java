package Workshop.Workshop06.pack04;

public abstract class Shape {
	
	// 변수
	private int width;  // 가로 길이
	private int height; // 세로 길이
	private String colors; // 색상
	
	// 생성자
	public Shape() {}
	
	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	// 메서드
	public abstract double getArea(); // 도형의 넓이를 리턴

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

}
