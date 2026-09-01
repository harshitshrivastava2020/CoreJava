package in.co.rays.Overriding.java;

public class RunShape {
	public static void main(String[] args) {
		System.out.println("------------------------ Circle -------------------------------------");
		// parents can keep child's reference
		Shape s = new Circle();

		// type cast Shape s to Circle c
		Circle c = (Circle) s;
		c.setColor("red");
		c.setBorderWidh(10);
		c.setRadius(16);

		System.out.println("color: " + c.getColor());
		System.out.println("borderwidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();

		System.out.println("------------------------ Rectangle ----------------------------------");
		Shape s1 = new Rectangle();
		Rectangle r = (Rectangle) s1;
		r.setColor("blue");
		r.setBorderWidh(20);
		r.setLength(25);
		r.setWidth(25);

		System.out.println("color: " + r.getColor());
		System.out.println("borderwidth: " + r.getBorderWidth());
		System.out.println("length: " + r.getLength());
		System.out.println("width: " + r.getWidth());
		r.area();

		System.out.println("------------------------ Triangle -----------------------------------");
		Shape s2 = new Triangle();
		Triangle t = (Triangle) s2;
		t.setColor("green");
		t.setBorderWidh(30);
		t.setBase(35);
		t.setHeight(35);

		System.out.println("color: " + t.getColor());
		System.out.println("borderwidth: " + t.getBorderWidth());
		System.out.println("base: " + t.getBase());
		System.out.println("height: " + t.getHeight());
		t.area();

	}

}
