package in.co.rays.Overriding.java;

public class Shape {
	protected String color;
	protected int borderWidh;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setBorderWidh(int borderWidh) {
		this.borderWidh = borderWidh;
	}

	public int getBorderWidth() {
		return borderWidh;
	}

	public void area() {
		System.out.println("area from shape (parent) class");
		;

	}
}
