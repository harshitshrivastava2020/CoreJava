package in.co.rays.Constructor;

public class SuperConstructorCircle extends SuperConstructorShape {
	protected int radius;

	public SuperConstructorCircle() {

	}

	public SuperConstructorCircle(String color, int borderWidth, int radius) {
		super(color, borderWidth);
		this.radius = radius;
		System.out.println("radius: "+this.radius);

	}

	public int getRadius() {
		return radius;
	}

}
