package in.co.rays.Inheritance;

public class Shape {
	protected String color;
	protected int borderWidh;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setBorderWidth(int borderWidh) {
		this.borderWidh = borderWidh;
	}

	public int getBorderWidth() {
		return borderWidh;
	}

	public int area() {
		return 0;

	}
}
