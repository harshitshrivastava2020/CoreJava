package in.co.rays.Inheritance;

public class Circle extends Shape {
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
//	public void area() {
//		System.out.println("area of circle: "+Math.PI*(radius *radius));
//
//	}
	@Override
	public int area() {
		System.out.println("area of circle: "+Math.PI*(radius *radius));
		// TODO Auto-generated method stub
		return radius;
	
	}

}
