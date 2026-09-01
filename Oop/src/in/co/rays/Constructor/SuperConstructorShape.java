package in.co.rays.Constructor;

public class SuperConstructorShape {
	protected String color;
	protected int borderWidth;

	public SuperConstructorShape() {
		System.out.println("default constructor");
	}

	public SuperConstructorShape(String color) {
		this();
		this.color = color;
		System.out.println("color: "+this.color);

	}

	public SuperConstructorShape(String color, int borderWidth) {
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
