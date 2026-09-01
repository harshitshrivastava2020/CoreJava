package in.co.rays.Inheritance;

public class RunShape {
	public static void main(String[] args) {
		System.out.println("-------------- Recangle ---------------------");
		Rectangle r = new Rectangle();
		r.setLength(6);
		r.setWidh(12);
		r.setColor("red");
		r.setBorderWidth(4);

		System.out.println("Recangle: " + r.getLength());
		System.out.println("Recangle: " + r.getWidth());
		System.out.println("Recangle: " + r.getColor());
		System.out.println("Recangle: " + r.getBorderWidth());
		r.area();
		
		System.out.println("-------------- Circle ---------------------");

		Circle c = new Circle();

		c.setRadius(2);
		c.setColor("blue");
		c.setBorderWidth(6);

		System.out.println("Circle: " + c.getRadius());
		System.out.println("Circle: " + c.getColor());
		System.out.println("Circle: " + c.getBorderWidth());
		c.area();

		System.out.println("-------------- Triangle ---------------------");

		Triangle t = new Triangle();

		t.setBase(2);
		t.setHeight(2);
		t.setColor("green");
		t.setBorderWidth(8);

		System.out.println("Triangle: " + t.getBase());
		System.out.println("Triangle: " + t.getHeight());
		System.out.println("Triangle: " + t.getColor());
		System.out.println("Triangle: " + t.getBorderWidth());
		t.area();

	}
}
