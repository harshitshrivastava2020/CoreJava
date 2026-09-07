package in.co.rays.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(0, "Harshit");
		v.add(1, 'h');
		v.add(2, 2.9);
		v.add(3, 45);
		v.add(4, "Harshit");
		v.add(5, "Harshit");

		System.out.println("vector: " + v);
		System.out.println("----Enumeration----");

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object obj = e.nextElement();
			System.out.println(obj);
		}
		System.out.println("vector: " + v);
	}
}
