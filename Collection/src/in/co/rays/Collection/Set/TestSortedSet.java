package in.co.rays.Collection.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {
		SortedSet st = new TreeSet();

		st.add("Chimaye");
		st.add("Baman");
		st.add("ahishek");
		st.add("Harshit");// sorted set is order set in asc as well as arrange in alphabetical order

		System.out.println(st);

	}
}
