package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestTestRetainAllMthods {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("Harshit");
		c1.add("Chinmaye");
		c1.add("Abhishek");

		Collection c2 = new ArrayList();

		c2.add("Harshit");
		c2.add("Chinmaye");
		c2.add("Baman");
		c1.retainAll(c2);
		System.out.println(c1);

	}
}
