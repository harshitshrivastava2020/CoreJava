package in.co.rays.Collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableMarksheet {
	public static void main(String[] args) {
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		list.add(new Marksheet("106", "Harshit", 96));
		list.add(new Marksheet("101", "Chinmay", 76));
		list.add(new Marksheet("103", "Abhishek", 66));
		list.add(new Marksheet("102", "Karuna", 56));
		list.add(new Marksheet("105", "Hema", 46));
		list.add(new Marksheet("104", "Niketan", 86));

		list.forEach(System.out::println);
		System.out.println("------sorted marksheet------");

		Collections.sort(list);
		list.forEach(System.out::println);

	}
}
