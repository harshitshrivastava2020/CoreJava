package in.co.rays.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {
	// . SortedMap order map in asc order
	// . SortedMap maintains order
	// . SortedMap allow multiple duplicate value
	public static void main(String[] args) {
		SortedMap m = new TreeMap();// SortedMap is a interface so create child reference
		m.put(3, "Niketan");
		m.put(1, "Harshit");
		m.put(2, "Chinmay");
		m.put(5, "Hema");
		m.put(6, "Abhishek");
		m.put(4, "Karuna");

		System.out.println("Sorted map: " + m);// it automatically sorts the array in numeric or alphabetically order
		System.out.println(m.firstKey());// to get first element from sorted map array
		System.out.println(m.lastKey());// to get last element from sorted map array
		System.out.println(m.headMap(3));// to Return all elements that appear before the specified element
		System.out.println(m.tailMap(3));// to Return all elements that appear after the specified element
		System.out.println(m.subMap(1, 6)); // to get element in given range
		System.out.println("size " + m.size()); // to get size of given map array


	}
}
