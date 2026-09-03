package in.co.rays.polymorphism;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		
		Circle c = new Circle();
		c.setRadius(5);
		shapes[0] = c;
		
		Rectangle r = new Rectangle();
		r.setLength(6);
		r.setWidth(4); 
		shapes[1] = r;
		
		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(5);
		shapes[2] = t;

		abstractArea(shapes);
	}

	private static void abstractArea(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			shapes[i].area();
		}
	}

}
