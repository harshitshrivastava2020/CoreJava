package in.co.rays.Inheritance;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setWidh(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}
//	public void area() {
//		System.out.println("area of rectangle: "+(length *width));
//
//	}
	
	@Override
	public int area() {
		int lb = length *width;
		System.out.println("area of rectangle: "+(lb));
		return lb ;
	
	}
}
