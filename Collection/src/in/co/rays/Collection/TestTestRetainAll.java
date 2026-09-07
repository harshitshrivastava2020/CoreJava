package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestTestRetainAll {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("Harshit");
		c1.add(26);
		c1.add('a');
		c1.add(4.3);
		c1.add(true);
		c1.add(87);
		c1.add('b');

		System.out.println("c1: " + c1);
		System.out.println("c1 size: " + c1.size());

		System.out.println("--------");

		Collection c2 = new ArrayList();

		c2.add("Harshit");
		c2.add(78);
		c2.add(2.8);
		c2.add('b');
		c2.add(false);

		System.out.println("c2: " + c2);
		c1.retainAll(c2);// it checks in both collection provide common values in both collection
		System.out.println("------------");
		System.out.println(c1);

	}
}
