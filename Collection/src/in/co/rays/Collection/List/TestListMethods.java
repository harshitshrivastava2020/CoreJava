package in.co.rays.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class TestListMethods {
	// 1. List can contain duplicate elements
	// 2. List can contain multiple null values
	// 3. Order of list is natural order
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(0, "Harshit");
		list.add(1, 'a');
		list.add(2, 2.3);
		list.add(3, true);
		list.add(4, 45);
		list.add(5, "Ram");
		list.add(6, "Ram");
		list.add(7, "Sita");
		System.out.println("list: " + list);
		System.out.println("provide ele at index :" + list.get(5));
		System.out.println("remove ele at index: " + list.remove(6));
		System.out.println("list: " + list);
		System.out.println("add ele at index: " + list.set(6, "chinmaye"));
		System.out.println("list: " + list);
		System.out.println(list.indexOf("Harshit"));
		System.out.println(list.lastIndexOf(2.3));
		System.out.println(list.subList(1, 6));

	}
}
