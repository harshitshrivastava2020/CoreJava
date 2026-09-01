package in.co.rays.polymorphism;

public class Shape {
	protected String color;
	protected int borderWidth;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;

	}

	
	public void area() {
		System.out.println("area from shape (parent) class");
		;

	}
}
