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
	
	public static Shape getShape(int i) {
		if (i == 1) {
			return new Circle();
		}

		if (i == 2) {
			return new Rectangle();
		}

		if (i == 3) {
			return new Triangle();
		}

		return new Shape();
	}
}
