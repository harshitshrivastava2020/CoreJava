package in.co.rays.TestStream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStream {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tarun");
		list.add("Chinmaye");
		list.add("Bahubali");
		list.add("Karuna");
		list.add("Kattappa");
		list.add("Kattappa");
		list.add("Kattappa");
		list.add("Harshit");

		list.forEach(System.out::println);
		System.out.println("--------sorted method------");

		list.stream().sorted().forEach(System.out::println);

		System.out.println("-------comparator reverseOrder method-------");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println("----distinct method -----------");

		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("-----map method------");
		
		list.stream().map(e -> e.toLowerCase()).distinct().forEach(System.out::println);
		
		System.out.println("-----------------");
		
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		System.out.println("-----filter method-----");
		
		list.stream().filter(e -> e.startsWith("K")).distinct().forEach(System.out::println);

	}
}
