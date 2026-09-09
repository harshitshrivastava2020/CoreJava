package in.co.rays.Map;

import java.util.HashMap;
import java.util.Map;

public class TestHashTable {
	// . HashTable does not contain duplicate key
	// . HashTable does not contain null key
	// . HashTable does not contain null value
	// . HashTable not maintain order
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("one", 1); // one = 1
		m.put("two", 2); // two = 2
		m.put("three", 3); // three = 3
		m.put("four", 4); // four = 4
		m.put("five", 5); // five = 5
		System.out.println("m" + m);// to get all data in key value pair but in object format

		System.out.println(m.get(1));// to get the single data is present or not from key
		System.out.println(m.get("Abhishek"));// to get the single data is present or not from key

		System.out.println(m.get("harshit"));// to get the single data is present or not from value it return null
		System.out.println(m.get(5));// to get the single data is present or not from value it return null
		System.out.println(m.containsKey(3));// to check the key is present or not and it returns boolean value
		System.out.println(m.containsValue("Karuna"));// to check the value is present or not and it returns boolean
														// value
		System.out.println(m.keySet());// to get all key in map (array)
		System.out.println(m.values());// to get all values in map (array)
		System.out.println(m.entrySet());// to get all data in key value pair but in array format
		System.out.println(m.remove("Abhishek")); // to remove single element in map
		System.out.println("m" + m);
		System.out.println("size " + m.size());// to get size of given map array

		m.clear(); // to remove single element in map
		System.out.println("m" + m);
		System.out.println(m.isEmpty());// to check the map (array) is empty or not and returns boolean value

	}
}
