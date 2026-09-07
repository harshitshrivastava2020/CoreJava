package in.co.rays.Collection.List;

import java.util.Vector;

public class TestVector {
	// vector increase double of its size
	// thread safe
	// slow performance
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Harshit");
		v.addElement(35);

		System.out.println("element at index: " + v.elementAt(1));// provide element at index
		System.out.println("get element: " + v.get(1));// get element at index
	}
}
