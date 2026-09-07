package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(0, "Harshit");
		list.add(1, 'h');
		list.add(2, 2.9);
		list.add(3, 45);
		list.add(4, "Harshit");
		list.add(5, "Harshit");

		System.out.println("list: " + list);
		Iterator it = list.iterator();

//		list.add("Sita"); // Fail Fast  //ConcurrentModificationException exception occurred when add before 

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println("elements: " + obj);
		}
		System.out.println("list: " + list);
		list.add("Ram");
		System.out.println("list: " + list);

	}
}
