package in.co.rays.Collection.Sorting;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee> {
	@Override
	public int compare(Employee obj1,Employee obj2) {
		return obj1.name.compareTo(obj2.name);// sort by name in asc order
		// return o2.name.compareTo(o1.name); // sort by name in desc order
	}

}
