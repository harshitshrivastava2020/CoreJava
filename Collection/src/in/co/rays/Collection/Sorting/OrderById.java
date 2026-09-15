package in.co.rays.Collection.Sorting;

import java.util.Comparator;

public class OrderById implements Comparator<Employee> {
	@Override
	public int compare(Employee obj1,Employee obj2) {
		return obj1.id -obj2.id;// sort by id in asc order
		// return o2.id - o1.id; // sort by id in desc order
	}

}
