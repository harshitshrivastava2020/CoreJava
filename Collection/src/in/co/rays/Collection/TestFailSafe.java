package in.co.rays.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(0, "Harshit");
		v.add(1, 'h');
		v.add(2, 2.9);
		v.add(3, 45);
		v.add(4, "Harshit");
		v.add(5, "Harshit");

		System.out.println("Vector: " + v);

		System.out.println("----Enumeration----");

		Enumeration e = v.elements();

//		v.add(7, "Sita"); // Fail Safe //ArrayIndexOutOfBoundsException exception occurred when add before 

		while (e.hasMoreElements()) {
			Object obj = e.nextElement();
			System.out.println("elements: " + obj);
		}
		System.out.println("vector: " + v);

	}

}
