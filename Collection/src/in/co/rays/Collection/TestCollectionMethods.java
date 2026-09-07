package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Harshit");
		c.add(26);
		c.add('a');
		c.add(4.3);
		c.add(true);
		c.add(87);
		c.add('b');

		System.out.println("Collection array: " + c);
		System.out.println("Size of collection array: " + c.size());
		System.out.println("---------");

		for (Object obj : c) {
			System.out.println(obj);
		}
		System.out.println("--------");
		System.out.println(c.contains(26));// elements present or not returns boolean value
		System.out.println(c.contains('a')); // elements present or not returns boolean value
		System.out.println("containsAll: " + c.containsAll(c)); // in small bracket pass elements to check element
																// present or not
		System.out.println(c.remove(87));
		System.out.println(c.remove('b'));
		System.out.println(c);
		System.out.println("size of c: " + c.size());

	}
}
