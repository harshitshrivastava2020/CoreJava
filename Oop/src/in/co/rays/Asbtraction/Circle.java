package in.co.rays.Asbtraction;

public class Circle extends Shape {
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public void area() {
		System.out.println("area of circle: " + Math.PI * radius * radius);
	}

}
