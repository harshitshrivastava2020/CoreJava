package in.co.rays.Asbtraction;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("============================ circle =====================================");
		Shape s = new Circle();
		s.setBorderWidth(9);
		s.setColor("red");
		Circle c = (Circle) s;
		c.setRadius(89);
		System.out.println("color: " + s.getColor());
		System.out.println("BorderWidth: " + s.getBorderWidth());
		System.out.println("Radius: " + c.getRadius());
		s.area();
	    System.out.println("============================ Rectangle =====================================");
        Shape s1 = new Rectangle();
        s1.setBorderWidth(8);
        s1.setColor("blue");
        Rectangle r =(Rectangle) s1;
        r.setLength(8);
        r.setWidth(9);
        System.out.println("color: "+s1.getColor());
        System.out.println("BorderWidth: "+ s1.getBorderWidth());
        System.out.println("Length: "+r.getLength());
        System.out.println("Width: "+ r.getWidth());
        s1.area();
	    System.out.println("============================ Triangle =====================================");
        Shape s2 = new Triangle();
        s2.setBorderWidth(7);
        s2.setColor("green");
        Triangle t =(Triangle) s2;
        t.setBase(7);
        t.setHeight(8);
        System.out.println("color: "+s2.getColor());
        System.out.println("BorderWidth: "+ s2.getBorderWidth());
        System.out.println("Length: "+t.getBase());
        System.out.println("Width: "+ t.getHeight());
        s2.area();
	}
}
