package in.co.rays.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class TestSetWithHashSet {
	// 1.Set contain only unique elements
	// 2.Set contain only one null value
	// 3.Order of set is not define
	public static void main(String[] args) {

		Set st = new HashSet();

		st.add(null);
		st.add(null);
		st.add('a');
		st.add('b');
		st.add('c');
		st.add('d');
		st.add('e');
		st.add('a');
		st.add('e');
		st.add('b');

		System.out.println("set:" + st);
	}
}
