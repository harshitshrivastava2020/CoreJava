package in.co.rays.Inheritance;

public class Triangle extends Shape {
	private int base;
	private int height;

	public void setBase(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}
//	public void area() {
//		System.out.println("area of triangle: "+(base *height)/2);
//
//	}
	
	@Override
	public int area() {
		int bh = base *height;
		System.out.println("area of triangle: "+(bh)/2);
		return bh ;
	
	}
}
