package in.co.rays.polymorphism;

public class TestPolymorphismByMethodArgument {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();
		
		Circle c = (Circle) s[0];
		c.setRadius(5);
		Rectangle r = (Rectangle) s[1];
		r.setLength(12);
		r.setWidth(6);
		Triangle t = (Triangle) s[2];
		t.setBase(6);
		t.setHeight(7);
		
		 calculateArea(s);

	}

	private static void calculateArea(Shape[] s) {
		for (int i = 0; i < s.length; i++) {
			  s[i].area();
		}
		
	}

}
