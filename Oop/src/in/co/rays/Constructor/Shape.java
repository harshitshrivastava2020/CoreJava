package in.co.rays.Constructor;

public class Shape {
	protected String color;
	protected int borderWidth;

	public Shape() {
		System.out.println("default constructor");
	}

	public Shape(String color) {
		this();
		this.color = color;
		System.out.println("color: "+this.color);

	}

	public Shape(String color, int borderWidth) {
		this(color);
		this.borderWidth = borderWidth;
		System.out.println("borderWidh :"+this.borderWidth);
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}


}
