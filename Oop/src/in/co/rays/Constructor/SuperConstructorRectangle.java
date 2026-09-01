package in.co.rays.Constructor;

public class SuperConstructorRectangle extends SuperConstructorShape {
	protected int length;
	protected int width;

	public SuperConstructorRectangle() {

	}

	public SuperConstructorRectangle(String color, int borderWidth, int length, int width) {
		super(color, borderWidth);
		this.length = length;
		this.width = width;
		System.out.println("length: " + this.length);
		System.out.println("width: " + this.width);

	}

	public int getLengh() {
		return length;
	}

	public int getWidth() {
		return width;
	}

}
